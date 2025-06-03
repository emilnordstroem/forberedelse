package emne05_polymorfi;

import java.time.LocalDate; // Kan blive relevant for nogle klasser
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;   // For equals/hashCode i hjælpeklasser

/**
 * Generel Beskrivelse for Opgavesættet Emne 5: Polymorfi
 * =======================================================
 * Dette opgavesæt fokuserer på Emne 5: Polymorfi.
 * Formålet er at demonstrere og anvende polymorfi ved at arbejde med
 * objekter af forskellige subklasser gennem en fælles supertype-reference.
 * Opgaverne vil involvere at kalde overridede metoder, bruge 'instanceof'
 * og type-casting, samt arbejde med samlinger af supertype-referencer.
 * Alle metoder, du implementerer, skal være testbare.
 * Opret separate .java filer for hver klasse.
 */
public class Emne05Polymorfi {

    // --- Start med at definere de nødvendige klassehierarkier for opgaverne ---
    // Eksempelvis, for Opgave 5.1, skal du oprette Dyr.java, Hund.java, Kat.java

    /**
     * Opgave 5.1: Dyrelyde via Polymorfi
     * ----------------------------------
     * Hierarki:
     * 1. Klasse `Dyr`:
     * - Attribut (protected): `navn` (String).
     * - Konstruktør: `Dyr(String navn)`.
     * - Metode (public): `String lavLyd()` (returnerer "En generisk dyrelyd...").
     * - Metode (public): `String getNavn()`.
     * 2. Klasse `Hund` (extends `Dyr`):
     * - Konstruktør: `Hund(String navn)`.
     * - Override `lavLyd()`: Returnerer "Vuf!".
     * 3. Klasse `Kat` (extends `Dyr`):
     * - Konstruktør: `Kat(String navn)`.
     * - Override `lavLyd()`: Returnerer "Miav!".
     * 4. Klasse `Fugl` (extends `Dyr`):
     * - Konstruktør: `Fugl(String navn)`.
     * - Override `lavLyd()`: Returnerer "Pip pip!".
     *
     * Opgave:
     * Implementer en statisk metode `opgave5_1_fremkaldAlleLyde(ArrayList<Dyr> dyreListe)`:
     * - Metoden skal iterere gennem `dyreListe`.
     * - For hvert `Dyr` i listen, kald `lavLyd()` metoden.
     * - Saml alle returnerede lyd-strenge i en ny `ArrayList<String>`.
     * - Returner listen af lyd-strenge.
     * TODO: Opret Dyr.java, Hund.java, Kat.java, Fugl.java. Implementer derefter opgave5_1_fremkaldAlleLyde.
     */
//    public static ArrayList<String> opgave5_1_fremkaldAlleLyde(ArrayList<Dyr> dyreListe) {
//        // TODO: Implementer logikken. Håndter null eller tom liste.
//        return new ArrayList<>(); // Placeholder
//    }


    /**
     * Opgave 5.2: Beregning af Arealer for Forskellige Figurer
     * -------------------------------------------------------
     * Hierarki:
     * 1. Klasse `Figur`:
     * - Metode (public): `double beregnAreal()` (returnerer 0.0).
     * - Metode (public): `String getFigurType()` (returnerer "Ukendt Figur").
     * 2. Klasse `CirkelFigur` (extends `Figur`):
     * - Attribut (private): `radius` (double).
     * - Konstruktør: `CirkelFigur(double radius)`. Valider radius > 0.
     * - Override `beregnAreal()`: Returnerer cirklens areal.
     * - Override `getFigurType()`: Returnerer "Cirkel".
     * 3. Klasse `RektangelFigur` (extends `Figur`):
     * - Attributter (private): `længde` (double), `bredde` (double).
     * - Konstruktør: `RektangelFigur(double længde, double bredde)`. Valider > 0.
     * - Override `beregnAreal()`: Returnerer rektanglets areal.
     * - Override `getFigurType()`: Returnerer "Rektangel".
     * 4. Klasse `KvadratFigur` (extends `RektangelFigur`):
     * - Konstruktør: `KvadratFigur(double side)` (kalder super med side, side).
     * - Override `getFigurType()`: Returnerer "Kvadrat".
     *
     * Opgave:
     * Implementer en statisk metode `opgave5_2_beregnSamletArealOgIdentificer(List<Figur> figurer)`:
     * - Metoden skal returnere en `Map<String, Double>`, hvor nøglen er figurtypen (fra `getFigurType()`)
     * og værdien er den samlede sum af arealer for alle figurer af den type i listen.
     * F.eks. {"Cirkel": 75.0, "Rektangel": 120.0, "Kvadrat": 50.0}.
     * (Bemærk: Kvadratfigurer vil også bidrage til Rektangel-summen hvis man ikke bruger instanceof
     * til at differentiere, eller hvis getFigurType i Kvadrat ikke overrider Rektangels.
     * For denne opgave: baser det på resultatet af getFigurType()).
     * TODO: Opret Figur.java, CirkelFigur.java, RektangelFigur.java, KvadratFigur.java. Implementer opgaven.
     */
//    public static Map<String, Double> opgave5_2_beregnSamletArealOgIdentificer(List<Figur> figurer) {
//        // TODO: Implementer logikken. Håndter null eller tom liste.
//        return new HashMap<>(); // Placeholder
//    }


