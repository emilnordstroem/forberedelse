package emne16_soegeskabelon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects; // For equals i evt. hjælpeklasser

/**
 * Generel Beskrivelse for Opgavesættet Emne 16: Søgeskabelonen
 * ============================================================
 * Dette opgavesæt fokuserer på Emne 16: Søgeskabelonen, herunder
 * Lineær Søgning og Binær Søgning.
 * Formålet er at implementere og anvende disse søgealgoritmer på
 * forskellige datatyper og i forskellige scenarier.
 * Alle metoder skal designes med testbarhed for øje.
 * Opret separate .java filer for de klasser, der evt. skal defineres.
 */
public class Emne16SøgeSkabelon {

    /**
     * Opgave 16.1: Lineær Søgning - Find Første Element Større End X
     * ------------------------------------------------------------
     * Filnavn: LineærSøgningMetoder.java (eller direkte her hvis kun én metode)
     *
     * Beskrivelse:
     * Implementer en statisk metode `int findFirstGreaterThan(int[] talArray, int x)`:
     * - Metoden skal anvende lineær søgning til at finde det *første* element i `talArray`,
     * som er strengt større end `x`.
     * - Hvis et sådant element findes, returneres elementets værdi.
     * - Hvis intet element er større end `x`, eller hvis arrayet er tomt/null,
     * returneres `Integer.MIN_VALUE` som en signalværdi.
     *
     * TODO: Implementer metoden.
     */
    public static int opgave16_1_findFirstGreaterThan(int[] talArray, int x) {
        // TODO: Implementer lineær søgning for at finde første tal > x.
        // Husk at håndtere null og tomt array.
        return Integer.MIN_VALUE; // Placeholder
    }

    /**
     * Opgave 16.2: Lineær Søgning - Find Sidste Forekomst af String i Liste
     * --------------------------------------------------------------------
     * Filnavn: LineærSøgningMetoder.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `int findLastOccurrence(List<String> tekstListe, String søgeStreng)`:
     * - Metoden skal anvende lineær søgning til at finde indekset på den *sidste*
     * forekomst af `søgeStreng` i `tekstListe`.
     * - Søgningen skal være case-sensitiv.
     * - Hvis `søgeStreng` ikke findes, eller hvis listen er null/tom, returneres -1.
     *
     * TODO: Implementer metoden. Overvej at iterere listen baglæns for at finde den sidste forekomst nemmere.
     */
    public static int opgave16_2_findLastOccurrence(List<String> tekstListe, String søgeStreng) {
        // TODO: Implementer lineær søgning for at finde sidste forekomst.
        // Håndter null/tom liste og null søgeStreng.
        return -1; // Placeholder
    }

    /**
     * Opgave 16.3: Lineær Søgning - Tæl Bøger fra Specifikt Forlag
     * ------------------------------------------------------------
     * Filnavne: BogSog.java, BogSøgningsFunktioner.java
     *
     * Beskrivelse:
     * 1. Klasse `BogSog`:
     * - Attributter: `titel` (String), `forfatter` (String), `forlag` (String), `udgivelsesår` (int).
     * - Konstruktør, Get-metoder.
     * 2. Klasse `BogSøgningsFunktioner`:
     * - Statisk metode `int tælBøgerFraForlag(List<BogSog> bøger, String forlagNavn)`:
     * - Metoden skal tælle, hvor mange bøger i listen `bøger` der er udgivet af `forlagNavn`.
     * - Søgningen skal være case-insensitive for forlagsnavnet.
     * - Håndter null/tom bogliste og null forlagNavn.
     *
     * TODO: Opret BogSog.java og BogSøgningsFunktioner.java. Implementer metoden.
     */
    // Metoden forventes i BogSøgningsFunktioner.java, men kan testes via statisk reference.

