package emne19_exceptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException; // For Opgave 19.7 og 19.8
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Når du har oprettet dine klasser og exceptions, fjern kommenteringen for de relevante imports.
/*
// Opgave 19.5
import emne19_exceptions.UtilstrækkeligSaldoException;
import emne19_exceptions.BankKontoChecked;

// Opgave 19.6
import emne19_exceptions.DataFormatFejlException;
import emne19_exceptions.DataProcessor;
// import emne19_exceptions.Produkt; // Hvis Produkt er en defineret klasse for 19.6

// Opgave 19.8
import emne19_exceptions.KonfigurationsFejl;
import emne19_exceptions.KonfigurationsLoader;
*/

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Emne19ExceptionsTest {

    // --- Opgave 19.1: Sikker Division ---
    @Test
    @Order(1)
    void testDividerSikkert_19_1() {
        assertEquals(2.0, Emne19Exceptions.opgave19_1_dividerSikkert(10, 5), 0.001);
        assertEquals(-2.0, Emne19Exceptions.opgave19_1_dividerSikkert(-10, 5), 0.001);
        assertEquals(0.0, Emne19Exceptions.opgave19_1_dividerSikkert(0, 5), 0.001);
        assertTrue(Double.isNaN(Emne19Exceptions.opgave19_1_dividerSikkert(5, 0)), "Division med nul skal returnere Double.NaN");
    }

    // --- Opgave 19.2: Parsning af Talstreng med Fejlhåndtering ---
    @Test
    @Order(2)
    void testParseHeltalMedDefault_19_2() {
        assertEquals(123, Emne19Exceptions.opgave19_2_parseHeltalMedDefault("123", 0));
        assertEquals(-45, Emne19Exceptions.opgave19_2_parseHeltalMedDefault("-45", 0));
        assertEquals(99, Emne19Exceptions.opgave19_2_parseHeltalMedDefault("abc", 99)); // Ugyldig streng
        assertEquals(77, Emne19Exceptions.opgave19_2_parseHeltalMedDefault(null, 77)); // Null streng
        assertEquals(55, Emne19Exceptions.opgave19_2_parseHeltalMedDefault("", 55)); // Tom streng (NumberFormatException)
    }

    // --- Opgave 19.3: Sikker Adgang til Array-element ---
    @Test
    @Order(3)
    void testHentElementSikkert_19_3() {
        String[] testArray = {"nul", "en", "to"};
        assertEquals("en", Emne19Exceptions.opgave19_3_hentElementSikkert(testArray, 1));
        assertEquals("Fejl: Array er null.", Emne19Exceptions.opgave19_3_hentElementSikkert(null, 0));
        assertEquals("Fejl: Indeks ude af grænser.", Emne19Exceptions.opgave19_3_hentElementSikkert(testArray, -1));
        assertEquals("Fejl: Indeks ude af grænser.", Emne19Exceptions.opgave19_3_hentElementSikkert(testArray, 3));
    }

    // --- Opgave 19.4: Validering af Input med IllegalArgumentException ---
    @Test
    @Order(4)
    void testValiderPositivtBeløb_19_4() {
        assertDoesNotThrow(() -> Emne19Exceptions.opgave19_4_validerPositivtBeløb(100.0, "Test"));
        assertDoesNotThrow(() -> Emne19Exceptions.opgave19_4_validerPositivtBeløb(0.0, "Test"));

        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
                () -> Emne19Exceptions.opgave19_4_validerPositivtBeløb(-50.0, "Indbetaling"));
        assertEquals("Indbetaling: Beløb må ikke være negativt.", thrown.getMessage());
    }

    // --- Opgave 19.5: Custom Checked Exception - UtilstrækkeligSaldoException ---
    @Test
    @Order(5)
    void testBankKontoChecked_Hæv_19_5() {
        // TODO: Afkommenter og kør når UtilstrækkeligSaldoException og BankKontoChecked er implementeret.
        /*
        BankKontoChecked konto = new BankKontoChecked(1000.0);
        assertDoesNotThrow(() -> konto.hæv(500.0));
        assertEquals(500.0, konto.getSaldo(), 0.01); // Antager en getSaldo() metode

        UtilstrækkeligSaldoException thrown = assertThrows(UtilstrækkeligSaldoException.class,
                () -> konto.hæv(600.0)); // Forsøger at hæve mere end saldo
        assertEquals(100.0, thrown.getManglendeBeløb(), 0.01); // Mangler 100 (600 - 500)
        assertTrue(thrown.getMessage().toLowerCase().contains("utilstrækkelig saldo"));
        assertEquals(500.0, konto.getSaldo(), 0.01); // Saldo skal være uændret efter fejlet hævning
        */
        assertTrue(true, "Test for 19.5 afventer implementering af custom exception og BankKontoChecked.");
    }

    // --- Opgave 19.6: Custom Unchecked Exception - DataFormatFejlException ---
    @Test
    @Order(6)
    void testDataProcessor_BehandlDataLinje_19_6() {
        // TODO: Afkommenter og kør når DataFormatFejlException og DataProcessor er implementeret.
        /*
        DataProcessor processor = new DataProcessor();
        assertEquals(35, processor.behandlDataLinje("ALDER:35"));
        assertEquals(100, processor.behandlDataLinje("SCORE:100"));

        assertThrows(DataFormatFejlException.class, () -> processor.behandlDataLinje(null));
        assertThrows(DataFormatFejlException.class, () -> processor.behandlDataLinje(""));
        assertThrows(DataFormatFejlException.class, () -> processor.behandlDataLinje("NAVN UDEN KOLON"));
        assertThrows(DataFormatFejlException.class, () -> processor.behandlDataLinje("TYPE:ABC")); // Ikke et heltal

        DataFormatFejlException thrown = assertThrows(DataFormatFejlException.class,
                                        () -> processor.behandlDataLinje("VÆGT:")); // Værdi mangler
        assertTrue(thrown.getMessage().toLowerCase().contains("værdi"));
        */
        assertTrue(true, "Test for 19.6 afventer implementering af custom exception og DataProcessor.");
    }

    // --- Opgave 19.7: Brug af try-catch-finally ---
    @Test
    @Order(7)
    void testSimulerRessourceBehandling_UdenFejl_19_7() throws IOException { // Test-metoden kan kaste IOException hvis den ikke fanges i opgaven
        String log = Emne19Exceptions.opgave19_7_simulerRessourceBehandling(false);
        assertTrue(log.contains("Ressource åbnes..."));
        assertTrue(log.contains("Ressource i brug..."));
        assertTrue(log.contains("Ressource brug afsluttet."));
        assertFalse(log.contains("FEJL fanget:"));
        assertTrue(log.contains("Ressource lukkes..."));
        assertTrue(log.endsWith("Ressource lukkes..."), "Lukning skal være det sidste i loggen ved succes.");
        // For at teste returværdi, hvis opgaven bad om det:
        // assertEquals("Succesfuldt behandletRessource lukkes...", log); // Eller hvad den nu skal returnere/logge
    }

    @Test
    @Order(8)
    void testSimulerRessourceBehandling_MedFejl_19_7() throws IOException {
        String log = Emne19Exceptions.opgave19_7_simulerRessourceBehandling(true);
        assertTrue(log.contains("Ressource åbnes..."));
        assertTrue(log.contains("Ressource i brug..."));
        assertFalse(log.contains("Ressource brug afsluttet."));
        assertTrue(log.contains("FEJL fanget: Simuleret I/O fejl under brug"));
        assertTrue(log.contains("Ressource lukkes..."));
        assertTrue(log.endsWith("Ressource lukkes..."), "Lukning skal være det sidste i loggen ved fejl.");
    }


    // --- Opgave 19.8: Propagering af Checked Exception (throws klausul) ---
    @Test
    @Order(9)
    void testKonfigurationsLoader_19_8() {
        // TODO: Afkommenter og kør når KonfigurationsFejl og KonfigurationsLoader er implementeret.
        /*
        KonfigurationsLoader loader = new KonfigurationsLoader();
        Map<String, String> validConfig = new HashMap<>();
        validConfig.put("DATABASE_URL", "myDbUrl");
        validConfig.put("PORT", "5432");

        Map<String, String> invalidConfig = new HashMap<>();
        invalidConfig.put("DATABASE_URL", "myDbUrl");
        // PORT mangler

        assertEquals("System initialiseret med URL=myDbUrl på Port=5432", loader.initialiserSystem(validConfig));

        String fejlResultat = loader.initialiserSystem(invalidConfig);
        assertTrue(fejlResultat.startsWith("System initialisering fejlet:"));
        assertTrue(fejlResultat.contains("Nøgle 'PORT' ikke fundet"));

        String fejlResultatNull = loader.initialiserSystem(null);
        assertTrue(fejlResultatNull.startsWith("System initialisering fejlet:"));
        */
        assertTrue(true, "Test for 19.8 afventer implementering af custom exception og KonfigurationsLoader.");
    }

    // --- Opgave 19.9: Multiple Catch Blokke ---
    @Test
    @Order(10)
    void testBehandlDiverseInput_19_9() {
        assertEquals("Heltal: 123", Emne19Exceptions.opgave19_9_behandlDiverseInput("123"));
        assertEquals("Decimaltal: 12.34", Emne19Exceptions.opgave19_9_behandlDiverseInput("12.34"));
        // Hvis "12.34" først forsøges parset som heltal, fanges NFE, så forsøges double
        assertEquals("Tekststreng: Hello", Emne19Exceptions.opgave19_9_behandlDiverseInput("Hello")); // Kan ikke parses som tal

        List<String> listForTest = new ArrayList<>(Arrays.asList("a"));
        assertEquals("Input var en liste, men adgang var udenfor grænser.", Emne19Exceptions.opgave19_9_behandlDiverseInput(listForTest));

        assertEquals("Input var null.", Emne19Exceptions.opgave19_9_behandlDiverseInput(null));

        // Test for "Ukendt input type" eller generel Exception
        Object ukendtObjekt = new Object(); // Ikke String, ikke List, ikke null
        // Afhængig af din implementering. Hvis den når "Ukendt input type."
        assertEquals("Ukendt input type.", Emne19Exceptions.opgave19_9_behandlDiverseInput(ukendtObjekt));
    }

    // --- Opgave 19.10: Teoretisk - Checked vs. Unchecked Exceptions ---
    @Test
    @Order(11)
    void testSvarCheckedVsUnchecked_19_10() {
        // Korrekt svar: 2 (Kompilator tvinger håndtering af checked...)
        assertEquals(2, Emne19Exceptions.opgave19_10_svarCheckedVsUnchecked());
    }
}