package emne17_sortering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects; // For equals/hashCode i evt. hjælpeklasser

/**
 * Generel Beskrivelse for Opgavesættet Emne 17: Sortering
 * =======================================================
 * Dette opgavesæt fokuserer på Emne 17: Sortering.
 * Formålet er at implementere og forstå forskellige simple sorteringsalgoritmer
 * (Bubble Sort, Selection Sort, Insertion Sort), sortere objekter ved hjælp af
 * Comparable og Comparator, samt overveje egenskaber ved sorteringsalgoritmer.
 * Opret separate .java filer for de klasser, der evt. skal defineres.
 * Alle sorteringsmetoder, der modificerer et array/liste, skal gøre det "in-place".
 */
public class Emne17Sortering {

    /**
     * Opgave 17.1: Implementer Bubble Sort
     * ------------------------------------
     * Filnavn: SimpleSorteringsAlgoritmer.java (eller direkte her hvis kun denne metode)
     *
     * Beskrivelse:
     * Implementer en statisk metode `void bubbleSort(int[] arr)` der sorterer
     * det givne `arr` af heltal i stigende rækkefølge ved hjælp af Bubble Sort algoritmen.
     * Metoden skal modificere arrayet `arr` direkte (in-place).
     *
     * TODO: Implementer bubbleSort metoden. Håndter null eller tomt array (gør intet).
     */
    public static void opgave17_1_bubbleSort(int[] arr) {
        // TODO: Implementer Bubble Sort her.
    }

    /**
     * Opgave 17.2: Implementer Selection Sort
     * ---------------------------------------
     * Filnavn: SimpleSorteringsAlgoritmer.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `void selectionSort(String[] arr)` der sorterer
     * det givne `arr` af strenge i alfabetisk (stigende) rækkefølge ved hjælp af
     * Selection Sort algoritmen. Brug `compareTo` for strenge.
     * Metoden skal modificere arrayet `arr` direkte (in-place).
     *
     * TODO: Implementer selectionSort metoden. Håndter null eller tomt array.
     */
    public static void opgave17_2_selectionSort(String[] arr) {
        // TODO: Implementer Selection Sort her.
    }

    /**
     * Opgave 17.3: Implementer Insertion Sort
     * ---------------------------------------
     * Filnavn: SimpleSorteringsAlgoritmer.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `void insertionSort(List<Double> list)` der sorterer
     * den givne `list` af `Double` i stigende rækkefølge ved hjælp af Insertion Sort algoritmen.
     * Metoden skal modificere listen `list` direkte (in-place).
     *
     * TODO: Implementer insertionSort metoden. Håndter null eller tom liste.
     */
    public static void opgave17_3_insertionSort(List<Double> list) {
        // TODO: Implementer Insertion Sort her.
    }

    /**
     * Opgave 17.4: Sortering af Objekter med `Comparable`
     * -------------------------------------------------
     * Filnavn: StuderendeMedGennemsnit.java, StuderendeSortering.java
     *
     * Beskrivelse:
     * 1. Klasse `StuderendeMedGennemsnit` implements `Comparable<StuderendeMedGennemsnit>`:
     * - Attributter: `navn` (String), `studieNummer` (String), `gennemsnitskarakter` (double).
     * - Konstruktør, Get-metoder, `toString()`.
     * - `compareTo`: Skal sortere studerende primært efter `gennemsnitskarakter` (FALDENDE),
     * og sekundært efter `navn` (STIGENDE alfabetisk), hvis gennemsnitskarakterer er ens.
     * 2. Klasse `StuderendeSortering`:
     * - Statisk metode `void sorterStuderendeNaturligt(List<StuderendeMedGennemsnit> studerende)`:
     * - Bruger `Collections.sort()` til at sortere listen baseret på den naturlige orden
     * defineret i `StuderendeMedGennemsnit`.
     *
     * TODO: Opret klasserne. Implementer `Comparable` i StuderendeMedGennemsnit.
     * Implementer metoden i StuderendeSortering.
     */

