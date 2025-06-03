package emne12_strategy_pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Når du har oprettet dine interfaces og klasser, fjern kommenteringen for de relevante imports.
// Sørg for, at klassenavne og pakkestruktur matcher.
/*
// Opgave 12.1
import emne12_strategy_pattern.RegneStrategi;
import emne12_strategy_pattern.PlusStrategi;
import emne12_strategy_pattern.MinusStrategi;
import emne12_strategy_pattern.GangeStrategi;
import emne12_strategy_pattern.DividerStrategi;
import emne12_strategy_pattern.KalkulatorContext;

// Opgave 12.2
import emne12_strategy_pattern.FormateringsStrategi;
import emne12_strategy_pattern.StorBogstavStrategi;
import emne12_strategy_pattern.LilleBogstavStrategi;
import emne12_strategy_pattern.CamelCaseStrategi;
import emne12_strategy_pattern.TekstProcessor;

// Opgave 12.3
import emne12_strategy_pattern.ForsendelsesInfo;
import emne12_strategy_pattern.ForsendelsesMetode;
import emne12_strategy_pattern.PakkeForsendelse;
import emne12_strategy_pattern.BrevForsendelse;
import emne12_strategy_pattern.PalletForsendelse;
import emne12_strategy_pattern.ForsendelsesKalkulator;

// Opgave 12.4
import emne12_strategy_pattern.FeltValideringsRegel;
import emne12_strategy_pattern.TalfeltValidering;
import emne12_strategy_pattern.TekstfeltLængdeValidering;
import emne12_strategy_pattern.DatoFormatValidering;
import emne12_strategy_pattern.DataFormular;

// Opgave 12.5
import emne12_strategy_pattern.NotifikationsKanal;
import emne12_strategy_pattern.EmailKanalStrategi;
import emne12_strategy_pattern.SMSKanalStrategi;
import emne12_strategy_pattern.NotifikationsService;

// Opgave 12.6
import emne12_strategy_pattern.KundeType;
import emne12_strategy_pattern.RabatBeregnerStrategi;
import emne12_strategy_pattern.ProcentRabat;
import emne12_strategy_pattern.FastBeløbRabat;
import emne12_strategy_pattern.SæsonRabat;
import emne12_strategy_pattern.IngenRabat;
import emne12_strategy_pattern.KasseApparat;

// Opgave 12.7
import emne12_strategy_pattern.AdressePunkt;
import emne12_strategy_pattern.RutePlanStrategi;
import emne12_strategy_pattern.KortesteAfstandStrategi;
import emne12_strategy_pattern.HurtigsteTidStrategi;
import emne12_strategy_pattern.UndgåMotorvejStrategi;
import emne12_strategy_pattern.LeveringsApp;
import emne12_strategy_pattern.LogLevel; // Fra opgavebeskrivelsen
import emne12_strategy_pattern.LogFormatter;
import emne12_strategy_pattern.SimpelLogFormatter;
import emne12_strategy_pattern.JsonLogFormatter;
import emne12_strategy_pattern.CsvLogFormatter;
import emne12_strategy_pattern.AppLogger;


// Opgave 12.8
import emne12_strategy_pattern.LagringsStrategi;
import emne12_strategy_pattern.FilSystemLagring;
import emne12_strategy_pattern.CloudDatabaseLagring;
import emne12_strategy_pattern.LokalCacheLagring;
import emne12_strategy_pattern.AppDataManager;

// Opgave 12.9
import emne12_strategy_pattern.SpilEntitet;
import emne12_strategy_pattern.NPC_Adfærd;
import emne12_strategy_pattern.VenligAdfærd;
import emne12_strategy_pattern.NeutralAdfærd;
import emne12_strategy_pattern.AggressivAdfærd;
import emne12_strategy_pattern.NonPlayerCharacter;

// Opgave 12.10
import emne12_strategy_pattern.MinListeSorterer;
import emne12_strategy_pattern.MinBobleSort;
import emne12_strategy_pattern.MinSelectionSort;
import emne12_strategy_pattern.JavaIndbyggetSort;
import emne12_strategy_pattern.DataBeholder;
*/

class Emne12StrategyPatternTest {

