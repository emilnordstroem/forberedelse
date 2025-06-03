package emne05_polymorfi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// Når du har oprettet dine klasser for Emne 5, fjern kommenteringen
// og sørg for at stierne matcher din pakke og filnavne.
/*
// For Opgave 5.1
import emne05_polymorfi.Dyr;
import emne05_polymorfi.Hund;
import emne05_polymorfi.Kat;
import emne05_polymorfi.Fugl;

// For Opgave 5.2
import emne05_polymorfi.Figur;
import emne05_polymorfi.CirkelFigur;
import emne05_polymorfi.RektangelFigur;
import emne05_polymorfi.KvadratFigur;

// For Opgave 5.3
import emne05_polymorfi.KøretøjDrift;
import emne05_polymorfi.BilDrift;
import emne05_polymorfi.CykelDrift;
import emne05_polymorfi.Transportfirma;

// For Opgave 5.4
import emne05_polymorfi.OrkesterInstrument;
import emne05_polymorfi.Stryger;
import emne05_polymorfi.Blæser;

// For Opgave 5.5
import emne05_polymorfi.Medarbejder;
import emne05_polymorfi.Tekniker;
import emne05_polymorfi.Konsulent;

// For Opgave 5.6
import emne05_polymorfi.FormBase;
import emne05_polymorfi.Polygon;
import emne05_polymorfi.LukketKurve;
import emne05_polymorfi.RektangelForm2;
import emne05_polymorfi.CirkelForm2;

// For Opgave 5.7
import emne05_polymorfi.Software;
import emne05_polymorfi.OperativSystem;
import emne05_polymorfi.ApplikationsSoftware;

// For Opgave 5.8
import emne05_polymorfi.Forbrugsvare;
import emne05_polymorfi.PrinterToner;
import emne05_polymorfi.KaffebønnerPakke;

// For Opgave 5.9
import emne05_polymorfi.KommunikationsEnhed;
import emne05_polymorfi.RadioEnhed;
import emne05_polymorfi.SatellitEnhed;

// For Opgave 5.10
import emne05_polymorfi.BetalingsMetode;
import emne05_polymorfi.Kreditkort;
import emne05_polymorfi.BankOverførsel;
import emne05_polymorfi.MobilBetaling;
*/

class Emne05PolymorfiTest {

    // --- Opgave 5.1: Dyrelyde via Polymorfi ---
    @Test
    void testFremkaldAlleLyde_BlandetListe_5_1() {
//        ArrayList<Dyr> dyr = new ArrayList<>();
//        dyr.add(new Hund("Fido"));
//        dyr.add(new Kat("Misser"));
//        dyr.add(new Fugl("Piphans"));
//        dyr.add(new Dyr("Ukendt"));
//
//        ArrayList<String> lyde = Emne05Polymorfi.opgave5_1_fremkaldAlleLyde(dyr);
//        assertEquals(4, lyde.size());
//        assertEquals("Vuf!", lyde.get(0));
//        assertEquals("Miav!", lyde.get(1));
//        assertEquals("Pip pip!", lyde.get(2));
//        assertEquals("En generisk dyrelyd...", lyde.get(3));
    }

    @Test
    void testFremkaldAlleLyde_KunHunde_5_1() {
//        ArrayList<Dyr> dyr = new ArrayList<>();
//        dyr.add(new Hund("King"));
//        dyr.add(new Hund("Pluto"));
//        ArrayList<String> lyde = Emne05Polymorfi.opgave5_1_fremkaldAlleLyde(dyr);
//        assertEquals(2, lyde.size());
//        assertEquals("Vuf!", lyde.get(0));
//        assertEquals("Vuf!", lyde.get(1));
    }

    @Test
    void testFremkaldAlleLyde_TomListe_5_1() {
//        ArrayList<Dyr> dyr = new ArrayList<>();
//        ArrayList<String> lyde = Emne05Polymorfi.opgave5_1_fremkaldAlleLyde(dyr);
//        assertTrue(lyde.isEmpty());
    }

    @Test
    void testFremkaldAlleLyde_NullListe_5_1() {
//        ArrayList<String> lyde = Emne05Polymorfi.opgave5_1_fremkaldAlleLyde(null);
//        assertNotNull(lyde, "Returneret liste bør ikke være null, men kan være tom.");
//        assertTrue(lyde.isEmpty());
    }

