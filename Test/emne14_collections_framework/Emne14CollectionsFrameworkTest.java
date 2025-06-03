package emne14_collections_framework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled; // Kan bruges til at markere tests som skal implementeres
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.*; // Importerer hele util for nemheds skyld

// Når du har oprettet dine interfaces og klasser for Emne 14,
// fjern kommenteringen for de relevante imports nedenfor,
// og afkommenter derefter testkroppene.
/*
// Opgave 14.1 & 14.2
import emne14_collections_framework.LinkedListDemo; // For 14.1
import emne14_collections_framework.ListManipulator; // For 14.2

// Opgave 14.3
import emne14_collections_framework.SetDemo;

// Opgave 14.4
import emne14_collections_framework.TreeSetDemo;
// import emne14_collections_framework.StringLengthThenAlphabeticalComparator; // Hvis du laver den som separat klasse

// Opgave 14.5
import emne14_collections_framework.SetOperationer;

// Opgave 14.6
import emne14_collections_framework.Ordtæller;

// Opgave 14.7
// import emne14_collections_framework.KontaktPerson; // Ikke nødvendig hvis Telefonbog tager String, String
import emne14_collections_framework.Telefonbog;

// Opgave 14.8
import emne14_collections_framework.PrinterKøManager;

// Opgave 14.9
import emne14_collections_framework.ListeUtilities;
*/

class Emne14CollectionsFrameworkTest {

    // --- Opgave 14.1: LinkedList som Stak og Kø ---
    @Test
    void testLinkedListDemo_StakOperationer_14_1() {
        // TODO: Afkommenter og kør denne test, når du har implementeret LinkedListDemo.java
        /*
        LinkedList<String> stakListe = new LinkedList<>();
        String[] stakOps = {"PUSH A", "PUSH B", "POP", "PUSH C", "POP", "POP", "POP"};
        List<String> stakResultater = LinkedListDemo.demonstrerStak(stakListe, stakOps);
        // Forventet: B, C, A, STAK TOM
        List<String> expectedStak = Arrays.asList("B", "C", "A", "STAK TOM");
        assertEquals(expectedStak, stakResultater);
        assertTrue(stakListe.isEmpty(), "Staklisten bør være tom efter operationerne");
        */
        assertTrue(true, "Testkroppen for 14.1 (Stak) er kommenteret ud indtil LinkedListDemo er implementeret.");
    }

    @Test
    void testLinkedListDemo_KøOperationer_14_1() {
        // TODO: Afkommenter og kør denne test, når du har implementeret LinkedListDemo.java
        /*
        LinkedList<String> køListe = new LinkedList<>();
        String[] køOps = {"ADD X", "ADD Y", "POLL", "ADD Z", "POLL", "POLL", "POLL"};
        List<String> køResultater = LinkedListDemo.demonstrerKø(køListe, køOps);
        // Forventet: X, Y, Z, KØ TOM
        List<String> expectedKø = Arrays.asList("X", "Y", "Z", "KØ TOM");
        assertEquals(expectedKø, køResultater);
        assertTrue(køListe.isEmpty(), "Kølisten bør være tom efter operationerne");
        */
        assertTrue(true, "Testkroppen for 14.1 (Kø) er kommenteret ud indtil LinkedListDemo er implementeret.");
    }

