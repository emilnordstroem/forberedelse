package emne25_kaededestrukturer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Når du har oprettet dine klasser og interfaces, fjern kommenteringen for de relevante imports.
/*
// Opgave 25.1, 25.2, 25.3, 25.9
import emne25_kaededestrukturer.MinEnkeltKædetListe;
// import emne25_kaededestrukturer.MinEnkeltKædetListe.SimpelSLLNode; // Hvis Node er public static inner

// Opgave 25.4, 25.5, 25.6
import emne25_kaededestrukturer.MinDobbeltKædetListe;
// import emne25_kaededestrukturer.MinDobbeltKædetListe.SimpelDLLNode; // Hvis Node er public static inner

// Opgave 25.7
import emne25_kaededestrukturer.MinCirkulærSLL;
// import emne25_kaededestrukturer.MinCirkulærSLL.SimpelSLLNode; // Hvis Node genbruges og er public static inner

// Opgave 25.8
import emne25_kaededestrukturer.JosephusLøser;

// Opgave 25.10
import emne25_kaededestrukturer.KædetStak;
// import emne25_kaededestrukturer.KædetStak.Node; // Hvis Node er public static inner
*/

class Emne25KædedeStrukturerTest {

    // --- Opgave 25.1, 25.2, 25.3: MinEnkeltKædetListe ---
//    private MinEnkeltKædetListe<Integer> sll;

    @BeforeEach
    void setUpSLL() {
        // TODO: Afkommenter når MinEnkeltKædetListe er implementeret
        /*
        sll = new MinEnkeltKædetListe<>();
        */
    }

    @Test
    void testSLL_GrundlæggendeOperationer_25_1() {
        // TODO: Afkommenter og kør når MinEnkeltKædetListe er implementeret.
        /*
        if (sll == null) fail("MinEnkeltKædetListe skal initialiseres i setUpSLL for testen kan køre.");

        assertTrue(sll.erTom());
        assertEquals(0, sll.getSize());

        sll.tilføjFørst(10);
        assertFalse(sll.erTom());
        assertEquals(1, sll.getSize());
        assertEquals("[10]", sll.toString());

        sll.tilføjSidst(20);
        assertEquals(2, sll.getSize());
        assertEquals("[10, 20]", sll.toString());

        sll.tilføjFørst(5);
        assertEquals(3, sll.getSize());
        assertEquals("[5, 10, 20]", sll.toString());

        assertEquals(Integer.valueOf(5), sll.fjernFørst());
        assertEquals(2, sll.getSize());
        assertEquals("[10, 20]", sll.toString());

        assertEquals(Integer.valueOf(10), sll.fjernFørst());
        assertEquals(Integer.valueOf(20), sll.fjernFørst());
        assertTrue(sll.erTom());
        assertThrows(NoSuchElementException.class, () -> sll.fjernFørst());
        */
    }

    @Test
    void testSLL_UdvidedeOperationer_25_2() {
        // TODO: Afkommenter og kør når MinEnkeltKædetListe er udvidet.
        /*
        if (sll == null) fail("MinEnkeltKædetListe skal initialiseres i setUpSLL for testen kan køre.");
        sll.tilføjSidst(1); sll.tilføjSidst(2); sll.tilføjSidst(3); // Liste: [1, 2, 3]

        assertEquals(Integer.valueOf(1), sll.getElementPå(0));
        assertEquals(Integer.valueOf(3), sll.getElementPå(2));
        assertThrows(IndexOutOfBoundsException.class, () -> sll.getElementPå(3));
        assertThrows(IndexOutOfBoundsException.class, () -> sll.getElementPå(-1));

        assertTrue(sll.indeholder(2));
        assertFalse(sll.indeholder(4));
        assertFalse(sll.indeholder(null)); // Antager null ikke er tilladt eller ikke findes
        sll.tilføjSidst(null); // Hvis null er tilladt
        assertTrue(sll.indeholder(null));


        sll = new MinEnkeltKædetListe<>(); // Nulstil
        sll.tilføjSidst(10); sll.tilføjSidst(30);
        sll.indsætEfter(10, 20); // [10, 20, 30]
        assertEquals("[10, 20, 30]", sll.toString());
        sll.indsætEfter(30, 40); // [10, 20, 30, 40]
        assertEquals("[10, 20, 30, 40]", sll.toString());
        sll.indsætEfter(50, 60); // 50 findes ikke, listen uændret
        assertEquals("[10, 20, 30, 40]", sll.toString());
        */
    }

