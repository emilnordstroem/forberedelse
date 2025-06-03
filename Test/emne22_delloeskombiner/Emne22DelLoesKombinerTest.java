package emne22_delloeskombiner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Importerer den klasse, der indeholder de statiske metoder, der skal testes.
// import static emne22_delloeskombiner.Emne22DelLoesKombiner.*; // Hvis du vil kalde metoderne direkte uden klassenavn

@DisplayName("Emne 22: Del-løs og kombiner skabelonen - Test af Metoder")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Emne22DelLoesKombinerTest {

    // --- Opgave 22.1: Find Største Element i Array (Del-løs-kombiner) ---
    @Test
    @Order(1)
    void testFindMaxDAC_22_1() {
        // TODO: Afkommenter og kør når opgave22_1_findMaxDAC er implementeret.
        /*
        assertEquals(9, Emne22DelLoesKombiner.opgave22_1_findMaxDAC(new int[]{5, 3, 8, 1, 9, 4}));
        assertEquals(10, Emne22DelLoesKombiner.opgave22_1_findMaxDAC(new int[]{10}));
        assertEquals(-1, Emne22DelLoesKombiner.opgave22_1_findMaxDAC(new int[]{-5, -2, -1, -10}));
        assertEquals(5, Emne22DelLoesKombiner.opgave22_1_findMaxDAC(new int[]{5, 5, 5}));

        assertThrows(IllegalArgumentException.class, () -> Emne22DelLoesKombiner.opgave22_1_findMaxDAC(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> Emne22DelLoesKombiner.opgave22_1_findMaxDAC(null));
        */
    }

    // --- Opgave 22.2: Summer Elementer i Array (Del-løs-kombiner) ---
    @Test
    @Order(2)
    void testSumArrayDAC_22_2() {
        // TODO: Afkommenter og kør når opgave22_2_sumArrayDAC er implementeret.
        /*
        assertEquals(30, Emne22DelLoesKombiner.opgave22_2_sumArrayDAC(new int[]{5, 3, 8, 1, 9, 4})); // 5+3+8+1+9+4 = 30
        assertEquals(10, Emne22DelLoesKombiner.opgave22_2_sumArrayDAC(new int[]{10}));
        assertEquals(-18, Emne22DelLoesKombiner.opgave22_2_sumArrayDAC(new int[]{-5, -2, -1, -10}));
        assertEquals(0, Emne22DelLoesKombiner.opgave22_2_sumArrayDAC(new int[]{}));
        assertEquals(0, Emne22DelLoesKombiner.opgave22_2_sumArrayDAC(null));
        */
    }

    // --- Opgave 22.3: Potensopløftning (x^n) med Del-løs-kombiner ---
    @Test
    @Order(3)
    void testPotensDAC_22_3() {
        // TODO: Afkommenter og kør når opgave22_3_potensDAC er implementeret.
        /*
        assertEquals(1.0, Emne22DelLoesKombiner.opgave22_3_potensDAC(5.0, 0), 0.001);
        assertEquals(5.0, Emne22DelLoesKombiner.opgave22_3_potensDAC(5.0, 1), 0.001);
        assertEquals(25.0, Emne22DelLoesKombiner.opgave22_3_potensDAC(5.0, 2), 0.001); // exp even
        assertEquals(125.0, Emne22DelLoesKombiner.opgave22_3_potensDAC(5.0, 3), 0.001); // exp odd
        assertEquals(1024.0, Emne22DelLoesKombiner.opgave22_3_potensDAC(2.0, 10), 0.001); // 2^10
        assertEquals(1.0, Emne22DelLoesKombiner.opgave22_3_potensDAC(1.0, 100), 0.001);
        assertEquals(0.0, Emne22DelLoesKombiner.opgave22_3_potensDAC(0.0, 5), 0.001);
        assertThrows(IllegalArgumentException.class, () -> Emne22DelLoesKombiner.opgave22_3_potensDAC(2.0, -2));
        */
    }

    // --- Opgave 22.4: Er en Streng et Palindrom? (Del-løs-kombiner) ---
    @Test
    @Order(4)
    void testErPalindromDAC_22_4() {
        // TODO: Afkommenter og kør når opgave22_4_erPalindromDAC er implementeret.
        /*
        assertTrue(Emne22DelLoesKombiner.opgave22_4_erPalindromDAC("regninger"));
        assertTrue(Emne22DelLoesKombiner.opgave22_4_erPalindromDAC("Madam"));
        assertTrue(Emne22DelLoesKombiner.opgave22_4_erPalindromDAC("a"));
        assertTrue(Emne22DelLoesKombiner.opgave22_4_erPalindromDAC(""));
        assertFalse(Emne22DelLoesKombiner.opgave22_4_erPalindromDAC("java"));
        assertFalse(Emne22DelLoesKombiner.opgave22_4_erPalindromDAC("palindrom"));
        assertFalse(Emne22DelLoesKombiner.opgave22_4_erPalindromDAC(null));
        assertTrue(Emne22DelLoesKombiner.opgave22_4_erPalindromDAC("Able was I ere I saw Elba"));
        */
    }

    // --- Opgave 22.5: Binær Søgning som Del-løs-kombiner ---
    @Test
    @Order(5)
    void testIndeholderBinærSøgningDAC_22_5() {
        // TODO: Afkommenter og kør når opgave22_5_indeholderBinærSøgningDAC er implementeret.
        /*
        int[] arr = {2, 5, 7, 8, 11, 12, 15, 18, 22, 25};
        assertTrue(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(arr, 2));
        assertTrue(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(arr, 11));
        assertTrue(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(arr, 25));
        assertFalse(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(arr, 0));
        assertFalse(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(arr, 9));
        assertFalse(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(arr, 30));
        assertFalse(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(new int[]{}, 5));
        assertFalse(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(null, 5));
        assertTrue(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(new int[]{7}, 7));
        assertFalse(Emne22DelLoesKombiner.opgave22_5_indeholderBinærSøgningDAC(new int[]{7}, 8));
        */
    }

    // --- Opgave 22.6: Antal Forekomster af Element i Array (Del-løs-kombiner) ---
    @Test
    @Order(6)
    void testTælForekomsterDAC_22_6() {
        // TODO: Afkommenter og kør når opgave22_6_tælForekomsterDAC er implementeret.
        /*
        assertEquals(3, Emne22DelLoesKombiner.opgave22_6_tælForekomsterDAC(new int[]{1, 5, 2, 5, 3, 5, 8}, 5));
        assertEquals(1, Emne22DelLoesKombiner.opgave22_6_tælForekomsterDAC(new int[]{1, 5, 2, 5, 3, 5, 8}, 8));
        assertEquals(0, Emne22DelLoesKombiner.opgave22_6_tælForekomsterDAC(new int[]{1, 5, 2, 5, 3, 5, 8}, 7));
        assertEquals(0, Emne22DelLoesKombiner.opgave22_6_tælForekomsterDAC(new int[]{}, 5));
        assertEquals(0, Emne22DelLoesKombiner.opgave22_6_tælForekomsterDAC(null, 5));
        assertEquals(4, Emne22DelLoesKombiner.opgave22_6_tælForekomsterDAC(new int[]{2,2,2,2}, 2));
        */
    }

    // --- Opgave 22.7: Merge Sort Implementering (Del-løs-kombiner) ---
    @Test
    @Order(7)
    void testMergeSortDAC_22_7() {
        // TODO: Afkommenter og kør når opgave22_7_mergeSortDAC (og dens hjælpemetoder) er implementeret.
        /*
        int[] arr1 = {5, 1, 8, 3, 9, 4, 6, 2, 7};
        int[] expected1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Emne22DelLoesKombiner.opgave22_7_mergeSortDAC(arr1);
        assertArrayEquals(expected1, arr1);

        int[] arr2 = {1};
        Emne22DelLoesKombiner.opgave22_7_mergeSortDAC(arr2);
        assertArrayEquals(new int[]{1}, arr2);

        int[] arr3 = {};
        Emne22DelLoesKombiner.opgave22_7_mergeSortDAC(arr3);
        assertArrayEquals(new int[]{}, arr3);

        int[] arr4 = {9,8,7,6,5,4,3,2,1};
        Emne22DelLoesKombiner.opgave22_7_mergeSortDAC(arr4);
        assertArrayEquals(expected1, arr4);

        Emne22DelLoesKombiner.opgave22_7_mergeSortDAC(null); // Skal håndtere null uden fejl

        int[] arr5 = {3,1,4,1,5,9,2,6}; // Med duplikater
        Emne22DelLoesKombiner.opgave22_7_mergeSortDAC(arr5);
        assertArrayEquals(new int[]{1,1,2,3,4,5,6,9}, arr5);
        */
    }

    // --- Opgave 22.8: Decimal til Binær Konvertering (Del-løs-kombiner) ---
    @Test
    @Order(8)
    void testDecimalTilBinærDAC_22_8() {
        // TODO: Afkommenter og kør når opgave22_8_decimalTilBinærDAC er implementeret.
        /*
        assertEquals("0", Emne22DelLoesKombiner.opgave22_8_decimalTilBinærDAC(0));
        assertEquals("1", Emne22DelLoesKombiner.opgave22_8_decimalTilBinærDAC(1));
        assertEquals("10", Emne22DelLoesKombiner.opgave22_8_decimalTilBinærDAC(2));
        assertEquals("1101", Emne22DelLoesKombiner.opgave22_8_decimalTilBinærDAC(13));
        assertEquals("100000", Emne22DelLoesKombiner.opgave22_8_decimalTilBinærDAC(32));
        assertThrows(IllegalArgumentException.class, () -> Emne22DelLoesKombiner.opgave22_8_decimalTilBinærDAC(-5));
        */
    }

    // --- Opgave 22.9: Konstruer en "Balanceret Træ-lignende" Liste-struktur ---
    @Test
    @Order(9)
    void testBygBalanceretStruktur_22_9() {
        // TODO: Afkommenter og kør når opgave22_9_bygBalanceretStruktur er implementeret.
        /*
        List<Object> res1 = Emne22DelLoesKombiner.opgave22_9_bygBalanceretStruktur(Arrays.asList(1,2,3,4,5,6,7));
        // Forventet: [[[1], 2, [3]], 4, [[5], 6, [7]]]
        // For at teste dette korrekt, skal man ned i strukturen.
        // Eksempel på en del af testen:
        assertEquals(3, res1.size()); // [left, middle, right]
        assertEquals(4, res1.get(1)); // Midterste element
        assertTrue(res1.get(0) instanceof List);
        assertTrue(res1.get(2) instanceof List);

        List<Object> leftSub = (List<Object>) res1.get(0);
        assertEquals(3, leftSub.size());
        assertEquals(2, leftSub.get(1));
        assertTrue(leftSub.get(0) instanceof List);
        assertEquals(Arrays.asList(1), leftSub.get(0));
        assertTrue(leftSub.get(2) instanceof List);
        assertEquals(Arrays.asList(3), leftSub.get(2));


        List<Object> res2 = Emne22DelLoesKombiner.opgave22_9_bygBalanceretStruktur(Arrays.asList(10, 20));
        // Forventet: [[10], 20, []] eller [10, [], [20]] eller lignende afhængig af midtpunktvalg.
        // Hvis midtpunkt er det første ved lige antal: [[], 10, [[20]]] (hvis det er List<Object> element)
        // Hvis midtpunkt er ceil(n/2)-th element (index 1 for size 2): [[10], 20, []]
        assertEquals(3, res2.size());
        assertEquals(Arrays.asList(10), res2.get(0)); // Antager at midtpunkt er det sidste af de to (20)
        assertEquals(20, res2.get(1));
        assertTrue(((List<Object>)res2.get(2)).isEmpty());


        List<Object> res3 = Emne22DelLoesKombiner.opgave22_9_bygBalanceretStruktur(Arrays.asList(5));
        assertEquals(1, res3.size());
        assertEquals(5, res3.get(0));

        List<Object> res4 = Emne22DelLoesKombiner.opgave22_9_bygBalanceretStruktur(new ArrayList<>());
        assertTrue(res4.isEmpty());
        */
    }

    // --- Opgave 22.10: Teoretisk - Genkend Del-løs-kombiner ---
    @Test
    @Order(10)
    @DisplayName("Opgave 22.10: Genkend Del-løs-kombiner paradigmet")
    void testOpgave22_10_SvarGenkendDelLoesKombiner() {
        // Korrekt svar: 3. Man opdeler problemet i mindre, uafhængige delproblemer af samme type...
        assertEquals(3, Emne22DelLoesKombiner.opgave22_10_svarGenkendDelLoesKombiner());
    }
}