package emne14_collections_framework;

import java.util.*; // Importerer hele util for nemheds skyld for brugeren
import java.time.LocalDate; // Kan være relevant for dataobjekter

/**
 * Generel Beskrivelse for Opgavesættet Emne 14: Collection Framework
 * ===================================================================
 * Dette opgavesæt dækker Emne 14: Java Collection Framework.
 * Formålet er at øve brugen af de centrale interfaces (List, Set, Map, Queue, Deque)
 * og deres gængse implementationer (ArrayList, LinkedList, HashSet, LinkedHashSet,
 * TreeSet, HashMap, LinkedHashMap, TreeMap, ArrayDeque). Opgaverne vil også
 * dække brugen af Collections utility-klassen og scenarier, hvor du skal
 * vælge den mest passende collection-type.
 * Alle metoder skal designes med testbarhed for øje.
 */
public class Emne14CollectionsFramework {

    // --- LinkedList<E> (2 opgaver) ---

    /**
     * Opgave 14.1: `LinkedList` som Stak og Kø (Deque-funktionalitet)
     * --------------------------------------------------------------
     * Beskrivelse:
     * Opret en klasse `LinkedListDemo`. I denne klasse skal du implementere to statiske metoder,
     * der bruger en `LinkedList<String>` til at demonstrere stak- og kø-adfærd.
     * 1. `public static List<String> demonstrerStak(LinkedList<String> liste, String[] operationer)`:
     * - `operationer` er et array af strenge. Hver streng starter med "PUSH " eller "POP".
     * - "PUSH [værdi]" tilføjer værdi til starten af listen (som en stak).
     * - "POP" fjerner og returnerer elementet fra starten af listen. Hvis listen er tom, tilføjes "STAK TOM" til resultatlisten.
     * - Metoden skal returnere en `List<String>` med resultaterne af POP operationer (eller "STAK TOM").
     * 2. `public static List<String> demonstrerKø(LinkedList<String> liste, String[] operationer)`:
     * - `operationer` er et array af strenge. Hver streng starter med "ADD " eller "POLL".
     * - "ADD [værdi]" tilføjer værdi til slutningen af listen (som en kø).
     * - "POLL" fjerner og returnerer elementet fra starten af listen. Hvis listen er tom, tilføjes "KØ TOM" til resultatlisten.
     * - Metoden skal returnere en `List<String>` med resultaterne af POLL operationer (eller "KØ TOM").
     * Brug `LinkedList`s `Deque` metoder (f.eks. `addFirst`, `removeFirst`, `addLast`).
     *
     * TODO: Opret LinkedListDemo.java. Implementer de to metoder.
     */

    /**
     * Opgave 14.2: Manipulation af `LinkedList` med `ListIterator`
     * -----------------------------------------------------------
     * Beskrivelse:
     * Opret en klasse `ListManipulator`. Implementer en statisk metode:
     * `public static LinkedList<Integer> manipulerListe(LinkedList<Integer> talListe)`:
     * - Brug en `ListIterator` til at gennemløbe `talListe`.
     * - Under fremadgående iteration: Hvis et tal er lige, erstat det med det dobbelte (brug `set()`).
     * - Efter første gennemløb, brug en ny `ListIterator` (startende fra slutningen) til at iterere baglæns.
     * - Under baglæns iteration: Hvis et tal (nu potentielt fordoblet) er deleligt med 3, fjern det (brug `remove()`).
     * - Metoden skal returnere den modificerede `talListe`.
     *
     * TODO: Opret ListManipulator.java. Implementer metoden.
     */

    // --- Set<E> (3 opgaver) ---

    /**
     * Opgave 14.3: Unikke Elementer og Orden i Sets
     * --------------------------------------------
     * Beskrivelse:
     * Opret en klasse `SetDemo`. Implementer en statisk metode:
     * `public static Map<String, Set<String>> behandlStrengListe(List<String> inputListe)`:
     * - Metoden tager en `List<String>` som input (kan indeholde dubletter).
     * - Metoden skal returnere et `Map<String, Set<String>>` med to entries:
     * - Nøgle "HashSet": Værdi er et `HashSet<String>` oprettet fra `inputListe`.
     * - Nøgle "LinkedHashSet": Værdi er et `LinkedHashSet<String>` oprettet fra `inputListe`.
     * - Dette vil demonstrere fjernelse af dubletter og forskellen i orden.
     *
     * TODO: Opret SetDemo.java. Implementer metoden.
     */

