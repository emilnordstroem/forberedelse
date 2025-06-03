package emne19_exceptions;

import java.io.FileReader; // Eksempel, ikke direkte brugt i opgaverne med mindre du simulerer
import java.io.IOException;  // Eksempel
import java.util.ArrayList;
import java.util.List;

/**
 * Generel Beskrivelse for Opgavesættet Emne 19: Exceptions
 * ========================================================
 * Dette opgavesæt fokuserer på Emne 19: Exceptions i Java.
 * Formålet er at øve korrekt brug af exception handling, herunder at fange
 * standard exceptions, kaste standard og custom exceptions, anvende try-catch-finally
 * blokke, og forstå forskellen på checked og unchecked exceptions samt throws-klausulen.
 * Opret separate .java filer for custom exceptions og de klasser, der skal defineres.
 */
public class Emne19Exceptions {

    /**
     * Opgave 19.1: Sikker Division
     * ---------------------------
     * Beskrivelse:
     * Implementer en statisk metode `double dividerSikkert(int tæller, int nævner)`.
     * Metoden skal returnere resultatet af `tæller / nævner`.
     * Hvis `nævner` er 0, skal metoden fange den `ArithmeticException`, der opstår,
     * og i stedet returnere `Double.NaN` (Not a Number).
     *
     * TODO: Implementer metoden med try-catch.
     */
    public static double opgave19_1_dividerSikkert(int tæller, int nævner) {
        // TODO: Implementer sikker division.
        return 0.0; // Placeholder
    }

    /**
     * Opgave 19.2: Parsning af Talstreng med Fejlhåndtering
     * ----------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `int parseHeltalMedDefault(String talStreng, int defaultVærdi)`.
     * Metoden skal forsøge at parse `talStreng` til en `int` ved hjælp af `Integer.parseInt()`.
     * Hvis en `NumberFormatException` opstår (f.eks. hvis strengen er "abc"),
     * skal metoden fange exceptionen og returnere `defaultVærdi`.
     * Hvis `talStreng` er `null`, skal den også returnere `defaultVærdi` (overvej hvordan du fanger/tjekker dette).
     *
     * TODO: Implementer metoden med try-catch for NumberFormatException og tjek for null input.
     */
    public static int opgave19_2_parseHeltalMedDefault(String talStreng, int defaultVærdi) {
        // TODO: Implementer parsning med fejlhåndtering.
        return 0; // Placeholder
    }

    /**
     * Opgave 19.3: Sikker Adgang til Array-element
     * --------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `String hentElementSikkert(String[] array, int indeks)`.
     * Metoden skal forsøge at returnere elementet på `array[indeks]`.
     * - Hvis `array` er `null`, fang `NullPointerException` og returner strengen "Fejl: Array er null.".
     * - Hvis `indeks` er uden for arrayets grænser, fang `ArrayIndexOutOfBoundsException` og returner "Fejl: Indeks ude af grænser.".
     * - Hvis ingen fejl opstår, returner det fundne element.
     *
     * TODO: Implementer metoden med flere catch-blokke.
     */
    public static String opgave19_3_hentElementSikkert(String[] array, int indeks) {
        // TODO: Implementer sikker array-adgang.
        return null; // Placeholder
    }

    /**
     * Opgave 19.4: Validering af Input med `IllegalArgumentException`
     * -------------------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `void validerPositivtBeløb(double beløb, String fejlBeskedPrefix)`.
     * - Hvis `beløb` er mindre end 0, skal metoden kaste en `IllegalArgumentException`.
     * Exceptionens besked skal være `fejlBeskedPrefix` efterfulgt af ": Beløb må ikke være negativt.".
     * - Ellers (hvis beløb er >= 0) skal metoden ikke gøre noget (eller printe "Beløb valideret" for test).
     *
     * TODO: Implementer metoden, der kaster en exception ved ugyldigt input.
     */
    public static void opgave19_4_validerPositivtBeløb(double beløb, String fejlBeskedPrefix) {
        // TODO: Implementer validering og kast af IllegalArgumentException.
    }

