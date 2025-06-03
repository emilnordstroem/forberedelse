package emne23_junit_teori;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

// Importerer den klasse, der indeholder svarmetoderne.
// import static emne23_junit_teori.Emne23JUnitTeoriOpgaver.*; // Hvis du vil kalde metoderne direkte

@DisplayName("Emne 23: Teoriopgaver om JUnit")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Emne23JUnitTeoriOpgaverTest {

    @Test
    @Order(1)
    @DisplayName("Opgave 23.1: Hovedformålet med JUnit")
    void testOpgave23_1_SvarHovedformålMedJUnit() {
        // Korrekt svar: 2. At udføre automatiserede unit tests...
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_1_svarHovedformålMedJUnit());
    }

    @Test
    @Order(2)
    @DisplayName("Opgave 23.2: Annotation for en Testmetode (JUnit 5)")
    void testOpgave23_2_SvarAnnotationForTestmetode() {
        // Korrekt svar: 3. @Test
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_2_svarAnnotationForTestmetode());
    }

    @Test
    @Order(3)
    @DisplayName("Opgave 23.3: Forståelse af assertEquals")
    void testOpgave23_3_SvarAssertEquals() {
        // Korrekt svar: 3. Om expected og actual er lig med hinanden ifølge deres equals()-metode...
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_3_svarAssertEquals());
    }

    @Test
    @Order(4)
    @DisplayName("Opgave 23.4: @BeforeEach Annotationens Funktion")
    void testOpgave23_4_SvarBeforeEachFunktion() {
        // Korrekt svar: 2. Før udførelsen af hver enkelt testmetode i testklassen.
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_4_svarBeforeEachFunktion());
    }

    @Test
    @Order(5)
    @DisplayName("Opgave 23.5: AAA-Mønsteret i Teststruktur")
    void testOpgave23_5_SvarAAAMønster() {
        // Korrekt svar: 3. Arrange, Act, Assert
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_5_svarAAAMønster());
    }

    @Test
    @Order(6)
    @DisplayName("Opgave 23.6: Anvendelse af assertThrows")
    void testOpgave23_6_SvarAssertThrows() {
        // Korrekt svar: 3. At verificere, at den udførbare kode (executable) kaster en exception af den specificerede type.
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_6_svarAssertThrows());
    }

    @Test
    @Order(7)
    @DisplayName("Opgave 23.7: JUnit og Regressionstest")
    void testOpgave23_7_SvarRegressionstest() {
        // Korrekt svar: 2. Ved at gøre det muligt at genkøre eksisterende tests efter kodeændringer...
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_7_svarRegressionstest());
    }

    @Test
    @Order(8)
    @DisplayName("Opgave 23.8: @AfterAll Annotationens Egenskaber")
    void testOpgave23_8_SvarAfterAllEgenskaber() {
        // Korrekt svar: 3. Den skal være public static void og tage ingen argumenter.
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_8_svarAfterAllEgenskaber());
    }

    @Test
    @Order(9)
    @DisplayName("Opgave 23.9: Test af Private Metoder")
    void testOpgave23_9_SvarTestAfPrivateMetoder() {
        // Korrekt svar: 3. Private metoder testes typisk indirekte ved at teste de public metoder...
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_9_svarTestAfPrivateMetoder());
    }

    @Test
    @Order(10)
    @DisplayName("Opgave 23.10: Red-Green-Refactor Cyklus")
    void testOpgave23_10_SvarRedGreenRefactor() {
        // Korrekt svar: 2. Test-Driven Development (TDD)
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_10_svarRedGreenRefactor());
    }

    @Test
    @Order(11)
    @DisplayName("Opgave 23.11: Formål med @BeforeAll (Revideret)")
    void testOpgave23_11_SvarFormålMedBeforeAll() {
        // Korrekt svar for revideret spg: 2. At initialisere tunge ressourcer én gang...
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_11_svarFormålMedBeforeAll());
    }

    @Test
    @Order(12)
    @DisplayName("Opgave 23.12: Assertions - assertNotNull (Revideret)")
    void testOpgave23_12_SvarAssertNotNull() {
        // Korrekt svar for revideret spg: 3. assertNotNull(hentBrugerdata("id123"))
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_12_svarAssertNotNull());
    }

    @Test
    @Order(13)
    @DisplayName("Opgave 23.13: Hvad sker der ved en Fejlet Assertion? (Revideret)")
    void testOpgave23_13_SvarFejletAssertion() {
        // Korrekt svar for revideret spg: 3. Den specifikke testmetode stoppes øjeblikkeligt og markeres som "fejlet"...
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_13_svarFejletAssertion());
    }

    @Test
    @Order(14)
    @DisplayName("Opgave 23.14: Fordel ved JUnit - Forbedret Kodedesign (Revideret)")
    void testOpgave23_14_SvarForbedretKodedesign() {
        // Korrekt svar for revideret spg: 2. Ved at opfordre til mindre, fokuserede metoder og klasser...
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_14_svarForbedretKodedesign());
    }

    @Test
    @Order(15)
    @DisplayName("Opgave 23.15: Testklassens Struktur (Revideret)")
    void testOpgave23_15_SvarTestklasseStruktur() {
        // Korrekt svar for revideret spg: 2. Testkoden placeres i en separat klasse, ofte i en parallel mappestruktur...
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_15_svarTestklasseStruktur());
    }

    @Test
    @Order(16)
    @DisplayName("Opgave 23.16: Formål med @AfterEach (Revideret)")
    void testOpgave23_16_SvarFormålMedAfterEach() {
        // Korrekt svar for revideret spg: 2. At udføre oprydning... efter hver testmetode er kørt.
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_16_svarFormålMedAfterEach());
    }

    @Test
    @Order(17)
    @DisplayName("Opgave 23.17: Nødvendighed af Assertions (Revideret)")
    void testOpgave23_17_SvarNødvendighedAfAssertions() {
        // Korrekt svar for revideret spg: 3. Nej, en @Test metode kan godt bestå uden eksplicitte assertions...
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_17_svarNødvendighedAfAssertions());
    }

    @Test
    @Order(18)
    @DisplayName("Opgave 23.18: Statiske Metoder i Testklasser (Revideret)")
    void testOpgave23_18_SvarStatiskeMetoderITestklasser() {
        // Korrekt svar for revideret spg: 3. @BeforeAll og @AfterAll.
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_18_svarStatiskeMetoderITestklasser());
    }

    @Test
    @Order(19)
    @DisplayName("Opgave 23.19: Arrange Delen af AAA (Revideret)")
    void testOpgave23_19_SvarArrangeDelen() {
        // Korrekt svar for revideret spg: 3. At opsætte de nødvendige forudsætninger og input-data for testen...
        assertEquals(3, Emne23JUnitTeoriOpgaver.opgave23_19_svarArrangeDelen());
    }

    @Test
    @Order(20)
    @DisplayName("Opgave 23.20: Fordel ved JUnit - Klare Resultater (Revideret)")
    void testOpgave23_20_SvarFordelKlareResultater() {
        // Korrekt svar for revideret spg: 2. At man hurtigt og visuelt kan se, om alle tests er bestået...
        assertEquals(2, Emne23JUnitTeoriOpgaver.opgave23_20_svarFordelKlareResultater());
    }
}