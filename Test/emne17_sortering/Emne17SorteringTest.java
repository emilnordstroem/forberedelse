package emne17_sortering;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Når du har oprettet dine klasser og interfaces, fjern kommenteringen for de relevante imports.
/*
// Opgave 17.1, 17.2, 17.3, 17.6, 17.7, 17.8 (hvis metoder er i en klasse SimpleSorteringsAlgoritmer)
// import emne17_sortering.SimpleSorteringsAlgoritmer;

// Opgave 17.4
import emne17_sortering.StuderendeMedGennemsnit;
import emne17_sortering.StuderendeSorteringUtil;

// Opgave 17.5
import emne17_sortering.VareTilSortering;
import emne17_sortering.VarePrisAscComparator;
import emne17_sortering.VareNavnDescComparator;
import emne17_sortering.VareSorteringUtil;

// Opgave 17.9
// import emne17_sortering.ArrayAnalyse; // Hvis metoden er her

// Opgave 17.10
import emne17_sortering.StandardArraySortering;
import emne17_sortering.MinTypeComparable;
import emne17_sortering.MinTypeUdenComparable;
*/

class Emne17SorteringTest {

    // --- Opgave 17.1: Implementer Bubble Sort ---
    @Test
    void testBubbleSort_17_1() {
        int[] arr = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        Emne17Sortering.opgave17_1_bubbleSort(arr);
        assertArrayEquals(expected, arr);

        int[] arr2 = {1}; Emne17Sortering.opgave17_1_bubbleSort(arr2); assertArrayEquals(new int[]{1}, arr2);
        int[] arr3 = {}; Emne17Sortering.opgave17_1_bubbleSort(arr3); assertArrayEquals(new int[]{}, arr3);
        int[] arr4 = {5,4,3,2,1}; Emne17Sortering.opgave17_1_bubbleSort(arr4); assertArrayEquals(new int[]{1,2,3,4,5}, arr4);
        Emne17Sortering.opgave17_1_bubbleSort(null); // Skal håndtere null uden fejl
    }

    // --- Opgave 17.2: Implementer Selection Sort ---
    @Test
    void testSelectionSort_Strings_17_2() {
        String[] arr = {"zebra", "abe", "kat", "hund"};
        String[] expected = {"abe", "hund", "kat", "zebra"};
        Emne17Sortering.opgave17_2_selectionSort(arr);
        assertArrayEquals(expected, arr);

        String[] arr2 = {"x"}; Emne17Sortering.opgave17_2_selectionSort(arr2); assertArrayEquals(new String[]{"x"}, arr2);
        String[] arr3 = {}; Emne17Sortering.opgave17_2_selectionSort(arr3); assertArrayEquals(new String[]{}, arr3);
        Emne17Sortering.opgave17_2_selectionSort(null); // Skal håndtere null
    }

    // --- Opgave 17.3: Implementer Insertion Sort ---
    @Test
    void testInsertionSort_Doubles_17_3() {
        List<Double> list = new ArrayList<>(Arrays.asList(5.5, 1.1, 4.4, 2.2, 8.8));
        List<Double> expected = Arrays.asList(1.1, 2.2, 4.4, 5.5, 8.8);
        Emne17Sortering.opgave17_3_insertionSort(list);
        assertEquals(expected, list);

        List<Double> list2 = new ArrayList<>(Arrays.asList(10.0)); Emne17Sortering.opgave17_3_insertionSort(list2);
        assertEquals(Arrays.asList(10.0), list2);
        List<Double> list3 = new ArrayList<>(); Emne17Sortering.opgave17_3_insertionSort(list3);
        assertTrue(list3.isEmpty());
        Emne17Sortering.opgave17_3_insertionSort(null); // Skal håndtere null
    }

