package emne24_generics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException; // For MinValgfri, hvis den kaster det
import java.util.EmptyStackException;  // For BegrænsetStak

// Når du har oprettet dine klasser og interfaces, fjern kommenteringen for de relevante imports.
/*
// Opgave 24.1
import emne24_generics.Holder;

// Opgave 24.2
// ArrayUtilGenerics (hvis metoden er der, ellers kaldes den statisk på Emne24Generics)

// Opgave 24.3
import emne24_generics.Par;

// Opgave 24.4
// ListUtilGenerics (hvis metoden er der)

// Opgave 24.5
import emne24_generics.Transformator;
import emne24_generics.StrengTilLængde;
import emne24_generics.HeltalTilKvadrat;

// Opgave 24.6
import emne24_generics.Datatrio;

// Opgave 24.7 & 24.10
import emne24_generics.Betingelse;
// ListUtilGenerics (hvis metoden er der for 24.7 og 24.10)

// Opgave 24.8
import emne24_generics.BegrænsetStak;

// Opgave 24.9
// ListUtilGenerics (hvis metoden er der)

// Opgave 24.10 (MinValgfri blev erstattet, men hvis det var den)
// import emne24_generics.MinValgfri;
*/

class Emne24GenericsTest {

    // --- Opgave 24.1: Simpel Generisk Holder<T> Klasse ---
    @Test
    void testHolder_StringOgInteger_24_1() {
        // TODO: Afkommenter når Holder er implementeret.
        /*
        Holder<String> stringHolder = new Holder<>("Test Streng");
        assertEquals("Test Streng", stringHolder.getVærdi());
        assertTrue(stringHolder.toString().contains("Test Streng"));

        stringHolder.setVærdi("Ny Streng");
        assertEquals("Ny Streng", stringHolder.getVærdi());

        Holder<Integer> intHolder = new Holder<>(123);
        assertEquals(Integer.valueOf(123), intHolder.getVærdi());
        intHolder.setVærdi(456);
        assertEquals(Integer.valueOf(456), intHolder.getVærdi());
        */
    }

    // --- Opgave 24.2: Generisk Metode til at Bytte To Elementer i et Array ---
    @Test
    void testBytElementer_IntegerOgStringArrays_24_2() {
        Integer[] talArray = {1, 2, 3, 4, 5};
        Emne24Generics.opgave24_2_bytElementer(talArray, 1, 3);
        assertArrayEquals(new Integer[]{1, 4, 3, 2, 5}, talArray);

        String[] strengArray = {"abe", "bi", "citron", "due"};
        Emne24Generics.opgave24_2_bytElementer(strengArray, 0, 3);
        assertArrayEquals(new String[]{"due", "bi", "citron", "abe"}, strengArray);

        // Test edge cases (ugyldige indekser, null array - afhængig af implementering)
        Integer[] kortArray = {10, 20};
        // Antager at ugyldige indekser ikke gør noget, eller kaster fejl (test for det i så fald)
        Emne24Generics.opgave24_2_bytElementer(kortArray, 0, 5); // Ugyldigt indeks
        assertArrayEquals(new Integer[]{10, 20}, kortArray, "Byt med ugyldigt indeks bør ikke ændre array, eller kaste fejl.");
        Emne24Generics.opgave24_2_bytElementer(null, 0, 0); // Skal håndtere null uden fejl
    }

    // --- Opgave 24.3: Generisk Par<K, V> Klasse ---
    @Test
    void testPar_ForskelligeTyperOgEquals_24_3() {
        // TODO: Afkommenter når Par er implementeret.
        /*
        Par<String, Integer> par1 = new Par<>("Alder", 30);
        assertEquals("Alder", par1.getNøgle());
        assertEquals(Integer.valueOf(30), par1.getVærdi());
        assertTrue(par1.toString().contains("Alder") && par1.toString().contains("30"));

        Par<String, Integer> par2 = new Par<>("Alder", 30);
        Par<String, Integer> par3 = new Par<>("Højde", 180);
        Par<Integer, String> par4 = new Par<>(1, "Tekst");

        assertEquals(par1, par2, "To ens Par objekter skal være ens ifølge equals.");
        assertNotEquals(par1, par3);
        assertNotEquals(par1, par4); // Forskellige typer for K, V (selvom equals kan håndtere Object)
        assertNotEquals(par1, null);
        assertNotEquals(par1, "En streng");
        */
    }