    /**
     * Opgave 5.3: Transportfirmaets Drift
     * -----------------------------------
     * Hierarki (genbrug/definer `Køretøj` fra 4.1 eller lignende):
     * 1. Klasse `KøretøjDrift`:
     * - Attribut (protected): `id` (String).
     * - Konstruktør.
     * - Metode (public): `String start()` (returnerer "[id] starter generisk.").
     * - Metode (public): `int getAntalHjul()` (returnerer f.eks. 4 som default).
     * 2. Klasse `BilDrift` (extends `KøretøjDrift`):
     * - Override `start()`: Returnerer "[id] bilmotor tænder.".
     * - Override `getAntalHjul()`: Returnerer 4.
     * 3. Klasse `CykelDrift` (extends `KøretøjDrift`):
     * - Override `start()`: Returnerer "[id] cykel begynder at trille.".
     * - Override `getAntalHjul()`: Returnerer 2.
     *
     * Opgave:
     * Definér en klasse `Transportfirma` med:
     * - Attribut (private): `navn` (String).
     * - Attribut (private): `flåde` (ArrayList<KøretøjDrift>).
     * - Konstruktør: `Transportfirma(String navn)`.
     * - Metoder:
     * - `void tilføjKøretøj(KøretøjDrift k)`.
     * - `ArrayList<String> startAlleKøretøjer()`: Itererer flåden, kalder `start()` på hvert køretøj,
     * og returnerer en liste af de returnerede start-beskeder.
     * - `int samletAntalHjulIFlåde()`: Returnerer det totale antal hjul for alle køretøjer i flåden.
     * TODO: Opret KøretøjDrift.java, BilDrift.java, CykelDrift.java, Transportfirma.java. Implementer.
     */
    // Du skal selv definere Transportfirma klassen i sin egen fil.
    // Metoderne nedenfor er statiske hjælpemetoder, hvis Transportfirma-klassen ikke selv skal have dem,
    // eller hvis opgaven skal løses med en simpel liste uden en Transportfirma-klasse.
    // For denne opgave, ANTAGE at du laver Transportfirma klassen. Denne fil er kun til beskrivelser.


