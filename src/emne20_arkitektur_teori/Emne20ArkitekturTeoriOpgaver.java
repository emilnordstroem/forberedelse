package emne20_arkitektur_teori;

/**
 * Generel Beskrivelse for Opgavesættet Emne 20: Arkitektur (Teori)
 * =================================================================
 * Dette opgavesæt fokuserer på Emne 20: Arkitektur, specifikt lagdelt arkitektur.
 * Formålet er at teste din teoretiske forståelse af formålet med lagdeling,
 * de typiske lags ansvarsområder, interaktionsregler mellem lag, og fordele
 * ved en velstruktureret, lagdelt applikation.
 * For hver opgave skal du sætte den tilhørende 'ditSvar'-variabel i metoden
 * til nummeret på den svarmulighed, du anser for mest korrekt.
 */
public class Emne20ArkitekturTeoriOpgaver {

    /**
     * Opgave 20.1: Primære Formål med Lagdeling
     * -----------------------------------------
     * Spørgsmål:
     * Hvad er et af de primære formål med at anvende en lagdelt arkitektur i softwareudvikling?
     *
     * Svarmuligheder:
     * 1. At øge programmets rå eksekveringshastighed markant.
     * 2. At samle al kode relateret til en bestemt feature i én enkelt klasse for overskuelighed.
     * 3. At opnå "Separation of Concerns" (adskillelse af ansvarsområder), hvilket kan føre til reduceret kobling mellem systemets dele og øget vedligeholdelsesvenlighed.
     * 4. At gøre det muligt at skrive hele applikationen i ét enkelt programmeringssprog.
     */
    public static int opgave20_1_svarFormålMedLagdeling() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.2: De Typiske Tre Lag
     * -------------------------------
     * Spørgsmål:
     * Hvilke tre lag udgør typisk en klassisk 3-lagsarkitektur (three-tier architecture)?
     *
     * Svarmuligheder:
     * 1. Input-lag, Algoritme-lag, Output-lag.
     * 2. Klient-lag, Server-lag, Database-lag.
     * 3. Præsentationslag (GUI), Applikationslag (Forretningslogik), Dataadgangslag (Storage/Persistens).
     * 4. Hardware-lag, Operativsystem-lag, Applikations-lag.
     */
    public static int opgave20_2_svarDeTreLag() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.3: Præsentationslagets (GUI) Ansvar
     * ---------------------------------------------
     * Spørgsmål:
     * Hvad er det primære ansvarsområde for præsentationslaget (GUI-laget) i en lagdelt arkitektur?
     *
     * Svarmuligheder:
     * 1. At udføre komplekse forretningsberegninger og datamanipulation.
     * 2. At håndtere direkte kommunikation med databasen for at hente og gemme data.
     * 3. At præsentere data for brugeren og håndtere brugerens interaktioner med systemet.
     * 4. At definere systemets overordnede sikkerhedsregler og adgangskontrol.
     */
    public static int opgave20_3_svarPræsentationslagetsAnsvar() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.4: Applikationslagets (Forretningslogik) Ansvar
     * --------------------------------------------------------
     * Spørgsmål:
     * I hvilket lag hører systemets kerneforretningslogik, regler og koordinering af opgaver typisk hjemme?
     *
     * Svarmuligheder:
     * 1. Udelukkende i Præsentationslaget for at være tæt på brugeren.
     * 2. I Applikationslaget (også kaldet forretningslogiklaget eller servicelaget).
     * 3. Udelukkende i Dataadgangslaget for at være tæt på data.
     * 4. Fordelt ligeligt mellem alle lag for at sikre balance.
     */
    public static int opgave20_4_svarApplikationslagetsAnsvar() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.5: Dataadgangslagets Ansvar
     * ------------------------------------
     * Spørgsmål:
     * Hvad er det primære ansvar for dataadgangslaget (storage/persistence layer)?
     *
     * Svarmuligheder:
     * 1. At validere brugerinput modtaget fra GUI'en.
     * 2. At implementere de visuelle elementer, som brugeren ser.
     * 3. At håndtere den tekniske lagring og hentning af data fra datakilder (f.eks. databaser, filer) og abstrahere disse detaljer væk fra applikationslaget.
     * 4. At indeholde al forretningslogik, der involverer data.
     */
    public static int opgave20_5_svarDataadgangslagetsAnsvar() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.6: Interaktion mellem Lag (Strikt Lagdeling)
     * ------------------------------------------------------
     * Spørgsmål:
     * I en strikt lagdelt arkitektur, hvilken af følgende interaktioner er typisk *ikke* tilladt eller anses for dårlig praksis?
     *
     * Svarmuligheder:
     * 1. Præsentationslaget kalder metoder i Applikationslaget.
     * 2. Applikationslaget kalder metoder i Dataadgangslaget.
     * 3. Dataadgangslaget kalder direkte metoder i Præsentationslaget for at opdatere brugergrænsefladen med data.
     * 4. En klasse i Applikationslaget bruger en anden klasse inden for samme Applikationslag.
     */
    public static int opgave20_6_svarInteraktionMellemLag() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.7: Placering af Forretningsvalidering
     * -----------------------------------------------
     * Problemstilling:
     * En bruger opretter en ny ordre via en GUI. Ordren skal have en leveringsdato,
     * der ligger mindst 3 dage ude i fremtiden.
     *
     * Spørgsmål:
     * Hvor bør den forretningsregel, der tjekker om leveringsdatoen er gyldig (mindst 3 dage frem), primært implementeres?
     *
     * Svarmuligheder:
     * 1. Kun i GUI-laget, lige før data sendes videre, for at give brugeren hurtig feedback.
     * 2. Direkte i databasen som en constraint.
     * 3. I Applikationslaget (forretningslogiklaget), som modtager data fra GUI'en, før ordren forsøges gemt.
     * 4. I en separat, global valideringsutility-klasse, der kan kaldes fra alle lag.
     */
    public static int opgave20_7_svarPlaceringAfForretningsvalidering() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.8: Testbarhed i Lagdelt Arkitektur
     * --------------------------------------------
     * Spørgsmål:
     * Hvordan kan en veldesignet lagdelt arkitektur forbedre testbarheden af et softwaresystem?
     *
     * Svarmuligheder:
     * 1. Den har ingen reel effekt på testbarheden, da alle dele alligevel skal testes sammen.
     * 2. Den gør testning mere kompliceret, fordi man skal teste interaktionerne mellem mange små lag.
     * 3. Den muliggør, at lag som f.eks. forretningslogiklaget kan unit-testes isoleret fra GUI og konkrete databaseløsninger, f.eks. ved brug af mock-objekter.
     * 4. Den eliminerer behovet for unit tests og fokuserer kun på integrationstests.
     */
    public static int opgave20_8_svarTestbarhedFordel() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.9: Håndtering af Dataadgangsfejl
     * -------------------------------------------
     * Problemstilling:
     * Dataadgangslaget forsøger at hente data fra en ekstern database, men databasen er nede,
     * og en `SQLException` (en checked exception) kastes.
     *
     * Spørgsmål:
     * Hvordan bør Dataadgangslaget typisk håndtere denne `SQLException` i forhold til det kaldende Applikationslag?
     *
     * Svarmuligheder:
     * 1. Fange `SQLException` og ignorere den, så programmet kan fortsætte uden data.
     * 2. Lade `SQLException` propagere ukontrolleret op gennem systemet, så programmet crasher.
     * 3. Fange `SQLException` og kaste en mere generel, domænespecifik (eller applikationsspecifik) checked exception (f.eks. `DataAccessException` eller `RepositoryException`), som Applikationslaget så kan håndtere eller kaste videre.
     * 4. Fange `SQLException` og straks vise en fejlmeddelelsesboks til brugeren direkte fra Dataadgangslaget.
     */
    public static int opgave20_9_svarHåndteringAfDatafejl() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    /**
     * Opgave 20.10: Udskiftelighed af Lag
     * ----------------------------------
     * Spørgsmål:
     * En af de store fordele ved en lagdelt arkitektur med lav kobling (loose coupling)
     * mellem lagene (ofte opnået via interfaces mellem lagene) er udskiftelighed.
     * Hvad betyder dette i praksis?
     *
     * Svarmuligheder:
     * 1. At man nemt kan skifte programmeringssprog for hele applikationen.
     * 2. At man kan udskifte implementeringen af et helt lag (f.eks. skifte fra filbaseret lagring til en SQL-database i dataadgangslaget) med minimal eller ingen påvirkning på de andre lag, så længe interfacene respekteres.
     * 3. At alle lag automatisk bliver trådsikre.
     * 4. At GUI-laget kan fjernes helt, uden at applikationslogikken påvirkes (hvilket altid er sandt, uanset arkitektur).
     */
    public static int opgave20_10_svarUdskiftelighedAfLag() {
        // TODO: Sæt variablen til det korrekte svar-nummer (1-4).
        int ditSvar = 0;
        return ditSvar;
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 20: Arkitektur (Teoriopgaver) ===");
        System.out.println("Udfyld 'ditSvar' variablerne i hver opgavemetode.");
        System.out.println("Kør derefter Emne20ArkitekturTeoriOpgaverTest.java for at verificere dine svar.");
    }
}