    @Test
    void testSLL_FjernOperationer_25_3() {
        // TODO: Afkommenter og kør når MinEnkeltKædetListe er udvidet.
        /*
        if (sll == null) fail("MinEnkeltKædetListe skal initialiseres i setUpSLL for testen kan køre.");
        sll.tilføjSidst(1); sll.tilføjSidst(2); sll.tilføjSidst(3); sll.tilføjSidst(2); sll.tilføjSidst(4); // [1,2,3,2,4]

        assertTrue(sll.fjernElement(2)); // Fjerner første 2
        assertEquals("[1, 3, 2, 4]", sll.toString());
        assertTrue(sll.fjernElement(4)); // Fjerner 4
        assertEquals("[1, 3, 2]", sll.toString());
        assertFalse(sll.fjernElement(5)); // Findes ikke
        assertEquals("[1, 3, 2]", sll.toString());

        assertEquals(Integer.valueOf(2), sll.fjernSidst()); // [1, 3]
        assertEquals("[1, 3]", sll.toString());
        assertEquals(Integer.valueOf(3), sll.fjernSidst()); // [1]
        assertEquals("[1]", sll.toString());
        assertEquals(Integer.valueOf(1), sll.fjernSidst()); // []
        assertTrue(sll.erTom());
        assertThrows(NoSuchElementException.class, () -> sll.fjernSidst());
        */
    }

    // --- Opgave 25.4, 25.5, 25.6: MinDobbeltKædetListe ---
//    private MinDobbeltKædetListe<String> dll;

    @BeforeEach
    void setUpDLL() {
        // TODO: Afkommenter når MinDobbeltKædetListe er implementeret
        /*
        dll = new MinDobbeltKædetListe<>();
        */
    }

    @Test
    void testDLL_GrundlæggendeOperationer_25_4() {
        // TODO: Afkommenter og kør når MinDobbeltKædetListe er implementeret.
        /*
        if (dll == null) fail("MinDobbeltKædetListe skal initialiseres i setUpDLL for testen kan køre.");
        assertTrue(dll.erTom());
        dll.tilføjFørst("B"); // [B]
        assertEquals(1, dll.getSize());
        dll.tilføjSidst("C"); // [B, C]
        dll.tilføjFørst("A"); // [A, B, C]
        assertEquals(3, dll.getSize());
        assertFalse(dll.erTom());

        assertEquals("A", dll.fjernFørst()); // [B, C]
        assertEquals("C", dll.fjernSidst());  // [B]
        assertEquals(1, dll.getSize());
        assertEquals("B", dll.fjernFørst());  // []
        assertTrue(dll.erTom());

        assertThrows(NoSuchElementException.class, () -> dll.fjernFørst());
        assertThrows(NoSuchElementException.class, () -> dll.fjernSidst());
        */
    }

    @Test
    void testDLL_UdvidedeOperationer_25_5() {
        // TODO: Afkommenter og kør når MinDobbeltKædetListe er udvidet.
        /*
        if (dll == null) fail("MinDobbeltKædetListe skal initialiseres i setUpDLL for testen kan køre.");
        dll.tilføjSidst("X"); dll.tilføjSidst("Z"); // [X, Z]
        dll.indsætPåPosition(1, "Y"); // [X, Y, Z]
        assertEquals(3, dll.getSize());
        // Tjek toStringFremad og toStringBaglæns her
        // assertEquals("[X, Y, Z]", dll.toStringFremad()); // Antager et bestemt format
        // assertEquals("[Z, Y, X]", dll.toStringBaglæns());

        dll.indsætPåPosition(0, "W"); // [W, X, Y, Z]
        // assertEquals("[W, X, Y, Z]", dll.toStringFremad());
        dll.indsætPåPosition(4, "Omega"); // [W, X, Y, Z, Omega]
        // assertEquals("[W, X, Y, Z, Omega]", dll.toStringFremad());

        assertEquals("Y", dll.fjernPåPosition(2)); // [W, X, Z, Omega]
        // assertEquals("[W, X, Z, Omega]", dll.toStringFremad());

        assertThrows(IndexOutOfBoundsException.class, () -> dll.indsætPåPosition(10, "Fail"));
        assertThrows(IndexOutOfBoundsException.class, () -> dll.fjernPåPosition(10));
        */
    }

    @Test
    void testDLL_FindOgErstat_25_6() {
        // TODO: Afkommenter og kør når MinDobbeltKædetListe er udvidet.
        /*
        if (dll == null) fail("MinDobbeltKædetListe skal initialiseres i setUpDLL for testen kan køre.");
        dll.tilføjSidst("Kat"); dll.tilføjSidst("Hund"); dll.tilføjSidst("Mus");

        assertTrue(dll.findOgErstat("Hund", "Fugl"));
        // Test at listen nu er [Kat, Fugl, Mus] via toString eller get-metoder
        // assertEquals("[Kat, Fugl, Mus]", dll.toStringFremad());

        assertFalse(dll.findOgErstat("Gris", "Ko")); // Gris findes ikke
        // assertEquals("[Kat, Fugl, Mus]", dll.toStringFremad()); // Uændret
        */
    }

