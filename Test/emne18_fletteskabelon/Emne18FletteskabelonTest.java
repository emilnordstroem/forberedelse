package emne18_fletteskabelon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Når du har oprettet dine klasser og interfaces, fjern kommenteringen for de relevante imports.
/*
// Opgave 18.3
import emne18_fletteskabelon.OrdreFlet;
import emne18_fletteskabelon.FletteFunktionerForObjekter;

// Opgave 18.4
import emne18_fletteskabelon.TransaktionFlet;
import emne18_fletteskabelon.TransaktionBeløbDescComparator;
// FletteFunktionerForObjekter genbruges eller udvides
*/

class Emne18FletteskabelonTest {

    // --- Opgave 18.1: Grundlæggende Fletning af to Sorterede Heltalsarrays ---
    @Test
    void testFletToSorteredeArrays_18_1() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
        assertArrayEquals(new int[]{1, 2, 3, 7, 8, 9}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(new int[]{1, 2, 3}, new int[]{7, 8, 9}));
        assertArrayEquals(new int[]{1, 2, 3, 7, 8, 9}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(new int[]{7, 8, 9}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(new int[]{1, 2, 3}, new int[]{}));
        assertArrayEquals(new int[]{}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{1, 2, 3}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(null, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(new int[]{1, 2, 3}, null));
        assertArrayEquals(new int[]{}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(null, null));
        assertArrayEquals(new int[]{1,1,2,2,3,3}, Emne18Fletteskabelon.opgave18_1_fletToSorteredeArrays(new int[]{1,2,3}, new int[]{1,2,3}));
    }

    // --- Opgave 18.2: Fletning af to Sorterede Lister af Strenge ---
    @Test
    void testFletToSorteredeStrengeLister_18_2() {
        List<String> l1 = Arrays.asList("abe", "giraf", "ko");
        List<String> l2 = Arrays.asList("elefant", "hund", "zebra");
        List<String> expected = Arrays.asList("abe", "elefant", "giraf", "hund", "ko", "zebra");
        assertEquals(expected, Emne18Fletteskabelon.opgave18_2_fletToSorteredeStrengeLister(l1, l2));

        List<String> l3 = new ArrayList<>();
        List<String> l4 = Arrays.asList("a", "b");
        assertEquals(Arrays.asList("a", "b"), Emne18Fletteskabelon.opgave18_2_fletToSorteredeStrengeLister(l3, l4));
        assertEquals(Arrays.asList("a", "b"), Emne18Fletteskabelon.opgave18_2_fletToSorteredeStrengeLister(l4, l3));
        assertEquals(new ArrayList<String>(), Emne18Fletteskabelon.opgave18_2_fletToSorteredeStrengeLister(null, l3));
    }

    // --- Opgave 18.3: Fletning af Sorterede Lister med Comparable Objekter ---
    @Test
    void testFletToSorteredeOrdreLister_18_3() {
        // TODO: Afkommenter og kør når OrdreFlet og FletteFunktionerForObjekter er implementeret.
        /*
        OrdreFlet o1 = new OrdreFlet(1, 100.0);
        OrdreFlet o2 = new OrdreFlet(2, 50.0);
        OrdreFlet o3 = new OrdreFlet(3, 150.0);
        OrdreFlet o4 = new OrdreFlet(4, 50.0); // Samme beløb som o2, højere ID

        List<OrdreFlet> listeA = new ArrayList<>(Arrays.asList(o2, o1)); // 50(ID2), 100(ID1)
        Collections.sort(listeA); // Sikrer sortering hvis OrdreFlet er Comparable

        List<OrdreFlet> listeB = new ArrayList<>(Arrays.asList(o4, o3)); // 50(ID4), 150(ID3)
        Collections.sort(listeB);

        List<OrdreFlet> flettet = FletteFunktionerForObjekter.fletToSorteredeOrdreLister(listeA, listeB);

        // Forventet orden: o2 (50, ID2), o4 (50, ID4), o1 (100, ID1), o3 (150, ID3)
        assertEquals(4, flettet.size());
        assertEquals(o2, flettet.get(0));
        assertEquals(o4, flettet.get(1));
        assertEquals(o1, flettet.get(2));
        assertEquals(o3, flettet.get(3));
        */
        assertTrue(true, "Test for 18.3 afventer implementering.");
    }

    // --- Opgave 18.4: Fletning af Sorterede Lister med Comparator ---
    @Test
    void testFletToSorteredeTransaktionsLister_18_4() {
        // TODO: Afkommenter og kør når TransaktionFlet, Comparator, og FletteFunktionerForObjekter er implementeret/udvidet.
        /*
        TransaktionFlet t1 = new TransaktionFlet("T1", 200.0, LocalDate.now());
        TransaktionFlet t2 = new TransaktionFlet("T2", 500.0, LocalDate.now().minusDays(1));
        TransaktionFlet t3 = new TransaktionFlet("T3", 100.0, LocalDate.now());
        TransaktionFlet t4 = new TransaktionFlet("T4", 800.0, LocalDate.now().plusDays(1));

        Comparator<TransaktionFlet> comp = new TransaktionBeløbDescComparator();

        List<TransaktionFlet> listeA = new ArrayList<>(Arrays.asList(t2, t1)); // 500, 200
        listeA.sort(comp); // Sikrer sortering efter beløb faldende

        List<TransaktionFlet> listeB = new ArrayList<>(Arrays.asList(t4, t3)); // 800, 100
        listeB.sort(comp);

        List<TransaktionFlet> flettet = FletteFunktionerForObjekter.fletToSorteredeTransaktionsLister(listeA, listeB, comp);

        // Forventet orden (Beløb FALDENDE): t4 (800), t2 (500), t1 (200), t3 (100)
        assertEquals(4, flettet.size());
        assertEquals(t4, flettet.get(0));
        assertEquals(t2, flettet.get(1));
        assertEquals(t1, flettet.get(2));
        assertEquals(t3, flettet.get(3));
        */
        assertTrue(true, "Test for 18.4 afventer implementering.");
    }

    // --- Opgave 18.5: Find Snit (Intersection) af to Sorterede Heltalsarrays ---
    @Test
    void testFindSnitAfToSorteredeArrays_18_5() {
        assertArrayEquals(new int[]{4, 5}, Emne18Fletteskabelon.opgave18_5_findSnitAfToSorteredeArrays(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 6, 7, 8}));
        assertArrayEquals(new int[]{}, Emne18Fletteskabelon.opgave18_5_findSnitAfToSorteredeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{1, 2, 3}, Emne18Fletteskabelon.opgave18_5_findSnitAfToSorteredeArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{}, Emne18Fletteskabelon.opgave18_5_findSnitAfToSorteredeArrays(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{}, Emne18Fletteskabelon.opgave18_5_findSnitAfToSorteredeArrays(new int[]{1,2,2,3,3,3}, new int[]{2,3,3,4})); // Forventer {2,3} hvis duplikater i input, men unikke i output
        // Opgaven siger "må ikke indeholde duplikater, hvis input-arrays heller ikke har det".
        // Hvis input HAR duplikater, er outputtet af snit stadig uden duplikater.
        // Forventet {2,3} for {1,2,2,3,3,3} og {2,3,3,4}
        assertArrayEquals(new int[]{2,3}, Emne18Fletteskabelon.opgave18_5_findSnitAfToSorteredeArrays(new int[]{1,2,2,3,3,3}, new int[]{2,3,3,4}));
    }

    // --- Opgave 18.6: Find Foreningsmængde (Union) af to Sorterede Lister UDEN Duplikater ---
    @Test
    void testFindUnionAfToSorteredeLister_18_6() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(expected, Emne18Fletteskabelon.opgave18_6_findUnionAfToSorteredeLister(l1, l2));

        List<Integer> l3 = Arrays.asList(10, 20);
        List<Integer> l4 = Arrays.asList(30, 40);
        assertEquals(Arrays.asList(10, 20, 30, 40), Emne18Fletteskabelon.opgave18_6_findUnionAfToSorteredeLister(l3, l4));

        List<Integer> l5 = Arrays.asList(1,1,2,3);
        List<Integer> l6 = Arrays.asList(2,3,3,4);
        assertEquals(Arrays.asList(1,2,3,4), Emne18Fletteskabelon.opgave18_6_findUnionAfToSorteredeLister(l5,l6));
    }

