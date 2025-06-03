package emne08_indkapsling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

// Importerer den klasse, der indeholder svarmetoderne.
// Sørg for, at denne er i samme pakke, eller juster importen.
// import static emne08_indkapsling.Emne08IndkapslingTeoriOpgaver.*; // Hvis du vil kalde metoderne direkte

@DisplayName("Emne 8: Teoriopgaver om Indkapsling og Afskærmning")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Emne08IndkapslingTeoriOpgaverTest {

    @Test
    @Order(1)
    @DisplayName("Opgave 8.1: Korrekt Access Modifier for saldo")
    void testOpgave8_1_SvarAccessModifierSaldo() {
        // Korrekt svar: 2 (private)
        assertEquals(2, Emne08IndkapslingTeoriOpgaver.opgave8_1_svarAccessModifierSaldo(),
                "Opgave 8.1: Forkert valg for access modifier til 'saldo'. 'private' er mest passende for stærk indkapsling.");
    }

    @Test
    @Order(2)
    @DisplayName("Opgave 8.2: Getter for Mutabel Liste")
    void testOpgave8_2_SvarGetterForMutabelListe() {
        // Korrekt svar: 2 (Returner en kopi af listen)
        assertEquals(2, Emne08IndkapslingTeoriOpgaver.opgave8_2_svarGetterForMutabelListe(),
                "Opgave 8.2: Forkert løsning for getter til mutabel liste. At returnere en kopi (eller unmodifiable view) er bedst.");
    }

    @Test
    @Order(3)
    @DisplayName("Opgave 8.3: Validering i Setter-metode")
    void testOpgave8_3_SvarSetterValidering() {
        // Korrekt svar: 3 (Kaste en IllegalArgumentException)
        assertEquals(3, Emne08IndkapslingTeoriOpgaver.opgave8_3_svarSetterValidering(),
                "Opgave 8.3: Forkert reaktion på ugyldigt input i setter. At kaste en exception er ofte bedste praksis.");
    }

    @Test
    @Order(4)
    @DisplayName("Opgave 8.4: Ansvarsplacering for Metode (totalPrisMedMoms)")
    void testOpgave8_4_SvarAnsvarsplacering() {
        // Korrekt svar: 3 (Som en private metode i Ordre-klassen, der kaldes internt)
        assertEquals(3, Emne08IndkapslingTeoriOpgaver.opgave8_4_svarAnsvarsplacering(),
                "Opgave 8.4: Forkert ansvarsplacering. Interne metoder i klassen selv sikrer bedst dataintegritet.");
    }

    @Test
    @Order(5)
    @DisplayName("Opgave 8.5: Utilsigtet Modifikation via Getter (Motor)")
    void testOpgave8_5_SvarUtilsigtetModifikation() {
        // Korrekt svar: 2 (Ja, returnerer reference til internt objekt)
        assertEquals(2, Emne08IndkapslingTeoriOpgaver.opgave8_5_svarUtilsigtetModifikation(),
                "Opgave 8.5: Forkert vurdering af indkapslingsproblem. Returnering af reference til mutabelt internt objekt er et problem.");
    }

    @Test
    @Order(6)
    @DisplayName("Opgave 8.6: Immutabilitet og final Attributter")
    void testOpgave8_6_SvarImmutabilitetFinal() {
        // Korrekt svar: 2 (Kun public get-metoder. Ingen set-metoder)
        assertEquals(2, Emne08IndkapslingTeoriOpgaver.opgave8_6_svarImmutabilitetFinal(),
                "Opgave 8.6: Forkert valg af metoder for final attributter i immutable klasse. Kun getters er passende.");
    }

    @Test
    @Order(7)
    @DisplayName("Opgave 8.7: protected vs. private i Superklasse")
    void testOpgave8_7_SvarProtectedVsPrivate() {
        // Korrekt svar: 3 (protected)
        assertEquals(3, Emne08IndkapslingTeoriOpgaver.opgave8_7_svarProtectedVsPrivate(),
                "Opgave 8.7: Forkert access modifier for metode, subklasser skal bruge. 'protected' er bedst her.");
    }

    @Test
    @Order(8)
    @DisplayName("Opgave 8.8: Princippet om Information Hiding")
    void testOpgave8_8_SvarInformationHiding() {
        // Korrekt svar: 4 (Reducere kompleksitet og afhængigheder...)
        assertEquals(4, Emne08IndkapslingTeoriOpgaver.opgave8_8_svarInformationHiding(),
                "Opgave 8.8: Forkert formål med Information Hiding. Fokus er på at reducere afhængigheder og kompleksitet.");
    }

    @Test
    @Order(9)
    @DisplayName("Opgave 8.9: Konsekvens af Public Attributter")
    void testOpgave8_9_SvarPublicAttributKonsekvens() {
        // Korrekt svar: 2 (Andre dele kan direkte ændre til ugyldige værdier...)
        assertEquals(2, Emne08IndkapslingTeoriOpgaver.opgave8_9_svarPublicAttributKonsekvens(),
                "Opgave 8.9: Forkert konsekvens af public attributter. Ugyldige tilstandsændringer er en primær risiko.");
    }

    @Test
    @Order(10)
    @DisplayName("Opgave 8.10: Fordele ved Indkapsling for Kompleks Klasse")
    void testOpgave8_10_SvarFordelVedIndkapsling() {
        // Korrekt svar: 3 (Indkapsling skjuler den interne kompleksitet...)
        assertEquals(3, Emne08IndkapslingTeoriOpgaver.opgave8_10_svarFordelVedIndkapsling(),
                "Opgave 8.10: Forkert fordel ved indkapsling. At skjule kompleksitet og tillade interne refaktoreringer er centralt.");
    }
}