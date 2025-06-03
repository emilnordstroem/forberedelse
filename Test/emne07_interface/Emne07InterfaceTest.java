package emne07_interface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Når du har oprettet dine interfaces og klasser, fjern kommenteringen for de relevante imports.
/*
// Opgave 7.1
import emne07_interface.Logføringsbar;
import emne07_interface.FilLogger;
import emne07_interface.KonsolLogger;
import emne07_interface.SystemMonitor;

// Opgave 7.2
import emne07_interface.Flyvende;
import emne07_interface.Svømmende;
import emne07_interface.And;
import emne07_interface.Fisk;
import emne07_interface.Flyvefisk;

// Opgave 7.3
import emne07_interface.Datakilde;
import emne07_interface.Produkt;
import emne07_interface.ProduktHukommelsesDatakilde;

// Opgave 7.4
import emne07_interface.Skalerbar;
import emne07_interface.SkalerbarCirkel;
import emne07_interface.SkalerbartRektangel;

// Opgave 7.5
import emne07_interface.Krypterbar;
import emne07_interface.CaesarKryptering;
import emne07_interface.OmvendtKryptering;

// Opgave 7.6
import emne07_interface.Bruger; // Omdøbt fra SammenligneligPerson for klarhed

// Opgave 7.7
import emne07_interface.Film;
import emne07_interface.FilmTitelComparator;
import emne07_interface.FilmÅrstalComparator;
import emne07_interface.FilmRatingComparator;

// Opgave 7.8
import emne07_interface.Validerbar;
import emne07_interface.BrugerInput;
import emne07_interface.PasswordInput;
// import emne07_interface.Lærred; // Dummy for Tegneobjekt

// Opgave 7.9
import emne07_interface.Ressource;
import emne07_interface.TræStamme;
import emne07_interface.JernMalm;
import emne07_interface.GuldÅre;
import emne07_interface.Indsamler;
// import emne07_interface.Spiller; // Dummy for Opsamlelig

// Opgave 7.10
import emne07_interface.Konfigurerbar;
import emne07_interface.DatabaseForbindelse;
import emne07_interface.WebServer;
*/

class Emne07InterfaceTest {

    // --- Opgave 7.1: Logføringsbar Interface ---
    @Test
    void testLogføringsbar_FilLogger_7_1() {
//        FilLogger filLogger = new FilLogger();
//        filLogger.logInfo("System startet.");
//        filLogger.logAdvarsel("Lav diskplads.");
//        filLogger.logFejl("Netværksfejl", new RuntimeException("Timeout"));
//
//        List<String> logs = filLogger.hentSenesteLogs(3);
//        assertEquals(3, logs.size());
//        assertTrue(logs.get(0).contains("INFO: System startet.")); // Nyeste først, hvis implementeret sådan
//        assertTrue(logs.get(1).contains("ADVARSEL: Lav diskplads."));
//        assertTrue(logs.get(2).contains("FEJL: Netværksfejl - Exception: Timeout"));
//
//        List<String> kunTo = filLogger.hentSenesteLogs(2);
//        assertEquals(2, kunTo.size());
    }

    @Test
    void testLogføringsbar_SystemMonitorMedKonsolLogger_7_1() {
//        KonsolLogger konsolLogger = new KonsolLogger(); // Gemmer også internt til test
//        SystemMonitor monitor = new SystemMonitor(konsolLogger);
//        monitor.udførSystemTjek(); // Dette vil kalde logInfo, logAdvarsel eller logFejl
//
//        // Test at *noget* blev logget til konsolLoggerens interne liste
//        assertFalse(konsolLogger.hentSenesteLogs(1).isEmpty(), "KonsolLogger skulle have modtaget mindst én log fra SystemMonitor.");
    }

    // --- Opgave 7.2: Flyvende og Svømmende Interfaces ---
    @Test
    void testAnd_ImplementererBeggeInterfaces_7_2() {
//        And anders = new And("Anders");
//        Flyvende flyver = anders;
//        Svømmende svømmer = anders;
//
//        assertTrue(flyver.tagAf().contains("Anders"));
//        assertTrue(flyver.flyv().contains("flapper"));
//        assertTrue(svømmer.dykNed().contains("dykker"));
//        assertTrue(svømmer.svøm().contains("svømmer"));
    }