    /**
     * Opgave 19.5: Custom Checked Exception - `UtilstrækkeligSaldoException`
     * ----------------------------------------------------------------------
     * Filnavne: UtilstrækkeligSaldoException.java, BankKontoChecked.java
     *
     * Beskrivelse:
     * 1. Definér en custom *checked* exception `UtilstrækkeligSaldoException` (nedarver fra `Exception`).
     * - Den skal have en konstruktør, der tager en `String message` og et `double manglendeBeløb`.
     * - Den skal have en get-metode `getManglendeBeløb()`.
     * 2. Klasse `BankKontoChecked`:
     * - Attribut (private): `saldo` (double). Konstruktør `BankKontoChecked(double startSaldo)`.
     * - Metode `void hæv(double beløb) throws UtilstrækkeligSaldoException`:
     * - Hvis `beløb > saldo`, kast en ny `UtilstrækkeligSaldoException` med passende besked
     * og det beløb, der mangler for at gennemføre hævningen.
     * - Ellers, reducer saldoen.
     *
     * TODO: Opret UtilstrækkeligSaldoException.java og BankKontoChecked.java. Implementer.
     */

    /**
     * Opgave 19.6: Custom Unchecked Exception - `DataFormatFejlException`
     * -------------------------------------------------------------------
     * Filnavne: DataFormatFejlException.java, DataProcessor.java
     *
     * Beskrivelse:
     * 1. Definér en custom *unchecked* exception `DataFormatFejlException` (nedarver fra `RuntimeException`).
     * - Den skal have en konstruktør, der tager en `String message`.
     * 2. Klasse `DataProcessor`:
     * - Metode `int behandlDataLinje(String dataLinje)`:
     * - En data linje forventes at være på formatet "TYPE:VÆRDI" (f.eks., "ALDER:35").
     * - Hvis `dataLinje` er `null`, tom, ikke indeholder ':', eller hvis VÆRDI-delen efter ':'
     * ikke kan parses til et heltal, skal metoden kaste en `DataFormatFejlException`
     * med en beskrivende fejlbesked.
     * - Ellers, returner den parsede heltalsværdi.
     *
     * TODO: Opret DataFormatFejlException.java og DataProcessor.java. Implementer.
     */

    /**
     * Opgave 19.7: Brug af `try-catch-finally` til Simuleret Ressourcehåndtering
     * --------------------------------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `String simulerRessourceBehandling(boolean fremprovokerFejl)`:
     * - Metoden skal returnere en log-streng, der opsummerer operationerne.
     * - Start med at tilføje "Ressource åbnes..." til loggen.
     * - I en `try`-blok:
     * - Tilføj "Ressource i brug..." til loggen.
     * - Hvis `fremprovokerFejl` er `true`, kast en ny `IOException("Simuleret I/O fejl under brug")`.
     * - Tilføj "Ressource brug afsluttet." til loggen (kun hvis ingen fejl).
     * - I en `catch`-blok for `IOException`:
     * - Tilføj "FEJL fanget: [exceptionens besked]" til loggen.
     * - I en `finally`-blok:
     * - Tilføj "Ressource lukkes..." til loggen. Dette skal *altid* ske.
     * - Returner den samlede log-streng.
     *
     * TODO: Implementer metoden med korrekt try-catch-finally struktur.
     */
    public static String opgave19_7_simulerRessourceBehandling(boolean fremprovokerFejl) throws IOException { // Throws for at vise man kan videresende
        // TODO: Implementer simuleret ressourcebehandling.
        return ""; // Placeholder
    }

    /**
     * Opgave 19.8: Propagering af Checked Exception (`throws` klausul)
     * ---------------------------------------------------------------
     * Filnavne: KonfigurationsFejl.java (custom checked exception), KonfigurationsLoader.java
     *
     * Beskrivelse:
     * 1. Definér en custom *checked* exception `KonfigurationsFejl extends Exception`.
     * - Konstruktør der tager en `String message`.
     * 2. Klasse `KonfigurationsLoader`:
     * - Metode `String læsKonfigurationsVærdi(String nøgle, Map<String, String> konfiguration) throws KonfigurationsFejl`:
     * - Hvis `konfiguration` er `null` eller ikke indeholder `nøgle`, kast en ny `KonfigurationsFejl`
     * med en besked som "Nøgle '[nøgle]' ikke fundet i konfiguration.".
     * - Ellers, returner værdien for nøglen.
     * - Metode `String initialiserSystem(Map<String, String> config)`:
     * - Denne metode kalder `læsKonfigurationsVærdi` for at hente f.eks. "DATABASE_URL" og "PORT".
     * - Den skal bruge `try-catch` til at håndtere `KonfigurationsFejl`.
     * - Hvis en fejl fanges, returner "System initialisering fejlet: [fejlbesked fra exception]".
     * - Hvis alt går godt, returner "System initialiseret med URL=[url] på Port=[port]".
     *
     * TODO: Opret KonfigurationsFejl.java og KonfigurationsLoader.java. Implementer.
     */