    // --- Opgave 14.2: Manipulation af LinkedList med ListIterator ---
    @Test
    void testListManipulator_ManipulerListe_14_2() {
        // TODO: Afkommenter og kør denne test, når du har implementeret ListManipulator.java
        /*
        LinkedList<Integer> tal = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // Fremad: Lige tal fordobles: {1, 4, 3, 8, 5, 12, 7, 16, 9, 20}
        // Baglæns: Tal delelige med 3 fjernes (3, 9, 12).
        // Forventet resultat: {1, 4, 8, 5, 7, 16, 20} (rækkefølgen bevares fra fremad-passet)
        LinkedList<Integer> forventet = new LinkedList<>(Arrays.asList(1, 4, 8, 5, 7, 16, 20));
        LinkedList<Integer> resultat = ListManipulator.manipulerListe(tal);
        assertEquals(forventet, resultat);

        LinkedList<Integer> tomListe = new LinkedList<>();
        assertEquals(new LinkedList<Integer>(), ListManipulator.manipulerListe(tomListe));

        LinkedList<Integer> kunUlige = new LinkedList<>(Arrays.asList(1,5,7));
        LinkedList<Integer> forventetUlige = new LinkedList<>(Arrays.asList(1,5,7)); // Ingen lige, ingen delelige med 3
        assertEquals(forventetUlige, ListManipulator.manipulerListe(kunUlige));
        */
        assertTrue(true, "Testkroppen for 14.2 er kommenteret ud indtil ListManipulator er implementeret.");
    }

    // --- Opgave 14.3: Unikke Elementer og Orden i Sets ---
    @Test
    void testSetDemo_BehandlStrengListe_14_3() {
        // TODO: Afkommenter og kør denne test, når du har implementeret SetDemo.java
        /*
        List<String> input = Arrays.asList("æble", "banan", "pære", "æble", "appelsin", "banan");
        Map<String, Set<String>> resultatMap = SetDemo.behandlStrengListe(input);

        Set<String> hashSetResultat = resultatMap.get("HashSet");
        Set<String> linkedHashSetResultat = resultatMap.get("LinkedHashSet");

        assertNotNull(hashSetResultat);
        assertNotNull(linkedHashSetResultat);

        assertEquals(4, hashSetResultat.size()); // æble, banan, pære, appelsin
        assertTrue(hashSetResultat.containsAll(Arrays.asList("æble", "banan", "pære", "appelsin")));

        assertEquals(4, linkedHashSetResultat.size());
        // Tjekker rækkefølge for LinkedHashSet (bør være som første forekomst i input)
        List<String> expectedOrder = Arrays.asList("æble", "banan", "pære", "appelsin");
        List<String> actualOrder = new ArrayList<>(linkedHashSetResultat);
        assertEquals(expectedOrder, actualOrder);
        */
        assertTrue(true, "Testkroppen for 14.3 er kommenteret ud indtil SetDemo er implementeret.");
    }

    // --- Opgave 14.4: Sorteret Set med TreeSet ---
    @Test
    void testTreeSetDemo_Sortering_14_4() {
        // TODO: Afkommenter og kør denne test, når du har implementeret TreeSetDemo.java
        // og evt. en custom Comparator (eller definer den her i testen).
        /*
        List<String> navne = Arrays.asList("Peter", "Anna", "Bo", "Christoffer", "Ida");

        TreeSet<String> naturligtSorteret = TreeSetDemo.sorterNavneNaturligt(navne);
        assertEquals("[Anna, Bo, Christoffer, Ida, Peter]", naturligtSorteret.toString());

        // Custom comparator: Først længde, så alfabetisk
        Comparator<String> længdeSåAlfabetisk = (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return Integer.compare(s1.length(), s2.length());
            }
            return s1.compareTo(s2);
        };
        TreeSet<String> customSorteret = TreeSetDemo.sorterNavneEfterLængdeSåAlfabetisk(navne, længdeSåAlfabetisk);
        // Forventet: Bo (2), Ida (3), Anna (4), Peter (5), Christoffer (11)
        assertEquals("[Bo, Ida, Anna, Peter, Christoffer]", customSorteret.toString());
        */
        assertTrue(true, "Testkroppen for 14.4 er kommenteret ud indtil TreeSetDemo er implementeret.");
    }