    // --- Opgave 24.4: Generisk Metode til at Tælle Specifikke Elementer i en Liste ---
    @Test
    void testTælElement_ForskelligeListerOgElementer_24_4() {
        List<String> strenge = Arrays.asList("a", "b", "a", "c", "a", "d");
        assertEquals(3, Emne24Generics.opgave24_4_tælElement(strenge, "a"));
        assertEquals(1, Emne24Generics.opgave24_4_tælElement(strenge, "c"));
        assertEquals(0, Emne24Generics.opgave24_4_tælElement(strenge, "x"));

        List<Integer> tal = Arrays.asList(1, 5, 2, 5, 3, 5);
        assertEquals(3, Emne24Generics.opgave24_4_tælElement(tal, 5));
        assertEquals(0, Emne24Generics.opgave24_4_tælElement(tal, 7));

        assertEquals(0, Emne24Generics.opgave24_4_tælElement(new ArrayList<String>(), "a")); // Tom liste
        assertEquals(0, Emne24Generics.opgave24_4_tælElement(strenge, null)); // Tælle null
        List<String> listeMedNull = Arrays.asList("a", null, "b", null);
        assertEquals(2, Emne24Generics.opgave24_4_tælElement(listeMedNull, null));
        assertEquals(0, Emne24Generics.opgave24_4_tælElement(null, "a")); // Null liste
    }

    // --- Opgave 24.5: Generisk Interface Transformator<I, O> ---
    @Test
    void testTransformator_Implementeringer_24_5() {
        // TODO: Afkommenter når Transformator, StrengTilLængde og HeltalTilKvadrat er implementeret.
        /*
        Transformator<String, Integer> længdeBeregner = new StrengTilLængde();
        assertEquals(Integer.valueOf(5), længdeBeregner.transformer("Hello"));
        assertEquals(Integer.valueOf(0), længdeBeregner.transformer(""));

        Transformator<Integer, Integer> kvadratBeregner = new HeltalTilKvadrat();
        assertEquals(Integer.valueOf(25), kvadratBeregner.transformer(5));
        assertEquals(Integer.valueOf(0), kvadratBeregner.transformer(0));
        assertEquals(Integer.valueOf(16), kvadratBeregner.transformer(-4)); // (-4)^2 = 16
        */
    }

    // --- Opgave 24.6: Generisk Klasse Datatrio<T1, T2, T3> ---
    @Test
    void testDatatrio_ForskelligeTyper_24_6() {
        // TODO: Afkommenter når Datatrio er implementeret.
        /*
        Datatrio<String, Integer, Boolean> trio1 = new Datatrio<>("Status", 1, true);
        assertEquals("Status", trio1.getElement1());
        assertEquals(Integer.valueOf(1), trio1.getElement2());
        assertEquals(Boolean.TRUE, trio1.getElement3());
        assertTrue(trio1.toString().contains("Status") && trio1.toString().contains("1") && trio1.toString().contains("true"));

        LocalDate dato = LocalDate.now();
        Datatrio<Double, String, LocalDate> trio2 = new Datatrio<>(3.14, "Pi", dato);
        assertEquals(Double.valueOf(3.14), trio2.getElement1());
        assertEquals("Pi", trio2.getElement2());
        assertEquals(dato, trio2.getElement3());
        */
    }

    // --- Opgave 24.7: Generisk Metode til at Finde Første Element der Opfylder Betingelse ---
    // Antager at Betingelse<T> interface er defineret: public interface Betingelse<T> { boolean test(T element); }
    @Test
    void testFindFørsteMatch_24_7() {
        // TODO: Afkommenter når Betingelse og opgave24_7_findFørsteMatch er implementeret.
        /*
        List<String> navne = Arrays.asList("Peter", "Anna", "Bo", "Christoffer", "Ida");
        Betingelse<String> starterMedA = s -> s.startsWith("A");
        assertEquals("Anna", Emne24Generics.opgave24_7_findFørsteMatch(navne, starterMedA));

        Betingelse<String> længereEnd5 = s -> s.length() > 5;
        assertEquals("Christoffer", Emne24Generics.opgave24_7_findFørsteMatch(navne, længereEnd5));

        Betingelse<String> indeholderX = s -> s.contains("X");
        assertNull(Emne24Generics.opgave24_7_findFørsteMatch(navne, indeholderX)); // Intet match

        List<Integer> tal = Arrays.asList(1, 3, 5, 6, 7, 9);
        Betingelse<Integer> erLige = n -> n % 2 == 0;
        assertEquals(Integer.valueOf(6), Emne24Generics.opgave24_7_findFørsteMatch(tal, erLige));

        assertNull(Emne24Generics.opgave24_7_findFørsteMatch(new ArrayList<String>(), starterMedA)); // Tom liste
        assertNull(Emne24Generics.opgave24_7_findFørsteMatch(null, starterMedA)); // Null liste
        assertNull(Emne24Generics.opgave24_7_findFørsteMatch(navne, null)); // Null betingelse
        */
    }