    /**
     * Opgave 16.4: Lineær Søgning - Find Produkt med Specifikt ID
     * ----------------------------------------------------------
     * Filnavne: ProduktSog.java, ProduktSøgningsFunktioner.java
     *
     * Beskrivelse:
     * 1. Klasse `ProduktSog`:
     * - Attributter: `produktId` (String), `navn` (String), `kategori` (String).
     * - Konstruktør, Get-metoder. `equals` (baseret på `produktId`).
     * 2. Klasse `ProduktSøgningsFunktioner`:
     * - Statisk metode `ProduktSog findProduktViaId(ArrayList<ProduktSog> produktListe, String id)`:
     * - Returnerer det `ProduktSog`-objekt fra `produktListe`, der har det matchende `id`.
     * - Returnerer `null` hvis intet produkt med det ID findes, eller hvis listen/ID er null/tom.
     * - Søgningen skal være case-sensitiv for ID.
     *
     * TODO: Opret ProduktSog.java og ProduktSøgningsFunktioner.java. Implementer metoden.
     */

    /**
     * Opgave 16.5: Lineær Søgning - Find Strenge Indeholdende Delstreng
     * ----------------------------------------------------------------
     * Filnavn: StrengManipulationSøgning.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `List<String> findStrengeMedDelstreng(List<String> alleStrenge, String delStreng)`:
     * - Metoden skal returnere en *ny* liste (`ArrayList`) indeholdende alle de strenge fra
     * `alleStrenge`, som indeholder `delStreng`.
     * - Søgningen efter delstrengen skal være case-insensitive.
     * - Hvis inputlisten, `delStreng` er null/tom, eller ingen strenge matcher, returneres en tom liste.
     *
     * TODO: Implementer metoden.
     */
    public static List<String> opgave16_5_findStrengeMedDelstreng(List<String> alleStrenge, String delStreng) {
        // TODO: Implementer lineær søgning og filtrering.
        // Håndter edge cases.
        return new ArrayList<>(); // Placeholder
    }

    /**
     * Opgave 16.6: Iterativ Binær Søgning i Array
     * -------------------------------------------
     * Filnavn: BinærSøgning.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `int iterativBinærSøgning(int[] sorteretArray, int søgeVærdi)`:
     * - Metoden skal implementere binær søgning *iterativt* for at finde `søgeVærdi`
     * i det *sorterede* `sorteretArray`.
     * - Hvis værdien findes, returneres indekset på værdien.
     * - Hvis værdien ikke findes, eller arrayet er null/tomt, returneres -1.
     *
     * TODO: Implementer metoden som beskrevet i dine noter (iterativ version).
     */
    public static int opgave16_6_iterativBinærSøgning(int[] sorteretArray, int søgeVærdi) {
        // TODO: Implementer iterativ binær søgning.
        // Håndter edge cases.
        return -1; // Placeholder
    }

    /**
     * Opgave 16.7: Rekursiv Binær Søgning i Array
     * ------------------------------------------
     * Filnavn: BinærSøgning.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `int rekursivBinærSøgning(int[] sorteretArray, int søgeVærdi)`:
     * - Metoden skal implementere binær søgning *rekursivt*. Du skal sandsynligvis
     * oprette en privat statisk hjælpemetode, der tager `low` og `high` indekser som parametre.
     * - Hvis værdien findes, returneres indekset på værdien.
     * - Hvis værdien ikke findes, eller arrayet er null/tomt, returneres -1.
     *
     * TODO: Implementer metoden og den nødvendige rekursive hjælpemetode.
     */
    public static int opgave16_7_rekursivBinærSøgning(int[] sorteretArray, int søgeVærdi) {
        // TODO: Dette er "wrapper"-metoden. Kald din rekursive hjælpemetode herfra.
        // Håndter null/tomt array her, før du kalder hjælpemetoden.
        // F.eks.: return rekursivHjælper(sorteretArray, søgeVærdi, 0, sorteretArray.length - 1);
        return -1; // Placeholder
    }
    // TODO: Definer din private static int rekursivHjælper(...) her.