    /**
     * Opgave 5.4: Orkester Performance
     * --------------------------------
     * Hierarki (genbrug/definer `Musikinstrument` fra 4.6 eller lignende):
     * 1. Klasse `OrkesterInstrument`:
     * - Attribut (protected): `navn` (String).
     * - Konstruktør.
     * - Metode (public): `String spilGrundtone()` (returnerer "[navn] spiller en grundtone.").
     * - Metode (public): `int getSværhedsgrad()` (returnerer en default værdi, f.eks. 3).
     * 2. Klasse `Stryger` (extends `OrkesterInstrument`):
     * - Attribut (private): `antalStrenge` (int).
     * - Konstruktør.
     * - Override `spilGrundtone()`: Returnerer "Smuk strygertone fra [navn]".
     * - Override `getSværhedsgrad()`: Returnerer f.eks. 4.
     * 3. Klasse `Blæser` (extends `OrkesterInstrument`):
     * - Attribut (private): `materiale` (String, f.eks. "Messing").
     * - Konstruktør.
     * - Override `spilGrundtone()`: Returnerer "Klar blæsertone fra [navn]".
     * - Override `getSværhedsgrad()`: Returnerer f.eks. 5.
     *
     * Opgave:
     * Implementer en statisk metode `opgave5_4_dirigerOrkester(List<OrkesterInstrument> instrumenter)`:
     * - Metoden skal returnere en `ArrayList<String>` med beskeder.
     * - For hvert instrument:
     * - Kald `spilGrundtone()` og tilføj resultatet til listen.
     * - Hvis instrumentet er en `Stryger` (brug `instanceof`), kald en (ny) specifik metode
     * `String brugBue()` på det castede objekt og tilføj resultatet til listen.
     * - Hvis instrumentet er en `Blæser` OG dets `getSværhedsgrad()` er > 4, kald en (ny)
     * specifik metode `String spilSoloPassage()` på det castede objekt og tilføj resultatet.
     * TODO: Opret OrkesterInstrument.java, Stryger.java, Blæser.java. Implementer opgaven.
     * Tilføj de nødvendige metoder (`brugBue`, `spilSoloPassage`) til subklasserne.
     */
//    public static ArrayList<String> opgave5_4_dirigerOrkester(List<OrkesterInstrument> instrumenter) {
//        // TODO: Implementer logikken. Håndter null eller tom liste.
//        return new ArrayList<>(); // Placeholder
//    }


    /**
     * Opgave 5.5: Personaleforvaltning med Roller
     * -------------------------------------------
     * Hierarki:
     * 1. Klasse `Medarbejder`:
     * - Attributter (protected): `navn` (String), `id` (int).
     * - Konstruktør.
     * - Metode (public): `String getArbejdsbeskrivelse()` (returnerer "Udfører generelle opgaver.").
     * - Metode (public): `double beregnUgeløn(int timer)` (returnerer timer * 150.0).
     * 2. Klasse `Tekniker` (extends `Medarbejder`):
     * - Attribut (private): `speciale` (String).
     * - Konstruktør.
     * - Override `getArbejdsbeskrivelse()`: Returnerer "Vedligeholder [speciale] systemer.".
     * - Override `beregnUgeløn(int timer)`: Returnerer timer * 250.0.
     * 3. Klasse `Konsulent` (extends `Medarbejder`):
     * - Attribut (private): `timetakst` (double).
     * - Konstruktør.
     * - Override `getArbejdsbeskrivelse()`: Returnerer "Rådgiver kunder.".
     * - Override `beregnUgeløn(int timer)`: Returnerer timer * `timetakst`.
     * - Metode (public): `void fakturerKunde(String kundeNavn, int timer)` (printer en faktura-besked).
     *
     * Opgave:
     * Implementer en statisk metode `opgave5_5_behandlPersonaleliste(ArrayList<Medarbejder> personale, int arbejdsTimerPrUge)`:
     * - Metoden skal returnere en `ArrayList<String>` med en statuslinje for hver medarbejder.
     * - For hver medarbejder:
     * - Generer en streng: "[Navn] ([ID]): [Arbejdsbeskrivelse] - Ugeløn: [beregnet ugeløn]".
     * - Hvis medarbejderen er en `Konsulent` (brug `instanceof`), kald `fakturerKunde("Stor Virksomhed", arbejdsTimerPrUge)`
     * på det castede objekt (denne metode printer selv, så dens output fanges ikke i listen, men den skal kaldes).
     * TODO: Opret Medarbejder.java, Tekniker.java, Konsulent.java. Implementer opgaven.
     */
//    public static ArrayList<String> opgave5_5_behandlPersonaleliste(ArrayList<Medarbejder> personale, int arbejdsTimerPrUge) {
//        // TODO: Implementer logikken. Håndter null eller tom liste.
//        return new ArrayList<>(); // Placeholder
//    }