    /**
     * Opgave 14.4: Sorteret Set med `TreeSet`
     * --------------------------------------
     * Beskrivelse:
     * Opret en klasse `TreeSetDemo`.
     * 1. Implementer en statisk metode:
     * `public static TreeSet<String> sorterNavneNaturligt(List<String> navne)`:
     * - Opretter og returnerer et `TreeSet<String>` fra `navne`-listen, hvilket sorterer dem alfabetisk.
     * 2. Definer en `Comparator<String>` (enten som en separat klasse eller et lambda-udtryk i testen/metoden),
     * der sorterer strenge først efter længde (korteste først), og derefter alfabetisk hvis længden er ens.
     * 3. Implementer en statisk metode:
     * `public static TreeSet<String> sorterNavneEfterLængdeSåAlfabetisk(List<String> navne, Comparator<String> customComparator)`:
     * - Opretter og returnerer et `TreeSet<String>` fra `navne`-listen ved hjælp af den givne `customComparator`.
     *
     * TODO: Opret TreeSetDemo.java. Implementer metoderne og den nødvendige Comparator.
     */

    /**
     * Opgave 14.5: Mængdeoperationer på Sets
     * ------------------------------------
     * Beskrivelse:
     * Opret en klasse `SetOperationer`. Implementer følgende statiske metoder,
     * der hver tager to `Set<Integer>` (setA, setB) som input og returnerer et *nyt* `Set<Integer>`:
     * 1. `public static Set<Integer> union(Set<Integer> setA, Set<Integer> setB)`
     * 2. `public static Set<Integer> snit(Set<Integer> setA, Set<Integer> setB)` (intersection)
     * 3. `public static Set<Integer> differens(Set<Integer> setA, Set<Integer> setB)` (elementer i A men ikke i B)
     * Du må gerne bruge `Set`-interfacets indbyggede metoder som `addAll`, `retainAll`, `removeAll`.
     *
     * TODO: Opret SetOperationer.java. Implementer metoderne.
     */

    // --- Map<K,V> (2 opgaver) ---

    /**
     * Opgave 14.6: Optælling af Ordfrekvenser med `HashMap`
     * ----------------------------------------------------
     * Beskrivelse:
     * Opret en klasse `Ordtæller`. Implementer en statisk metode:
     * `public static Map<String, Integer> tælOrdfrekvenser(String tekst)`:
     * - Metoden tager en `String` `tekst` som input.
     * - Den skal splitte teksten i ord (f.eks. ved mellemrum).
     * - Konverter alle ord til små bogstaver.
     * - Fjern simpel tegnsætning (f.eks. ',', '.', '!', '?') fra slutningen af ordene.
     * - Metoden skal returnere et `Map<String, Integer>`, hvor hver nøgle er et unikt ord
     * fra teksten, og værdien er antallet af gange, ordet forekommer.
     * - Brug `HashMap` til at gemme frekvenserne.
     *
     * Eksempel: "Hej med dig, hej igen!" -> {"hej": 2, "med": 1, "dig": 1, "igen": 1}
     *
     * TODO: Opret Ordtæller.java. Implementer metoden.
     */

