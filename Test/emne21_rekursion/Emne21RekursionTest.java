package emne21_rekursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List; // For evt. fremtidige opgaver, ikke brugt direkte her
import java.util.ArrayList; // For evt. fremtidige opgaver

// Importerer den klasse, der indeholder de statiske metoder, der skal testes.
// import static emne21_rekursion.Emne21Rekursion.*; // Kan bruges hvis du vil kalde metoderne direkte

@DisplayName("Emne 21: Rekursion - Test af Metoder")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Emne21RekursionTest {

    // --- Opgave 21.1: Fibonacci-tal (Rekursiv) ---
    @Test
    @Order(1)
    @DisplayName("Fibonacci: Basistilfælde og små n")
    void testFibonacci_BasisOgSmåN_21_1() {
        assertEquals(0, Emne21Rekursion.opgave21_1_fibonacci(0));
        assertEquals(1, Emne21Rekursion.opgave21_1_fibonacci(1));
        assertEquals(1, Emne21Rekursion.opgave21_1_fibonacci(2));
        assertEquals(2, Emne21Rekursion.opgave21_1_fibonacci(3));
        assertEquals(5, Emne21Rekursion.opgave21_1_fibonacci(5));
        assertEquals(55, Emne21Rekursion.opgave21_1_fibonacci(10));
    }

    @Test
    @Order(2)
    @DisplayName("Fibonacci: Negativt input kaster Exception")
    void testFibonacci_NegativInput_21_1() {
        assertThrows(IllegalArgumentException.class, () -> Emne21Rekursion.opgave21_1_fibonacci(-1));
        assertThrows(IllegalArgumentException.class, () -> Emne21Rekursion.opgave21_1_fibonacci(-5));
    }

    // --- Opgave 21.2: Sum af Cifre i et Heltal (Rekursiv) ---
    @Test
    @Order(3)
    @DisplayName("Sum af Cifre: Forskellige tal")
    void testSumAfCifre_21_2() {
        assertEquals(6, Emne21Rekursion.opgave21_2_sumAfCifre(123));
        assertEquals(15, Emne21Rekursion.opgave21_2_sumAfCifre(555));
        assertEquals(7, Emne21Rekursion.opgave21_2_sumAfCifre(7));
        assertEquals(0, Emne21Rekursion.opgave21_2_sumAfCifre(0));
        assertEquals(36, Emne21Rekursion.opgave21_2_sumAfCifre(12345678));
    }

    @Test
    @Order(4)
    @DisplayName("Sum af Cifre: Negativt input kaster Exception")
    void testSumAfCifre_NegativInput_21_2() {
        assertThrows(IllegalArgumentException.class, () -> Emne21Rekursion.opgave21_2_sumAfCifre(-123));
    }

    // --- Opgave 21.3: Potensopløftning (Rekursiv) ---
    @Test
    @Order(5)
    @DisplayName("Potens: Forskellige baser og eksponenter")
    void testPotens_21_3() {
        assertEquals(1.0, Emne21Rekursion.opgave21_3_potens(5.0, 0), 0.001);
        assertEquals(5.0, Emne21Rekursion.opgave21_3_potens(5.0, 1), 0.001);
        assertEquals(25.0, Emne21Rekursion.opgave21_3_potens(5.0, 2), 0.001);
        assertEquals(125.0, Emne21Rekursion.opgave21_3_potens(5.0, 3), 0.001);
        assertEquals(8.0, Emne21Rekursion.opgave21_3_potens(2.0, 3), 0.001);
        assertEquals(16.0, Emne21Rekursion.opgave21_3_potens(-2.0, 4), 0.001); // (-2)^4 = 16
        assertEquals(-32.0, Emne21Rekursion.opgave21_3_potens(-2.0, 5), 0.001); // (-2)^5 = -32
    }

    // --- Opgave 21.4: Omvend en Streng (Rekursiv) ---
    @Test
    @Order(6)
    @DisplayName("Omvend Streng: Forskellige strenge")
    void testOmvendStreng_21_4() {
        assertEquals("avaj", Emne21Rekursion.opgave21_4_omvendStreng("java"));
        assertEquals("nedreV jeH", Emne21Rekursion.opgave21_4_omvendStreng("Hej Verden"));
        assertEquals("a", Emne21Rekursion.opgave21_4_omvendStreng("a"));
        assertEquals("", Emne21Rekursion.opgave21_4_omvendStreng(""));
        assertNull(Emne21Rekursion.opgave21_4_omvendStreng(null));
    }

    // --- Opgave 21.5: Tæl Forekomster af et Tegn i en Streng (Rekursiv) ---
    @Test
    @Order(7)
    @DisplayName("Tæl Tegn: Forskellige scenarier")
    void testTælTegn_21_5() {
        assertEquals(3, Emne21Rekursion.opgave21_5_tælTegn("bananabanden", 'a'));
        assertEquals(1, Emne21Rekursion.opgave21_5_tælTegn("MissiSSippi", 'M')); // Case sensitiv
        assertEquals(0, Emne21Rekursion.opgave21_5_tælTegn("MissiSSippi", 'x'));
        assertEquals(0, Emne21Rekursion.opgave21_5_tælTegn("", 'a'));
        assertEquals(0, Emne21Rekursion.opgave21_5_tælTegn(null, 'a'));
    }

    // --- Opgave 21.6: Tæl Lige Tal i et Array (Rekursivt) ---
    @Test
    @Order(8)
    @DisplayName("Tæl Lige Tal: Forskellige arrays")
    void testTælLigeTalRekursivt_21_6() {
        assertEquals(3, Emne21Rekursion.opgave21_6_tælLigeTalRekursivt(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(0, Emne21Rekursion.opgave21_6_tælLigeTalRekursivt(new int[]{1, 3, 5, 7, 9}));
        assertEquals(5, Emne21Rekursion.opgave21_6_tælLigeTalRekursivt(new int[]{0, 2, 4, 6, 8})); // 0 er lige
        assertEquals(0, Emne21Rekursion.opgave21_6_tælLigeTalRekursivt(new int[]{}));
        assertEquals(0, Emne21Rekursion.opgave21_6_tælLigeTalRekursivt(null));
        assertEquals(1, Emne21Rekursion.opgave21_6_tælLigeTalRekursivt(new int[]{10}));
        assertEquals(0, Emne21Rekursion.opgave21_6_tælLigeTalRekursivt(new int[]{11}));
    }

    // --- Opgave 21.7: Er en Streng et Palindrom? (Rekursiv) ---
    @Test
    @Order(9)
    @DisplayName("Er Palindrom: Forskellige strenge")
    void testErPalindrom_21_7() {
        assertTrue(Emne21Rekursion.opgave21_7_erPalindrom("regninger"));
        assertTrue(Emne21Rekursion.opgave21_7_erPalindrom("Madam")); // Ignorer case
        assertTrue(Emne21Rekursion.opgave21_7_erPalindrom("a"));
        assertTrue(Emne21Rekursion.opgave21_7_erPalindrom(""));
        assertFalse(Emne21Rekursion.opgave21_7_erPalindrom("java"));
        assertFalse(Emne21Rekursion.opgave21_7_erPalindrom("palindrom"));
        assertFalse(Emne21Rekursion.opgave21_7_erPalindrom(null));
    }

    // --- Opgave 21.8: Find Mindste Element i et Heltalsarray (Rekursiv) ---
    @Test
    @Order(10)
    @DisplayName("Find Mindste Rekursivt: Forskellige arrays")
    void testFindMindsteRekursivt_21_8() {
        assertEquals(1, Emne21Rekursion.opgave21_8_findMindsteRekursivt(new int[]{5, 3, 8, 1, 9, 4}));
        assertEquals(-10, Emne21Rekursion.opgave21_8_findMindsteRekursivt(new int[]{-5, -2, -10, -1}));
        assertEquals(7, Emne21Rekursion.opgave21_8_findMindsteRekursivt(new int[]{7}));

        assertThrows(IllegalArgumentException.class, () -> Emne21Rekursion.opgave21_8_findMindsteRekursivt(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> Emne21Rekursion.opgave21_8_findMindsteRekursivt(null));
    }

    // --- Opgave 21.9: Generer Talrække som Streng (Rekursivt) ---
    @Test
    @Order(11)
    @DisplayName("Talrække Stigende: Forskellige intervaller")
    void testTalRækkeStigende_21_9() {
        assertEquals("3, 4, 5, 6, 7", Emne21Rekursion.opgave21_9_talRækkeStigende(3, 7));
        assertEquals("1", Emne21Rekursion.opgave21_9_talRækkeStigende(1, 1));
        assertEquals("", Emne21Rekursion.opgave21_9_talRækkeStigende(5, 3)); // start > slut
    }

    @Test
    @Order(12)
    @DisplayName("Talrække Faldende: Forskellige intervaller")
    void testTalRækkeFaldende_21_9() {
        assertEquals("7, 6, 5, 4, 3", Emne21Rekursion.opgave21_9_talRækkeFaldende(7, 3));
        assertEquals("1", Emne21Rekursion.opgave21_9_talRækkeFaldende(1, 1));
        assertEquals("", Emne21Rekursion.opgave21_9_talRækkeFaldende(3, 5)); // start < slut
    }

    // --- Opgave 21.10: Multiplikation via Gentagen Addition (Rekursiv) ---
    @Test
    @Order(13)
    @DisplayName("Multiplicer Rekursivt: Forskellige input")
    void testMultiplicerRekursivt_21_10() {
        assertEquals(15, Emne21Rekursion.opgave21_10_multiplicerRekursivt(5, 3));
        assertEquals(0, Emne21Rekursion.opgave21_10_multiplicerRekursivt(5, 0));
        assertEquals(0, Emne21Rekursion.opgave21_10_multiplicerRekursivt(0, 5));
        assertEquals(7, Emne21Rekursion.opgave21_10_multiplicerRekursivt(7, 1));
        assertEquals(7, Emne21Rekursion.opgave21_10_multiplicerRekursivt(1, 7));
        assertEquals(-15, Emne21Rekursion.opgave21_10_multiplicerRekursivt(5, -3));
        assertEquals(-15, Emne21Rekursion.opgave21_10_multiplicerRekursivt(-5, 3));
        assertEquals(15, Emne21Rekursion.opgave21_10_multiplicerRekursivt(-5, -3));
    }
}