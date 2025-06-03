package emne06_abstrakt_superklasse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;


/**
 * Generel Beskrivelse for Opgavesættet Emne 6: Abstrakt Superklasse
 * ==================================================================
 * Dette opgavesæt fokuserer på Emne 6: Abstrakt Superklasse.
 * Formålet er at designe og implementere abstrakte superklasser, der definerer
 * en fælles struktur og adfærd for et sæt af relaterede subklasser. Dette inkluderer
 * brugen af abstrakte metoder, som tvinger subklasser til at levere specifikke
 * implementationer, samt konkrete metoder, der kan nedarves eller overrides.
 * Opret separate .java filer for hver klasse.
 */
public class Emne06AbstraktSuperklasse {

    /**
     * Opgave 6.1: Abstrakt `FigurBase` med Areal og Navn
     * --------------------------------------------------
     * Filnavne: FigurBase.java, CirkelFigurAbs.java, RektangelFigurAbs.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `FigurBase`:
     * - Attribut (protected): `farve` (String).
     * - Konstruktør: `FigurBase(String farve)`.
     * - Metode (public concrete): `String getFarve()`.
     * - Metode (public abstract): `double beregnAreal()`.
     * - Metode (public abstract): `String getFigurNavn()`.
     * - Metode (public concrete): `String getInfo()` - returnerer en streng som
     * "[FigurNavn] er [farve] og har et areal på [areal]." (bruger de to abstrakte metoder).
     * 2. Konkret Klasse `CirkelFigurAbs` (nedarver fra `FigurBase`):
     * - Attribut (private): `radius` (double).
     * - Konstruktør: `CirkelFigurAbs(String farve, double radius)`. Valider radius > 0.
     * - Implementer/Override de abstrakte metoder fra `FigurBase`. `getFigurNavn()` returnerer "Cirkel".
     * 3. Konkret Klasse `RektangelFigurAbs` (nedarver fra `FigurBase`):
     * - Attributter (private): `længde` (double), `bredde` (double).
     * - Konstruktør: `RektangelFigurAbs(String farve, double længde, double bredde)`. Valider > 0.
     * - Implementer/Override de abstrakte metoder. `getFigurNavn()` returnerer "Rektangel".
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    /**
     * Opgave 6.2: Abstrakt `MusikinstrumentBase`
     * ------------------------------------------
     * Filnavne: MusikinstrumentBase.java, StrengeinstrumentAbs.java, BlæseinstrumentAbs.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `MusikinstrumentBase`:
     * - Attribut (protected): `instrumentNavn` (String).
     * - Konstruktør: `MusikinstrumentBase(String navn)`.
     * - Metode (public concrete): `String getInstrumentNavn()`.
     * - Metode (public abstract): `String spilGrundLyd()`.
     * - Metode (public abstract): `int getAntalNøgleDele()` (f.eks. strenge, ventiler, tangenter).
     * - Metode (public concrete final): `String getVedligeholdelsesInfo()` - returnerer
     * "Instrumentet '[instrumentNavn]' har [antalNøgleDele] nøgledele der kræver vedligeholdelse."
     * 2. Konkret Klasse `StrengeinstrumentAbs` (nedarver fra `MusikinstrumentBase`):
     * - Attribut (private): `antalStrenge` (int).
     * - Konstruktør.
     * - Implementer/Override de abstrakte metoder. `spilGrundLyd()` returnerer "Kling-klang". `getAntalNøgleDele()` returnerer `antalStrenge`.
     * 3. Konkret Klasse `BlæseinstrumentAbs` (nedarver fra `MusikinstrumentBase`):
     * - Attribut (private): `materiale` (String, f.eks. "Messing").
     * - Konstruktør.
     * - Implementer/Override de abstrakte metoder. `spilGrundLyd()` returnerer "Trut-trut". `getAntalNøgleDele()` returnerer f.eks. 3 (for ventiler).
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    /**
     * Opgave 6.3: Abstrakt `AnsatBase` med Lønberegning
     * -------------------------------------------------
     * Filnavne: AnsatBase.java, FuldtidsMedarbejder.java, DeltidsMedarbejder.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `AnsatBase`:
     * - Attributter (protected): `navn` (String), `medarbejderId` (int).
     * - Konstruktør.
     * - Metode (public concrete): `String getNavn()`, `int getMedarbejderId()`.
     * - Metode (public abstract): `double beregnMånedsløn()`.
     * - Metode (public concrete): `void udskrivLønseddel()` - udskriver "[Navn] (ID: [Id]) har en månedsløn på: [månedsløn]".
     * 2. Konkret Klasse `FuldtidsMedarbejder` (nedarver fra `AnsatBase`):
     * - Attribut (private): `fastMånedsløn` (double).
     * - Konstruktør.
     * - Implementer/Override `beregnMånedsløn()` (returnerer `fastMånedsløn`).
     * 3. Konkret Klasse `DeltidsMedarbejder` (nedarver fra `AnsatBase`):
     * - Attributter (private): `timeløn` (double), `antalTimerDenneMåned` (double).
     * - Konstruktør.
     * - Implementer/Override `beregnMånedsløn()` (returnerer `timeløn * antalTimerDenneMåned`).
     * - Metode (public): `void registrerTimer(double timer)` (opdaterer `antalTimerDenneMåned`).
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    /**
     * Opgave 6.4: Abstrakt `Fødevare`
     * -------------------------------
     * Filnavne: Fødevare.java, FrugtAbs.java, GrøntsagAbs.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `Fødevare`:
     * - Attributter (protected): `navn` (String), `kalorierPr100g` (int).
     * - Konstruktør.
     * - Metode (public concrete): `String getNavn()`, `int getKalorierPr100g()`.
     * - Metode (public abstract): `String getKategori()`.
     * - Metode (public abstract): `boolean erSund()`.
     * - Metode (public concrete): `String getBeskrivelse()` - returnerer "[Navn] ([Kategori]) har [Kalorier] kcal/100g. Sund: [Ja/Nej]".
     * 2. Konkret Klasse `FrugtAbs` (nedarver fra `Fødevare`):
     * - Attribut (private): `harKerne` (boolean).
     * - Konstruktør.
     * - Implementer/Override `getKategori()` (returnerer "Frugt").
     * - Implementer/Override `erSund()` (returnerer `true` hvis `kalorierPr100g < 100`).
     * 3. Konkret Klasse `GrøntsagAbs` (nedarver fra `Fødevare`):
     * - Attribut (private): `erRå` (boolean - om den typisk spises rå).
     * - Konstruktør.
     * - Implementer/Override `getKategori()` (returnerer "Grøntsag").
     * - Implementer/Override `erSund()` (returnerer altid `true`).
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    /**
     * Opgave 6.5: Abstrakt `Kunstværk`
     * -------------------------------
     * Filnavne: Kunstværk.java, Maleri.java, Skulptur.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `Kunstværk`:
     * - Attributter (protected): `titel` (String), `kunstner` (String), `årstal` (int).
     * - Konstruktør.
     * - Metode (public concrete): `String getBasisInfo()` (returnerer "[Titel] af [Kunstner] ([Årstal])").
     * - Metode (public abstract): `String getTeknik()`.
     * - Metode (public abstract): `double estimerVærdi(int alderIFraÅrstal)`.
     * 2. Konkret Klasse `Maleri` (nedarver fra `Kunstværk`):
     * - Attribut (private): `maleteknik` (String, f.eks. "Olie på lærred").
     * - Konstruktør.
     * - Implementer/Override `getTeknik()` (returnerer `maleteknik`).
     * - Implementer/Override `estimerVærdi(int alder)` (f.eks. 1000 * alder + (hvis "Olie på lærred" 5000 ekstra)).
     * 3. Konkret Klasse `Skulptur` (nedarver fra `Kunstværk`):
     * - Attributter (private): `materiale` (String), `vægtKg` (double).
     * - Konstruktør.
     * - Implementer/Override `getTeknik()` (returnerer "Skulptur i [materiale]").
     * - Implementer/Override `estimerVærdi(int alder)` (f.eks. 500 * alder * `vægtKg`).
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    /**
     * Opgave 6.6: Abstrakt `DatastrukturOperation` (Template Method Mønster light)
     * ------------------------------------------------------------------------
     * Filnavne: DatastrukturOperation.java, ArraySumOperation.java, ListeMaxOperation.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `DatastrukturOperation`:
     * - Metode (public final concrete): `int udførOperationPåData(int[] data)`:
     * - Denne metode er en "template method". Den definerer skelettet af en algoritme.
     * - Den kalder `initialiserResultat()`.
     * - Den itererer gennem `data`. For hvert element kalder den `behandlElement(element, nuværendeResultat)`
     * og opdaterer `nuværendeResultat`.
     * - Til sidst kalder den `finaliserResultat(nuværendeResultat)` og returnerer det.
     * - Metode (protected abstract): `int initialiserResultat()`.
     * - Metode (protected abstract): `int behandlElement(int element, int delresultat)`.
     * - Metode (protected abstract): `int finaliserResultat(int delresultat)`.
     * 2. Konkret Klasse `ArraySumOperation` (nedarver fra `DatastrukturOperation`):
     * - Implementer de tre abstrakte metoder for at beregne summen af elementerne i et array.
     * (`initialiserResultat` -> 0, `behandlElement` -> delresultat + element, `finaliserResultat` -> delresultat).
     * 3. Konkret Klasse `ListeMaxOperation` (nedarver fra `DatastrukturOperation`):
     * - Implementer de tre abstrakte metoder for at finde det største element i et array.
     * (`initialiserResultat` -> Integer.MIN_VALUE, `behandlElement` -> Math.max(delresultat, element), `finaliserResultat` -> delresultat).
     *
     * TODO: Opret de tre .java filer. Implementer klasserne. Dette demonstrerer, hvordan en abstrakt klasse kan
     * definere en overordnet algoritme, mens subklasser udfylder de specifikke trin.
     */

