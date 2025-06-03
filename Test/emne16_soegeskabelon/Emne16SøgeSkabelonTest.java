package emne16_soegeskabelon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Når du har oprettet dine klasser, fjern kommenteringen for de relevante imports.
/*
// For Opgave 16.3
import emne16_soegeskabelon.BogSog;
import emne16_soegeskabelon.BogSøgningsFunktioner; // Hvis metoden er her

// For Opgave 16.4
import emne16_soegeskabelon.ProduktSog;
import emne16_soegeskabelon.ProduktSøgningsFunktioner; // Hvis metoden er her

// For Opgave 16.8
import emne16_soegeskabelon.VareData;
import emne16_soegeskabelon.VareSøgning; // Hvis metoden er her
*/

class Emne16SøgeSkabelonTest {

    // --- Opgave 16.1: Lineær Søgning - Find Første Element Større End X ---
    @Test
    void testFindFirstGreaterThan_16_1() {
        assertEquals(7, Emne16SøgeSkabelon.opgave16_1_findFirstGreaterThan(new int[]{2, 4, 6, 7, 3, 8}, 6));
        assertEquals(8, Emne16SøgeSkabelon.opgave16_1_findFirstGreaterThan(new int[]{1, 2, 3, 8}, 5));
        assertEquals(Integer.MIN_VALUE, Emne16SøgeSkabelon.opgave16_1_findFirstGreaterThan(new int[]{1, 2, 3}, 5));
        assertEquals(Integer.MIN_VALUE, Emne16SøgeSkabelon.opgave16_1_findFirstGreaterThan(new int[]{}, 5));
        assertEquals(Integer.MIN_VALUE, Emne16SøgeSkabelon.opgave16_1_findFirstGreaterThan(null, 5));
    }

