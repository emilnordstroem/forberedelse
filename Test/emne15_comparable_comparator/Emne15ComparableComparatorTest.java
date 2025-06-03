package emne15_comparable_comparator;

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
import java.util.PriorityQueue;
import java.util.TreeSet;

// Når du har oprettet dine klasser og interfaces, fjern kommenteringen for de relevante imports.
/*
// Opgave 15.1
import emne15_comparable_comparator.FilmComparable;

// Opgave 15.2
import emne15_comparable_comparator.ProduktData;
import emne15_comparable_comparator.ProduktNavnComparator;
import emne15_comparable_comparator.ProduktPrisComparator;
import emne15_comparable_comparator.ProduktLagerComparator;

// Opgave 15.3
import emne15_comparable_comparator.StrengSortering;

// Opgave 15.4
import emne15_comparable_comparator.ScoreEntry;

// Opgave 15.5
import emne15_comparable_comparator.BogTilTreeSet;
import emne15_comparable_comparator.BogSideantalComparator;

// Opgave 15.6
import emne15_comparable_comparator.PlanlagtEvent;
import emne15_comparable_comparator.EventSorterer;

// Opgave 15.7
import emne15_comparable_comparator.SpilResultat;
import emne15_comparable_comparator.ResultatAnalyser;

// Opgave 15.8
import emne15_comparable_comparator.MedarbejderStilling;

// Opgave 15.9
import emne15_comparable_comparator.BankTransaktion;
import emne15_comparable_comparator.TransaktionsFilter;

// Opgave 15.10
import emne15_comparable_comparator.OpgaveMedPrioritet;
*/

class Emne15ComparableComparatorTest {

    // --- Opgave 15.1: FilmComparable - Naturlig Orden ---
    @Test
    void testFilmComparable_Sortering_15_1() {
        // TODO: Afkommenter og kør når FilmComparable er implementeret.
        /*
        FilmComparable film1 = new FilmComparable("Braveheart", 1995, 8.3);
        FilmComparable film2 = new FilmComparable("Gladiator", 2000, 8.5);
        FilmComparable film3 = new FilmComparable("Avatar", 2009, 7.8);
        FilmComparable film4 = new FilmComparable("The Dark Knight", 2008, 9.0);
        FilmComparable film5 = new FilmComparable("Inception", 2010, 8.8);
        FilmComparable film6 = new FilmComparable("Interstellar", 2014, 8.8);

        List<FilmComparable> filmListe = new ArrayList<>(Arrays.asList(film1, film2, film3, film4, film5, film6));
        Collections.sort(filmListe);

        assertEquals("The Dark Knight", filmListe.get(0).getTitel());
        assertEquals("Inception", filmListe.get(1).getTitel());
        assertEquals("Interstellar", filmListe.get(2).getTitel());
        assertEquals("Gladiator", filmListe.get(3).getTitel());
        assertEquals("Braveheart", filmListe.get(4).getTitel());
        assertEquals("Avatar", filmListe.get(5).getTitel());
        */
    }

    // --- Opgave 15.2: ProduktData og Flere Comparatorer ---
//    private List<ProduktData> produktListe_15_2;

    @BeforeEach
    void setUpProduktListe_15_2() {
        // TODO: Afkommenter når ProduktData er implementeret.
        /*
        produktListe_15_2 = new ArrayList<>(Arrays.asList(
                new ProduktData("P003", "Banan", 2.50, 150),
                new ProduktData("P001", "Æble", 3.00, 100),
                new ProduktData("P002", "Appelsin", 2.50, 200)
        ));
        */
    }

    @Test
    void testProduktComparators_Navn_15_2() {
        // TODO: Afkommenter og kør når ProduktData og ProduktNavnComparator er implementeret.
        /*
        if (produktListe_15_2 == null) {
            System.err.println("Skipping testProduktComparators_Navn_15_2: ProduktData klassen skal implementeres først.");
            return; // Spring testen over hvis setup fejlede
        }
        Collections.sort(produktListe_15_2, new ProduktNavnComparator());
        assertEquals("Appelsin", produktListe_15_2.get(0).getNavn());
        assertEquals("Banan", produktListe_15_2.get(1).getNavn());
        assertEquals("Æble", produktListe_15_2.get(2).getNavn());
        */
    }