    // --- Opgave 14.5: Mængdeoperationer på Sets ---
    @Test
    void testSetOperationer_Alle_14_5() {
        // TODO: Afkommenter og kør denne test, når du har implementeret SetOperationer.java
        /*
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        Set<Integer> union = SetOperationer.union(setA, setB);
        assertEquals(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)), union);

        Set<Integer> snit = SetOperationer.snit(setA, setB);
        assertEquals(new HashSet<>(Arrays.asList(4, 5)), snit);

        Set<Integer> differensAB = SetOperationer.differens(setA, setB); // A - B
        assertEquals(new HashSet<>(Arrays.asList(1, 2, 3)), differensAB);

        Set<Integer> differensBA = SetOperationer.differens(setB, setA); // B - A
        assertEquals(new HashSet<>(Arrays.asList(6, 7, 8)), differensBA);
        */
        assertTrue(true, "Testkroppen for 14.5 er kommenteret ud indtil SetOperationer er implementeret.");
    }

    // --- Opgave 14.6: Optælling af Ordfrekvenser med HashMap ---
    @Test
    void testOrdtæller_TælOrdfrekvenser_14_6() {
        // TODO: Afkommenter og kør denne test, når du har implementeret Ordtæller.java
        /*
        String tekst = "Hej med dig, det er en hej hej test!";
        Map<String, Integer> frekvenser = Ordtæller.tælOrdfrekvenser(tekst);

        assertEquals(3, frekvenser.get("hej").intValue());
        assertEquals(1, frekvenser.get("med").intValue());
        assertEquals(1, frekvenser.get("dig").intValue());
        assertEquals(1, frekvenser.get("det").intValue());
        assertEquals(1, frekvenser.get("er").intValue());
        assertEquals(1, frekvenser.get("en").intValue());
        assertEquals(1, frekvenser.get("test").intValue());
        assertEquals(7, frekvenser.size()); // Antal unikke ord

        String tomTekst = " , . ! ? ";
        assertTrue(Ordtæller.tælOrdfrekvenser(tomTekst).isEmpty());
        */
        assertTrue(true, "Testkroppen for 14.6 er kommenteret ud indtil Ordtæller er implementeret.");
    }

    // --- Opgave 14.7: Telefonbog med TreeMap ---
    @Test
    void testTelefonbog_Operationer_14_7() {
        // TODO: Afkommenter og kør denne test, når du har implementeret Telefonbog.java
        /*
        Telefonbog bog = new Telefonbog();
        assertTrue(bog.tilføjKontakt("Anders And", "11223344"));
        assertTrue(bog.tilføjKontakt("Mickey Mouse", "55667788"));
        assertTrue(bog.tilføjKontakt("Fedtmule", "99887766"));
        assertFalse(bog.tilføjKontakt("Anders And", "00000000")); // Findes allerede

        assertEquals("55667788", bog.hentNummer("Mickey Mouse"));
        assertNull(bog.hentNummer("Pluto"));

        List<String> formateret = bog.hentAlleKontakterFormateret();
        assertEquals(3, formateret.size());
        assertEquals("Anders And: 11223344", formateret.get(0)); // TreeMap sorterer
        assertEquals("Fedtmule: 99887766", formateret.get(1));
        assertEquals("Mickey Mouse: 55667788", formateret.get(2));

        assertTrue(bog.fjernKontakt("Mickey Mouse"));
        assertEquals(2, bog.hentAlleKontakterFormateret().size());
        assertFalse(bog.fjernKontakt("Mickey Mouse"));
        */
        assertTrue(true, "Testkroppen for 14.7 er kommenteret ud indtil Telefonbog er implementeret.");
    }