    // --- Opgave 16.2: Lineær Søgning - Find Sidste Forekomst af String i Liste ---
    @Test
    void testFindLastOccurrence_16_2() {
        List<String> liste = Arrays.asList("abe", "kat", "hund", "kat", "mus", "kat");
        assertEquals(5, Emne16SøgeSkabelon.opgave16_2_findLastOccurrence(liste, "kat"));
        assertEquals(0, Emne16SøgeSkabelon.opgave16_2_findLastOccurrence(liste, "abe"));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_2_findLastOccurrence(liste, "hest"));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_2_findLastOccurrence(new ArrayList<>(), "kat"));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_2_findLastOccurrence(null, "kat"));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_2_findLastOccurrence(liste, null));
    }

    // --- Opgave 16.3: Lineær Søgning - Tæl Bøger fra Specifikt Forlag ---
    @Test
    void testTælBøgerFraForlag_16_3() {
        // TODO: Afkommenter og kør når BogSog og BogSøgningsFunktioner er implementeret.
        /*
        List<BogSog> bøger = new ArrayList<>();
        bøger.add(new BogSog("Titel1", "Forf1", "ForlagA", 2000));
        bøger.add(new BogSog("Titel2", "Forf2", "ForlagB", 2001));
        bøger.add(new BogSog("Titel3", "Forf3", "forlaga", 2002)); // Case-insensitive match
        bøger.add(new BogSog("Titel4", "Forf4", "ForlagC", 2000));

        // Antager at metoden er i klassen Emne16SøgeSkabelon, eller at du har en BogSøgningsFunktioner klasse.
        // For nu kalder vi en hypotetisk statisk metode i Emne16SøgeSkabelon (eller din valgte klasse).
        // Juster kaldet hvis du placerer metoden i BogSøgningsFunktioner.java
        // For eksempel: assertEquals(2, BogSøgningsFunktioner.tælBøgerFraForlag(bøger, "ForlagA"));

        // For at testen kan køre uden eksterne klasser lige nu:
        // assertEquals(2, Emne16SøgeSkabelon.tælBøgerFraForlag_dummy(bøger, "ForlagA"));
        // assertEquals(1, Emne16SøgeSkabelon.tælBøgerFraForlag_dummy(bøger, "ForlagB"));
        // assertEquals(0, Emne16SøgeSkabelon.tælBøgerFraForlag_dummy(bøger, "UkendtForlag"));
        // assertEquals(0, Emne16SøgeSkabelon.tælBøgerFraForlag_dummy(new ArrayList<>(), "ForlagA"));
        // assertEquals(0, Emne16SøgeSkabelon.tælBøgerFraForlag_dummy(bøger, null));
        */
        assertTrue(true, "Test for 16.3 afventer implementering af BogSog og tælBøgerFraForlag.");
    }
    // Dummy metode for at lade testen kompilere, indtil brugeren implementerer den rigtige.
    // public static int tælBøgerFraForlag_dummy(List<BogSog> bøger, String forlagNavn) { return 0; }


    // --- Opgave 16.4: Lineær Søgning - Find Produkt med Specifikt ID ---
    @Test
    void testFindProduktViaId_16_4() {
        // TODO: Afkommenter og kør når ProduktSog og ProduktSøgningsFunktioner er implementeret.
        /*
        ArrayList<ProduktSog> produkter = new ArrayList<>();
        ProduktSog p1 = new ProduktSog("ID001", "Laptop", "Elektronik");
        ProduktSog p2 = new ProduktSog("ID002", "Kaffe", "Dagligvarer");
        ProduktSog p3 = new ProduktSog("id001", "Laptop Gammel", "Elektronik"); // Case-sensitiv forskel
        produkter.add(p1);
        produkter.add(p2);
        produkter.add(p3);

        // Antager at metoden er i klassen Emne16SøgeSkabelon eller ProduktSøgningsFunktioner.
        // Juster kaldet efter din implementering.
        // For eksempel: assertEquals(p1, ProduktSøgningsFunktioner.findProduktViaId(produkter, "ID001"));

        // For at testen kan køre:
        // assertEquals(p1, Emne16SøgeSkabelon.findProduktViaId_dummy(produkter, "ID001"));
        // assertNull(Emne16SøgeSkabelon.findProduktViaId_dummy(produkter, "ID003"));
        // assertNull(Emne16SøgeSkabelon.findProduktViaId_dummy(new ArrayList<>(), "ID001"));
        // assertNull(Emne16SøgeSkabelon.findProduktViaId_dummy(produkter, null));
        */
        assertTrue(true, "Test for 16.4 afventer implementering af ProduktSog og findProduktViaId.");
    }
    // public static ProduktSog findProduktViaId_dummy(ArrayList<ProduktSog> p, String id) { return null; }


    // --- Opgave 16.5: Lineær Søgning - Find Strenge Indeholdende Delstreng ---
    @Test
    void testFindStrengeMedDelstreng_16_5() {
        List<String> input = Arrays.asList("Danmark er et dejligt land", "Sverige er også fint", "Danse macabre");
        List<String> expected = Arrays.asList("Danmark er et dejligt land", "Danse macabre");
        assertEquals(expected, Emne16SøgeSkabelon.opgave16_5_findStrengeMedDelstreng(input, "dan")); // Case-insensitive

        List<String> input2 = Arrays.asList("Solskin", "Regnvejr", "Skyfrit");
        assertTrue(Emne16SøgeSkabelon.opgave16_5_findStrengeMedDelstreng(input2, "sne").isEmpty());
        assertTrue(Emne16SøgeSkabelon.opgave16_5_findStrengeMedDelstreng(new ArrayList<>(), "test").isEmpty());
        assertTrue(Emne16SøgeSkabelon.opgave16_5_findStrengeMedDelstreng(input2, null).isEmpty());
        assertTrue(Emne16SøgeSkabelon.opgave16_5_findStrengeMedDelstreng(input2, "").size() == input2.size()); // Tom delstreng matcher alle
    }

    // --- Opgave 16.6: Iterativ Binær Søgning i Array ---
    @Test
    void testIterativBinærSøgning_16_6() {
        int[] arr = {2, 5, 7, 8, 11, 12, 15, 18, 22, 25};
        assertEquals(0, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(arr, 2));
        assertEquals(5, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(arr, 12));
        assertEquals(9, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(arr, 25));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(arr, 6));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(arr, 0));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(arr, 100));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(new int[]{}, 5));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(null, 5));
        assertEquals(0, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(new int[]{5}, 5));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_6_iterativBinærSøgning(new int[]{5}, 3));
    }

    // --- Opgave 16.7: Rekursiv Binær Søgning i Array ---
    @Test
    void testRekursivBinærSøgning_16_7() {
        int[] arr = {2, 5, 7, 8, 11, 12, 15, 18, 22, 25};
        assertEquals(0, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(arr, 2));
        assertEquals(5, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(arr, 12));
        assertEquals(9, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(arr, 25));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(arr, 6));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(arr, 0));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(arr, 100));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(new int[]{}, 5));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(null, 5));
        assertEquals(0, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(new int[]{5}, 5));
        assertEquals(-1, Emne16SøgeSkabelon.opgave16_7_rekursivBinærSøgning(new int[]{5}, 3));
    }

    // --- Opgave 16.8: Binær Søgning på Liste af Comparable Objekter ---
    @Test
    void testFindVareMedPris_16_8() {
        // TODO: Afkommenter og kør når VareData og VareSøgning (med metoden) er implementeret.
        /*
        List<VareData> varer = new ArrayList<>(Arrays.asList(
            new VareData("V002", "Mus", 99.95),
            new VareData("V001", "Tastatur", 249.50),
            new VareData("V003", "Skærm", 1299.00),
            new VareData("V004", "USB Hub", 249.50) // Samme pris som tastatur
        ));
        Collections.sort(varer); // Sorterer på pris, så varekoder

        // Forventet sorteret orden: Mus(99.95), Tastatur(249.50,V001), USB Hub(249.50,V004), Skærm(1299)

        // Antager at metoden er i klassen Emne16SøgeSkabelon eller VareSøgning.
        // Juster kaldet efter din implementering.
        assertTrue(Emne16SøgeSkabelon.findVareMedPris_dummy(varer, 249.50));
        assertTrue(Emne16SøgeSkabelon.findVareMedPris_dummy(varer, 99.95));
        assertFalse(Emne16SøgeSkabelon.findVareMedPris_dummy(varer, 100.00)); // Præcis pris, ikke tæt på
        assertFalse(Emne16SøgeSkabelon.findVareMedPris_dummy(new ArrayList<>(), 100.00));
        assertFalse(Emne16SøgeSkabelon.findVareMedPris_dummy(null, 100.00));
        */
        assertTrue(true, "Test for 16.8 afventer implementering af VareData og findVareMedPris.");
    }
    // public static boolean findVareMedPris_dummy(List<VareData> v, double p) { return false;}


    // --- Opgave 16.9: Find Indsætningspunkt i Sorteret Array ---
    @Test
    void testFindInsertionPoint_16_9() {
        int[] arr = {2, 5, 7, 8, 11, 12};
        assertEquals(2, Emne16SøgeSkabelon.opgave16_9_findInsertionPoint(arr, 6)); // Mellem 5 og 7
        assertEquals(2, Emne16SøgeSkabelon.opgave16_9_findInsertionPoint(arr, 7)); // Ved eksisterende element (første forekomst)
        assertEquals(6, Emne16SøgeSkabelon.opgave16_9_findInsertionPoint(arr, 13)); // Efter alle
        assertEquals(0, Emne16SøgeSkabelon.opgave16_9_findInsertionPoint(arr, 1));  // Før alle
        assertEquals(0, Emne16SøgeSkabelon.opgave16_9_findInsertionPoint(arr, 2));  // Ved første element
        assertEquals(5, Emne16SøgeSkabelon.opgave16_9_findInsertionPoint(arr, 12)); // Ved sidste element

        assertEquals(0, Emne16SøgeSkabelon.opgave16_9_findInsertionPoint(new int[]{}, 5)); // Tomt array
        assertEquals(0, Emne16SøgeSkabelon.opgave16_9_findInsertionPoint(null, 5));      // Null array
    }

    // --- Opgave 16.10: Teoretisk Anvendelse af Søgeskabelonen ---
    @Test
    void testSvarSøgestrategiUsorteretListe_16_10() {
        // Korrekt svar: 3. Liste A: Lineær søgning; Liste B: Binær søgning.
        // (Efter rettelse af opgaven til at fjerne Big O)
        assertEquals(3, Emne16SøgeSkabelon.opgave16_10_svarSøgestrategiValg());
    }
}