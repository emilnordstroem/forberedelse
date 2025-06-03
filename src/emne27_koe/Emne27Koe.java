package emne27_koe;

import java.util.*; // Importerer hele util for nemheds skyld

/**
 * Generel Beskrivelse for Opgavesættet Emne 27: Kø (Queue)
 * =======================================================
 * Dette opgavesæt fokuserer på Emne 27: Kø (Queue) datastrukturen.
 * Formålet er at implementere køer ved hjælp af både arrays (som cirkulær buffer)
 * og kædede lister, samt at anvende kø-konceptet til at løse forskellige problemer,
 * der naturligt følger FIFO-princippet.
 * Opret separate .java filer for de klasser, der skal defineres.
 */
public class Emne27Koe {

    /**
     * Opgave 27.1: Array-baseret Kø (Cirkulær Buffer, Fast Størrelse)
     * --------------------------------------------------------------
     * Filnavn: ArrayKø.java, KøFuldException.java (custom unchecked exception)
     *
     * Beskrivelse:
     * Implementer en generisk klasse `ArrayKø<E>` der repræsenterer en kø
     * med en fast maksimal kapacitet, som angives i konstruktøren.
     * Køen skal internt bruge et array og implementeres som en **cirkulær buffer**
     * for at udnytte pladsen effektivt. Du skal bruge `front`, `rear` indekser og en `size` tæller.
     * Metoder:
     * 1. Konstruktør: `ArrayKø(int kapacitet)`.
     * 2. `void enqueue(E element)`: Tilføjer element bagerst i køen. Kaster `KøFuldException` hvis køen er fuld.
     * 3. `E dequeue()`: Fjerner og returnerer elementet forrest i køen. Kaster `NoSuchElementException` hvis tom.
     * 4. `E peek()`: Returnerer elementet forrest uden at fjerne det. Kaster `NoSuchElementException` hvis tom.
     * 5. `boolean erTom()`.
     * 6. `int size()`.
     * 7. `boolean erFuld()`.
     *
     * TODO: Opret KøFuldException.java og ArrayKø.java. Implementer den cirkulære buffer logik.
     */

    /**
     * Opgave 27.2: Kædet Kø (Implementering)
     * -------------------------------------
     * Filnavn: MinKædetKø.java (indeholder evt. intern Node klasse)
     *
     * Beskrivelse:
     * Implementer en generisk klasse `MinKædetKø<E>` der opfører sig som en kø (FIFO).
     * Internt skal den bruge en enkeltkædet liste med referencer til både `head` (forrest) og `tail` (bagerst)
     * for at sikre O(1) tidskompleksitet for `enqueue` og `dequeue`.
     * Metoder: `void enqueue(E element)`, `E dequeue()`, `E peek()`, `boolean erTom()`, `int size()`.
     * `dequeue()` og `peek()` skal kaste `NoSuchElementException` hvis køen er tom.
     *
     * TODO: Opret MinKædetKø.java (og dens Node). Implementer metoderne.
     */

    /**
     * Opgave 27.3: Implementer `Deque` med `MinDobbeltKædetListe` (Adapter/Wrapper)
     * ----------------------------------------------------------------------------
     * Filnavne: MinSimpelDeque.java (genbrug evt. MinDobbeltKædetListe.java fra Emne 25)
     *
     * Beskrivelse:
     * Opret en generisk klasse `MinSimpelDeque<E>` der implementerer et simpelt subset af `java.util.Deque` interfacet.
     * Internt skal denne klasse *bruge* (via komposition/aggregering) en instans af din
     * `MinDobbeltKædetListe<E>` fra Emne 25 til at levere funktionaliteten.
     * Implementer følgende metoder fra `Deque`-interfacet (eller med lignende navne):
     * - `void addFirst(E e)`
     * - `void addLast(E e)`
     * - `E removeFirst()` (kaster `NoSuchElementException` hvis tom)
     * - `E removeLast()` (kaster `NoSuchElementException` hvis tom)
     * - `E peekFirst()` (returnerer null hvis tom)
     * - `E peekLast()` (returnerer null hvis tom)
     * - `boolean isEmpty()`
     * - `int size()`
     *
     * TODO: Opret MinSimpelDeque.java. Implementer den ved at delegere kald til din dobbeltkædede liste.
     * Du skal muligvis justere din MinDobbeltKædetListe til at have de nødvendige metoder
     * (f.eks. peekFirst/Last uden at fjerne, og returnere null hvis tom for disse).
     */