    // --- Opgave 5.2: Beregning af Arealer for Forskellige Figurer ---
    @Test
    void testBeregnSamletArealOgIdentificer_BlandetListe_5_2() {
//        ArrayList<Figur> figurer = new ArrayList<>();
//        figurer.add(new CirkelFigur(10)); // Areal ~ 314.159
//        figurer.add(new RektangelFigur(5, 10)); // Areal = 50
//        figurer.add(new KvadratFigur(4)); // Areal = 16 (FigurType "Kvadrat")
//        figurer.add(new CirkelFigur(5));  // Areal ~ 78.539
//        figurer.add(new Figur()); // Areal = 0, Type "Ukendt Figur"
//
//        Map<String, Double> resultat = Emne05Polymorfi.opgave5_2_beregnSamletArealOgIdentificer(figurer);
//
//        assertEquals(Math.PI * 100 + Math.PI * 25, resultat.get("Cirkel"), 0.01);
//        assertEquals(50.0, resultat.get("Rektangel"), 0.01);
//        assertEquals(16.0, resultat.get("Kvadrat"), 0.01);
//        assertEquals(0.0, resultat.get("Ukendt Figur"), 0.01);
//        assertEquals(4, resultat.size());
    }

    @Test
    void testBeregnSamletArealOgIdentificer_KunCirkler_5_2() {
//        ArrayList<Figur> figurer = new ArrayList<>();
//        figurer.add(new CirkelFigur(1)); // PI
//        figurer.add(new CirkelFigur(2)); // 4*PI
//        Map<String, Double> resultat = Emne05Polymorfi.opgave5_2_beregnSamletArealOgIdentificer(figurer);
//        assertEquals(Math.PI * 1 + Math.PI * 4, resultat.get("Cirkel"), 0.01);
//        assertEquals(1, resultat.size());
    }

    @Test
    void testBeregnSamletArealOgIdentificer_TomListe_5_2() {
//        Map<String, Double> resultat = Emne05Polymorfi.opgave5_2_beregnSamletArealOgIdentificer(new ArrayList<>());
//        assertTrue(resultat.isEmpty());
    }

    @Test
    void testFigurKlasse_RadiusValidering_5_2() {
        // Test at ugyldig radius i CirkelFigur håndteres (f.eks. sættes til 0 eller kaster fejl)
        // Denne test forudsætter, at en ugyldig radius resulterer i areal 0.
//        CirkelFigur cNeg = new CirkelFigur(-5);
//        assertEquals(0.0, cNeg.beregnAreal(), 0.001, "Areal bør være 0 for negativ radius");
    }


    // --- Opgave 5.3: Transportfirmaets Drift ---
    @Test
    void testTransportfirma_StartAlleOgHjul_5_3() {
//        Transportfirma firma = new Transportfirma("HurtigFragt");
//        BilDrift bil1 = new BilDrift("BIL-001");
//        CykelDrift cykel1 = new CykelDrift("CYK-001");
//        KøretøjDrift ukendt = new KøretøjDrift("UNK-001"); // Generisk
//        firma.tilføjKøretøj(bil1);
//        firma.tilføjKøretøj(cykel1);
//        firma.tilføjKøretøj(ukendt);
//
//        ArrayList<String> startLog = firma.startAlleKøretøjer();
//        assertEquals(3, startLog.size());
//        assertEquals("BIL-001 bilmotor tænder.", startLog.get(0));
//        assertEquals("CYK-001 cykel begynder at trille.", startLog.get(1));
//        assertEquals("UNK-001 starter generisk.", startLog.get(2));
//
//        assertEquals(4 + 2 + 4, firma.samletAntalHjulIFlåde()); // Bil (4) + Cykel (2) + Ukendt (default 4)
    }

    @Test
    void testTransportfirma_TomFlåde_5_3() {
//        Transportfirma firma = new Transportfirma("Tomgang A/S");
//        assertTrue(firma.startAlleKøretøjer().isEmpty());
//        assertEquals(0, firma.samletAntalHjulIFlåde());
    }

    // --- Opgave 5.4: Orkester Performance ---
    // Hjælpeklasser defineres her for testens skyld, indtil brugeren laver de rigtige
    // I den endelige version skal disse fjernes, og de rigtige klasser importeres.
//    static class OrkesterInstrument_TestStub extends OrkesterInstrument {
//        public OrkesterInstrument_TestStub(String n, int sv) { /*super(n,sv);*/ }
//    }
//    static class Stryger_TestStub extends Stryger {
//        public Stryger_TestStub(String n, int strenge, int sv) { /*super(n,strenge,sv);*/ }
//        @Override public String brugBue() { /*return getNavn() + " stryger buen elegant.";*/ return "";}
//    }
//    static class Blæser_TestStub extends Blæser {
//        public Blæser_TestStub(String n, String mat, int sv) { /*super(n,mat,sv);*/ }
//        @Override public String spilSoloPassage() { /*return getNavn() + " blæser en kraftfuld solo!";*/ return ""; }
//    }