    /**
     * Opgave 19.9: Multiple Catch Blokke og Exception Hierarki
     * -------------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `String behandlDiverseInput(Object input)`:
     * - Metoden skal forsøge at behandle `input` på forskellige måder og returnere en beskrivelse af resultatet.
     * - Brug en `try`-blok.
     * - Indeni `try`:
     * 1. Hvis `input` er en `String`:
     * a. Forsøg at parse den til en `Integer`. Hvis det lykkes, returner "Heltal: [værdi]".
     * b. Hvis `NumberFormatException` opstår under heltals-parsning, forsøg at parse den til en `Double`.
     * Hvis det lykkes, returner "Decimaltal: [værdi]".
     * c. Hvis `NumberFormatException` også opstår for double-parsning, returner "Tekststreng: [input]".
     * 2. Hvis `input` er en `List` (tjek med `instanceof`):
     * a. Forsøg at tilgå element på indeks 10 (dette vil sandsynligvis kaste `IndexOutOfBoundsException` for de fleste lister).
     * Returner ikke noget her, lad fejlen blive fanget.
     * 3. Hvis `input` er `null`, kast en `NullPointerException` manuelt.
     * - Efter `try`-blokken, hav `catch`-blokke for:
     * - `NumberFormatException`: Returner "Input var en streng, men ikke et gyldigt tal."
     * - `IndexOutOfBoundsException`: Returner "Input var en liste, men adgang var udenfor grænser."
     * - `NullPointerException`: Returner "Input var null."
     * - `Exception` (som en generel opsamler): Returner "En uventet fejl opstod: [exception klasse navn]".
     * - Hvis ingen exceptions fanges (f.eks. hvis input ikke er en String eller List), returner "Ukendt input type."
     *
     * TODO: Implementer metoden med try og multiple catch-blokke.
     */
    public static String opgave19_9_behandlDiverseInput(Object input) {
        // TODO: Implementer behandling med multiple catch.
        return "Ikke implementeret"; // Placeholder
    }

    /**
     * Opgave 19.10: Teoretisk - Checked vs. Unchecked Exceptions
     * ----------------------------------------------------------
     * Spørgsmål:
     * Hvad er den primære forskel på, hvordan Java-kompilatoren behandler `checked exceptions`
     * versus `unchecked exceptions` (som `RuntimeException` og dens subklasser)?
     * Og hvad signalerer de typisk hver især?
     *
     * Svarmuligheder:
     * 1. Checked exceptions skal altid fanges med try-catch; unchecked exceptions må aldrig fanges. Checked signalerer programmeringsfejl, unchecked signalerer eksterne fejl.
     * 2. Kompilatoren tvinger håndtering (catch eller throws) af checked exceptions; for unchecked er det valgfrit. Checked exceptions signalerer ofte fejlforhold, som et robust program bør kunne forudse og potentielt komme sig over (f.eks. fil ikke fundet). Unchecked exceptions signalerer ofte programmeringsfejl (f.eks. null pointer) eller kritiske runtime fejl.
     * 3. Unchecked exceptions skal altid erklæres med `throws` i metode-signaturen; checked exceptions behøver ikke. Unchecked er for fejl uden for programmets kontrol, checked er for interne logikfejl.
     * 4. Der er ingen forskel i kompilatorens behandling; forskellen er kun en navngivningskonvention. Begge typer signalerer alvorlige, ukontrollerbare fejl.
     *
     * TODO: Sæt variablen 'ditSvar' i metoden opgave19_10_svarCheckedVsUnchecked() til det korrekte svar-nummer (1-4).
     */
    public static int opgave19_10_svarCheckedVsUnchecked() {
        int ditSvar = 0;
        // TODO: Sæt ditSvar til 1, 2, 3 eller 4.
        return ditSvar;
    }


    public static void main(String[] args) {
        System.out.println("=== Emne 19: Exceptions - Main metode til VALGFRI manuel test ===");
    }
}