    /**
     * Opgave 27.4: Simuler Printerkø
     * ------------------------------
     * Filnavne: PrintJob.java, PrinterManager.java
     *
     * Beskrivelse:
     * 1. Klasse `PrintJob`: Attributter `dokumentNavn` (String), `antalSider` (int). Konstruktør, getters.
     * 2. Klasse `PrinterManager`:
     * - Attribut (private): `printKø` (Deque<PrintJob> - brug `ArrayDeque` til initialisering).
     * - Metoder:
     * - `void tilføjPrintJob(PrintJob job)`: Tilføjer et job til køen.
     * - `PrintJob behandlNæstePrintJob()`: Fjerner og returnerer det næste job fra køen. Returnerer `null` hvis køen er tom.
     * - `int getAntalJobsIKø()`: Returnerer antallet af ventende jobs.
     * - `String seAlleJobs()`: Returnerer en streng med en oversigt over alle jobs i køen (uden at ændre køen).
     *
     * TODO: Opret PrintJob.java og PrinterManager.java. Implementer.
     */

    /**
     * Opgave 27.5: Palindrom Tjek med Stak og Kø
     * -----------------------------------------
     * Filnavn: PalindromTjekker.java
     *
     * Beskrivelse:
     * Implementer en statisk metode i klassen `PalindromTjekker`:
     * `public static boolean erPalindrom(String tekst)`:
     * - Metoden skal tjekke om `tekst` er et palindrom.
     * - Ignorer store/små bogstaver og alle tegn, der ikke er bogstaver (a-z).
     * - Algoritme:
     * 1. Opret en stak (`Deque<Character>`) og en kø (`Queue<Character>`).
     * 2. Gennemløb `tekst`. For hvert bogstav: normaliser til småt bogstav og tilføj det til *både* stakken og køen.
     * 3. Så længe stakken (og dermed køen) ikke er tom: Pop et tegn fra stakken og dequeue et tegn fra køen.
     * Hvis de to tegn på noget tidspunkt er forskellige, er teksten ikke et palindrom.
     * 4. Hvis alle tegn matcher, er det et palindrom.
     * - Håndter `null` eller tom streng (anses som palindrom).
     *
     * TODO: Opret PalindromTjekker.java. Implementer metoden.
     */

    /**
     * Opgave 27.6: "Hot Potato" Spil Simulering
     * -----------------------------------------
     * Filnavn: HotPotatoSpil.java
     *
     * Beskrivelse:
     * Implementer en statisk metode i klassen `HotPotatoSpil`:
     * `public static String spilHotPotato(List<String> spillerNavne, int antalHopPrRunde)`:
     * - Metoden simulerer "Hot Potato" spillet.
     * - Læg alle `spillerNavne` i en kø (`Queue<String>`).
     * - I hver runde: Dequeue en spiller og enqueue spilleren igen `antalHopPrRunde - 1` gange.
     * Den næste spiller, der dequeues, er "ude" af spillet.
     * - Gentag processen, indtil kun én spiller er tilbage i køen.
     * - Returner navnet på denne vinder.
     * - Håndter `null`/tom `spillerNavne`-liste (returner f.eks. "Ingen spillere") eller `antalHopPrRunde < 1` (returner f.eks. første spiller).
     *
     * TODO: Opret HotPotatoSpil.java. Implementer metoden.
     */

    /**
     * Opgave 27.7: Sammenflet To Køer Alternativt (NY OPGAVE)
     * ----------------------------------------------------
     * Filnavn: KøOperationer.java (eller direkte her som statisk metode)
     *
     * Beskrivelse:
     * Implementer en statisk metode:
     * `public static Queue<Integer> sammenfletKøerAlternativt(Queue<Integer> koe1, Queue<Integer> koe2)`:
     * - Metoden tager to køer af heltal (`koe1` og `koe2`) som input.
     * - Den skal returnere en *ny* kø (f.eks. en `LinkedList` eller `ArrayDeque`), der indeholder
     * elementerne fra `koe1` og `koe2` flettet sammen "alternativt". Det betyder:
     * Først tages et element fra `koe1`, så et element fra `koe2`, så det næste fra `koe1`,
     * så det næste fra `koe2`, og så videre, indtil en af køerne (eller begge) er tomme.
     * - Hvis den ene kø løber tør for elementer før den anden, skal alle de
     * resterende elementer fra den længste kø tilføjes til sidst i den nye kø.
     * - De oprindelige køer (`koe1` og `koe2`) skal være tomme efter operationen,
     * da alle deres elementer er blevet flyttet til den nye kø.
     * - Håndter hvis en eller begge inputkøer er `null` (returner f.eks. den anden kø, en tom kø, eller den ikke-null kø).
     *
     * Eksempel:
     * koe1 = [1, 3, 5] (forrest til bagerst)
     * koe2 = [2, 4, 6, 7, 8] (forrest til bagerst)
     * Resultat ny kø: [1, 2, 3, 4, 5, 6, 7, 8]
     *
     * koe1 = [A, B]
     * koe2 = [1, 2, 3]
     * Resultat ny kø: [A, 1, B, 2, 3] (hvis det var blandede typer, her er det Integer)
     *
     * TODO: Opret KøOperationer.java (eller implementer statisk her). Implementer metoden.
     */
    public static Queue<Integer> opgave27_7_sammenfletKøerAlternativt(Queue<Integer> koe1, Queue<Integer> koe2) {
        // TODO: Implementer logikken til at flette de to køer alternativt.
        // Husk at tømme de oprindelige køer.
        return new ArrayDeque<>(); // Placeholder
    }

