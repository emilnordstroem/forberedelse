package emne28_serializable_teori;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

// Importerer den klasse, der indeholder svarmetoderne.
// Sørg for, at denne er i samme pakke, eller juster importen hvis nødvendigt.
// import static emne28_serializable_teori.Emne28SerializableTeoriOpgaver.*; // Hvis du vil kalde metoderne direkte

@DisplayName("Emne 28: Teoriopgaver om Persistering af Objekter (Serializable)")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Emne28SerializableTeoriOpgaverTest {

    @Test
    @Order(1)
    @DisplayName("Opgave 28.1: Formålet med java.io.Serializable")
    void testOpgave28_1_SvarFormaalMedSerializable() {
        // Korrekt svar: 2. At markere klassens objekter som værende egnede til at blive konverteret...
        assertEquals(2, Emne28SerializableTeoriOpgaver.opgave28_1_svarFormaalMedSerializable(),
                "Opgave 28.1: Forkert svar for formålet med Serializable interfacet.");
    }

    @Test
    @Order(2)
    @DisplayName("Opgave 28.2: Metode til Serialisering af Objekt")
    void testOpgave28_2_SvarMetodeTilSerialisering() {
        // Korrekt svar: 3. writeObject(Object obj)
        assertEquals(3, Emne28SerializableTeoriOpgaver.opgave28_2_svarMetodeTilSerialisering(),
                "Opgave 28.2: Forkert metode til serialisering af et objekt.");
    }

    @Test
    @Order(3)
    @DisplayName("Opgave 28.3: Metode og Returtype for Deserialisering")
    void testOpgave28_3_SvarMetodeTilDeserialisering() {
        // Korrekt svar: 2. readObject(), returnerer Object.
        assertEquals(2, Emne28SerializableTeoriOpgaver.opgave28_3_svarMetodeTilDeserialisering(),
                "Opgave 28.3: Forkert metode eller returtype for deserialisering.");
    }

    @Test
    @Order(4)
    @DisplayName("Opgave 28.4: Nøgleordet transient")
    void testOpgave28_4_SvarTransientNøgleord() {
        // Korrekt svar: 3. Variabelen ignoreres under serialiseringsprocessen... default-værdi...
        assertEquals(3, Emne28SerializableTeoriOpgaver.opgave28_4_svarTransientNøgleord(),
                "Opgave 28.4: Forkert forklaring af 'transient' nøgleordet.");
    }

    @Test
    @Order(5)
    @DisplayName("Opgave 28.5: Formålet med serialVersionUID")
    void testOpgave28_5_SvarSerialVersionUIDFormaal() {
        // Korrekt svar: 3. At fungere som et versionsnummer for klassen... kompatibilitet...
        assertEquals(3, Emne28SerializableTeoriOpgaver.opgave28_5_svarSerialVersionUIDFormaal(),
                "Opgave 28.5: Forkert formål med serialVersionUID.");
    }

    @Test
    @Order(6)
    @DisplayName("Opgave 28.6: Serialisering af Objektgrafer")
    void testOpgave28_6_SvarObjektgrafSerialisering() {
        // Korrekt svar: 3. Både Bestilling-objektet og det refererede KundeInfo-objekt... bliver automatisk serialiseret...
        assertEquals(3, Emne28SerializableTeoriOpgaver.opgave28_6_svarObjektgrafSerialisering(),
                "Opgave 28.6: Forkert forståelse af serialisering af objektgrafer.");
    }

    @Test
    @Order(7)
    @DisplayName("Opgave 28.7: Klasseændring - Tilføjelse af Nyt Felt")
    void testOpgave28_7_SvarKlasseændringTilføjFelt() {
        // Korrekt svar: 2. Deserialiseringen vil typisk lykkes, og det nye lagerStatus-felt... vil blive initialiseret til sin default-værdi...
        assertEquals(2, Emne28SerializableTeoriOpgaver.opgave28_7_svarKlasseændringTilføjFelt(),
                "Opgave 28.7: Forkert konsekvens af at tilføje felt til Serializable klasse (med samme serialVersionUID).");
    }

    @Test
    @Order(8)
    @DisplayName("Opgave 28.8: Hvad returnerer ObjectInputStream.readObject()?")
    void testOpgave28_8_SvarReadObjectReturtype() {
        // Korrekt svar: 3. Den returneres som typen Object og skal derfor typecastes...
        assertEquals(3, Emne28SerializableTeoriOpgaver.opgave28_8_svarReadObjectReturtype(),
                "Opgave 28.8: Forkert håndtering af returtypen fra readObject().");
    }

    @Test
    @Order(9)
    @DisplayName("Opgave 28.9: Felt af Ikke-Serializable Type")
    void testOpgave28_9_SvarIkkeSerializableFelt() {
        // Korrekt svar: 2. Der ville blive kastet en java.io.NotSerializableException...
        assertEquals(2, Emne28SerializableTeoriOpgaver.opgave28_9_svarIkkeSerializableFelt(),
                "Opgave 28.9: Forkert konsekvens af at have et ikke-transient, ikke-Serializable felt.");
    }

    @Test
    @Order(10)
    @DisplayName("Opgave 28.10: Sikkerhed ved Deserialisering")
    void testOpgave28_10_SvarSikkerhedVedDeserialisering() {
        // Korrekt svar: 3. Det kan potentielt føre til udførelse af ondsindet kode...
        assertEquals(3, Emne28SerializableTeoriOpgaver.opgave28_10_svarSikkerhedVedDeserialisering(),
                "Opgave 28.10: Forkert forståelse af sikkerhedsrisiko ved deserialisering fra upålidelige kilder.");
    }
}