    @Test
    void testPolymorfiMedFlyvendeOgSvømmende_7_2() {
//        List<Object> væsner = new ArrayList<>();
//        væsner.add(new And("Donald"));
//        væsner.add(new Fisk("Nemo"));
//        væsner.add(new Flyvefisk("Flipper"));
//
//        ArrayList<String> log = new ArrayList<>();
//        for (Object v : væsner) {
//            if (v instanceof Flyvende) {
//                Flyvende f = (Flyvende) v;
//                log.add(f.tagAf());
//                log.add(f.flyv());
//                log.add(f.land());
//            }
//            if (v instanceof Svømmende) {
//                Svømmende s = (Svømmende) v;
//                log.add(s.dykNed());
//                log.add(s.svøm());
//                log.add(s.komOpTilOverfladen());
//            }
//        }
//        // Donald: 3 flyve + 3 svømme = 6 logs
//        // Nemo: 3 svømme = 3 logs
//        // Flipper: 3 flyve + 3 svømme = 6 logs
//        assertEquals(6 + 3 + 6, log.size());
//        assertTrue(log.stream().anyMatch(s -> s.contains("Donald") && s.contains("flapper")));
//        assertTrue(log.stream().anyMatch(s -> s.contains("Nemo") && s.contains("svømmer")));
//        assertTrue(log.stream().anyMatch(s -> s.contains("Flipper") && s.contains("Springer op af vandet!")));
    }

    // --- Opgave 7.3: Generisk Datakilde Interface ---
    @Test
    void testProduktHukommelsesDatakilde_CRUD_7_3() {
//        Datakilde<Produkt> ds = new ProduktHukommelsesDatakilde();
//        Produkt p1 = new Produkt("P001", "Laptop Pro", 9999.95);
//        Produkt p2 = new Produkt("P002", "Kaffemaskine Deluxe", 799.00);
//        Produkt p1Update = new Produkt("P001", "Laptop Pro X", 10999.95);
//
//        assertTrue(ds.gem(p1));
//        assertTrue(ds.gem(p2));
//        assertFalse(ds.gem(new Produkt("P001", "Fejl", 0))); // ID eksisterer
//
//        assertEquals(p1, ds.hent("P001"));
//        assertEquals(2, ds.hentAlle().size());
//
//        assertTrue(ds.opdater(p1Update));
//        assertEquals("Laptop Pro X", ds.hent("P001").getNavn());
//        assertFalse(ds.opdater(new Produkt("P003", "Ukendt", 0))); // ID findes ikke
//
//        assertTrue(ds.slet("P002"));
//        assertEquals(1, ds.hentAlle().size());
//        assertNull(ds.hent("P002"));
//        assertFalse(ds.slet("P002")); // Allerede slettet
    }

    // --- Opgave 7.4: Skalerbar Interface for Figurer ---
    @Test
    void testSkalerbar_CirkelOgRektangel_7_4() {
//        SkalerbarCirkel cirkel = new SkalerbarCirkel(10.0); // Areal = PI*100
//        SkalerbartRektangel rekt = new SkalerbartRektangel(4.0, 5.0); // Areal = 20
//
//        List<Skalerbar> figurer = new ArrayList<>(Arrays.asList(cirkel, rekt));
//        for (Skalerbar figur : figurer) {
//            figur.skaler(2.0); // Dobbelt størrelse
//        }
//
//        assertEquals(Math.PI * (20.0 * 20.0), cirkel.getAreal(), 0.01); // Radius nu 20
//        assertEquals((4.0*2.0) * (5.0*2.0), rekt.getAreal(), 0.01); // Længde 8, Bredde 10
//
//        assertTrue(cirkel.getFigurBeskrivelse().contains("Cirkel"));
//        assertTrue(rekt.getFigurBeskrivelse().contains("Rektangel"));
    }

    // --- Opgave 7.5: Krypterbar Interface ---
    @Test
    void testKrypterbar_CaesarOgOmvendt_7_5() {
//        Krypterbar caesar = new CaesarKryptering(3);
//        String originalTekst = "Hej Verden!";
//        String caesarKrypteret = caesar.krypter(originalTekst);
//        assertEquals("Khm#Yhughq$", caesarKrypteret); // H+3=K, e+3=h, j+3=m, etc.
//        assertEquals(originalTekst, caesar.dekrypter(caesarKrypteret));
//
//        Krypterbar omvendt = new OmvendtKryptering();
//        String omvendtKrypteret = omvendt.krypter(originalTekst);
//        assertEquals("!nedreV jeH", omvendtKrypteret);
//        assertEquals(originalTekst, omvendt.dekrypter(omvendtKrypteret));
//
//        assertEquals("ABC", caesar.krypter(caesar.dekrypter("ABC"))); // Skal matche
    }