    // --- Opgave 18.7: Fletning af K Sorterede Lister (Simpel Iterativ Tilgang) ---
    @Test
    void testFletKListsIterativt_18_7() {
        List<List<Integer>> lister = new ArrayList<>();
        lister.add(new ArrayList<>(Arrays.asList(1, 5, 9)));
        lister.add(new ArrayList<>(Arrays.asList(2, 6, 10)));
        lister.add(new ArrayList<>(Arrays.asList(3, 7, 11)));
        lister.add(new ArrayList<>(Arrays.asList(4, 8, 12)));
        List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        assertEquals(expected, Emne18Fletteskabelon.opgave18_7_fletKListsIterativt(lister));

        List<List<Integer>> listerMedTom = new ArrayList<>();
        listerMedTom.add(new ArrayList<>(Arrays.asList(1, 3)));
        listerMedTom.add(new ArrayList<>());
        listerMedTom.add(new ArrayList<>(Arrays.asList(2, 4)));
        assertEquals(Arrays.asList(1,2,3,4), Emne18Fletteskabelon.opgave18_7_fletKListsIterativt(listerMedTom));

        assertTrue(Emne18Fletteskabelon.opgave18_7_fletKListsIterativt(new ArrayList<>()).isEmpty());
    }

    // --- Opgave 18.8 & 18.9: Merge Sort ---
    @Test
    void testMergeSort_FuldImplementering_18_9() {
        int[] arr1 = {5, 1, 8, 3, 9, 4, 6, 2, 7};
        int[] expected1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Emne18Fletteskabelon.opgave18_9_mergeSort(arr1);
        assertArrayEquals(expected1, arr1);

        int[] arr2 = {1};
        Emne18Fletteskabelon.opgave18_9_mergeSort(arr2);
        assertArrayEquals(new int[]{1}, arr2);

        int[] arr3 = {};
        Emne18Fletteskabelon.opgave18_9_mergeSort(arr3);
        assertArrayEquals(new int[]{}, arr3);

        int[] arr4 = {9,8,7,6,5,4,3,2,1};
        Emne18Fletteskabelon.opgave18_9_mergeSort(arr4);
        assertArrayEquals(expected1, arr4);

        Emne18Fletteskabelon.opgave18_9_mergeSort(null); // Skal håndtere null uden fejl
    }