    /**
     * Opgave 14.7: Telefonbog med `TreeMap`
     * ------------------------------------
     * Filnavne: KontaktPerson.java, Telefonbog.java
     *
     * Beskrivelse:
     * 1. Klasse `KontaktPerson`: `navn` (String), `telefonnummer` (String). Konstruktør, getters. `equals/hashCode` på navn.
     * 2. Klasse `Telefonbog`:
     * - Attribut (private): `kontakter` (TreeMap<String, String>). Nøglen er kontaktens navn, værdien er telefonnummeret.
     * `TreeMap` vil holde kontakterne sorteret alfabetisk efter navn.
     * - Metoder:
     * - `boolean tilføjKontakt(String navn, String telefonnummer)`: Tilføjer hvis navn ikke allerede eksisterer.
     * - `String hentNummer(String navn)`: Returnerer nummer eller null.
     * - `boolean fjernKontakt(String navn)`: Fjerner kontakt. Returnerer succes.
     * - `List<String> hentAlleKontakterFormateret()`: Returnerer en liste af strenge,
     * hvor hver streng er formateret som "[Navn]: [Nummer]", sorteret efter navn.
     *
     * TODO: Opret KontaktPerson.java (eller brug en simpel String for navn) og Telefonbog.java. Implementer.
     */

    // --- Queue<E> (1 opgave) ---

    /**
     * Opgave 14.8: Simpel Opgavekø (FIFO)
     * ------------------------------------
     * Beskrivelse:
     * Opret en klasse `PrinterKøManager`.
     * - Attribut (private): `printJobs` (Queue<String>). Brug `ArrayDeque` til initialisering.
     * - Metoder:
     * - `void tilføjPrintJob(String jobBeskrivelse)`: Tilføjer job til køen.
     * - `String behandlNæstePrintJob()`: Fjerner og returnerer det næste job fra køen.
     * Returnerer "Ingen jobs i køen" hvis køen er tom.
     * - `int getAntalVentendeJobs()`: Returnerer antallet af jobs i køen.
     * - `String seNæsteJob()`: Returnerer det næste job uden at fjerne det.
     * Returnerer "Ingen jobs i køen" hvis køen er tom.
     *
     * TODO: Opret PrinterKøManager.java. Implementer metoderne.
     */

    // --- Collections Utility Klassen (1 opgave) ---

    /**
     * Opgave 14.9: Anvendelse af `Collections` Hjælpemetoder
     * ----------------------------------------------------
     * Beskrivelse:
     * Opret en klasse `ListeUtilities`. Implementer en statisk metode:
     * `public static Map<String, Object> analyserOgManipulerListe(List<Integer> talListe, Integer talAtTælle)`:
     * - Metoden tager en `List<Integer>` (som vil blive modificeret) og et `Integer` som input.
     * - Den skal udføre følgende operationer *i rækkefølge* på en *kopi* af den originale liste (for at undgå at ændre inputlisten til senere steps):
     * 1. Opret en kopi af `talListe`.
     * 2. Sortér kopien stigende. Gem resultatet.
     * 3. Vend den sorterede kopi om (så den bliver faldende). Gem resultatet.
     * 4. Bland den oprindelige `talListe` (den der blev sendt ind som parameter) tilfældigt.
     * 5. Find det største element i den oprindelige `talListe` (efter blanding).
     * 6. Find det mindste element i den oprindelige `talListe`.
     * 7. Tæl antallet af forekomster af `talAtTælle` i den oprindelige `talListe`.
     * - Metoden skal returnere et `Map<String, Object>` der indeholder følgende nøgler med tilhørende værdier:
     * - "sortedList" -> den sorterede liste (fra step 2)
     * - "reversedList" -> den omvendte sorterede liste (fra step 3)
     * - "shuffledOriginalList" -> den blandede oprindelige liste (fra step 4 - selve inputlisten modificeres)
     * - "maxValue" -> det største element (fra step 5)
     * - "minValue" -> det mindste element (fra step 6)
     * - "frequency" -> frekvensen af `talAtTælle` (fra step 7)
     *
     * TODO: Opret ListeUtilities.java. Implementer metoden. Brug relevante metoder fra `Collections`-klassen.
     */

    // --- Valg af Korrekt Collection (4 opgaver) ---
    // For disse opgaver skal du returnere et tal (1-4) der angiver dit valg.