    /**
     * Opgave 17.5: Sortering af Objekter med `Comparator`
     * --------------------------------------------------
     * Filnavne: VareTilSortering.java, VarePrisAscComparator.java, VareNavnDescComparator.java, VareSortering.java
     *
     * Beskrivelse:
     * 1. Klasse `VareTilSortering`: (Implementerer IKKE Comparable)
     * - Attributter: `vareId` (int), `navn` (String), `pris` (double), `antalPåLager` (int).
     * - Konstruktør, Get-metoder, `toString()`.
     * 2. Klasse `VarePrisAscComparator` implements `Comparator<VareTilSortering>`:
     * - Sorterer varer efter `pris` (STIGENDE).
     * 3. Klasse `VareNavnDescComparator` implements `Comparator<VareTilSortering>`:
     * - Sorterer varer efter `navn` (FALDENDE alfabetisk).
     * 4. Klasse `VareSortering`:
     * - Statisk metode `void sorterVarerMedComparator(List<VareTilSortering> varer, Comparator<VareTilSortering> comparator)`:
     * - Bruger `Collections.sort()` med den givne `comparator` til at sortere listen.
     *
     * TODO: Opret klasserne. Implementer Comparator-klasserne. Implementer metoden i VareSortering.
     */

    /**
     * Opgave 17.6: Tæl Antal Bytninger i Bubble Sort
     * ---------------------------------------------
     * Filnavn: OptimeretBubbleSort.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `int bubbleSortOgTælBytninger(int[] arr)`:
     * - Metoden skal sortere `arr` stigende med Bubble Sort.
     * - Metoden skal tælle og returnere det totale antal bytninger (`swaps`), der blev foretaget
     * under sorteringsprocessen.
     *
     * TODO: Implementer metoden. Håndter null/tomt array (returner 0 bytninger).
     */
    public static int opgave17_6_bubbleSortOgTælBytninger(int[] arr) {
        // TODO: Implementer Bubble Sort og tæl antal bytninger.
        return 0; // Placeholder
    }

    /**
     * Opgave 17.7: Sortering af Del-array med Insertion Sort
     * ----------------------------------------------------
     * Filnavn: AvanceretSortering.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `void insertionSortPåDel(int[] arr, int fraIndex, int tilIndex)`:
     * - Metoden skal sortere kun den del af arrayet `arr`, der ligger fra og med `fraIndex`
     * til og med `tilIndex` (inklusiv), ved hjælp af Insertion Sort algoritmen.
     * - Elementer uden for dette interval skal forblive urørte på deres oprindelige positioner.
     * - Håndter ugyldige indekser (f.eks. `fraIndex < 0`, `tilIndex >= arr.length`, `fraIndex > tilIndex`).
     *
     * TODO: Implementer metoden.
     */
    public static void opgave17_7_insertionSortPåDel(int[] arr, int fraIndex, int tilIndex) {
        // TODO: Implementer Insertion Sort på et specificeret sub-array.
    }

    /**
     * Opgave 17.8: Sortering i Faldende Orden med Selection Sort
     * --------------------------------------------------------
     * Filnavn: SimpleSorteringsAlgoritmer.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `void selectionSortFaldende(double[] arr)`:
     * - Metoden skal sortere det givne `arr` af `double` i FALDENDE rækkefølge
     * ved hjælp af Selection Sort algoritmen.
     * - Metoden skal modificere arrayet `arr` direkte (in-place).
     *
     * TODO: Implementer metoden. Håndter null eller tomt array.
     */
    public static void opgave17_8_selectionSortFaldende(double[] arr) {
        // TODO: Implementer Selection Sort for faldende orden.
    }