    // --- Opgave 12.1: Simpel Regnemaskine med Strategier ---
    @Test
    void testKalkulatorContext_MedForskelligeStrategier_12_1() {
//        KalkulatorContext kalkulator = new KalkulatorContext(new PlusStrategi());
//        assertEquals(8, kalkulator.udførBeregning(5, 3));
//
//        kalkulator.setStrategi(new MinusStrategi());
//        assertEquals(2, kalkulator.udførBeregning(5, 3));
//
//        kalkulator.setStrategi(new GangeStrategi());
//        assertEquals(15, kalkulator.udførBeregning(5, 3));
//
//        kalkulator.setStrategi(new DividerStrategi());
//        assertEquals(2, kalkulator.udførBeregning(6, 3));
//        // Test division med nul (afhængig af din implementering i DividerStrategi)
//        // assertThrows(ArithmeticException.class, () -> kalkulator.udførBeregning(5, 0));
//        // Eller hvis den returnerer 0:
//        assertEquals(0, kalkulator.udførBeregning(5, 0), "Division med 0 skal håndteres.");
    }

    // --- Opgave 12.2: Tekstformateringsstrategier ---
    @Test
    void testTekstProcessor_Formatering_12_2() {
//        TekstProcessor processor = new TekstProcessor();
//        String testTekst = "Hej Verden";
//
//        processor.setFormateringsStrategi(new StorBogstavStrategi());
//        assertEquals("HEJ VERDEN", processor.anvendFormatering(testTekst));
//
//        processor.setFormateringsStrategi(new LilleBogstavStrategi());
//        assertEquals("hej verden", processor.anvendFormatering(testTekst));
//
//        processor.setFormateringsStrategi(new OmvendtTekstStrategi());
//        assertEquals("nedreV jeH", processor.anvendFormatering(testTekst));
//
//        TekstProcessor processor2 = new TekstProcessor();
//        processor2.setFormateringsStrategi(new CamelCaseStrategi());
//        assertEquals("hejVerdenHer", processor2.anvendFormatering("hej verden her"));
//        assertEquals("startMedStort", processor2.anvendFormatering("Start Med Stort"));
    }

    // --- Opgave 12.3: Beregning af Forsendelsesomkostninger ---
    @Test
    void testForsendelsesKalkulator_ForskelligeMetoder_12_3() {
//        ForsendelsesKalkulator kalkulator = new ForsendelsesKalkulator();
//        ForsendelsesInfo info = new ForsendelsesInfo(10.0, 100.0, 0.5); // vægt, distance, volumen
//
//        kalkulator.setAktivMetode(new StandardForsendelse());
//        // Pris = 50 + (10 * 5) + (100 * 0.1) = 50 + 50 + 10 = 110.0
//        assertEquals(110.0, kalkulator.kalkulerForsendelse(info), 0.01);
//
//        kalkulator.setAktivMetode(new ExpressForsendelse());
//        // Pris = 100 + (10 * 7) + (100 * 0.2) = 100 + 70 + 20 = 190.0
//        assertEquals(190.0, kalkulator.kalkulerForsendelse(info), 0.01);
//
//        kalkulator.setAktivMetode(new BrevForsendelse());
//        ForsendelsesInfo brevInfoLet = new ForsendelsesInfo(0.05, 50, 0.01); // 50g
//        assertEquals(15.0, kalkulator.kalkulerForsendelse(brevInfoLet), 0.01);
//        ForsendelsesInfo brevInfoTung = new ForsendelsesInfo(0.2, 50, 0.01); // 200g
//        // Pris = 15 + (0.2 - 0.1) * 50 = 15 + 0.1 * 50 = 15 + 5 = 20.0
//        assertEquals(20.0, kalkulator.kalkulerForsendelse(brevInfoTung), 0.01);
//
//        kalkulator.setAktivMetode(new PalletForsendelse());
//        // Pris = 200 + (0.5 * 100) + (100 * 1.5) = 200 + 50 + 150 = 400
//        assertEquals(400.0, kalkulator.kalkulerForsendelse(info),0.01);
    }