    @Test
    void testCaesarKryptering_WrapAround_7_5() {
//        Krypterbar caesar = new CaesarKryptering(3);
//        assertEquals("ABC", caesar.krypter("XYZ")); // X->A, Y->B, Z->C
//        assertEquals("XYZ", caesar.dekrypter("ABC"));
    }


    // --- Opgave 7.6: Sortering af Bruger objekter med Comparable ---
    @Test
    void testBruger_ComparableSortering_7_6() {
//        ArrayList<Bruger> brugere = new ArrayList<>();
//        Bruger b1 = new Bruger(1, "Peter", "p@e.dk", LocalDate.of(2023, 1, 15));
//        Bruger b2 = new Bruger(2, "Anna", "a@e.dk", LocalDate.of(2022, 12, 1)); // Ældst
//        Bruger b3 = new Bruger(3, "Peter", "p2@e.dk", LocalDate.of(2023, 1, 15)); // Samme dato, samme navn, højere ID
//        Bruger b4 = new Bruger(4, "Bent", "b@e.dk", LocalDate.of(2023, 1, 15)); // Samme dato, andet navn
//
//        brugere.add(b1); brugere.add(b2); brugere.add(b3); brugere.add(b4);
//        Collections.sort(brugere); // Bruger Bruger.compareTo()
//
//        // Forventet orden: b2 (ældst), b4 (Bent), b1 (Peter, ID 1), b3 (Peter, ID 3)
//        assertEquals(b2, brugere.get(0));
//        assertEquals(b4, brugere.get(1));
//        assertEquals(b1, brugere.get(2));
//        assertEquals(b3, brugere.get(3));
    }

    // --- Opgave 7.7: Sortering af Film objekter med Comparator ---
//    private ArrayList<Film> filmListe_7_7;

    @BeforeEach
    void setUpFilm_7_7() {
//        filmListe_7_7 = new ArrayList<>();
//        filmListe_7_7.add(new Film("The Shawshank Redemption", "Frank Darabont", 1994, 9.3));
//        filmListe_7_7.add(new Film("The Godfather", "Francis Ford Coppola", 1972, 9.2));
//        filmListe_7_7.add(new Film("Pulp Fiction", "Quentin Tarantino", 1994, 8.9));
//        filmListe_7_7.add(new Film("The Dark Knight", "Christopher Nolan", 2008, 9.0));
    }

    @Test
    void testFilm_SorterMedTitelComparator_7_7() {
//        Collections.sort(filmListe_7_7, new FilmTitelComparator());
//        assertEquals("Pulp Fiction", filmListe_7_7.get(0).getTitel());
//        assertEquals("The Dark Knight", filmListe_7_7.get(1).getTitel());
//        assertEquals("The Godfather", filmListe_7_7.get(2).getTitel());
//        assertEquals("The Shawshank Redemption", filmListe_7_7.get(3).getTitel());
    }

    @Test
    void testFilm_SorterMedÅrstalComparator_7_7() {
//        Collections.sort(filmListe_7_7, new FilmÅrstalComparator()); // Ældste først, så titel
//        assertEquals("The Godfather", filmListe_7_7.get(0).getTitel()); // 1972
//        // For 1994, "Pulp Fiction" kommer før "The Shawshank Redemption" alfabetisk
//        assertEquals("Pulp Fiction", filmListe_7_7.get(1).getTitel());
//        assertEquals("The Shawshank Redemption", filmListe_7_7.get(2).getTitel());
//        assertEquals("The Dark Knight", filmListe_7_7.get(3).getTitel()); // 2008
    }

    @Test
    void testFilm_SorterMedRatingComparator_7_7() {
//        Collections.sort(filmListe_7_7, new FilmRatingComparator()); // Højeste rating først
//        assertEquals("The Shawshank Redemption", filmListe_7_7.get(0).getTitel()); // 9.3
//        assertEquals("The Godfather", filmListe_7_7.get(1).getTitel()); // 9.2
//        assertEquals("The Dark Knight", filmListe_7_7.get(2).getTitel()); // 9.0
//        assertEquals("Pulp Fiction", filmListe_7_7.get(3).getTitel()); // 8.9
    }