    /**
     * Opgave 16.8: Binær Søgning på Liste af `Comparable` Objekter
     * -----------------------------------------------------------
     * Filnavne: VareData.java, VareSøgning.java
     *
     * Beskrivelse:
     * 1. Klasse `VareData` implements `Comparable<VareData>`:
     * - Attributter: `varekode` (String), `navn` (String), `pris` (double).
     * - Konstruktør, Get-metoder.
     * - `compareTo` skal sortere primært på `pris` (stigende). Sekundært på `varekode` (alfabetisk) hvis priser er ens.
     * 2. Klasse `VareSøgning`:
     * - Statisk metode `boolean findVareMedPris(List<VareData> sorteredeVarer, double søgePris)`:
     * - Metoden skal bruge en binær søgnings-lignende tilgang til at afgøre, om der findes
     * en vare i den *sorterede* liste `sorteredeVarer` med en pris, der er "tæt på" `søgePris`
     * (f.eks. inden for en tolerance på +/- 0.01). Da binær søgning typisk leder efter eksakt match
     * og listen er sorteret på pris, kan du modificere binær søgning til at stoppe, når du finder
     * et element, hvis pris er inden for tolerancen af `søgePris`.
     * - Returner `true` hvis en sådan vare findes, ellers `false`.
     * - Håndter null/tom liste.
     *
     * TODO: Opret VareData.java og VareSøgning.java. Implementer metoden.
     * Du kan evt. bruge `Collections.binarySearch` med en custom Comparator for at finde et
     * element og så tjekke prisen, eller implementere logikken manuelt.
     * For denne opgave, prøv at implementere binær søgningslogikken manuelt.
     */
    // Metoden forventes i VareSøgning.java.

    /**
     * Opgave 16.9: Find Indsætningspunkt i Sorteret Array
     * --------------------------------------------------
     * Filnavn: BinærSøgning.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `int findInsertionPoint(int[] sorteretArray, int værdi)`:
     * - Metoden skal returnere det indeks `i`, hvor `værdi` *ville* blive indsat i `sorteretArray`
     * for at bevare sorteringen. Dvs. alle elementer før indeks `i` er `< værdi` (eller `<= værdi`
     * hvis duplikater håndteres på en bestemt måde), og alle elementer fra og med indeks `i`
     * er `>= værdi`.
     * - Hvis `værdi` er mindre end alle elementer, returneres 0.
     * - Hvis `værdi` er større end alle elementer, returneres `sorteretArray.length`.
     * - Hvis arrayet er null eller tomt, kan du returnere 0.
     * - Overvej at bruge en modificeret binær søgning.
     *
     * Eksempel:
     * sorteretArray = {2, 5, 7, 8, 11, 12}, værdi = 6 => returnerer 2 (indeks for 7)
     * sorteretArray = {2, 5, 7, 8, 11, 12}, værdi = 13 => returnerer 6
     * sorteretArray = {2, 5, 7, 8, 11, 12}, værdi = 1 => returnerer 0
     *
     * TODO: Implementer metoden.
     */
    public static int opgave16_9_findInsertionPoint(int[] sorteretArray, int værdi) {
        // TODO: Implementer logik til at finde korrekt indsætningspunkt.
        // Håndter edge cases.
        return 0; // Placeholder
    }

    /**
     * Opgave 16.10: Valg af Søgestrategi (Teoretisk)
     * ----------------------------------------------
     * Problemstilling:
     * Du har to lister med produktnavne (strenge):
     * - Liste A er **usorteret**.
     * - Liste B er **sorteret alfabetisk**.
     * Du skal i begge lister effektivt tjekke, om et specifikt produktnavn findes.
     *
     * Spørgsmål:
     * Hvilken grundlæggende søgemetode er generelt mest effektiv (dvs. vil i
     * gennemsnit eller i værste fald kræve færrest sammenligninger for at finde et element
     * eller konstatere, at det ikke findes) for henholdsvis Liste A og Liste B?
     *
     * Svarmuligheder:
     * 1. Liste A: Lineær søgning; Liste B: Lineær søgning (da det altid virker).
     * 2. Liste A: Binær søgning (kan altid tilpasses); Liste B: Lineær søgning.
     * 3. Liste A: Lineær søgning; Liste B: Binær søgning.
     * 4. Liste A: Binær søgning (hvis man først sorterer den); Liste B: Binær søgning.
     *
     * (Fokus er på den mest direkte og generelt effektive metode for den *givne* tilstand af listen).
     */
    public static int opgave16_10_svarSøgestrategiValg() { // Metodenavn er ændret for klarhed
        // TODO: Returner det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 16: Søgeskabelonen - Main metode til VALGFRI manuel test ===");
    }
}