    // --- Opgave 12.4: Valideringsstrategier for Datafelter ---
    @Test
    void testDataFormular_Validering_12_4() {
//        DataFormular formular = new DataFormular();
//        formular.tilføjValideringsRegel("alder", new TalfeltValidering());
//        formular.tilføjValideringsRegel("navn", new TekstfeltLængdeValidering(2, 10));
//        formular.tilføjValideringsRegel("fødselsdag", new DatoFormatValidering("dd-MM-yyyy"));
//
//        assertTrue(formular.validerFelt("alder", "25"));
//        assertFalse(formular.validerFelt("alder", "femogtyve"));
//        assertEquals("Skal være et heltal.", formular.getFeltFejlbesked("alder"));
//
//        assertTrue(formular.validerFelt("navn", "Peter"));
//        assertFalse(formular.validerFelt("navn", "P"));
//        assertEquals("Tekst skal være mellem 2 og 10 tegn.", formular.getFeltFejlbesked("navn"));
//
//        assertTrue(formular.validerFelt("fødselsdag", "24-12-2023"));
//        assertFalse(formular.validerFelt("fødselsdag", "2023-12-24"));
//        assertEquals("Dato skal være i formatet dd-MM-yyyy.", formular.getFeltFejlbesked("fødselsdag"));
//
//        assertFalse(formular.validerFelt("ukendtFelt", "test")); // Regel ikke fundet
    }

    // --- Opgave 12.5: Afsendelse af Notifikationer ---
    @Test
    void testNotifikationsService_ForskelligeKanaler_12_5() {
//        NotifikationsService service = new NotifikationsService();
//
//        service.setNotifikationsMetode(new EmailKanalStrategi());
//        String emailRes = service.udsend("test@example.com", "Vigtigt!", "Dette er en email notifikation.");
//        assertTrue(emailRes.contains("Email sendt til test@example.com") && emailRes.contains("Vigtigt!"));
//
//        service.setNotifikationsMetode(new SMSKanalStrategi());
//        String smsRes = service.udsend("12345678", "Kort besked", "SMS notifikation.");
//        assertTrue(smsRes.contains("SMS sendt til 12345678") && smsRes.contains("Kort besked"));
    }

    // --- Opgave 12.6: Dynamisk Rabatsystem ---
    @Test
    void testKasseApparat_Rabatter_12_6() {
//        KasseApparat kasse = new KasseApparat();
//        double pris = 1000.0;
//
//        kasse.setRabatStrategi(new IngenRabat());
//        assertEquals(1000.0, kasse.beregnPrisEfterRabat(pris, KundeType.STANDARD), 0.01);
//
//        kasse.setRabatStrategi(new ProcentRabat(0.15)); // 15% rabat
//        assertEquals(850.0, kasse.beregnPrisEfterRabat(pris, KundeType.VIP), 0.01);
//
//        kasse.setRabatStrategi(new FastBeløbRabat(100.0, 500.0)); // 100kr rabat hvis pris > 500
//        assertEquals(900.0, kasse.beregnPrisEfterRabat(pris, KundeType.LOYAL), 0.01);
//        assertEquals(450.0, kasse.beregnPrisEfterRabat(450.0, KundeType.LOYAL), 0.01); // Ingen rabat
//
//        kasse.setRabatStrategi(new SæsonRabat()); // 20% rabat
//        assertEquals(800.0, kasse.beregnPrisEfterRabat(pris, KundeType.STANDARD), 0.01);
    }

    // --- Opgave 12.7: Log Formatteringsstrategier ---
    @Test
    void testAppLogger_ForskelligeFormatters_12_7() {
//        AppLogger logger = new AppLogger();
//        LocalDateTime tid = LocalDateTime.of(2023, 10, 26, 14, 30, 0); // Fast tidspunkt for test
//
//        logger.setFormatter(new SimpelLogFormatter());
//        String simpelLog = logger.logMedFastTid(LogLevel.INFO, "System startet.", tid);
//        assertEquals("[2023-10-26 14:30:00] [INFO]: System startet.", simpelLog);
//
//        logger.setFormatter(new JsonLogFormatter());
//        String jsonLog = logger.logMedFastTid(LogLevel.WARNING, "Disk er fuld!", tid);
//        // Simpel test af JSON-lignende output
//        assertTrue(jsonLog.startsWith("{") && jsonLog.endsWith("}"));
//        assertTrue(jsonLog.contains("\"timestamp\": \"2023-10-26T14:30:00\""));
//        assertTrue(jsonLog.contains("\"level\": \"WARNING\""));
//        assertTrue(jsonLog.contains("\"message\": \"Disk er fuld!\""));
//
//        logger.setFormatter(new CsvLogFormatter());
//        String csvLog = logger.logMedFastTid(LogLevel.ERROR, "Databasefejl.", tid);
//        assertEquals("\"2023-10-26T14:30:00\",\"ERROR\",\"Databasefejl.\"", csvLog);
    }