    /**
     * Opgave 5.6: FormManagement med Specifikke Operationer
     * ----------------------------------------------------
     * Hierarki (lignende 4.2, men med andre metoder):
     * 1. Klasse `FormBase`: `farve` (String). `String getFarve()`. `String getFormNavn()` (returnerer "Generisk Form"). `double getPerimeter()`.
     * 2. Klasse `Polygon` (extends `FormBase`): `antalSider` (int). Override `getFormNavn()`.
     * 3. Klasse `LukketKurve` (extends `FormBase`): Override `getFormNavn()`.
     * 4. `RektangelForm2` (extends `Polygon`): `sideA`, `sideB`. Override `getPerimeter()`. Override `getFormNavn()`.
     * 5. `CirkelForm2` (extends `LukketKurve`): `radius`. Override `getPerimeter()`. Override `getFormNavn()`.
     *
     * Opgave:
     * Implementer en statisk metode `opgave5_6_analyserFormer(List<FormBase> former)`:
     * - Metoden skal returnere en `List<String>` med analyser.
     * - For hver form i listen:
     * - Tilføj "[FormNavn] med farven [Farve] har en omkreds på [Perimeter]." til resultatlisten.
     * - Hvis formen er et `RektangelForm2`, tjek om det er et kvadrat (sideA == sideB). Hvis ja, tilføj "Dette rektangel er også et kvadrat."
     * - Hvis formen er en `CirkelForm2` med radius > 10, tilføj "Dette er en stor cirkel."
     * TODO: Definer klasserne. Implementer metoden.
     */
//    public static List<String> opgave5_6_analyserFormer(List<FormBase> former) {
//        // TODO: Implementer. Håndter null/tom liste.
//        return new ArrayList<>(); // Placeholder
//    }

    /**
     * Opgave 5.7: Software Installation og Opdatering
     * -----------------------------------------------
     * Hierarki:
     * 1. `Software`: `navn` (String), `version` (String). `String installer()` (returnerer "[Navn] v[Version] installeres..."). `String opdater()` (returnerer "Søger efter opdateringer til [Navn]...").
     * 2. `OperativSystem` (extends `Software`): `buildNummer` (int). Override `installer()` (tilføjer "Kerne initialiseres..."). Override `opdater()` (tilføjer "Systemopdatering anvendes...").
     * 3. `ApplikationsSoftware` (extends `Software`): `kræverAdministratorRettigheder` (boolean). Override `installer()` (tilføjer "Tjekker rettigheder..." før installation).
     *
     * Opgave:
     * Implementer `opgave5_7_vedligeholdSoftware(List<Software> softwarePakker)`:
     * - Metoden skal returnere en `List<String>` der logger alle handlinger.
     * - For hver softwarepakke:
     * - Kald `installer()` og log resultatet.
     * - Kald `opdater()` og log resultatet.
     * - Hvis pakken er en `ApplikationsSoftware` og `kræverAdministratorRettigheder` er true, log "ADVARSEL: [Navn] kræver administrator rettigheder!".
     * TODO: Definer klasserne. Implementer metoden.
     */
//    public static List<String> opgave5_7_vedligeholdSoftware(List<Software> softwarePakker) {
//        // TODO: Implementer.
//        return new ArrayList<>(); // Placeholder
//    }

    /**
     * Opgave 5.8: Forbrugsvarer og Genopfyldning
     * ------------------------------------------
     * Hierarki:
     * 1. `Forbrugsvare`: `navn` (String), `enhederTilbage` (int). `forbrug(int antal)` (reducerer enheder, må ikke gå under 0, returnerer faktisk forbrugt antal). `getProduktStatus()`.
     * 2. `PrinterToner` (extends `Forbrugsvare`): `farve` (String, "Sort", "Cyan" etc.). Override `getProduktStatus()`. Metode `bestilNyPatron()` (returnerer "Bestiller ny [farve] toner...").
     * 3. `KaffebønnerPakke` (extends `Forbrugsvare`): `ristningsgrad` (String, "Mørk", "Medium"). Override `getProduktStatus()`. Metode `kværnBønner(int gram)` (returnerer "Kværner [gram]g [ristningsgrad] bønner...").
     *
     * Opgave:
     * Implementer `opgave5_8_administrerForbrugsvarer(List<Forbrugsvare> varer, int standardForbrug)`:
     * - Metoden skal returnere en `List<String>` med logbeskeder.
     * - For hver vare:
     * - Kald `forbrug(standardForbrug)` og log hvor mange enheder der blev forbrugt.
     * - Hvis `enhederTilbage` efter forbrug er <= 5:
     * - Hvis varen er `PrinterToner`, kald `bestilNyPatron()` og log resultatet.
     * - Hvis varen er `KaffebønnerPakke`, kald `kværnBønner(50)` (hvis der er nok bønner tilbage til det, ellers kværn hvad der er) og log resultatet.
     * - Ellers (for andre `Forbrugsvare`typer), log "INFO: [Navn] er ved at løbe tør."
     * TODO: Definer klasserne. Implementer metoden.
     */
//    public static List<String> opgave5_8_administrerForbrugsvarer(List<Forbrugsvare> varer, int standardForbrug) {
//        // TODO: Implementer.
//        return new ArrayList<>(); // Placeholder
//    }