    /**
     * Opgave 17.9: Tjek om To Arrays er Permutationer (ved hjælp af sortering)
     * ---------------------------------------------------------------------
     * Filnavn: ArrayAnalyse.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `boolean erPermutationer(int[] arr1, int[] arr2)`:
     * - Metoden skal afgøre, om `arr2` er en permutation af `arr1`. Det betyder,
     * at begge arrays skal indeholde præcis de samme elementer med de samme
     * frekvenser (antal forekomster), men ikke nødvendigvis i samme rækkefølge.
     * - En effektiv måde at tjekke dette på er at sortere begge arrays og derefter
     * sammenligne dem element for element.
     * - Metoden skal returnere `true`, hvis de er permutationer af hinanden, ellers `false`.
     * - Håndtering af edge cases:
     * - Hvis et af (eller begge) arrays er `null`, skal de ikke betragtes som permutationer (medmindre begge er `null`).
     * - Hvis arrays har forskellig længde, kan de ikke være permutationer.
     * - To tomme arrays betragtes som permutationer af hinanden.
     * - Brug `Arrays.sort()` til at sortere.
     *
     * Eksempel:
     * arr1 = {1, 2, 3, 2}, arr2 = {3, 1, 2, 2} => returnerer true
     * arr1 = {1, 2, 3},    arr2 = {1, 2, 4}    => returnerer false
     * arr1 = {1, 2, 3},    arr2 = {1, 2, 3, 3} => returnerer false (forskellig længde)
     *
     * Relation til noter:
     * Anvender sortering (`Arrays.sort()`) som et centralt værktøj til at løse et
     * sammenligningsproblem mellem to datastrukturer.
     *
     * TODO: Implementer metoden.
     */
    public static boolean opgave17_9_erPermutationer(int[] arr1, int[] arr2) {
        // TODO: Implementer logik til at tjekke om arr1 og arr2 er permutationer
        // ved først at sortere dem og derefter sammenligne.
        // Husk grundig håndtering af edge cases (null, forskellige længder, tomme arrays).
        return false; // Placeholder
    }

    /**
     * Opgave 17.10: Anvendelse af `Arrays.sort()` på Forskellige Datatyper
     * -------------------------------------------------------------------
     * Filnavn: StandardArraySortering.java, MinTypeComparable.java, MinTypeUdenComparable.java
     *
     * Beskrivelse:
     * Opret en klasse `StandardArraySortering` med følgende statiske metoder, der alle
     * sorterer det givne array "in-place" ved hjælp af `java.util.Arrays.sort()`:
     *
     * 1. `void sortIntArray(int[] data)`: Sorterer et array af heltal.
     * 2. `void sortStringArray(String[] data)`: Sorterer et array af strenge.
     *
     * 3. Opret klassen `MinTypeComparable` implements `Comparable<MinTypeComparable>`:
     * - Attribut: `værdi` (int). Konstruktør, getter.
     * - `compareTo` skal sortere på `værdi` (stigende).
     * Metode i `StandardArraySortering`: `void sortMinTypeComparableArray(MinTypeComparable[] data)`.
     *
     * 4. Opret klassen `MinTypeUdenComparable`:
     * - Attribut: `navn` (String), `prioritet` (int). Konstruktør, getters.
     * Metode i `StandardArraySortering`:
     * `void sortMinTypeUdenComparableArrayMedComparator(MinTypeUdenComparable[] data, Comparator<MinTypeUdenComparable> comp)`:
     * - Sorterer arrayet ved hjælp af den medfølgende `comp`.
     * - Du skal også i din JUnit-test oprette en `Comparator<MinTypeUdenComparable>` (f.eks. der sorterer på `prioritet`)
     * og bruge den til at kalde denne metode.
     *
     * TODO: Opret de tre .java filer (StandardArraySortering, MinTypeComparable, MinTypeUdenComparable).
     * Implementer metoderne i StandardArraySortering.
     */
    // Metoderne forventes i StandardArraySortering.java

    public static void main(String[] args) {
        System.out.println("=== Emne 17: Sortering - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for klasser og brug JUnit-tests. ===");
    }
}