    @Test
    void testProduktComparators_Pris_15_2() {
        // TODO: Afkommenter og kør når ProduktData og ProduktPrisComparator er implementeret.
        /*
        if (produktListe_15_2 == null) {
             System.err.println("Skipping testProduktComparators_Pris_15_2: ProduktData klassen skal implementeres først.");
            return;
        }
        Collections.sort(produktListe_15_2, new ProduktPrisComparator());
        // Forventet: Appelsin (2.50, P002), Banan (2.50, P003), Æble (3.00, P001) (hvis ID er sekundær sortering)
        assertEquals("P002", produktListe_15_2.get(0).getProduktId());
        assertEquals("P003", produktListe_15_2.get(1).getProduktId());
        assertEquals("P001", produktListe_15_2.get(2).getProduktId());
        */
    }

    @Test
    void testProduktComparators_Lager_15_2() {
        // TODO: Afkommenter og kør når ProduktData og ProduktLagerComparator er implementeret.
        /*
        if (produktListe_15_2 == null) {
            System.err.println("Skipping testProduktComparators_Lager_15_2: ProduktData klassen skal implementeres først.");
            return;
        }
        Collections.sort(produktListe_15_2, new ProduktLagerComparator());
        // Forventet: Appelsin (200), Banan (150), Æble (100)
        assertEquals("P002", produktListe_15_2.get(0).getProduktId());
        assertEquals("P003", produktListe_15_2.get(1).getProduktId());
        assertEquals("P001", produktListe_15_2.get(2).getProduktId());
        */
    }

    // --- Opgave 15.3: Sortering af Strenge med Lambda Comparator ---
    @Test
    void testStrengSortering_Lambda_15_3() {
        // TODO: Afkommenter og kør når StrengSortering er implementeret.
        /*
        List<String> strenge = Arrays.asList("abe", "giraf", "ko", "elefant", "myre");

        List<String> efterLængde = StrengSortering.sorterEfterLængdeKortestFørst(new ArrayList<>(strenge));
        assertEquals(Arrays.asList("ko", "abe", "myre", "giraf", "elefant"), efterLængde);

        List<String> efterSidsteBogstav = StrengSortering.sorterEfterSidsteBogstav(new ArrayList<>(strenge));
        assertEquals(Arrays.asList("abe", "myre", "giraf", "ko", "elefant"), efterSidsteBogstav);

        List<String> medTom = Arrays.asList("kat", "", "mus", "hund");
        List<String> efterSidsteBogstavMedTom = StrengSortering.sorterEfterSidsteBogstav(new ArrayList<>(medTom));
        assertEquals(Arrays.asList("", "hund", "mus", "kat"), efterSidsteBogstavMedTom);
        */
    }

    // --- Opgave 15.4: ScoreEntry med Comparable og Statisk Comparator ---
    @Test
    void testScoreEntry_Sortering_15_4() {
        // TODO: Afkommenter og kør når ScoreEntry er implementeret.
        /*
        ScoreEntry s1 = new ScoreEntry("Peter", 100, LocalDate.of(2023, 1, 10));
        ScoreEntry s2 = new ScoreEntry("Anna", 120, LocalDate.of(2023, 1, 5));
        ScoreEntry s3 = new ScoreEntry("Bo", 100, LocalDate.of(2023, 1, 15));
        ScoreEntry s4 = new ScoreEntry("Peter", 100, LocalDate.of(2023, 1, 15));

        List<ScoreEntry> scores = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        Collections.sort(scores);

        // Forventet orden (Comparable: Score DESC, Dato DESC, Navn ASC):
        // s2 (Anna, 120, 05/01)
        // s3 (Bo,   100, 15/01)
        // s4 (Peter,100, 15/01)
        // s1 (Peter,100, 10/01)
        assertEquals(s2, scores.get(0));
        assertEquals(s3, scores.get(1));
        assertEquals(s4, scores.get(2));
        assertEquals(s1, scores.get(3));

        // Test NAVN_COMPARATOR
        Collections.sort(scores, ScoreEntry.NAVN_COMPARATOR);
        // Forventet orden (Navn ASC): Anna, Bo, Peter, Peter
        assertEquals(s2, scores.get(0)); // Anna
        assertEquals(s3, scores.get(1)); // Bo
        // s1 og s4 (begge Peter) - deres indbyrdes rækkefølge er ikke garanteret af kun NAVN_COMPARATOR
        // Vi tjekker blot, at de to sidste er Peter'er
        assertTrue( (scores.get(2).getSpillerNavn().equals("Peter")) && (scores.get(3).getSpillerNavn().equals("Peter")) );
        */
    }