    // --- Opgave 17.4: Sortering af Objekter med Comparable ---
    @Test
    void testSorterStuderendeNaturligt_17_4() {
        // TODO: Afkommenter og kør når StuderendeMedGennemsnit og StuderendeSorteringUtil er implementeret.
        /*
        StuderendeMedGennemsnit s1 = new StuderendeMedGennemsnit("Peter", "S1", 7.5);
        StuderendeMedGennemsnit s2 = new StuderendeMedGennemsnit("Anna", "S2", 8.5);
        StuderendeMedGennemsnit s3 = new StuderendeMedGennemsnit("Bo", "S3", 7.5); // Samme gns som Peter
        StuderendeMedGennemsnit s4 = new StuderendeMedGennemsnit("Ida", "S4", 9.0);

        List<StuderendeMedGennemsnit> studerende = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        StuderendeSorteringUtil.sorterStuderendeNaturligt(studerende);

        // Forventet orden: Ida (9.0), Anna (8.5), Bo (7.5, navn B), Peter (7.5, navn P)
        assertEquals(s4, studerende.get(0)); // Ida
        assertEquals(s2, studerende.get(1)); // Anna
        assertEquals(s3, studerende.get(2)); // Bo
        assertEquals(s1, studerende.get(3)); // Peter
        */
    }

    // --- Opgave 17.5: Sortering af Objekter med Comparator ---
    @Test
    void testSorterVarerMedComparator_17_5() {
        // TODO: Afkommenter og kør når VareTilSortering, comparators, og VareSorteringUtil er implementeret.
        /*
        VareTilSortering v1 = new VareTilSortering(1, "Banan", 2.50, 100);
        VareTilSortering v2 = new VareTilSortering(2, "Æble", 3.00, 50);
        VareTilSortering v3 = new VareTilSortering(3, "Pære", 2.50, 75); // Samme pris som Banan

        List<VareTilSortering> varer = new ArrayList<>(Arrays.asList(v1, v2, v3));

        // Sorter efter pris (stigende)
        VareSorteringUtil.sorterVarerMedComparator(varer, new VarePrisAscComparator());
        // Forventet (pris, så ID hvis pris ens): Banan (2.50, ID1), Pære (2.50, ID3), Æble (3.00, ID2)
        assertEquals(1, varer.get(0).getVareId()); // Banan
        assertEquals(3, varer.get(1).getVareId()); // Pære
        assertEquals(2, varer.get(2).getVareId()); // Æble

        // Nulstil listen til usorteret for næste test
        varer = new ArrayList<>(Arrays.asList(v1, v2, v3));
        // Sorter efter navn (faldende)
        VareSorteringUtil.sorterVarerMedComparator(varer, new VareNavnDescComparator());
        // Forventet: Æble, Pære, Banan
        assertEquals("Æble", varer.get(0).getNavn());
        assertEquals("Pære", varer.get(1).getNavn());
        assertEquals("Banan", varer.get(2).getNavn());
        */
    }