    /**
     * Opgave 14.10: Scenarie - Unikke brugernavne, hurtigt opslag
     * ---------------------------------------------------------
     * Beskrivelse: Du skal gemme en samling af brugernavne for et system. Hvert brugernavn
     * skal være unikt. Du skal ofte og hurtigt kunne tjekke, om et givet brugernavn
     * allerede eksisterer. Rækkefølgen af brugernavne er ikke vigtig.
     *
     * Spørgsmål: Hvilken Collection interface og konkret implementering er bedst egnet?
     * Svarmuligheder:
     * 1. `List<String>`, `ArrayList<String>`
     * 2. `Set<String>`, `HashSet<String>`
     * 3. `Map<String, String>`, `HashMap<String, String>`
     * 4. `Queue<String>`, `LinkedList<String>`
     */
    public static int opgave14_10_svarUnikkeBrugernavne() {
        // TODO: Returner det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 14.11: Scenarie - Redigerbar indkøbsliste, rækkefølge vigtig
     * ------------------------------------------------------------------
     * Beskrivelse: Du skal implementere en indkøbsliste. Brugeren kan tilføje varer,
     * fjerne varer, og se varerne i den rækkefølge, de blev tilføjet. Dubletter er
     * tilladt (f.eks. "2 x mælk", hvilket ville betyde to separate "mælk" entries).
     * Du skal også nemt kunne tilgå varer via et indeks (f.eks. hente vare nr. 3).
     *
     * Spørgsmål: Hvilken Collection interface og konkret implementering er bedst egnet?
     * Svarmuligheder:
     * 1. `Set<String>`, `TreeSet<String>`
     * 2. `List<String>`, `ArrayList<String>`
     * 3. `Map<String, Integer>`, `LinkedHashMap<String, Integer>`
     * 4. `Deque<String>`, `ArrayDeque<String>`
     */
    public static int opgave14_11_svarIndkøbsliste() {
        // TODO: Returner det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 14.12: Scenarie - Oversættelsesordbog (Dansk til Engelsk)
     * ----------------------------------------------------------------
     * Beskrivelse: Du skal lave en ordbog, der kan slå danske ord op og returnere deres
     * primære engelske oversættelse. Hvert dansk ord har én engelsk oversættelse.
     * Opslag skal være hurtige baseret på det danske ord. Rækkefølgen af ordpar er
     * ikke vigtig for opslagsfunktionen.
     *
     * Spørgsmål: Hvilken Collection interface og konkret implementering er bedst egnet?
     * Svarmuligheder:
     * 1. `List<String>`, `LinkedList<String>` (hvor hver anden streng er dansk/engelsk)
     * 2. `Set<Map.Entry<String, String>>`, `HashSet<Map.Entry<String, String>>`
     * 3. `Map<String, String>`, `HashMap<String, String>` (DanskOrd -> EngelskOrd)
     * 4. `List<Par<String,String>>`, `ArrayList<Par<String,String>>` (hvor Par er en custom klasse)
     */
    public static int opgave14_12_svarOrdbog() {
        // TODO: Returner det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 14.13: Scenarie - Behandling af support-sager (FIFO)
     * -----------------------------------------------------------
     * Beskrivelse: Et supportsystem modtager kundehenvendelser (repræsenteret som strenge).
     * Disse henvendelser skal behandles strikt i den rækkefølge, de ankommer (First-In, First-Out).
     * Nye henvendelser tilføjes til sidst i samlingen, og den ældste henvendelse
     * (den der har ventet længst) skal altid behandles/fjernes først.
     *
     * Spørgsmål: Hvilken Collection interface og konkret implementering er bedst egnet
     * til at håndtere de ventende henvendelser?
     *
     * Svarmuligheder:
     * 1. `List<String>`, `ArrayList<String>` (med manuel styring af ender)
     * 2. `Set<String>`, `LinkedHashSet<String>`
     * 3. `Queue<String>`, `ArrayDeque<String>` (eller `LinkedList<String>`)
     * 4. `Stack<String>` (som er en List-implementation)
     */
    public static int opgave14_13_svarSupportSager() {
        // TODO: Returner det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }


    public static void main(String[] args) {
        System.out.println("=== Emne 14: Collection Framework - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for hver klasse/interface og brug JUnit-tests. ===");
    }
}