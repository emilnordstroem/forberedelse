package emne20_arkitektur_teori;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

// Importerer den klasse, der indeholder svarmetoderne.
// Sørg for, at denne er i samme pakke, eller juster importen hvis nødvendigt.
// import static emne20_arkitektur_teori.Emne20ArkitekturTeoriOpgaver.*; // Hvis du vil kalde metoderne direkte uden klassenavn

@DisplayName("Emne 20: Teoriopgaver om Arkitektur (Lagdeling)")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Emne20ArkitekturTeoriOpgaverTest {

    @Test
    @Order(1)
    @DisplayName("Opgave 20.1: Primære Formål med Lagdeling")
    void testOpgave20_1_SvarFormålMedLagdeling() {
        // Korrekt svar: 3. At opnå "Separation of Concerns"...
        assertEquals(3, Emne20ArkitekturTeoriOpgaver.opgave20_1_svarFormålMedLagdeling(),
                "Opgave 20.1: Forkert svar for primære formål med lagdeling.");
    }

    @Test
    @Order(2)
    @DisplayName("Opgave 20.2: De Typiske Tre Lag")
    void testOpgave20_2_SvarDeTreLag() {
        // Korrekt svar: 3. Præsentationslag (GUI), Applikationslag (Forretningslogik), Dataadgangslag (Storage/Persistens).
        assertEquals(3, Emne20ArkitekturTeoriOpgaver.opgave20_2_svarDeTreLag(),
                "Opgave 20.2: Forkert svar for de typiske tre lag i en 3-lagsarkitektur.");
    }

    @Test
    @Order(3)
    @DisplayName("Opgave 20.3: Præsentationslagets (GUI) Ansvar")
    void testOpgave20_3_SvarPræsentationslagetsAnsvar() {
        // Korrekt svar: 3. At præsentere data for brugeren og håndtere brugerens interaktioner med systemet.
        assertEquals(3, Emne20ArkitekturTeoriOpgaver.opgave20_3_svarPræsentationslagetsAnsvar(),
                "Opgave 20.3: Forkert svar for præsentationslagets primære ansvar.");
    }

    @Test
    @Order(4)
    @DisplayName("Opgave 20.4: Applikationslagets (Forretningslogik) Ansvar")
    void testOpgave20_4_SvarApplikationslagetsAnsvar() {
        // Korrekt svar: 2. I Applikationslaget (også kaldet forretningslogiklaget eller servicelaget).
        assertEquals(2, Emne20ArkitekturTeoriOpgaver.opgave20_4_svarApplikationslagetsAnsvar(),
                "Opgave 20.4: Forkert svar for placering af kerneforretningslogik.");
    }

    @Test
    @Order(5)
    @DisplayName("Opgave 20.5: Dataadgangslagets Ansvar")
    void testOpgave20_5_SvarDataadgangslagetsAnsvar() {
        // Korrekt svar: 3. At håndtere den tekniske lagring og hentning af data fra datakilder...
        assertEquals(3, Emne20ArkitekturTeoriOpgaver.opgave20_5_svarDataadgangslagetsAnsvar(),
                "Opgave 20.5: Forkert svar for dataadgangslagets primære ansvar.");
    }

    @Test
    @Order(6)
    @DisplayName("Opgave 20.6: Interaktion mellem Lag (Strikt Lagdeling)")
    void testOpgave20_6_SvarInteraktionMellemLag() {
        // Korrekt svar: 3. Dataadgangslaget kalder direkte metoder i Præsentationslaget...
        assertEquals(3, Emne20ArkitekturTeoriOpgaver.opgave20_6_svarInteraktionMellemLag(),
                "Opgave 20.6: Forkert svar for hvilken interaktion der typisk IKKE er tilladt.");
    }

    @Test
    @Order(7)
    @DisplayName("Opgave 20.7: Placering af Forretningsvalidering")
    void testOpgave20_7_SvarPlaceringAfForretningsvalidering() {
        // Korrekt svar: 3. I Applikationslaget (forretningslogiklaget)...
        assertEquals(3, Emne20ArkitekturTeoriOpgaver.opgave20_7_svarPlaceringAfForretningsvalidering(),
                "Opgave 20.7: Forkert svar for placering af forretningsvalidering.");
    }

    @Test
    @Order(8)
    @DisplayName("Opgave 20.8: Testbarhed i Lagdelt Arkitektur")
    void testOpgave20_8_SvarTestbarhedFordel() {
        // Korrekt svar: 3. Den muliggør, at lag som f.eks. forretningslogiklaget kan unit-testes isoleret...
        assertEquals(3, Emne20ArkitekturTeoriOpgaver.opgave20_8_svarTestbarhedFordel(),
                "Opgave 20.8: Forkert svar for hvordan lagdelt arkitektur forbedrer testbarhed.");
    }

    @Test
    @Order(9)
    @DisplayName("Opgave 20.9: Håndtering af Dataadgangsfejl")
    void testOpgave20_9_SvarHåndteringAfDatafejl() {
        // Korrekt svar: 3. Fange SQLException og kaste en mere generel... exception...
        assertEquals(3, Emne20ArkitekturTeoriOpgaver.opgave20_9_svarHåndteringAfDatafejl(),
                "Opgave 20.9: Forkert svar for håndtering af dataadgangsfejl.");
    }

    @Test
    @Order(10)
    @DisplayName("Opgave 20.10: Udskiftelighed af Lag")
    void testOpgave20_10_SvarUdskiftelighedAfLag() {
        // Korrekt svar: 2. At man kan udskifte implementeringen af et helt lag... med minimal eller ingen påvirkning...
        assertEquals(2, Emne20ArkitekturTeoriOpgaver.opgave20_10_svarUdskiftelighedAfLag(),
                "Opgave 20.10: Forkert svar for hvad udskiftelighed af lag betyder.");
    }
}