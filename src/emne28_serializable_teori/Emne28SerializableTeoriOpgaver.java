package emne28_serializable_teori;

/**
 * Generel Beskrivelse for Opgavesættet Emne 28: Persister objekter (Serializable - Teori)
 * ========================================================================================
 * Dette opgavesæt fokuserer på Emne 28: Persistering af objekter ved hjælp af Java Serialisering.
 * Formålet er at teste din teoretiske forståelse af Serializable-interfacet,
 * processen for serialisering og deserialisering, nøgleordet transient,
 * serialVersionUID, og hvordan klasseændringer kan påvirke processen.
 * For hver opgave skal du sætte den tilhørende 'ditSvar'-variabel i metoden
 * til nummeret på den svarmulighed, du anser for mest korrekt.
 */
public class Emne28SerializableTeoriOpgaver {

    /**
     * Opgave 28.1: Formålet med `java.io.Serializable`
     * -------------------------------------------------
     * Spørgsmål:
     * Hvad er det primære formål med, at en klasse implementerer `java.io.Serializable` interfacet i Java?
     *
     * Svarmuligheder:
     * 1. At gøre klassens objekter "immutable" (uforanderlige).
     * 2. At markere klassens objekter som værende egnede til at blive konverteret til en byte-strøm (serialiseret) og genskabt fra en byte-strøm (deserialiseret) af Java's standard serialiseringsmekanisme.
     * 3. At give klassen metoder til at interagere direkte med en SQL-database.
     * 4. At sikre, at klassen er trådsikker (thread-safe) i multitrådede applikationer.
     */
    public static int opgave28_1_svarFormaalMedSerializable() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.2: Metode til Serialisering af Objekt
     * ----------------------------------------------
     * Spørgsmål:
     * Hvilken metode på klassen `java.io.ObjectOutputStream` anvendes typisk til at skrive (serialisere) et objekt til en output stream?
     *
     * Svarmuligheder:
     * 1. `saveObject(Object obj)`
     * 2. `serializeObject(Object obj)`
     * 3. `writeObject(Object obj)`
     * 4. `persist(Object obj)`
     */
    public static int opgave28_2_svarMetodeTilSerialisering() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.3: Metode og Returtype for Deserialisering
     * ----------------------------------------------------
     * Spørgsmål:
     * Hvilken metode på `java.io.ObjectInputStream` bruges til at læse (deserialisere) et objekt fra en input stream, og hvad er den umiddelbare returtype for denne metode?
     *
     * Svarmuligheder:
     * 1. `loadObject()`, returnerer den specifikke type af det deserialiserede objekt.
     * 2. `readObject()`, returnerer `Object`.
     * 3. `deserializeObject()`, returnerer `byte[]`.
     * 4. `getObject()`, returnerer `java.io.Serializable`.
     */
    public static int opgave28_3_svarMetodeTilDeserialisering() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.4: Nøgleordet `transient`
     * ------------------------------------
     * Spørgsmål:
     * Hvis en instansvariabel i en klasse, der implementerer `Serializable`, er markeret med nøgleordet `transient`, hvad sker der så med denne variabel under serialisering og deserialisering?
     *
     * Svarmuligheder:
     * 1. Variabelen serialiseres med en speciel kryptering.
     * 2. Det forårsager en `NotSerializableException`, når man forsøger at serialisere objektet.
     * 3. Variabelen ignoreres under serialiseringsprocessen, og når objektet deserialiseres, vil variablen have sin default-værdi for sin type (f.eks. `null` for objekter, 0 for tal).
     * 4. Variabelen skal have en public getter og setter for at serialisering kan fungere.
     */
    public static int opgave28_4_svarTransientNøgleord() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.5: Formålet med `serialVersionUID`
     * ---------------------------------------------
     * Spørgsmål:
     * Hvad er det primære formål med at deklarere en `private static final long serialVersionUID` i en klasse, der implementerer `Serializable`?
     *
     * Svarmuligheder:
     * 1. At give et unikt ID til hver enkelt instans af klassen, der serialiseres.
     * 2. At angive den maksimale tilladte størrelse i bytes for det serialiserede objekt.
     * 3. At fungere som et versionsnummer for klassen, der bruges under deserialisering til at verificere kompatibilitet mellem den gemte objektdata og den aktuelle klasse-definition.
     * 4. At specificere filtypen (.ser, .dat etc.), som objekter af denne klasse skal serialiseres til.
     */
    public static int opgave28_5_svarSerialVersionUIDFormaal() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.6: Serialisering af Objektgrafer
     * ------------------------------------------
     * Problemstilling:
     * Et `Bestilling`-objekt er `Serializable` og indeholder en reference til et `KundeInfo`-objekt, som også er `Serializable`.
     *
     * Spørgsmål:
     * Hvad sker der typisk, når `Bestilling`-objektet serialiseres via `ObjectOutputStream.writeObject()`?
     *
     * Svarmuligheder:
     * 1. Kun `Bestilling`-objektet serialiseres; `KundeInfo`-objektet skal serialiseres manuelt i et separat kald.
     * 2. Det vil altid resultere i en `StackOverflowError` på grund af potentielle cykliske referencer.
     * 3. Både `Bestilling`-objektet og det refererede `KundeInfo`-objekt (samt eventuelle yderligere `Serializable` objekter de måtte referere til) bliver automatisk serialiseret som en del af den samme objektgraf. Hvis flere dele af grafen peger på det samme `KundeInfo`-objekt, serialiseres det kun én gang, og referencerne bevares.
     * 4. `KundeInfo`-objektet konverteres til en streng via sin `toString()`-metode og gemmes som en del af `Bestilling`-objektet.
     */
    public static int opgave28_6_svarObjektgrafSerialisering() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.7: Klasseændring - Tilføjelse af Nyt Felt
     * ----------------------------------------------------
     * Problemstilling:
     * Du har serialiseret objekter af en klasse `Vare` (som har en eksplicit `serialVersionUID`).
     * Senere modificerer du `Vare`-klassen ved at tilføje et nyt `private int lagerStatus;` felt,
     * men du beholder den samme `serialVersionUID`.
     *
     * Spørgsmål:
     * Hvad sker typisk, når du forsøger at deserialisere et af de *gamle* `Vare`-objekter (gemt før feltet blev tilføjet) med den *nye* klasseversion?
     *
     * Svarmuligheder:
     * 1. En `InvalidClassException` kastes altid, fordi klassens struktur har ændret sig.
     * 2. Deserialiseringen vil typisk lykkes, og det nye `lagerStatus`-felt i det deserialiserede objekt vil blive initialiseret til sin default-værdi (0 for int).
     * 3. Deserialiseringen vil crashe programmet uden en specifik Java exception.
     * 4. Du vil blive bedt om at angive en værdi for det nye felt under deserialiseringsprocessen.
     */
    public static int opgave28_7_svarKlasseændringTilføjFelt() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.8: Hvad returnerer `ObjectInputStream.readObject()`?
     * -------------------------------------------------------------
     * Spørgsmål:
     * Efter at have kaldt `ObjectInputStream.readObject()` for at deserialisere et objekt, hvad skal man typisk gøre med den returnerede værdi for at kunne bruge objektet som dets oprindelige type?
     *
     * Svarmuligheder:
     * 1. Ingenting, den returnerede værdi har allerede den korrekte specifikke type.
     * 2. Den skal altid konverteres til en `String` repræsentation.
     * 3. Den returneres som typen `Object` og skal derfor typecastes til den forventede konkrete klasse (f.eks. `(MinKlasse)ois.readObject();`).
     * 4. Metoden returnerer `void`; objektet genskabes i en pre-defineret variabel.
     */
    public static int opgave28_8_svarReadObjectReturtype() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.9: Felt af Ikke-Serializable Type
     * --------------------------------------------
     * Problemstilling:
     * En klasse `BrugerSession` implementerer `Serializable`. Den har en instansvariabel
     * `private transient java.net.Socket aktivSocket;` (Socket er ikke Serializable).
     *
     * Spørgsmål:
     * Hvad ville konsekvensen være, hvis `aktivSocket` IKKE var markeret som `transient`, når man forsøgte at serialisere et `BrugerSession`-objekt?
     *
     * Svarmuligheder:
     * 1. `aktivSocket` ville blive serialiseret korrekt ved hjælp af en speciel mekanisme for netværksstreams.
     * 2. Der ville blive kastet en `java.io.NotSerializableException` under forsøget på at serialisere `BrugerSession`-objektet.
     * 3. `aktivSocket` ville automatisk blive ignoreret af serialiseringsprocessen, som om den var transient.
     * 4. Kun `aktivSocket`s IP-adresse og portnummer ville blive serialiseret.
     */
    public static int opgave28_9_svarIkkeSerializableFelt() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 28.10: Sikkerhed ved Deserialisering
     * -------------------------------------------
     * Spørgsmål:
     * Hvad er en kendt sikkerhedsrisiko ved at deserialisere objekter fra en *ikke-pålidelig* (untrusted) kilde?
     *
     * Svarmuligheder:
     * 1. Det kan forårsage, at den deserialiserede data optager for meget diskplads.
     * 2. Det er altid 100% sikkert, da Java's serialiseringsmekanisme er designet til at forhindre alle sikkerhedsproblemer.
     * 3. Det kan potentielt føre til udførelse af ondsindet kode (en "deserialization vulnerability"), hvis den deserialiserede data er specielt udformet til at udnytte sårbarheder i de klasser, der genskabes, eller i selve deserialiseringsprocessen.
     * 4. Den eneste risiko er, at programmet kan kaste en `ClassNotFoundException`, hvis klassen ikke findes.
     */
    public static int opgave28_10_svarSikkerhedVedDeserialisering() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 28: Persister objekter (Serializable - Teori) ===");
        System.out.println("Udfyld 'ditSvar' variablerne i hver opgavemetode.");
        System.out.println("Kør derefter Emne28SerializableTeoriOpgaverTest.java for at verificere dine svar.");
    }
}