package emne23_junit_teori;

/**
 * Generel Beskrivelse for Opgavesættet Emne 23: JUnit (Teori)
 * ===========================================================
 * Dette opgavesæt fokuserer på Emne 23: JUnit.
 * Formålet er at teste din teoretiske forståelse af JUnit frameworkets formål,
 * centrale annotationer, assertions, og best practices for unit testing.
 * For hver opgave skal du sætte den tilhørende 'ditSvar'-variabel i metoden
 * til nummeret på den svarmulighed, du anser for mest korrekt.
 */
public class Emne23JUnitTeoriOpgaver {

    /**
     * Opgave 23.1: Hovedformålet med JUnit
     * -----------------------------------
     * Spørgsmål:
     * Hvad er det primære formål med at bruge JUnit i softwareudvikling?
     *
     * Svarmuligheder:
     * 1. At generere automatisk dokumentation for Java-klasser.
     * 2. At udføre automatiserede unit tests for at verificere korrektheden af individuelle kodeenheder (metoder/klasser).
     * 3. At optimere Java-kodes ydeevne ved at fjerne unødvendige kodeblokke.
     * 4. At designe og implementere grafiske brugergrænseflader (GUI'er).
     */
    public static int opgave23_1_svarHovedformålMedJUnit() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.2: Annotation for en Testmetode (JUnit 5)
     * ---------------------------------------------------
     * Spørgsmål:
     * Hvilken Java annotation bruges typisk til at markere en metode som en testmetode i JUnit 5?
     *
     * Svarmuligheder:
     * 1. `@TestMethod`
     * 2. `@JUnitTest`
     * 3. `@Test`
     * 4. `@RunTest`
     */
    public static int opgave23_2_svarAnnotationForTestmetode() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.3: Forståelse af `assertEquals`
     * -----------------------------------------
     * Spørgsmål:
     * Hvad verificerer assertion-metoden `assertEquals(expected, actual)` i JUnit?
     *
     * Svarmuligheder:
     * 1. Om de to objekter `expected` og `actual` peger på præcis den samme hukommelseslokation (identitet).
     * 2. Om `actual` er en subklasse af `expected`.
     * 3. Om `expected` og `actual` er lig med hinanden ifølge deres `equals()`-metode (for objekter) eller `==` (for primitiver).
     * 4. Om `actual` er større end eller lig med `expected`.
     */
    public static int opgave23_3_svarAssertEquals() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.4: `@BeforeEach` Annotationens Funktion
     * ------------------------------------------------
     * Spørgsmål:
     * Hvornår udføres en metode, der er annoteret med `@BeforeEach` i en JUnit 5 testklasse?
     *
     * Svarmuligheder:
     * 1. Én enkelt gang, før alle testmetoder i testklassen udføres.
     * 2. Før udførelsen af hver enkelt testmetode i testklassen.
     * 3. Efter udførelsen af hver enkelt testmetode i testklassen.
     * 4. Kun hvis den foregående testmetode fejlede, for at nulstille tilstanden.
     */
    public static int opgave23_4_svarBeforeEachFunktion() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.5: AAA-Mønsteret i Teststruktur
     * ------------------------------------------
     * Spørgsmål:
     * "AAA"-mønsteret er en anerkendt måde at strukturere testmetoder på. Hvad står "AAA" for?
     *
     * Svarmuligheder:
     * 1. Author, Action, Assertion
     * 2. Abstract, Apply, Analyze
     * 3. Arrange, Act, Assert
     * 4. Allocate, Access, Affirm
     */
    public static int opgave23_5_svarAAAMønster() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.6: Anvendelse af `assertThrows`
     * -----------------------------------------
     * Spørgsmål:
     * Hvad er formålet med JUnit 5 assertion-metoden `assertThrows(ExpectedExceptionType.class, executable)`?
     *
     * Svarmuligheder:
     * 1. At verificere, at den udførbare kode (`executable`) IKKE kaster nogen exceptions.
     * 2. At fange alle exceptions, som den udførbare kode måtte kaste, og derefter ignorere dem.
     * 3. At verificere, at den udførbare kode (`executable`) kaster en exception af den specificerede type (`ExpectedExceptionType`).
     * 4. At tvinge den udførbare kode til at kaste en `ExpectedExceptionType`.
     */
    public static int opgave23_6_svarAssertThrows() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.7: JUnit og Regressionstest
     * -------------------------------------
     * Spørgsmål:
     * Hvordan understøtter JUnit primært konceptet "regressionstest"?
     *
     * Svarmuligheder:
     * 1. Ved automatisk at forhindre, at ny kode introducerer fejl.
     * 2. Ved at gøre det muligt at genkøre eksisterende tests efter kodeændringer for at sikre, at tidligere funktionalitet stadig virker som forventet.
     * 3. Ved at analysere kode for potentielle regressionsfejl ved hjælp af statisk analyse.
     * 4. Ved at omskrive gammel kode, så den bliver mindre tilbøjelig til regression.
     */
    public static int opgave23_7_svarRegressionstest() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.8: `@AfterAll` Annotationens Egenskaber
     * -------------------------------------------------
     * Spørgsmål:
     * En metode annoteret med `@AfterAll` i JUnit 5 har et specifikt krav til sin signatur. Hvilket?
     *
     * Svarmuligheder:
     * 1. Den skal være `private` og tage en `TestResult` parameter.
     * 2. Den skal være `public` og returnere `void`.
     * 3. Den skal være `public static void` og tage ingen argumenter.
     * 4. Den skal være `protected` og returnere en `boolean`.
     */
    public static int opgave23_8_svarAfterAllEgenskaber() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.9: Test af Private Metoder
     * ------------------------------------
     * Spørgsmål:
     * Hvad er den generelt anbefalede tilgang til unit-test af `private` metoder i en klasse?
     *
     * Svarmuligheder:
     * 1. Man skal altid ændre deres synlighed til `public` for at kunne teste dem direkte.
     * 2. Man bør bruge Java Reflection til at omgå `private` og kalde dem direkte i testen.
     * 3. `Private` metoder testes typisk indirekte ved at teste de `public` metoder i klassen, som kalder de private metoder. Deres korrekthed verificeres gennem det offentlige interface.
     * 4. JUnit tilbyder en speciel `@TestPrivateMethod` annotation til dette formål.
     */
    public static int opgave23_9_svarTestAfPrivateMetoder() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.10: "Red-Green-Refactor" Cyklus
     * -----------------------------------------
     * Spørgsmål:
     * Hvilken softwareudviklingspraksis er tæt forbundet med brugen af unit testing frameworks som JUnit
     * og involverer en cyklus bestående af at skrive en test, der fejler (Red), skrive kode for at få
     * testen til at bestå (Green), og derefter forbedre koden (Refactor)?
     *
     * Svarmuligheder:
     * 1. Waterfall Model
     * 2. Test-Driven Development (TDD)
     * 3. Rapid Application Development (RAD)
     * 4. Feature-Driven Development (FDD)
     */
    public static int opgave23_10_svarRedGreenRefactor() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 23.11: Formål med `@BeforeAll`
     * -------------------------------------
     * Spørgsmål:
     * Hvad er et typisk formål med en metode annoteret med `@BeforeAll` i JUnit 5?
     *
     * Svarmuligheder:
     * 1. At udføre en oprydning efter hver enkelt testmetode.
     * 2. At initialisere tunge ressourcer én gang, som deles af alle testmetoder i klassen (f.eks. databaseforbindelse).
     * 3. At definere parametre, som skal sendes til hver testmetode.
     * 4. At springe alle tests i klassen over, hvis en bestemt betingelse er opfyldt.
     */
    public static int opgave23_11_svarFormålMedBeforeAll() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.12: Assertions - `assertNotNull`
     * -----------------------------------------
     * Problemstilling:
     * En metode `hentBrugerdata(String brugerId)` forventes at returnere et `BrugerData`-objekt,
     * hvis brugeren findes, og ikke `null`.
     *
     * Spørgsmål:
     * Hvilken JUnit assertion er mest direkte til at verificere, at metoden IKKE returnerer `null` for et gyldigt ID?
     *
     * Svarmuligheder:
     * 1. `assertTrue(hentBrugerdata("id123") != null)`
     * 2. `assertEquals(false, hentBrugerdata("id123") == null)`
     * 3. `assertNotNull(hentBrugerdata("id123"))`
     * 4. `assertNull(hentBrugerdata("id123"))`
     */
    public static int opgave23_12_svarAssertNotNull() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.13: Hvad sker der ved en Fejlet Assertion?
     * ----------------------------------------------------
     * Spørgsmål:
     * Hvis en assertion (f.eks. `assertEquals`) fejler under kørslen af en JUnit testmetode, hvad sker der så typisk?
     *
     * Svarmuligheder:
     * 1. Testmetoden fortsætter med at udføre resten af koden, men fejlen logges.
     * 2. Hele testklassen stopper øjeblikkeligt, og ingen yderligere tests i klassen køres.
     * 3. Den specifikke testmetode stoppes øjeblikkeligt og markeres som "fejlet" (Failed). Andre testmetoder i klassen vil stadig blive forsøgt kørt.
     * 4. JUnit forsøger automatisk at rette fejlen og køre assertionen igen.
     */
    public static int opgave23_13_svarFejletAssertion() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.14: Fordel ved JUnit - Forbedret Kodedesign
     * ----------------------------------------------------
     * Spørgsmål:
     * Dine noter nævner, at JUnit kan forbedre kodedesign ("Design for Testability"). Hvordan primært?
     *
     * Svarmuligheder:
     * 1. Ved at tvinge brug af bestemte designmønstre i produktionskoden.
     * 2. Ved at opfordre til mindre, fokuserede metoder og klasser med klare ansvarsområder, da disse er nemmere at unit-teste.
     * 3. Ved automatisk at refaktorere kode, så den bliver mere testbar.
     * 4. Ved at kræve, at al kode skrives med `public` synlighed for at lette testadgang.
     */
    public static int opgave23_14_svarForbedretKodedesign() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.15: Testklassens Struktur
     * -----------------------------------
     * Spørgsmål:
     * Hvad er en typisk og anbefalet struktur for en JUnit testklasse i forhold til den klasse, den tester?
     *
     * Svarmuligheder:
     * 1. Testkoden skrives direkte inde i den klasse, der skal testes, i specielle testblokke.
     * 2. Testkoden placeres i en separat klasse, ofte i en parallel mappestruktur (f.eks. `src/test/java`), og navngives typisk med `Test` som suffiks til den testede klasses navn.
     * 3. Alle tests for et helt projekt samles i én enkelt, stor testfil.
     * 4. Testkoden skrives i en `main`-metode i selve den klasse, der testes.
     */
    public static int opgave23_15_svarTestklasseStruktur() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.16: Formål med `@AfterEach`
     * ------------------------------------
     * Spørgsmål:
     * Hvad er et primært formål med en metode annoteret med `@AfterEach` i JUnit 5?
     *
     * Svarmuligheder:
     * 1. At initialisere fælles testdata, før hver testmetode køres.
     * 2. At udføre oprydning (f.eks. frigøre ressourcer, nulstille tilstande) efter hver testmetode er kørt.
     * 3. At logge resultatet af hver testmetode.
     * 4. At køre én gang efter alle tests i klassen er afsluttet for global oprydning.
     */
    public static int opgave23_16_svarFormålMedAfterEach() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.17: Nødvendighed af Assertions
     * ---------------------------------------
     * Spørgsmål:
     * Er det strengt nødvendigt at have en assertion (f.eks. `assertEquals`) i en `@Test` metode for, at den betragtes som en gyldig test af JUnit?
     *
     * Svarmuligheder:
     * 1. Ja, en testmetode uden assertions vil altid blive markeret som fejlet af JUnit.
     * 2. Ja, JUnit vil give en kompileringsfejl, hvis en `@Test` metode mangler en assertion.
     * 3. Nej, en `@Test` metode kan godt bestå uden eksplicitte assertions (f.eks. hvis testen blot verificerer, at en bestemt kodeblok kan udføres uden at kaste en exception, især hvis `assertDoesNotThrow` ikke bruges). Dog er tests uden assertions ofte mindre meningsfulde.
     * 4. Nej, men man skal i stedet bruge `@Verify` annotationen for at markere, at testen er komplet.
     */
    public static int opgave23_17_svarNødvendighedAfAssertions() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.18: Statiske Metoder i Testklasser
     * -------------------------------------------
     * Spørgsmål:
     * Hvilke JUnit 5 setup/teardown annotationer kræver typisk, at den metode de annoterer, er `static`?
     *
     * Svarmuligheder:
     * 1. `@BeforeEach` og `@AfterEach`.
     * 2. `@Test` og `@ParameterizedTest`.
     * 3. `@BeforeAll` og `@AfterAll`.
     * 4. Ingen JUnit annotationer kræver statiske metoder.
     */
    public static int opgave23_18_svarStatiskeMetoderITestklasser() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.19: "Arrange" Delen af AAA
     * ------------------------------------
     * Spørgsmål:
     * I "Arrange, Act, Assert" (AAA) mønsteret, hvad involverer "Arrange"-delen typisk?
     *
     * Svarmuligheder:
     * 1. At kalde den metode, der skal testes.
     * 2. At verificere, at resultatet af metodekaldet er som forventet.
     * 3. At opsætte de nødvendige forudsætninger og input-data for testen, inklusiv oprettelse af objekter.
     * 4. At rydde op efter testen er kørt.
     */
    public static int opgave23_19_svarArrangeDelen() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    /**
     * Opgave 23.20: Fordel ved JUnit - Klare Resultater
     * ------------------------------------------------
     * Spørgsmål:
     * Dine noter nævner, at en fordel ved JUnit er "klare resultater (grøn bjælke)". Hvad betyder dette for udvikleren?
     *
     * Svarmuligheder:
     * 1. At koden automatisk bliver mere effektiv og kører hurtigere.
     * 2. At man hurtigt og visuelt kan se, om alle tests er bestået (succes) eller om der er fejl, hvilket letter fejlfinding.
     * 3. At JUnit genererer en detaljeret rapport om kodens dækningsgrad.
     * 4. At JUnit automatisk foreslår forbedringer til koden, hvis en test fejler.
     */
    public static int opgave23_20_svarFordelKlareResultater() {
        int ditSvar = 0; // TODO
        return ditSvar;
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 23: JUnit (Teoriopgaver) ===");
        System.out.println("Udfyld 'ditSvar' variablerne i hver opgavemetode.");
        System.out.println("Kør derefter Emne23JUnitTeoriOpgaverTest.java for at verificere dine svar.");
    }
}