    // --- Opgave 12.8: Data Lagringsstrategier (simuleret) ---
    @Test
    void testAppDataManager_Lagringsstrategier_12_8() {
//        AppDataManager manager = new AppDataManager();
//        String nøgle = "brugerNavn";
//        String værdi = "TestBruger";
//
//        manager.setLagringsStrategi(new FilSystemLagring());
//        assertTrue(manager.gemAppSetting(nøgle, værdi));
//        assertEquals("FilData for " + nøgle, manager.hentAppSetting(nøgle)); // Forudsat dummy implementering
//
//        manager.setLagringsStrategi(new CloudDatabaseLagring());
//        assertTrue(manager.gemAppSetting(nøgle, værdi));
//        assertEquals("CloudData for " + nøgle, manager.hentAppSetting(nøgle)); // Forudsat dummy implementering
//
//        LokalCacheLagring cache = new LokalCacheLagring();
//        manager.setLagringsStrategi(cache);
//        assertTrue(manager.gemAppSetting(nøgle, værdi));
//        assertEquals(værdi, manager.hentAppSetting(nøgle)); // Henter fra HashMap
//        assertNull(manager.hentAppSetting("ukendtNøgle"));
    }

    // --- Opgave 12.9: Spil AI Adfærd Strategier for en NPC ---
    @Test
    void testNonPlayerCharacter_Adfærd_12_9() {
//        NonPlayerCharacter npc = new NonPlayerCharacter("Vagten Ulrik", 100);
//        SpilEntitet spiller = new SpilEntitet("Helten Finn", 100);
//
//        npc.setAdfærd(new VenligAdfærd());
//        assertTrue(npc.interagerMedSpiller(spiller).contains("hilser venligt"));
//
//        npc.setAdfærd(new NeutralAdfærd());
//        assertTrue(npc.interagerMedSpiller(spiller).contains("observerer"));
//
//        npc.setAdfærd(new AggressivAdfærd());
//        String aggressivHandling = npc.interagerMedSpiller(spiller);
//        assertTrue(aggressivHandling.contains("Vagten Ulrik angriber Helten Finn"));
        // Antager at AggressivAdfærd.udførHandling også kalder target.tagSkade()
        // Dette kan testes ved at tjekke spiller.getHealth() hvis SpilEntitet har den.
        // For nu fokuserer vi på den returnerede streng fra strategien.
    }

    // --- Opgave 12.10: Sorteringsalgoritme Strategier ---
    @Test
    void testDataBeholder_Sortering_12_10() {
//        List<Integer> startListe = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 8));
//        DataBeholder beholder = new DataBeholder(new ArrayList<>(startListe)); // Send kopi til konstruktør
//
//        beholder.setSorteringsAlgoritme(new MinBobleSort());
//        beholder.udførSortering();
//        List<Integer> forventetSorteret = Arrays.asList(1, 2, 4, 5, 8);
//        assertEquals(forventetSorteret, beholder.getData());
//
//        // Nulstil og test SelectionSort
//        beholder = new DataBeholder(new ArrayList<>(startListe)); // Ny usorteret liste
//        beholder.setSorteringsAlgoritme(new MinSelectionSort());
//        beholder.udførSortering();
//        assertEquals(forventetSorteret, beholder.getData());
//
//        // Nulstil og test IndbyggetSort
//        beholder = new DataBeholder(new ArrayList<>(startListe)); // Ny usorteret liste
//        beholder.setSorteringsAlgoritme(new JavaIndbyggetSort());
//        beholder.udførSortering();
//        assertEquals(forventetSorteret, beholder.getData());
    }
}