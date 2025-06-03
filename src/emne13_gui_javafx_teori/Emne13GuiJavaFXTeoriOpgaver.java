package emne13_gui_javafx_teori;

/**
 * Generel Beskrivelse for Opgavesættet Emne 13: GUI og JavaFX (Teori)
 * ====================================================================
 * Dette opgavesæt fokuserer på Emne 13: GUI og JavaFX.
 * Formålet er at teste din teoretiske forståelse af centrale JavaFX-koncepter,
 * event-håndtering, og principper for design af grafiske brugergrænseflader,
 * herunder interaktionen mellem GUI-laget og et controller-lag.
 * For hver opgave skal du sætte den tilhørende 'ditSvar'-variabel i metoden
 * til nummeret på den svarmulighed, du anser for mest korrekt.
 */
public class Emne13GuiJavaFXTeoriOpgaver {

    /**
     * Opgave 13.1: Grundlæggende JavaFX Struktur
     * -----------------------------------------
     * Spørgsmål:
     * Hvilken klasse skal en typisk JavaFX-applikations hovedklasse nedarve fra,
     * og hvilken metode skal den primært implementere for at starte GUI'en?
     * <p>
     * Svarmuligheder:
     * 1. `javafx.scene.Application` og implementere `initGui(Window w)`.
     * 2. `javafx.application.Application` og implementere `start(Stage primaryStage)`.
     * 3. `javafx.stage.Stage` og implementere `showScene(Scene s)`.
     * 4. `java.awt.Frame` og implementere `paint(Graphics g)`.
     */
    public static int opgave13_1_svarGrundStruktur() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.2: Scene Graph Hierarki
     * ---------------------------------
     * Spørgsmål:
     * I JavaFX, hvad er de grundlæggende byggeblokke i en `Scene`, som organiseres
     * i et hierarki (scene graph)?
     * <p>
     * Svarmuligheder:
     * 1. Pixels
     * 2. Components
     * 3. Nodes (Knuder)
     * 4. EventListeners
     */
    public static int opgave13_2_svarSceneGraph() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.3: Event Handlers Rolle i Lagdelt Arkitektur
     * ------------------------------------------------------
     * Problemstilling:
     * En JavaFX applikation har et `TextField` hvor brugeren indtaster data, og en `Button`.
     * Når knappen trykkes, skal data valideres og gemmes i en database.
     * <p>
     * Spørgsmål:
     * Hvad er den primære opgave for knappens event handler (`setOnAction`) i GUI-laget,
     * ifølge principperne for god lagdelt arkitektur?
     * <p>
     * Svarmuligheder:
     * 1. At direkte skrive SQL-kode til at indsætte data i databasen.
     * 2. At validere inputtet, oprette et model-objekt, og kalde en metode i et data-lag for at gemme objektet.
     * 3. At opsamle input fra `TextField`, kalde en metode i en `Controller`-klasse med dette input, og derefter opdatere GUI'en baseret på controllerens svar.
     * 4. At udføre al validering og forretningslogik direkte i event handleren for at holde koden samlet.
     */
    public static int opgave13_3_svarEventHandlerRolle() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.4: Layout Panes
     * -------------------------
     * Spørgsmål:
     * Hvilken type JavaFX-komponent bruges typisk til at arrangere andre UI-elementer
     * (som knapper og tekstfelter) i en `Scene`, f.eks. i en lodret kolonne eller et gitter?
     * <p>
     * Svarmuligheder:
     * 1. `EventPane`
     * 2. `WidgetContainer`
     * 3. `Layout Pane` (f.eks. `VBox`, `GridPane`, `BorderPane`)
     * 4. `StyleSheet`
     */
    public static int opgave13_4_svarLayoutPanes() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.5: `Stage` vs. `Scene`
     * ------------------------------
     * Spørgsmål:
     * Hvad er forholdet mellem en `Stage` og en `Scene` i JavaFX?
     * <p>
     * Svarmuligheder:
     * 1. En `Scene` indeholder flere `Stage`s.
     * 2. En `Stage` er selve topniveau-vinduet, og den indeholder én `Scene` ad gangen, som definerer vinduets indhold.
     * 3. `Stage` og `Scene` er synonymer for det samme koncept.
     * 4. En `Stage` er en UI-kontrol (som en knap), mens en `Scene` er en layout container.
     */
    public static int opgave13_5_svarStageVsScene() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.6: Håndtering af Brugerinput fra TextField
     * ---------------------------------------------------
     * Problemstilling:
     * Du har et `TextField` ved navn `navnInputFelt` og en `Button` ved navn `gemKnap`.
     * <p>
     * Spørgsmål:
     * Hvordan vil du typisk tilknytte en handling til `gemKnap`, så den læser teksten
     * fra `navnInputFelt`, når der klikkes på knappen?
     * <p>
     * Svarmuligheder:
     * 1. `gemKnap.addActionListener(event -> String tekst = navnInputFelt.getText());`
     * 2. `gemKnap.setOnAction(event -> { String tekst = navnInputFelt.getText(); yderligere logik  });`
     * 3. `navnInputFelt.onTextChange(new Handler() { public void handle() { String tekst = navnInputFelt.getText(); } });`
     * 4. `gemKnap.setClickHandler("læsTekstFraNavnInputFelt");`
     */
    public static int opgave13_6_svarTextFieldInput() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.7: Hvorfor Adskille GUI og Forretningslogik?
     * -----------------------------------------------------
     * Spørgsmål:
     * Hvad er en primær fordel ved at adskille GUI-kode (views) fra forretningslogik
     * (controller/model) i en JavaFX applikation?
     * <p>
     * Svarmuligheder:
     * 1. Det gør altid programmet hurtigere at køre.
     * 2. Det reducerer antallet af nødvendige klasser i projektet.
     * 3. Det gør det nemmere at ændre GUI'en uden at skulle omskrive forretningslogikken, og omvendt, samt forbedrer testbarheden af forretningslogikken.
     * 4. Det er et krav fra JavaFX frameworket for at kunne kompilere.
     */
    public static int opgave13_7_svarAdskillelseFordel() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.8: Opdatering af GUI fra Controller
     * ---------------------------------------------
     * Problemstilling:
     * En event handler i GUI'en kalder en metode i en `Controller`-klasse. Controller-metoden
     * udfører en beregning og skal returnere et resultat, der skal vises i en `Label` i GUI'en.
     * <p>
     * Spørgsmål:
     * Hvordan får event handleren typisk resultatet tilbage fra controlleren og opdaterer `Label`'en?
     * <p>
     * Svarmuligheder:
     * 1. Controlleren opdaterer direkte `Label`-objektet, da den har en reference til det.
     * 2. Controller-metoden returnerer resultatet (f.eks. en String eller et dataobjekt), og event handleren bruger så dette resultat til at kalde `setText()` på `Label`'en.
     * 3. `Label`'en observerer automatisk ændringer i controlleren via data binding uden kode i event handleren.
     * 4. Event handleren skal periodisk polle controlleren for et opdateret resultat.
     */
    public static int opgave13_8_svarOpdaterGuiFraController() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.9: Standard JavaFX UI Controls
     * ----------------------------------------
     * Spørgsmål:
     * Hvilken af følgende er IKKE en standard UI kontrol (Node) i JavaFX?
     * <p>
     * Svarmuligheder:
     * 1. `javafx.scene.control.Button`
     * 2. `javafx.scene.control.ListView`
     * 3. `javax.swing.JButton`
     * 4. `javafx.scene.control.CheckBox`
     */
    public static int opgave13_9_svarIkkeFxControl() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 13.10: JavaFX Properties og Data Binding (Konceptuelt)
     * -----------------------------------------------------------
     * Spørgsmål:
     * JavaFX introducerer "Properties" (f.eks. `StringProperty`, `IntegerProperty`).
     * Hvad er en central fordel ved at bruge disse properties i forbindelse med GUI-elementer?
     * <p>
     * Svarmuligheder:
     * 1. De gør koden mere kompleks, men tillader brug af ældre Java-versioner.
     * 2. De muliggør "data binding", hvor ændringer i en property automatisk kan opdatere GUI-elementer (og omvendt), hvilket reducerer behovet for manuel opdateringskode.
     * 3. De bruges udelukkende til at formatere strenge, der vises i GUI'en.
     * 4. De erstatter helt behovet for event handlers til knapper.
     */
    public static int opgave13_10_svarFordelVedProperties() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 13: GUI og JavaFX (Teoriopgaver) ===");
        System.out.println("Udfyld 'ditSvar' variablerne i hver opgavemetode.");
        System.out.println("Kør derefter Emne13GuiJavaFXTeoriOpgaverTest.java for at verificere dine svar.");
    }
}