    // --- Opgave 24.8: Generisk Klasse BegrænsetStak<E> ---
    @Test
    void testBegrænsetStak_OperationerOgGrænser_24_8() {
        // TODO: Afkommenter når BegrænsetStak er implementeret.
        /*
        BegrænsetStak<String> stak = new BegrænsetStak<>(2);
        assertTrue(stak.erTom());
        assertFalse(stak.erFuldt());
        assertEquals(0, stak.getAntalElementer());

        assertTrue(stak.push("A"));
        assertFalse(stak.erTom());
        assertEquals(1, stak.getAntalElementer());
        assertEquals("A", stak.peek());

        assertTrue(stak.push("B"));
        assertTrue(stak.erFuldt());
        assertEquals(2, stak.getAntalElementer());
        assertEquals("B", stak.peek());

        assertFalse(stak.push("C"), "Stakken skulle være fuld."); // Kan ikke pushe C
        assertEquals("B", stak.peek()); // Stadig B øverst

        assertEquals("B", stak.pop());
        assertFalse(stak.erFuldt());
        assertEquals(1, stak.getAntalElementer());
        assertEquals("A", stak.pop());
        assertTrue(stak.erTom());

        assertThrows(EmptyStackException.class, () -> stak.pop());
        assertThrows(EmptyStackException.class, () -> stak.peek());
        */
    }

    // --- Opgave 24.9: Generisk Metode til at Sammenflette To Lister ---
    @Test
    void testFletLister_ForskelligeScenarier_24_9() {
        // TODO: Afkommenter når opgave24_9_fletLister er implementeret.
        /*
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5));
        List<Integer> expected1 = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected1, Emne24Generics.opgave24_9_fletLister(list1, list2));

        List<String> sList1 = new ArrayList<>(Arrays.asList("a", "b"));
        List<String> sList2 = new ArrayList<>(); // Tom liste
        assertEquals(sList1, Emne24Generics.opgave24_9_fletLister(sList1, sList2));
        assertEquals(sList1, Emne24Generics.opgave24_9_fletLister(sList2, sList1)); // Tom først

        List<Double> dList = new ArrayList<>(Arrays.asList(1.1, 2.2));
        // Håndtering af null input afhænger af din implementering.
        // Her antager vi, at null + liste => liste, null + null => tom liste.
        assertEquals(dList, Emne24Generics.opgave24_9_fletLister(null, dList));
        assertEquals(dList, Emne24Generics.opgave24_9_fletLister(dList, null));
        assertTrue(Emne24Generics.opgave24_9_fletLister(null, null).isEmpty());
        assertTrue(Emne24Generics.opgave24_9_fletLister(new ArrayList<>(), new ArrayList<>()).isEmpty());
        */
    }

    // --- Opgave 24.10: Generisk Metode til at Filtrere en Liste ---
    @Test
    void testFiltrerListe_24_10() {
        // TODO: Afkommenter når Betingelse og opgave24_10_filtrerListe er implementeret.
        /*
        List<Integer> tal = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Betingelse<Integer> erLigeTal = n -> n % 2 == 0;
        List<Integer> ligeTal = Emne24Generics.opgave24_10_filtrerListe(tal, erLigeTal);
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), ligeTal);

        Betingelse<Integer> erStørreEnd5 = n -> n > 5;
        List<Integer> storeTal = Emne24Generics.opgave24_10_filtrerListe(tal, erStørreEnd5);
        assertEquals(Arrays.asList(6, 7, 8, 9, 10), storeTal);

        List<String> ord = Arrays.asList("Test", "Hej", "Verden", "Java", "Kode");
        Betingelse<String> har4Bogstaver = s -> s.length() == 4;
        List<String> fireBogstavsOrd = Emne24Generics.opgave24_10_filtrerListe(ord, har4Bogstaver);
        assertEquals(Arrays.asList("Test", "Hej!", "Java", "Kode"), fireBogstavsOrd); // Fejl i min testdata. "Hej" er 3.
                                                                                   // Korrekt: "Test", "Java", "Kode"
        assertEquals(Arrays.asList("Test", "Java", "Kode"), fireBogstavsOrd);


        assertTrue(Emne24Generics.opgave24_10_filtrerListe(new ArrayList<Integer>(), erLigeTal).isEmpty()); // Tom liste
        assertTrue(Emne24Generics.opgave24_10_filtrerListe(tal, null).isEmpty()); // Null betingelse -> tom liste
        assertTrue(Emne24Generics.opgave24_10_filtrerListe(null, erLigeTal).isEmpty()); // Null liste -> tom liste
        */
    }
}