    // --- Opgave 17.6: Tæl Antal Bytninger i Bubble Sort ---
    @Test
    void testBubbleSortOgTælBytninger_17_6() {
        int[] arr1 = {5, 1, 4, 2, 8};
        // Sortering:
        // 1,5,4,2,8 (1 swap) -> 1,4,5,2,8 (1 swap) -> 1,4,2,5,8 (1 swap) -> 1,2,4,5,8 (1 swap) -> 4 swaps i første pass
        // 1,2,4,5,8 (0 swaps)
        // Dette er en naiv tælling; den faktiske antal afhænger af implementeringen.
        // En standard bubble sort:
        // {5,1,4,2,8} -> {1,5,4,2,8} (s1)
        // {1,4,5,2,8} -> {1,4,5,2,8} (ingen) -> {1,4,2,5,8} (s2) -> {1,4,2,5,8} (ingen) -> 4 swaps
        // {1,2,4,5,8} -> {1,2,4,5,8} (ingen) -> {1,2,4,5,8} (ingen) -> 2 swaps
        // {1,2,4,5,8} ...
        // Korrekt antal for {5,1,4,2,8} -> {1,2,4,5,8} er 5 swaps for en standard bubble sort.
        // (5,1)->(1,5) swap1 | {1,5,4,2,8}
        // (5,4)->(4,5) swap2 | {1,4,5,2,8}
        // (5,2)->(2,5) swap3 | {1,4,2,5,8}
        // (5,8)              | {1,4,2,5,8}
        // (4,2)->(2,4) swap4 | {1,2,4,5,8}
        // (4,5)              | {1,2,4,5,8}
        // (2,4)              | {1,2,4,5,8}
        // Forventer 5 swaps for {5,1,4,2,8}
        assertEquals(5, Emne17Sortering.opgave17_6_bubbleSortOgTælBytninger(arr1));
        assertArrayEquals(new int[]{1,2,4,5,8}, arr1);

        int[] arr2 = {1, 2, 3, 4, 5}; // Allerede sorteret
        assertEquals(0, Emne17Sortering.opgave17_6_bubbleSortOgTælBytninger(arr2));

        int[] arr3 = {5,4,3,2,1}; // Omvendt sorteret (n*(n-1)/2 swaps = 5*4/2 = 10 swaps)
        assertEquals(10, Emne17Sortering.opgave17_6_bubbleSortOgTælBytninger(arr3));
        assertArrayEquals(new int[]{1,2,3,4,5}, arr3);

        assertEquals(0, Emne17Sortering.opgave17_6_bubbleSortOgTælBytninger(new int[]{}));
        assertEquals(0, Emne17Sortering.opgave17_6_bubbleSortOgTælBytninger(null));
    }

    // --- Opgave 17.7: Sortering af Del-array med Insertion Sort ---
    @Test
    void testInsertionSortPåDel_17_7() {
        int[] arr = {5, 1, 8, 3, 9, 4, 6, 2, 7};
        // Sorter del fra indeks 2 (værdi 8) til indeks 5 (værdi 4)
        // Del er {8, 3, 9, 4} -> sorteret {3, 4, 8, 9}
        // Hele arrayet bliver {5, 1, 3, 4, 8, 9, 6, 2, 7}
        Emne17Sortering.opgave17_7_insertionSortPåDel(arr, 2, 5);
        assertArrayEquals(new int[]{5, 1, 3, 4, 8, 9, 6, 2, 7}, arr);

        int[] arr2 = {1, 2, 3, 4, 5}; // Allerede sorteret del
        Emne17Sortering.opgave17_7_insertionSortPåDel(arr2, 1, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr2);

        int[] arr3 = {5, 4, 3, 2, 1}; // Sorter hele arrayet
        Emne17Sortering.opgave17_7_insertionSortPåDel(arr3, 0, 4);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr3);