    @Test
    void testDirigerOrkester_BlandetInstrumenter_5_4() {
//        ArrayList<OrkesterInstrument> instrumenter = new ArrayList<>();
//        instrumenter.add(new Stryger_TestStub("Violin Soloist", 4, 4)); // sv <= 4
//        instrumenter.add(new Blæser_TestStub("Trompet Virtuos", "Guld", 5)); // sv > 4
//        instrumenter.add(new Blæser_TestStub("Klarinet Elev", "Træ", 3));   // sv <= 4
//        instrumenter.add(new OrkesterInstrument_TestStub("Pauke Slager", 2));
//
//        ArrayList<String> log = Emne05Polymorfi.opgave5_4_dirigerOrkester(instrumenter);
//
//        // Forventet output:
//        // 1. Violin grundtone
//        // 2. Violin bruger bue
//        // 3. Trompet grundtone
//        // 4. Trompet solo
//        // 5. Klarinet grundtone
//        // 6. Pauke grundtone
//        assertEquals(6, log.size());
//        assertTrue(log.get(0).contains("Smuk strygertone fra Violin Soloist"));
//        assertTrue(log.get(1).contains("Violin Soloist stryger buen elegant"));
//        assertTrue(log.get(2).contains("Klar blæsertone fra Trompet Virtuos"));
//        assertTrue(log.get(3).contains("Trompet Virtuos blæser en kraftfuld solo!"));
//        assertTrue(log.get(4).contains("Klar blæsertone fra Klarinet Elev"));
//        assertTrue(log.get(5).contains("Pauke Slager spiller en grundtone."));
    }
    @Test
    void testDirigerOrkester_TomListe_5_4() {
//        assertTrue(Emne05Polymorfi.opgave5_4_dirigerOrkester(new ArrayList<>()).isEmpty());
    }


    // --- Opgave 5.5: Personaleforvaltning med Roller ---
    @Test
    void testBehandlPersonaleliste_RollerOgLøn_5_5() {
//        ArrayList<Medarbejder> personale = new ArrayList<>();
//        Tekniker tek = new Tekniker("Thomas It", 10, 35000, "Serverdrift");
//        Konsulent kon = new Konsulent("Karla Rådgiver", 11, 0, 800.0); // 800/time
//        Medarbejder med = new Medarbejder("Mads Alm.", 12, 28000);
//        personale.add(tek);
//        personale.add(kon);
//        personale.add(med);
//
//        ArrayList<String> status = Emne05Polymorfi.opgave5_5_behandlPersonaleliste(personale, 40);
//
//        assertEquals(3, status.size());
//        assertTrue(status.get(0).contains("Thomas It") && status.get(0).contains("Ugeløn: " + (40 * 250.0)));
//        assertTrue(status.get(1).contains("Karla Rådgiver") && status.get(1).contains("Ugeløn: " + (40 * 800.0)));
//        assertTrue(status.get(2).contains("Mads Alm.") && status.get(2).contains("Ugeløn: " + (40 * 150.0)));
//        // Test for `fakturerKunde` er sværere her, da den printer. Vi antager den kaldes.
    }

    // --- Opgave 5.6: FormManagement med Specifikke Operationer ---
    @Test
    void testAnalyserFormer_ForskelligeTyper_5_6() {
//        ArrayList<FormBase> former = new ArrayList<>();
//        former.add(new RektangelForm2("Blå", 5, 5)); // Kvadrat
//        former.add(new CirkelForm2("Grøn", 15));    // Stor cirkel
//        former.add(new RektangelForm2("Gul", 2, 8)); // Alm. rektangel
//
//        List<String> analyser = Emne05Polymorfi.opgave5_6_analyserFormer(former);
//        // Kvadrat: 1 (perimeter) + 1 (kvadrat info) = 2 linjer
//        // Stor Cirkel: 1 (perimeter) + 1 (stor cirkel info) = 2 linjer
//        // Rektangel: 1 (perimeter) = 1 linje
//        assertEquals(5, analyser.size());
//        assertTrue(analyser.get(1).contains("Dette rektangel er også et kvadrat."));
//        assertTrue(analyser.get(3).contains("Dette er en stor cirkel."));
    }

    // --- Opgave 5.7: Software Installation og Opdatering ---
    @Test
    void testVedligeholdSoftware_ForskelligeSoftwareTyper_5_7() {
//        ArrayList<Software> softwareListe = new ArrayList<>();
//        softwareListe.add(new OperativSystem("OmegaOS", "3.0", 3001));
//        softwareListe.add(new ApplikationsSoftware("FotoRedigerer", "2.1", true)); // Kræver admin
//        softwareListe.add(new ApplikationsSoftware("TekstEditor", "1.0", false));
//
//        List<String> log = Emne05Polymorfi.opgave5_7_vedligeholdSoftware(softwareListe);
//        // 3 pakker * 2 logs (installer + opdater) + 1 admin advarsel = 7
//        assertEquals(7, log.size());
//        assertTrue(log.stream().anyMatch(s -> s.contains("OmegaOS") && s.contains("Kerne initialiseres")));
//        assertTrue(log.stream().anyMatch(s -> s.contains("FotoRedigerer") && s.contains("Tjekker rettigheder")));
//        assertTrue(log.stream().anyMatch(s -> s.contains("ADVARSEL: FotoRedigerer kræver administrator rettigheder!")));
//        assertFalse(log.stream().anyMatch(s -> s.contains("ADVARSEL: TekstEditor")));
    }