    // --- Opgave 15.5: BogTilTreeSet og TreeSet ---
    @Test
    void testBogTilTreeSet_MedForskelligeSorteringer_15_5() {
        // TODO: Afkommenter og kør når BogTilTreeSet og BogSideantalComparator er implementeret.
        /*
        BogTilTreeSet b1 = new BogTilTreeSet("Java Puzzlers", "Joshua Bloch", 282);
        BogTilTreeSet b2 = new BogTilTreeSet("Effective Java", "Joshua Bloch", 416);
        BogTilTreeSet b3 = new BogTilTreeSet("Clean Code", "Robert C. Martin", 464);
        BogTilTreeSet b4 = new BogTilTreeSet("Design Patterns", "GoF", 395);

        TreeSet<BogTilTreeSet> titelSorteret = new TreeSet<>();
        titelSorteret.add(b1); titelSorteret.add(b2); titelSorteret.add(b3); titelSorteret.add(b4);

        // Naturlig orden (titel): Clean Code, Design Patterns, Effective Java, Java Puzzlers
        assertEquals("Clean Code", titelSorteret.first().getTitel());
        // For at tjekke hele rækkefølgen:
        List<String> titler = new ArrayList<>();
        for(BogTilTreeSet bog : titelSorteret) { titler.add(bog.getTitel()); }
        assertEquals(Arrays.asList("Clean Code", "Design Patterns", "Effective Java", "Java Puzzlers"), titler);

        TreeSet<BogTilTreeSet> sideantalSorteret = new TreeSet<>(new BogSideantalComparator());
        sideantalSorteret.add(b1); sideantalSorteret.add(b2); sideantalSorteret.add(b3); sideantalSorteret.add(b4);

        // Sideantal stigende: Java Puzzlers (282), Design Patterns (395), Effective Java (416), Clean Code (464)
        assertEquals("Java Puzzlers", sideantalSorteret.first().getTitel());
        List<String> titlerSideantal = new ArrayList<>();
        for(BogTilTreeSet bog : sideantalSorteret) { titlerSideantal.add(bog.getTitel()); }
        assertEquals(Arrays.asList("Java Puzzlers", "Design Patterns", "Effective Java", "Clean Code"), titlerSideantal);
        */
    }

    // --- Opgave 15.6: PlanlagtEvent Sortering med Comparator.comparing ---
    @Test
    void testEventSorterer_CombinedSort_15_6() {
        // TODO: Afkommenter og kør når PlanlagtEvent og EventSorterer er implementeret.
        /*
        List<PlanlagtEvent> events = new ArrayList<>(Arrays.asList(
            new PlanlagtEvent("Møde B", LocalDate.of(2024, 1, 10), "Aalborg"),
            new PlanlagtEvent("Møde A", LocalDate.of(2024, 1, 10), "Aalborg"),
            new PlanlagtEvent("Konference X", LocalDate.of(2023, 12, 1), "København"),
            new PlanlagtEvent("Workshop Y", LocalDate.of(2024, 1, 10), "Odense")
        ));

        EventSorterer.sorterEvents(events);

        assertEquals("Konference X", events.get(0).getEventNavn());
        assertEquals("Møde A", events.get(1).getEventNavn());
        assertEquals("Møde B", events.get(2).getEventNavn());
        assertEquals("Workshop Y", events.get(3).getEventNavn());
        */
    }