        // Test ugyldige indekser (bør ikke crashe eller ændre array)
        int[] arr4 = {3,1,2};
        int[] arr4Kopi = Arrays.copyOf(arr4, arr4.length);
        Emne17Sortering.opgave17_7_insertionSortPåDel(arr4, -1, 1); assertArrayEquals(arr4Kopi, arr4);
        Emne17Sortering.opgave17_7_insertionSortPåDel(arr4, 0, 5); assertArrayEquals(arr4Kopi, arr4);
        Emne17Sortering.opgave17_7_insertionSortPåDel(arr4, 2, 1); assertArrayEquals(arr4Kopi, arr4);
        Emne17Sortering.opgave17_7_insertionSortPåDel(null, 0, 0); // Skal håndtere null
    }

    // --- Opgave 17.8: Sortering i Faldende Orden med Selection Sort ---
    @Test
    void testSelectionSortFaldende_17_8() {
        double[] arr = {3.0, 1.5, 4.0, 2.5, 0.5};
        double[] expected = {4.0, 3.0, 2.5, 1.5, 0.5};
        Emne17Sortering.opgave17_8_selectionSortFaldende(arr);
        assertArrayEquals(expected, arr, 0.001);

        double[] arr2 = {10.0}; Emne17Sortering.opgave17_8_selectionSortFaldende(arr2); assertArrayEquals(new double[]{10.0}, arr2, 0.001);
        double[] arr3 = {}; Emne17Sortering.opgave17_8_selectionSortFaldende(arr3); assertArrayEquals(new double[]{}, arr3, 0.001);
        Emne17Sortering.opgave17_8_selectionSortFaldende(null); // Skal håndtere null
    }

    // --- Opgave 17.9: Tjek om To Arrays er Permutationer ---
    @Test
    void testErPermutationer_17_9() {
        assertTrue(Emne17Sortering.opgave17_9_erPermutationer(new int[]{1, 2, 3, 2}, new int[]{3, 1, 2, 2}));
        assertFalse(Emne17Sortering.opgave17_9_erPermutationer(new int[]{1, 2, 3}, new int[]{1, 2, 4}));
        assertFalse(Emne17Sortering.opgave17_9_erPermutationer(new int[]{1, 2, 3}, new int[]{1, 2, 3, 3})); // Forskellig længde
        assertTrue(Emne17Sortering.opgave17_9_erPermutationer(new int[]{}, new int[]{})); // To tomme er permutationer
        assertFalse(Emne17Sortering.opgave17_9_erPermutationer(null, new int[]{1,2}));
        assertFalse(Emne17Sortering.opgave17_9_erPermutationer(new int[]{1,2}, null));
        assertTrue(Emne17Sortering.opgave17_9_erPermutationer(null, null)); // Begge null er perm. (eller false, afhængig af def.)
        // Opgaven siger: "skal ikke betragtes som permutationer (medmindre begge er null)" -> true
    }

    // --- Opgave 17.10: Anvendelse af Arrays.sort() på Forskellige Datatyper ---
    @Test
    void testStandardArraySortering_17_10() {
        // TODO: Afkommenter og kør når StandardArraySortering, MinTypeComparable, MinTypeUdenComparable er implementeret.
        /*
        // 1. int[]
        int[] talArr = {5, 1, 9, 3, 7};
        StandardArraySortering.sortIntArray(talArr);
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, talArr);

        // 2. String[]
        String[] strengArr = {" appelsin ", " æble ", " banan "}; // Med vilje med mellemrum
        StandardArraySortering.sortStringArray(strengArr);
        // Naturlig strengsortering: " æble ", " appelsin ", " banan "
        assertArrayEquals(new String[]{" æble ", " appelsin ", " banan "}, strengArr);

        // 3. MinTypeComparable[]
        MinTypeComparable mtc1 = new MinTypeComparable(10);
        MinTypeComparable mtc2 = new MinTypeComparable(5);
        MinTypeComparable mtc3 = new MinTypeComparable(15);
        MinTypeComparable[] mtcArr = {mtc1, mtc2, mtc3};
        StandardArraySortering.sortMinTypeComparableArray(mtcArr);
        assertArrayEquals(new MinTypeComparable[]{mtc2, mtc1, mtc3}, mtcArr); // Sorteret på værdi

        // 4. MinTypeUdenComparable[] med Comparator
        MinTypeUdenComparable mtu1 = new MinTypeUdenComparable("X", 30);
        MinTypeUdenComparable mtu2 = new MinTypeUdenComparable("Y", 10);
        MinTypeUdenComparable mtu3 = new MinTypeUdenComparable("Z", 20);
        MinTypeUdenComparable[] mtuArr = {mtu1, mtu2, mtu3};

        Comparator<MinTypeUdenComparable> prioritetComp = Comparator.comparingInt(MinTypeUdenComparable::getPrioritet);
        StandardArraySortering.sortMinTypeUdenComparableArrayMedComparator(mtuArr, prioritetComp);
        assertArrayEquals(new MinTypeUdenComparable[]{mtu2, mtu3, mtu1}, mtuArr); // Sorteret på prioritet
        */
    }
}