    // --- Opgave 5.8: Forbrugsvarer og Genopfyldning ---
    @Test
    void testAdministrerForbrugsvarer_Genbestilling_5_8() {
//        ArrayList<Forbrugsvare> varer = new ArrayList<>();
//        PrinterToner pt = new PrinterToner("SortToner", 7, "Sort");
//        KaffebønnerPakke kbp = new KaffebønnerPakke("LuksusKaffe", 60, "Mørkristet");
//        Forbrugsvare alm = new Forbrugsvare("Papir", 6);
//        varer.add(pt); varer.add(kbp); varer.add(alm);
//
//        List<String> log = Emne05Polymorfi.opgave5_8_administrerForbrugsvarer(varer, 3);
//        // pt: 7-3=4 (<=5) -> bestil. Forbrugt 3. (2 logs)
//        // kbp: 60-3=57 (>5) -> intet ekstra. Forbrugt 3. (1 log)
//        // alm: 6-3=3 (<=5) -> "løber tør" info. Forbrugt 3. (2 logs)
//        assertEquals(2 + 1 + 2, log.size());
//        assertTrue(log.stream().anyMatch(s -> s.contains("Bestiller ny Sort toner")));
//        assertFalse(log.stream().anyMatch(s -> s.contains("Kværner LuksusKaffe"))); // Ikke under 5 endnu
//        assertTrue(log.stream().anyMatch(s -> s.contains("INFO: Papir er ved at løbe tør.")));
    }

    // --- Opgave 5.9: Kommunikation mellem Enheder ---
    @Test
    void testSimulerKommunikation_ForskelligeEnheder_5_9() {
//        ArrayList<KommunikationsEnhed> enheder = new ArrayList<>();
//        enheder.add(new RadioEnhed("BaseStation Alfa", 446.00625));
//        enheder.add(new SatellitEnhed("MobilSat Terminal", "IridiumNEXT"));
//        enheder.add(new KommunikationsEnhed("InternLinje"));
//
//        List<String> log = Emne05Polymorfi.opgave5_9_simulerKommunikation(enheder, "Vigtig besked!");
//        // Radio: 1 log
//        // Satellit: 1 juster + 1 send log = 2 logs
//        // Intern: 1 log
//        assertEquals(1 + 2 + 1, log.size());
//        assertTrue(log.get(0).contains("via radio"));
//        assertTrue(log.get(1).contains("Antenne justeret for IridiumNEXT"));
//        assertTrue(log.get(2).contains("via satellit IridiumNEXT"));
//        assertTrue(log.get(3).contains("InternLinje sender"));
    }

    // --- Opgave 5.10: Betalingssystem med Forskellige Metoder ---
    @Test
    void testProcesserBetalinger_ForskelligeMetoder_5_10() {
//        ArrayList<BetalingsMetode> metoder = new ArrayList<>();
//        // Antag kreditlimit er mindre end 800 for første kort
//        metoder.add(new Kreditkort("Anders And", "1111", LocalDate.now().plusYears(1), 500.0));
//        metoder.add(new BankOverførsel("Joakim Von And", "9876", "Andeby Bank")); // Godkender altid
//        metoder.add(new MobilBetaling("Andersine And", "1234", 1000.0));
//
//        String res1 = Emne05Polymorfi.opgave5_10_processerBetalinger(metoder, 400.0);
//        assertTrue(res1.contains("Kreditkort") && res1.contains("Anders And"));
//
//        String res2 = Emne05Polymorfi.opgave5_10_processerBetalinger(metoder, 800.0); // Kreditkort fejler, BankOverførsel tager over
//        assertTrue(res2.contains("BankOverførsel") && res2.contains("Joakim Von And"));
//
//        // Test med MobilBetaling som den første succesfulde
//        ArrayList<BetalingsMetode> metoder2 = new ArrayList<>();
//        metoder2.add(new Kreditkort("Anders And", "1111", LocalDate.now().plusYears(1), 100.0)); // Lav limit
//        metoder2.add(new MobilBetaling("Andersine And", "1234", 500.0));
//        String res3 = Emne05Polymorfi.opgave5_10_processerBetalinger(metoder2, 300.0);
//        assertTrue(res3.contains("MobilBetaling") && res3.contains("Andersine And"));
//
//        String res4 = Emne05Polymorfi.opgave5_10_processerBetalinger(metoder, 20000.0); // Alle fejler
//        assertTrue(res4.contains("kunne ikke gennemføres"));
    }
}