    // --- Opgave 15.7: SpilResultat Sortering (flere Comparator lambda-udtryk) ---
    @Test
    void testResultatAnalyser_ForskelligeSorteringer_15_7() {
        // TODO: Afkommenter og kør når SpilResultat og ResultatAnalyser er implementeret.
        /*
        List<SpilResultat> resultater = new ArrayList<>(Arrays.asList(
            new SpilResultat("P1", 1000, 120, 5),
            new SpilResultat("P2", 1500, 100, 5),
            new SpilResultat("P3", 1000, 150, 6),
            new SpilResultat("P4", 1200, 90, 7)
        ));
        ResultatAnalyser analyser = new ResultatAnalyser(resultater);

        List<SpilResultat> efterScore = analyser.getSorteretEfterScoreFaldende();
        assertEquals("P2", efterScore.get(0).getSpillerId());
        assertEquals("P4", efterScore.get(1).getSpillerId());

        List<SpilResultat> efterTid = analyser.getSorteretEfterTidStigende();
        assertEquals("P4", efterTid.get(0).getSpillerId());
        assertEquals("P2", efterTid.get(1).getSpillerId());

        List<SpilResultat> efterLevelScore = analyser.getSorteretEfterLevelSåScore();
        assertEquals("P4", efterLevelScore.get(0).getSpillerId());
        assertEquals("P3", efterLevelScore.get(1).getSpillerId());
        assertEquals("P2", efterLevelScore.get(2).getSpillerId());
        assertEquals("P1", efterLevelScore.get(3).getSpillerId());
        */
    }

    // --- Opgave 15.8: MedarbejderStilling med Comparable for Anciennitet ---
    @Test
    void testMedarbejderStilling_Sortering_15_8() {
        // TODO: Afkommenter og kør når MedarbejderStilling er implementeret.
        /*
        MedarbejderStilling m1 = new MedarbejderStilling("Ida Illemose", "Udvikler", LocalDate.of(2020, 6, 1), "IT");
        MedarbejderStilling m2 = new MedarbejderStilling("Bo Bendtsen", "Senior Udvikler", LocalDate.of(2018, 3, 15), "IT");
        MedarbejderStilling m3 = new MedarbejderStilling("Carl Carlsen", "Designer", LocalDate.of(2021, 1, 10), "Design");
        MedarbejderStilling m4 = new MedarbejderStilling("Ada Admin", "Sekretær", LocalDate.of(2019, 8, 1), "Administration");
        MedarbejderStilling m5 = new MedarbejderStilling("Dennis Dal", "Tester", LocalDate.of(2020, 6, 1), "IT");

        List<MedarbejderStilling> medarbejdere = new ArrayList<>(Arrays.asList(m1, m2, m3, m4, m5));
        Collections.sort(medarbejdere);

        // Forventet: Afdeling (ASC), AnsættelsesDato (ASC), Navn (ASC)
        // Admin(m4), Design(m3), IT(m2), IT(m5), IT(m1)
        assertEquals("Ada Admin", medarbejdere.get(0).getMedarbejderNavn());
        assertEquals("Carl Carlsen", medarbejdere.get(1).getMedarbejderNavn());
        assertEquals("Bo Bendtsen", medarbejdere.get(2).getMedarbejderNavn()); // 2018
        assertEquals("Dennis Dal", medarbejdere.get(3).getMedarbejderNavn()); // 2020, Dennis før Ida
        assertEquals("Ida Illemose", medarbejdere.get(4).getMedarbejderNavn()); // 2020
        */
    }