    // --- Opgave 7.8: Validerbar Interface med Default Metoder ---
    // Test af validerOgLog() kræver normalt at fange System.out,
    // men vi kan teste de andre metoder og indirekte default-metodens brug af dem.
    @Test
    void testValiderbar_BrugerInput_7_8() {
//        BrugerInput gyldigtInput = new BrugerInput("TestStreng", 5);
//        assertTrue(gyldigtInput.erGyldig());
//        assertNull(gyldigtInput.getFejlBesked()); // Eller tom streng
//        assertEquals("BrugerInput streng", gyldigtInput.getValideringsKontekst());
//        // gyldigtInput.validerOgLog(); // Ville printe "Validering OK..."
//
//        BrugerInput ugyldigtInput = new BrugerInput("Kort", 5);
//        assertFalse(ugyldigtInput.erGyldig());
//        assertNotNull(ugyldigtInput.getFejlBesked());
//        assertTrue(ugyldigtInput.getFejlBesked().toLowerCase().contains("mindst 5 tegn"));
//        // ugyldigtInput.validerOgLog(); // Ville printe "Validering FEJL..."
    }

    @Test
    void testValiderbar_PasswordInput_7_8() {
//        PasswordInput svagtPw = new PasswordInput("pass"); // For kort, ingen tal
//        assertFalse(svagtPw.erGyldig());
//        assertTrue(svagtPw.getFejlBesked().toLowerCase().contains("mindst 8 tegn") ||
//                svagtPw.getFejlBesked().toLowerCase().contains("tal"));
//
//        PasswordInput okPw = new PasswordInput("Password123");
//        assertTrue(okPw.erGyldig());
//        assertNull(okPw.getFejlBesked());
    }


    // --- Opgave 7.9: Ressource Interface i et Spil ---
    @Test
    void testRessource_Indsamling_7_9() {
//        TræStamme træ = new TræStamme(100);
//        JernMalm jern = new JernMalm(50);
//        Indsamler skovhugger = new Indsamler("Skovhugger Bob");
//
//        // For at teste Indsamler.indsamlFraRessource, som printer,
//        // ville man normalt fange System.out. Her tester vi Ressource-objekterne direkte.
//        assertEquals(30, træ.indsamlEnheder(30));
//        assertEquals(70, træ.getAntalEnhederTilbage());
//        assertEquals("Træ", træ.getRessourceType());
//
//        assertEquals(50, jern.indsamlEnheder(60)); // Kan kun tage hvad der er
//        assertEquals(0, jern.getAntalEnhederTilbage());
//        assertEquals("Jern", jern.getRessourceType());
    }

    // --- Opgave 7.10: Konfigurerbar Interface med Static Metoder ---
    @Test
    void testKonfigurerbar_StaticFactoryOgImplementering_7_10() {
//        Map<String, String> dbProps = new HashMap<>();
//        dbProps.put("host", "localhost");
//        dbProps.put("port", "5432");
//        dbProps.put("brugernavn", "admin");
//        // password mangler for DatabaseForbindelse.erKonfigureretKorrekt()
//
//        Konfigurerbar dbForbindelse = Konfigurerbar.opretFraProperties(dbProps, "Database");
//        assertNotNull(dbForbindelse);
//        assertTrue(dbForbindelse instanceof DatabaseForbindelse);
//        assertEquals("localhost", dbForbindelse.getParameter("host"));
//        assertFalse(dbForbindelse.erKonfigureretKorrekt(), "Database skulle ikke være korrekt konfigureret uden password");
//
//        dbForbindelse.setParameter("password", "hemmeligt");
//        assertTrue(dbForbindelse.erKonfigureretKorrekt(), "Database skulle nu være korrekt konfigureret");
//
//        Map<String, String> webProps = new HashMap<>();
//        webProps.put("port", "8080");
//        webProps.put("rootDirectory", "/var/www");
//        Konfigurerbar webServer = Konfigurerbar.opretFraProperties(webProps, "WebServer");
//        assertNotNull(webServer);
//        assertTrue(webServer instanceof WebServer);
//        assertTrue(webServer.erKonfigureretKorrekt());
//
//        assertNull(Konfigurerbar.opretFraProperties(webProps, "UkendtType"));
    }
}