    // --- Opgave 14.8: Simpel Opgavekø (FIFO) ---
    @Test
    void testPrinterKøManager_Operationer_14_8() {
        // TODO: Afkommenter og kør denne test, når du har implementeret PrinterKøManager.java
        /*
        PrinterKøManager printer = new PrinterKøManager();
        assertEquals(0, printer.getAntalVentendeJobs());
        assertEquals("Ingen jobs i køen", printer.seNæsteJob());
        assertEquals("Ingen jobs i køen", printer.behandlNæstePrintJob());

        printer.tilføjPrintJob("Dokument1.pdf");
        printer.tilføjPrintJob("Billede.jpg");
        assertEquals(2, printer.getAntalVentendeJobs());
        assertEquals("Dokument1.pdf", printer.seNæsteJob());

        assertEquals("Dokument1.pdf", printer.behandlNæstePrintJob());
        assertEquals(1, printer.getAntalVentendeJobs());
        assertEquals("Billede.jpg", printer.seNæsteJob());

        assertEquals("Billede.jpg", printer.behandlNæstePrintJob());
        assertTrue(printer.getAntalVentendeJobs() == 0);
        */
        assertTrue(true, "Testkroppen for 14.8 er kommenteret ud indtil PrinterKøManager er implementeret.");
    }


    // --- Opgave 14.9: Anvendelse af Collections Hjælpemetoder ---
    @Test
    void testListeUtilities_AnalyserOgManipuler_14_9() {
        // TODO: Afkommenter og kør denne test, når du har implementeret ListeUtilities.java
        /*
        List<Integer> originalListe = new ArrayList<>(Arrays.asList(5, 1, 8, 1, 3, 5, 5));
        Integer talAtTælle = 5;

        Map<String, Object> resultater = ListeUtilities.analyserOgManipulerListe(new ArrayList<>(originalListe), talAtTælle);

        List<Integer> sortedList = (List<Integer>) resultater.get("sortedList");
        assertEquals(Arrays.asList(1, 1, 3, 5, 5, 5, 8), sortedList);

        List<Integer> reversedList = (List<Integer>) resultater.get("reversedList");
        assertEquals(Arrays.asList(8, 5, 5, 5, 3, 1, 1), reversedList);

        List<Integer> shuffledOriginalList = (List<Integer>) resultater.get("shuffledOriginalList");
        assertEquals(originalListe.size(), shuffledOriginalList.size()); // Størrelse skal være ens
        assertTrue(shuffledOriginalList.containsAll(originalListe) && originalListe.containsAll(shuffledOriginalList)); // Samme elementer
        // Rækkefølgen af shuffledOriginalList er svær at teste præcist, medmindre den ikke er lig originalListe eller sortedList
        // Forventer at inputlisten 'originalListe' er blevet shufflet.

        assertEquals(Integer.valueOf(8), resultater.get("maxValue"));
        assertEquals(Integer.valueOf(1), resultater.get("minValue"));
        assertEquals(Integer.valueOf(3), resultater.get("frequency"));
        */
        assertTrue(true, "Testkroppen for 14.9 er kommenteret ud indtil ListeUtilities er implementeret.");
    }

    // --- Opgave 14.10 til 14.13: Valg af Korrekt Collection (Teori) ---
    @Test
    void testOpgave14_10_SvarUnikkeBrugernavne() {
        // Korrekt svar: 2 (Set<String>, HashSet<String>)
        assertEquals(2, Emne14CollectionsFramework.opgave14_10_svarUnikkeBrugernavne());
    }

    @Test
    void testOpgave14_11_SvarIndkøbsliste() {
        // Korrekt svar: 2 (List<String>, ArrayList<String>)
        assertEquals(2, Emne14CollectionsFramework.opgave14_11_svarIndkøbsliste());
    }

    @Test
    void testOpgave14_12_SvarOrdbog() {
        // Korrekt svar: 3 (Map<String, String>, HashMap<String, String>)
        assertEquals(3, Emne14CollectionsFramework.opgave14_12_svarOrdbog());
    }

    @Test
    void testOpgave14_13_SvarSupportSager() {
        // Korrekt svar: 3 (Queue<Henvendelse>, ArrayDeque<Henvendelse> (eller LinkedList))
        assertEquals(3, Emne14CollectionsFramework.opgave14_13_svarSupportSager());
    }
}