    // --- Opgave 15.9: BankTransaktion Sortering med Kompleks Lambda Comparator ---
    @Test
    void testTransaktionsFilter_Sortering_15_9() {
        // TODO: Afkommenter og kør når BankTransaktion og TransaktionsFilter er implementeret.
        /*
        List<BankTransaktion> transaktioner = new ArrayList<>(Arrays.asList(
            new BankTransaktion("T1", LocalDateTime.of(2023,1,10,10,0), 100.0, "Indbetaling"),
            new BankTransaktion("T2", LocalDateTime.of(2023,1,10,12,0), 50.0, "Udbetaling"),
            new BankTransaktion("T3", LocalDateTime.of(2023,1,9,15,0), 200.0, "Indbetaling"),
            new BankTransaktion("T4", LocalDateTime.of(2023,1,10,10,0), 75.0, "Overførsel"),
            new BankTransaktion("T5", LocalDateTime.of(2023,1,10,14,0), 150.0, "Udbetaling"),
            new BankTransaktion("T6", LocalDateTime.of(2023,1,10,10,0), 150.0, "Indbetaling") // Samme tid som T1, større beløb
        ));

        List<BankTransaktion> sorteret = TransaktionsFilter.sorterTransaktioner(new ArrayList<>(transaktioner));

        // Orden: Type (Ind, Over, Ud), så DatoTid (Nyeste Først), så Beløb (specifik orden pr type)
        // Indbetalinger (Nyeste først, så Største beløb først):
        // T6 (10/1 10:00, 150)
        // T1 (10/1 10:00, 100)
        // T3 (09/1 15:00, 200)
        // Overførsler (Nyeste først, så Mindste beløb først):
        // T4 (10/1 10:00, 75)
        // Udbetalinger (Nyeste først, så Mindste beløb først):
        // T5 (10/1 14:00, 150)
        // T2 (10/1 12:00, 50)

        assertEquals("T6", sorteret.get(0).getTransaktionsId());
        assertEquals("T1", sorteret.get(1).getTransaktionsId());
        assertEquals("T3", sorteret.get(2).getTransaktionsId());
        assertEquals("T4", sorteret.get(3).getTransaktionsId());
        assertEquals("T5", sorteret.get(4).getTransaktionsId());
        assertEquals("T2", sorteret.get(5).getTransaktionsId());
        */
    }

    // --- Opgave 15.10: OpgaveMedPrioritet i en PriorityQueue ---
    @Test
    void testOpgaveMedPrioritet_PriorityQueue_15_10() {
        // TODO: Afkommenter og kør når OpgaveMedPrioritet er implementeret.
        /*
        PriorityQueue<OpgaveMedPrioritet> pq = new PriorityQueue<>();

        OpgaveMedPrioritet opgA = new OpgaveMedPrioritet("Lav kaffe", 2, LocalDate.now().plusDays(1)); // Prio 2, Deadline D+1
        OpgaveMedPrioritet opgB = new OpgaveMedPrioritet("Ret eksamen", 1, LocalDate.now().plusDays(2)); // Prio 1
        OpgaveMedPrioritet opgC = new OpgaveMedPrioritet("Planlæg ferie", 3, LocalDate.now().plusDays(10)); // Prio 3
        OpgaveMedPrioritet opgD = new OpgaveMedPrioritet("Læs bog", 2, LocalDate.now().plusDays(0));    // Prio 2, Deadline D (tidligere end opgA)
        OpgaveMedPrioritet opgE = new OpgaveMedPrioritet("Ryd op", 1, LocalDate.now().plusDays(2));      // Samme prio & deadline som opgB, "Ryd op" > "Ret eksamen"

        pq.offer(opgA); pq.offer(opgB); pq.offer(opgC); pq.offer(opgD); pq.offer(opgE);

        // Forventet rækkefølge (Prio ASC, Deadline ASC, Beskrivelse ASC):
        // 1. opgB ("Ret eksamen", P1, D+2)
        // 2. opgE ("Ryd op", P1, D+2)
        // 3. opgD ("Læs bog", P2, D+0)
        // 4. opgA ("Lav kaffe", P2, D+1)
        // 5. opgC ("Planlæg ferie", P3, D+10)

        assertEquals(opgB, pq.poll());
        assertEquals(opgE, pq.poll());
        assertEquals(opgD, pq.poll());
        assertEquals(opgA, pq.poll());
        assertEquals(opgC, pq.poll());
        assertTrue(pq.isEmpty());
        */
    }
}