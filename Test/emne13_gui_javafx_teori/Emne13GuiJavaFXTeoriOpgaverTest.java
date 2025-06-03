package emne13_gui_javafx_teori;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

// Importerer den klasse, der indeholder svarmetoderne.
// Sørg for, at denne er i samme pakke, eller juster importen.
// import static emne13_gui_javafx_teori.Emne13GuiJavaFXTeoriOpgaver.*; // Hvis du vil kalde metoderne direkte

@DisplayName("Emne 13: Teoriopgaver om GUI og JavaFX")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Emne13GuiJavaFXTeoriOpgaverTest {

    @Test
    @Order(1)
    @DisplayName("Opgave 13.1: Grundlæggende JavaFX Struktur")
    void testOpgave13_1_SvarGrundStruktur() {
        // Korrekt svar: 2. javafx.application.Application og implementere start(Stage primaryStage).
        assertEquals(2, Emne13GuiJavaFXTeoriOpgaver.opgave13_1_svarGrundStruktur(),
                "Opgave 13.1: Forkert svar for grundlæggende JavaFX struktur.");
    }

    @Test
    @Order(2)
    @DisplayName("Opgave 13.2: Scene Graph Hierarki")
    void testOpgave13_2_SvarSceneGraph() {
        // Korrekt svar: 3. Nodes (Knuder)
        assertEquals(3, Emne13GuiJavaFXTeoriOpgaver.opgave13_2_svarSceneGraph(),
                "Opgave 13.2: Forkert svar for grundlæggende byggeblokke i en Scene.");
    }

    @Test
    @Order(3)
    @DisplayName("Opgave 13.3: Event Handlers Rolle i Lagdelt Arkitektur")
    void testOpgave13_3_SvarEventHandlerRolle() {
        // Korrekt svar: 3. At opsamle input..., kalde en metode i en Controller-klasse..., opdatere GUI...
        assertEquals(3, Emne13GuiJavaFXTeoriOpgaver.opgave13_3_svarEventHandlerRolle(),
                "Opgave 13.3: Forkert svar for Event Handlerens rolle.");
    }

    @Test
    @Order(4)
    @DisplayName("Opgave 13.4: Layout Panes")
    void testOpgave13_4_SvarLayoutPanes() {
        // Korrekt svar: 3. Layout Pane (f.eks. VBox, GridPane, BorderPane)
        assertEquals(3, Emne13GuiJavaFXTeoriOpgaver.opgave13_4_svarLayoutPanes(),
                "Opgave 13.4: Forkert svar for komponent til arrangering af UI-elementer.");
    }

    @Test
    @Order(5)
    @DisplayName("Opgave 13.5: Stage vs. Scene")
    void testOpgave13_5_SvarStageVsScene() {
        // Korrekt svar: 2. En Stage er selve topniveau-vinduet, og den indeholder én Scene ad gangen...
        assertEquals(2, Emne13GuiJavaFXTeoriOpgaver.opgave13_5_svarStageVsScene(),
                "Opgave 13.5: Forkert svar for forholdet mellem Stage og Scene.");
    }

    @Test
    @Order(6)
    @DisplayName("Opgave 13.6: Håndtering af Brugerinput fra TextField")
    void testOpgave13_6_SvarTextFieldInput() {
        // Korrekt svar: 2. gemKnap.setOnAction(event -> { String tekst = navnInputFelt.getText(); ... });
        assertEquals(2, Emne13GuiJavaFXTeoriOpgaver.opgave13_6_svarTextFieldInput(),
                "Opgave 13.6: Forkert svar for håndtering af input fra TextField via knap.");
    }

    @Test
    @Order(7)
    @DisplayName("Opgave 13.7: Hvorfor Adskille GUI og Forretningslogik?")
    void testOpgave13_7_SvarAdskillelseFordel() {
        // Korrekt svar: 3. Det gør det nemmere at ændre GUI'en uden at skulle omskrive forretningslogikken...
        assertEquals(3, Emne13GuiJavaFXTeoriOpgaver.opgave13_7_svarAdskillelseFordel(),
                "Opgave 13.7: Forkert svar for primær fordel ved adskillelse af GUI og forretningslogik.");
    }

    @Test
    @Order(8)
    @DisplayName("Opgave 13.8: Opdatering af GUI fra Controller")
    void testOpgave13_8_SvarOpdaterGuiFraController() {
        // Korrekt svar: 2. Controller-metoden returnerer resultatet..., og event handleren bruger så dette resultat...
        assertEquals(2, Emne13GuiJavaFXTeoriOpgaver.opgave13_8_svarOpdaterGuiFraController(),
                "Opgave 13.8: Forkert svar for hvordan GUI typisk opdateres fra en controller.");
    }

    @Test
    @Order(9)
    @DisplayName("Opgave 13.9: Standard JavaFX UI Controls")
    void testOpgave13_9_SvarIkkeFxControl() {
        // Korrekt svar: 3. javax.swing.JButton (er en Swing komponent)
        assertEquals(3, Emne13GuiJavaFXTeoriOpgaver.opgave13_9_svarIkkeFxControl(),
                "Opgave 13.9: Forkert svar for hvilken komponent der IKKE er en standard JavaFX UI kontrol.");
    }

    @Test
    @Order(10)
    @DisplayName("Opgave 13.10: JavaFX Properties og Data Binding")
    void testOpgave13_10_SvarFordelVedProperties() {
        // Korrekt svar: 2. De muliggør "data binding"...
        assertEquals(2, Emne13GuiJavaFXTeoriOpgaver.opgave13_10_svarFordelVedProperties(),
                "Opgave 13.10: Forkert svar for central fordel ved JavaFX Properties.");
    }
}