    // --- Opgave 25.7: MinCirkulærSLL ---
    @Test
    void testMinCirkulærSLL_Operationer_25_7() {
        // TODO: Afkommenter og kør når MinCirkulærSLL er implementeret.
        /*
        MinCirkulærSLL<Integer> csll = new MinCirkulærSLL<>();
        assertTrue(csll.erTom()); // Antager erTom() metode

        csll.tilføjSidst(1); // Tail peger på 1, 1.next peger på 1
        csll.tilføjSidst(2); // Tail peger på 2, 2.next peger på 1
        csll.tilføjSidst(3); // Tail peger på 3, 3.next peger på 1
        assertEquals(3, csll.getSize()); // Antager getSize() metode

        // toStringMedStart skal starte fra "hovedet" (efter tail)
        // Liste: 1 -> 2 -> 3 -> (tilbage til 1). Tail er 3. Head er 1.
        assertEquals("[1, 2, 3]", csll.toStringMedStart(3));

        csll.roter(); // Tail er nu 1. Head er 2. Liste: 2 -> 3 -> 1 -> (tilbage til 2)
        assertEquals("[2, 3, 1]", csll.toStringMedStart(3));

        assertEquals(Integer.valueOf(2), csll.fjernFørst()); // Fjerner "hovedet" (2)
        assertEquals(2, csll.getSize());
        // Tail er stadig 1. Head er 3. Liste: 3 -> 1 -> (tilbage til 3)
        assertEquals("[3, 1]", csll.toStringMedStart(2));
        */
    }

    // --- Opgave 25.8: Josephus Problem ---
    @Test
    void testJosephusProblem_25_8() {
        // TODO: Afkommenter og kør når JosephusLøser er implementeret.
        /*
        List<String> navne = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        List<String> fjernetRækkefølge = JosephusLøser.løsJosephusProblem(navne, 3);
        // Forventet: C, A, E, B, D (som udregnet i opgavebeskrivelsen)
        assertEquals(Arrays.asList("C", "A", "E", "B", "D"), fjernetRækkefølge);

        List<String> navne2 = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7"));
        List<String> fjernet2 = JosephusLøser.løsJosephusProblem(navne2, 3);
        assertEquals(Arrays.asList("3","6","2","7","5","1","4"), fjernet2);

        assertTrue(JosephusLøser.løsJosephusProblem(new ArrayList<>(), 3).isEmpty());
        assertThrows(IllegalArgumentException.class, () -> JosephusLøser.løsJosephusProblem(navne, 0)); // Hvis hop < 1 kaster fejl
        */
    }

    // --- Opgave 25.9: Find Midterste Element i Enkeltkædet Liste ---
    @Test
    void testFindMidtersteElement_SLL_25_9() {
        // TODO: Afkommenter og kør når MinEnkeltKædetListe er udvidet (eller utility-metoden er lavet).
        /*
        // Antager at findMidtersteElement er en instansmetode på MinEnkeltKædetListe
        MinEnkeltKædetListe<Integer> liste1 = new MinEnkeltKædetListe<>();
        liste1.tilføjSidst(1); liste1.tilføjSidst(2); liste1.tilføjSidst(3); liste1.tilføjSidst(4); liste1.tilføjSidst(5);
        assertEquals(Integer.valueOf(3), liste1.findMidtersteElement()); // Odd antal

        MinEnkeltKædetListe<Integer> liste2 = new MinEnkeltKædetListe<>();
        liste2.tilføjSidst(1); liste2.tilføjSidst(2); liste2.tilføjSidst(3); liste2.tilføjSidst(4);
        assertEquals(Integer.valueOf(2), liste2.findMidtersteElement()); // Lige antal, første af de to midterste

        MinEnkeltKædetListe<Integer> liste3 = new MinEnkeltKædetListe<>();
        liste3.tilføjSidst(10);
        assertEquals(Integer.valueOf(10), liste3.findMidtersteElement()); // Et element

        MinEnkeltKædetListe<Integer> tomListe = new MinEnkeltKædetListe<>();
        assertThrows(NoSuchElementException.class, () -> tomListe.findMidtersteElement());
        */
    }


    // --- Opgave 25.10: Implementer en Simpel Kædet Stak (LIFO) ---
    @Test
    void testKædetStak_Operationer_25_10() {
        // TODO: Afkommenter og kør når KædetStak er implementeret.
        /*
        KædetStak<String> stak = new KædetStak<>();
        assertTrue(stak.erTom());
        assertEquals(0, stak.size());
        assertThrows(NoSuchElementException.class, () -> stak.pop());
        assertThrows(NoSuchElementException.class, () -> stak.peek());

        stak.push("A");
        stak.push("B");
        stak.push("C");
        assertEquals(3, stak.size());
        assertFalse(stak.erTom());

        assertEquals("C", stak.peek());
        assertEquals(3, stak.size()); // Peek ændrer ikke size

        assertEquals("C", stak.pop());
        assertEquals("B", stak.pop());
        assertEquals("A", stak.pop());
        assertTrue(stak.erTom());
        assertEquals(0, stak.size());
        */
    }
}