    /**
     * Opgave 6.7: Abstrakt `SpilKarakter` med SpecialAngreb
     * ----------------------------------------------------
     * Filnavne: SpilKarakter.java, Kriger.java, Magiker.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `SpilKarakter`:
     * - Attributter (protected): `navn` (String), `health` (int), `mana` (int).
     * - Konstruktør.
     * - Metoder (public concrete): `void tagSkade(int skade)` (reducerer health), `boolean erIOverlevelse()`.
     * - Metode (public abstract): `String udførBasisAngreb(SpilKarakter mål)`.
     * - Metode (public abstract): `String udførSpecialAngreb(SpilKarakter mål)`. (Kræver og forbruger mana).
     * 2. Konkret Klasse `Kriger` (nedarver fra `SpilKarakter`):
     * - Har f.eks. høj health, lav mana.
     * - Konstruktør.
     * - Implementer abstrakte angrebsmetoder (f.eks. "Sværdhug!", "Kraftfuldt Slag!" som koster 10 mana).
     * 3. Konkret Klasse `Magiker` (nedarver fra `SpilKarakter`):
     * - Har f.eks. lav health, høj mana.
     * - Konstruktør.
     * - Implementer abstrakte angrebsmetoder (f.eks. "Magisk Missil!", "Ildkugle!" som koster 25 mana).
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    /**
     * Opgave 6.8: Abstrakt `Transportmiddel`
     * ---------------------------------------
     * Filnavne: Transportmiddel.java, Tog.java, Bus.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `Transportmiddel`:
     * - Attributter (protected): `ruteNummer` (String), `kapacitet` (int), `nuværendePassagerer` (int).
     * - Konstruktør.
     * - Metoder (public concrete): `boolean stigPå(int antal)` (øger passagerer, tjek kapacitet),
     * `boolean stigAf(int antal)` (reducerer passagerer, tjek ikke < 0).
     * - Metode (public abstract): `double beregnBilletpris(int zoner)`.
     * - Metode (public abstract): `String getTransportTypeInfo()`.
     * 2. Konkret Klasse `Tog` (nedarver fra `Transportmiddel`):
     * - Attribut (private): `harStillezone` (boolean).
     * - Konstruktør.
     * - Implementer abstrakte metoder. Billetpris f.eks. `zoner * 12.50`. Info: "Tog rute [ruteNummer]".
     * 3. Konkret Klasse `Bus` (nedarver fra `Transportmiddel`):
     * - Attribut (private): `erNatbus` (boolean).
     * - Konstruktør.
     * - Implementer abstrakte metoder. Billetpris f.eks. `zoner * 10.0 (+ 5.0 hvis natbus)`. Info: "Bus rute [ruteNummer]".
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    /**
     * Opgave 6.9: Abstrakt `ByggeMateriale`
     * ------------------------------------
     * Filnavne: ByggeMateriale.java, TræMateriale.java, MetalMateriale.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `ByggeMateriale`:
     * - Attribut (protected): `navn` (String), `densitet` (double kg/m^3).
     * - Konstruktør.
     * - Metode (public concrete): `double beregnVægt(double volumenM3)` (returnerer `densitet * volumenM3`).
     * - Metode (public abstract): `double getStyrkeFaktor()` (en relativ faktor, f.eks. 1-10).
     * - Metode (public abstract): `boolean erBrandbart()`.
     * 2. Konkret Klasse `TræMateriale` (nedarver fra `ByggeMateriale`):
     * - Attribut (private): `træSort` (String, f.eks. "Eg", "Fyr").
     * - Konstruktør (sætter en passende densitet for træ).
     * - Implementer abstrakte metoder (`getStyrkeFaktor` f.eks. 3-6 afhængig af sort, `erBrandbart` returnerer true).
     * 3. Konkret Klasse `MetalMateriale` (nedarver fra `ByggeMateriale`):
     * - Attribut (private): `metalType` (String, f.eks. "Stål", "Aluminium").
     * - Konstruktør (sætter en passende densitet for metal).
     * - Implementer abstrakte metoder (`getStyrkeFaktor` f.eks. 7-10, `erBrandbart` returnerer false).
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    /**
     * Opgave 6.10: Abstrakt `FinansieltInstrument`
     * -------------------------------------------
     * Filnavne: FinansieltInstrument.java, Aktie.java, Obligation.java
     *
     * Beskrivelse:
     * 1. Abstrakt Klasse `FinansieltInstrument`:
     * - Attributter (protected): `symbol` (String, f.eks. "MSFT"), `nuværendePris` (double).
     * - Konstruktør.
     * - Metode (public concrete): `void opdaterPris(double nyPris)` (valider nyPris >= 0).
     * - Metode (public concrete): `double getNuværendePris()`.
     * - Metode (public abstract): `double beregnForventetAfkastProcent()`.
     * - Metode (public abstract): `String getInstrumentTypeBeskrivelse()`.
     * 2. Konkret Klasse `Aktie` (nedarver fra `FinansieltInstrument`):
     * - Attribut (private): `firmaNavn` (String), `dividendePrÅr` (double).
     * - Konstruktør.
     * - Implementer `beregnForventetAfkastProcent` (f.eks. `(dividendePrÅr / nuværendePris) * 100 + en lille forventet kursstigning på 2%`).
     * - Implementer `getInstrumentTypeBeskrivelse` (returner "Aktie i [firmaNavn]").
     * 3. Konkret Klasse `Obligation` (nedarver fra `FinansieltInstrument`):
     * - Attributter (private): `kuponRentePct` (double), `udløbsDato` (LocalDate).
     * - Konstruktør.
     * - Implementer `beregnForventetAfkastProcent` (returnerer `kuponRentePct`).
     * - Implementer `getInstrumentTypeBeskrivelse` (returner "Obligation ([symbol]) med udløb [udløbsDato]").
     *
     * TODO: Opret de tre .java filer og implementer klasserne.
     */

    public static void main(String[] args) {
        System.out.println("=== Emne 6: Abstrakt Superklasse - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for hver klasse og brug JUnit-tests til verificering. ===");
    }
}