    // Test for fletteHjælperForMergeSort (Opgave 18.8) er indirekte testet via den fulde mergeSort.
    // Man kan lave separate tests for fletteHjælperen, hvis man vil teste den isoleret:
    @Test
    void testFletteHjælper_18_8() {
        int[] arr = {2, 5, 8,   1, 6, 9}; // Del1: {2,5,8}, Del2: {1,6,9}
        int[] temp = new int[arr.length];
        // Flet arr[0..2] og arr[3..5]
        Emne18Fletteskabelon.opgave18_8_fletteHjælperForMergeSort(arr, temp, 0, 2, 5);
        assertArrayEquals(new int[]{1,2,5,6,8,9}, arr);

        int[] arr2 = {1,3,5,7,  2,4,6,8};
        int[] temp2 = new int[arr2.length];
        Emne18Fletteskabelon.opgave18_8_fletteHjælperForMergeSort(arr2, temp2, 0, 3, 7);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, arr2);
    }


    // --- Opgave 18.10: Verificer Korrekt Fletning ---
    @Test
    void testVerificerKorrektFletning_18_10() {
        List<Integer> a = Arrays.asList(1, 5, 8);
        List<Integer> b = Arrays.asList(2, 6, 9);

        List<Integer> flettetKorrekt = Arrays.asList(1, 2, 5, 6, 8, 9);
        assertTrue(Emne18Fletteskabelon.opgave18_10_verificerKorrektFletning(flettetKorrekt, a, b));

        List<Integer> flettetForkertOrden = Arrays.asList(1, 5, 2, 6, 8, 9);
        assertFalse(Emne18Fletteskabelon.opgave18_10_verificerKorrektFletning(flettetForkertOrden, a, b));

        List<Integer> flettetManglerElement = Arrays.asList(1, 2, 5, 8, 9);
        assertFalse(Emne18Fletteskabelon.opgave18_10_verificerKorrektFletning(flettetManglerElement, a, b));

        List<Integer> flettetForMangeElementer = Arrays.asList(1, 2, 5, 6, 8, 9, 10);
        assertFalse(Emne18Fletteskabelon.opgave18_10_verificerKorrektFletning(flettetForMangeElementer, a, b));

        List<Integer> aMedDup = Arrays.asList(1, 5, 5, 8); // Input antages sorteret, unikke *indenfor hver liste*
        List<Integer> bMedDup = Arrays.asList(2, 5, 6, 9); // Fælles element 5
        List<Integer> flettetMedDupKorrekt = Arrays.asList(1, 2, 5, 5, 5, 6, 8, 9); // Forventer at bevare duplikater fra den samlede mængde
        // Opgaven siger "duplikater fra den samlede mængde bevares"
        assertTrue(Emne18Fletteskabelon.opgave18_10_verificerKorrektFletning(flettetMedDupKorrekt, aMedDup, bMedDup));

        assertTrue(Emne18Fletteskabelon.opgave18_10_verificerKorrektFletning(a, a, new ArrayList<>())); // Flet med tom liste
    }
}