    /**
     * Opgave 27.8: Kundeservice Ventekø System
     * ---------------------------------------
     * Filnavne: Kundesag.java, KundeserviceCenter.java
     *
     * Beskrivelse:
     * 1. Klasse `Kundesag`: `sagsNummer` (int), `kundeNavn` (String), `problemType` (String). Konstruktør, getters.
     * 2. Klasse `KundeserviceCenter`:
     * - Attributter: `sagsKø` (private Deque<Kundesag>), `maxKøLængde` (private final int).
     * - Konstruktør: `KundeserviceCenter(int maxKøLængde)`.
     * - Metoder:
     * - `boolean modtagNySag(Kundesag sag)`: Tilføjer sagen til `sagsKø`, hvis der er plads (`size() < maxKøLængde`). Returnerer succes.
     * - `Kundesag ekspederNæsteSag()`: Fjerner og returnerer den næste sag. Returnerer null hvis køen er tom.
     * - `int getAntalSagerIVent()`: Antal sager i kø.
     * - `boolean erKøFuld()`: Tjekker om køen har nået `maxKøLængde`.
     *
     * TODO: Opret Kundesag.java og KundeserviceCenter.java. Implementer.
     */

    /**
     * Opgave 27.9: Omvend de Første K Elementer i en Kø (NY OPGAVE)
     * ------------------------------------------------------------
     * Filnavn: KøManipulation.java (eller direkte her som statisk metode)
     *
     * Beskrivelse:
     * Implementer en statisk metode `void omvendFørsteKElementer(Queue<Integer> kø, int k)`:
     * - Metoden tager en kø af heltal (`Queue<Integer>`) og et heltal `k` som input.
     * - De første `k` elementer i køen skal have deres rækkefølge omvendt.
     * - De resterende elementer i køen (elementer efter de første `k`) skal forblive
     * i deres oprindelige relative rækkefølge og komme *efter* de `k` omvendte elementer.
     * - Køen skal modificeres "in-place".
     * - Hvis `k` er større end eller lig med køens størrelse, skal hele køen omvendes.
     * - Hvis `k <= 0`, skal køen forblive uændret.
     * - Hint: Brug en stak (`Deque<Integer>` brugt som stak) som hjælpe-datastruktur til at
     * gemme de første `k` elementer midlertidigt.
     *
     * Eksempel:
     * kø = [1, 2, 3, 4, 5, 6] (forrest til bagerst), k = 3
     * Efter kald: kø = [3, 2, 1, 4, 5, 6]
     *
     * kø = [A, B, C, D], k = 5 (større end size)
     * Efter kald: kø = [D, C, B, A]
     *
     * TODO: Opret KøManipulation.java (eller implementer statisk her). Implementer metoden.
     */
    public static void opgave27_9_omvendFørsteKElementerIKø(Queue<Integer> kø, int k) {
        // TODO: Implementer logikken. Håndter null kø, k <= 0, og k >= kø.size().
    }

    /**
     * Opgave 27.10: Teoretisk - FIFO vs. LIFO
     * ---------------------------------------
     * Spørgsmål:
     * En række personer ankommer til en billetluge. Systemet skal sikre, at den person,
     * der ankom først, også betjenes først.
     *
     * Hvilket data-organisationsprincip og tilsvarende abstrakt datastruktur
     * er mest velegnet til at administrere rækkefølgen af personer, der venter?
     *
     * Svarmuligheder:
     * 1. LIFO (Last-In, First-Out) - implementeret med en Stak.
     * 2. FIFO (First-In, First-Out) - implementeret med en Kø.
     * 3. Tilfældig adgang - implementeret med et Array eller ArrayList.
     * 4. Sorteret orden baseret på navn - implementeret med et TreeSet.
     *
     * TODO: Sæt variablen 'ditSvar' i metoden opgave27_10_svarFifoLifo() til det korrekte svar-nummer (1-4).
     */
    public static int opgave27_10_svarFifoLifo() {
        int ditSvar = 0;
        // TODO: Sæt ditSvar til 1, 2, 3 eller 4.
        return ditSvar;
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 27: Kø (Queue) - Main metode til VALGFRI manuel test ===");
    }
}