    /**
     * Opgave 5.9: Kommunikation mellem Enheder
     * ---------------------------------------
     * Hierarki:
     * 1. `KommunikationsEnhed`: `id` (String). `String sendBesked(String besked)` (returnerer "[id] sender: [besked]"). `String modtagBesked(String besked)` (returnerer "[id] modtog: [besked]").
     * 2. `RadioEnhed` (extends `KommunikationsEnhed`): `frekvens` (double). Override `sendBesked` (tilføj "via radio på [frekvens] MHz").
     * 3. `SatellitEnhed` (extends `KommunikationsEnhed`): `satellitNavn` (String). Override `sendBesked` (tilføj "via satellit [satellitNavn]"). Metode `justerAntenne()` (returnerer "Antenne justeret for [satellitNavn]").
     *
     * Opgave:
     * Implementer `opgave5_9_simulerKommunikation(List<KommunikationsEnhed> enheder, String fællesBesked)`:
     * - Metoden skal returnere en `List<String>` med logbeskeder.
     * - For hver enhed i listen:
     * - Log resultatet af at kalde `sendBesked(fællesBesked)`.
     * - Hvis enheden er en `SatellitEnhed`, kald `justerAntenne()` og log resultatet *før* `sendBesked`.
     * TODO: Definer klasserne. Implementer metoden.
     */
//    public static List<String> opgave5_9_simulerKommunikation(List<KommunikationsEnhed> enheder, String fællesBesked) {
//        // TODO: Implementer.
//        return new ArrayList<>(); // Placeholder
//    }

    /**
     * Opgave 5.10: Betalingssystem med Forskellige Metoder
     * ---------------------------------------------------
     * Hierarki:
     * 1. `BetalingsMetode`: `ejerNavn` (String). `boolean godkendBetaling(double beløb)` (returnerer `true` som default). `String getMetodeType()`.
     * 2. `Kreditkort` (extends `BetalingsMetode`): `kortNummer` (String), `udløbsDato` (LocalDate), `kreditLimit` (double). Override `godkendBetaling` (tjekker om `beløb <= kreditLimit`). Override `getMetodeType()`.
     * 3. `BankOverførsel` (extends `BetalingsMetode`): `kontoNummer` (String), `bankNavn` (String). Override `godkendBetaling` (simulerer en forsinkelse og returnerer altid true for denne opgave, men log "Bankoverførsel initialiseret..."). Override `getMetodeType()`.
     * 4. `MobilBetaling` (extends `BetalingsMetode`): `telefonNummer` (String), `maxBeløbPrTransaktion` (double). Override `godkendBetaling` (tjekker `beløb <= maxBeløbPrTransaktion`). Override `getMetodeType()`.
     *
     * Opgave:
     * Implementer `opgave5_10_processerBetalinger(List<BetalingsMetode> metoder, double beløbDerSkalBetales)`:
     * - Itererer gennem listen af betalingsmetoder.
     * - For hver metode, forsøg at kalde `godkendBetaling(beløbDerSkalBetales)`.
     * - Hvis en metode returnerer `true`:
     * - Returner strengen: "Betaling på [beløb] godkendt med [MetodeType] ejet af [EjerNavn]."
     * - (Stop ved første succesfulde betaling).
     * - Hvis ingen metoder kan godkende betalingen, returner: "Betaling på [beløb] kunne ikke gennemføres med nogen metode."
     * TODO: Definer klasserne. Implementer metoden.
     */
//    public static String opgave5_10_processerBetalinger(List<BetalingsMetode> metoder, double beløbDerSkalBetales) {
//        // TODO: Implementer.
//        return "Betaling ikke forsøgt."; // Placeholder
//    }


    public static void main(String[] args) {
        System.out.println("=== Emne 5: Polymorfi - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for hver klasse og brug JUnit-tests til verificering. ===");
    }
}

