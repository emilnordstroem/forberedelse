package emne09_associering;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Generel Beskrivelse for Opgavesættet Emne 9: Associering (Revideret)
 * ====================================================================
 * Dette opgavesæt fokuserer på Emne 9: Associering mellem klasser.
 * For hver opgave vil klasserne og deres basale attributter blive beskrevet.
 * Derefter specificeres typen af associering, der skal etableres mellem dem.
 * DIN OPGAVE er at implementere de nødvendige linkattributter og metoder
 * i de relevante klasser for at håndtere den specificerede associering korrekt,
 * inklusiv sikring af konsistens for dobbeltrettede forbindelser.
 * Overvej hvilke metoder der er nødvendige for at oprette, fjerne og forespørge på links.
 * Opret separate .java filer for hver klasse.
 */
public class Emne09Associering {

    /**
     * Opgave 9.1: `Person` og `Pas`
     * -----------------------------
     * Filnavne: Pas.java, PersonMedPas.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `Pas`:
     * - Attributter (private): `pasNummer` (String), `udløbsDato` (LocalDate).
     * - Konstruktør: `Pas(String pasNummer, LocalDate udløbsDato)`. Get-metoder. `toString()`.
     * 2. Klasse `PersonMedPas`:
     * - Attributter (private): `navn` (String).
     * - Konstruktør: `PersonMedPas(String navn)`. Getter for `navn`.
     *
     * Specificeret Associering:
     * - Mellem `PersonMedPas` og `Pas` skal der være en **enkeltrettet en-til-en (0..1) associering**.
     * - En `PersonMedPas` kan have ét `Pas` (eller intet pas).
     * - Et `Pas` "kender ikke" til sin `PersonMedPas`.
     *
     * TODO: I `PersonMedPas`, implementer linkattribut og metoder for at håndtere associeringen.
     * Dette bør inkludere metoder til at:
     * a) Sætte/tilknytte et `Pas` (og evt. erstatte et eksisterende).
     * b) Hente det tilknyttede `Pas` (som kan være null).
     * c) Fjerne/nulstille passet. Overvej validering (f.eks. kan et nyt pas være null ved sætning?).
     */

    /**
     * Opgave 9.2: `Forfatter` og `UdgivetBog`
     * ------------------------------------
     * Filnavne: UdgivetBog.java, Forfatter.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `UdgivetBog`:
     * - Attributter (private): `titel` (String), `udgivelsesår` (int).
     * - Konstruktør, Get-metoder, `equals/hashCode` (baseret på titel og år), `toString()`.
     * 2. Klasse `Forfatter`:
     * - Attributter (private): `navn` (String).
     * - Konstruktør: `Forfatter(String navn)`. Getter for `navn`.
     *
     * Specificeret Associering:
     * - Mellem `Forfatter` og `UdgivetBog` skal der være en **enkeltrettet en-til-mange (1 til 0..*) associering**.
     * - En `Forfatter` kan have skrevet nul eller flere `UdgivetBog`.
     * - En `UdgivetBog` "kender ikke" til sin `Forfatter` gennem denne associering.
     *
     * TODO: I `Forfatter`, implementer linkattribut (typisk en List) og metoder for at håndtere associeringen.
     * Dette bør inkludere metoder til at:
     * a) Tilføje en `UdgivetBog` til forfatterens liste (undgå dubletter).
     * b) Fjerne en `UdgivetBog` fra listen.
     * c) Hente en (kopi af) listen af alle forfatterens udgivne bøger.
     */

    /**
     * Opgave 9.3: `PartnerPerson` (Ægteskab)
     * ---------------------------------------
     * Filnavn: PartnerPerson.java
     *
     * Beskrivelse af klasse:
     * 1. Klasse `PartnerPerson`:
     * - Attributter (private): `navn` (String).
     * - Konstruktør: `PartnerPerson(String navn)`. Getter for `navn`.
     *
     * Specificeret Associering:
     * - Mellem `PartnerPerson`-objekter skal der være en **dobbeltrettet en-til-en (0..1 til 0..1) associering**.
     * - En `PartnerPerson` kan være gift med én anden `PartnerPerson` (eller ingen).
     * - Forbindelsen skal være konsistent: Hvis A er gift med B, skal B være gift med A.
     *
     * TODO: I `PartnerPerson`, implementer linkattribut og metoder for at håndtere "ægteskabet".
     * Dette bør inkludere metoder til at:
     * a) Etablere et ægteskab (sætte partner). Husk at opdatere linket hos *begge* personer
     * og håndtere eventuelle tidligere partnere korrekt (en "skilsmisse" før nyt ægteskab).
     * b) Hente personens ægtefælle (kan være null).
     * c) Ophæve et ægteskab (sætte partner til null for begge).
     */

    /**
     * Opgave 9.4: `Klasselokale` og `Elev` (Dobbeltrettet En-til-Mange)
     * ----------------------------------------------------------------
     * Filnavne: Elev.java, Klasselokale.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `Elev`:
     * - Attributter (private): `navn` (String), `elevNummer` (int).
     * - Konstruktør: `Elev(String navn, int elevNummer)`. Getters. `equals/hashCode` (baseret på `elevNummer`).
     * 2. Klasse `Klasselokale`:
     * - Attributter (private): `lokaleKode` (String, f.eks. "301B").
     * - Konstruktør: `Klasselokale(String lokaleKode)`. Getter for `lokaleKode`.
     *
     * Specificeret Associering:
     * - Mellem `Klasselokale` og `Elev` skal der være en **dobbeltrettet en-til-mange (1 til 0..*) associering**.
     * - Et `Klasselokale` kan have mange `Elev`er.
     * - En `Elev` tilhører ét `Klasselokale` (eller intet, hvis f.eks. nyoprettet og ikke tildelt).
     *
     * TODO: Implementer linkattributter og metoder i *begge* klasser for at håndtere associeringen.
     * - `Klasselokale` skal have metoder til at tilføje og fjerne en elev.
     * - `Elev` skal have en metode til at sætte/ændre sit klasseværelse.
     * - Sørg for, at links holdes konsistente (f.eks. hvis en elev tilføjes til et klasseværelse,
     * skal elevens reference til klasseværelset også opdateres, og eleven skal fjernes
     * fra et evt. tidligere klasseværelses liste).
     */

    /**
     * Opgave 9.5: `Virksomhed` og `AfdelingsMedarbejder` (Dobbeltrettet En-til-Mange, mere kompleks)
     * ------------------------------------------------------------------------------------------
     * Filnavne: AfdelingsMedarbejder.java, Virksomhed.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `AfdelingsMedarbejder`:
     * - Attributter (private): `navn` (String), `medarbejderId` (int).
     * - Konstruktør. Getters. `equals/hashCode` (baseret på `medarbejderId`).
     * 2. Klasse `Virksomhed`:
     * - Attributter (private): `virksomhedsNavn` (String), `cvrNummer` (String).
     * - Konstruktør. Getters.
     *
     * Specificeret Associering:
     * - Mellem `Virksomhed` og `AfdelingsMedarbejder` er der en **dobbeltrettet en-til-mange associering**.
     * - En `Virksomhed` har en liste af `AfdelingsMedarbejder`.
     * - En `AfdelingsMedarbejder` er ansat i én `Virksomhed`.
     *
     * TODO: Implementer linkattributter og metoder i begge klasser.
     * - `Virksomhed` skal have metoder til at `ansætteMedarbejder(AfdelingsMedarbejder m)` og `afskedigeMedarbejder(AfdelingsMedarbejder m)`.
     * - `AfdelingsMedarbejder` skal have en metode `blivAnsatiVirksomhed(Virksomhed v)` og `stopIVirksomhed()`.
     * - Fokus på robust håndtering af link-konsistens:
     * - Når en medarbejder ansættes i en virksomhed, skal virksomheden tilføjes til medarbejderens reference,
     * og medarbejderen skal tilføjes virksomhedens liste.
     * - Hvis medarbejderen allerede var ansat i en anden virksomhed, skal de først "afskediges" der.
     * - Når en medarbejder afskediges, skal begge sider af linket fjernes.
     */

    /**
     * Opgave 9.6: `Blogger` og `BlogIndlæg` (Enkeltrettet En-til-Mange, ejer-ejet)
     * ------------------------------------------------------------------------
     * Filnavne: BlogIndlæg.java, Blogger.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `BlogIndlæg`: `overskrift` (String), `indhold` (String), `dato` (LocalDate). Konstruktør, getters, toString.
     * 2. Klasse `Blogger`:
     * - Attributter: `navn` (String), `email` (String).
     * - Konstruktør. Getters.
     *
     * Specificeret Associering:
     * - Mellem `Blogger` og `BlogIndlæg` er der en **enkeltrettet en-til-mange (1 til 0..*) associering**.
     * - En `Blogger` "ejer" og har skrevet nul eller flere `BlogIndlæg`.
     * - Et `BlogIndlæg` "kender ikke" sin `Blogger` gennem denne specifikke associering.
     *
     * TODO: I `Blogger`, implementer en privat `final List<BlogIndlæg>` og public metoder til at:
     * a) `publicerNytIndlæg(String overskrift, String indhold, LocalDate dato)` (opretter og tilføjer et nyt `BlogIndlæg`).
     * b) `List<BlogIndlæg> getAlleIndlæg()` (returnerer en *uforanderlig kopi*).
     * c) `BlogIndlæg findIndlæg(String overskrift)` (returnerer indlæg eller null).
     */

    /**
     * Opgave 9.7: `FlyRute` og `Lufthavn` (Mange-til-Mange via attributter, enkeltrettet)
     * -----------------------------------------------------------------------------------
     * Filnavne: Lufthavn.java, FlyRute.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `Lufthavn`: `iataKode` (String, f.eks. "CPH"), `navn` (String). Konstruktør, getters, equals/hashCode på iataKode.
     * 2. Klasse `FlyRute`:
     * - Attributter: `ruteNummer` (String).
     *
     * Specificeret Associering:
     * - En `FlyRute` har en **enkeltrettet en-til-en (1 til 1) associering** til en `afgangsLufthavn` (Lufthavn).
     * - En `FlyRute` har en **enkeltrettet en-til-en (1 til 1) associering** til en `ankomstLufthavn` (Lufthavn).
     * - En lufthavn kan være afgangs- eller ankomstlufthavn for mange ruter, men dette modelleres ikke fra `Lufthavn`-klassen.
     *
     * TODO: I `FlyRute`, implementer private linkattributter for `afgangsLufthavn` og `ankomstLufthavn`.
     * Lav en konstruktør `FlyRute(String ruteNummer, Lufthavn afgang, Lufthavn ankomst)` som sætter disse.
     * Lav get-metoder for afgangs- og ankomstlufthavn.
     * Overvej validering (f.eks. afgang og ankomst må ikke være den samme lufthavn).
     */

    /**
     * Opgave 9.8: `Kunde` og `FavoritButik` (Enkeltrettet En-til-En, udskiftelig)
     * ------------------------------------------------------------------------
     * Filnavne: Butik.java, Kunde.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `Butik`: `butiksNavn` (String), `adresse` (String). Konstruktør, getters.
     * 2. Klasse `Kunde`:
     * - Attributter: `kundeNavn` (String).
     * - Konstruktør. Getter.
     *
     * Specificeret Associering:
     * - En `Kunde` kan have én `FavoritButik` (en `Butik`), eller ingen. Dette er en **enkeltrettet en-til-en (0..1) associering**.
     * - Butikken kender ikke til de kunder, der har den som favorit.
     *
     * TODO: I `Kunde`, implementer linkattribut og metoder for at:
     * a) Sætte en kundes `FavoritButik`.
     * b) Hente kundens `FavoritButik` (kan være null).
     * c) Fjerne kundens `FavoritButik` (sætte den til null).
     */

    /**
     * Opgave 9.9: `BilEjer` og `BilFlåde` (Dobbeltrettet En-til-Mange, hvor Bil "ejes")
     * -------------------------------------------------------------------------------
     * Filnavne: SimpelBil.java, BilEjer.java
     *
     * Beskrivelse af klasser: En `BilEjer` kan eje flere `SimpelBil`. En `SimpelBil` ejes af én `BilEjer`.
     * 1. Klasse `SimpelBil`:
     * - Attributter: `registreringsnummer` (String), `model` (String).
     * - Konstruktør: `SimpelBil(String regNr, String model)`. Getters.
     * 2. Klasse `BilEjer`:
     * - Attributter: `ejerNavn` (String).
     * - Konstruktør: `BilEjer(String navn)`. Getter.
     *
     * Specificeret Associering:
     * - Mellem `BilEjer` og `SimpelBil` er der en **dobbeltrettet en-til-mange (1 til 0..*) associering**.
     * - En `BilEjer` har en liste af `SimpelBil` objekter, som personen ejer.
     * - En `SimpelBil` har en reference til sin `BilEjer`.
     *
     * TODO: Implementer linkattributter og metoder i begge klasser.
     * - `BilEjer` skal have metoder til at `købBil(SimpelBil bil)` og `sælgBil(SimpelBil bil)`.
     * - `SimpelBil` skal have en metode `setEjer(BilEjer ejer)` og `getEjer()`.
     * - Når en bil købes/sælges, eller en ejer sættes, skal begge sider af relationen opdateres.
     * En bil kan kun have én ejer. Hvis en bil "sælges" fra en ejer, skal dens ejer-reference nulstilles.
     * Hvis en bil "købes" af en ny ejer, og den allerede havde en ejer, skal den fjernes fra den gamle ejers liste.
     */

    /**
     * Opgave 9.10: `Læge` og `PatientJournal` (Dobbeltrettet En-til-Mange, med begrænset adgang)
     * ---------------------------------------------------------------------------------------
     * Filnavne: PatientJournal.java, Læge.java
     *
     * Beskrivelse af klasser: En `Læge` har ansvaret for mange `PatientJournaler`. Hver `PatientJournal` er tilknyttet én primær `Læge`.
     * 1. Klasse `PatientJournal`:
     * - Attributter: `patientCPR` (String), `journalNotater` (ArrayList<String>).
     * - Konstruktør: `PatientJournal(String cpr)`.
     * - Metoder: `void tilføjNotat(String notat)`, `List<String> getJournalNotaterKopi()`.
     * 2. Klasse `Læge`:
     * - Attributter: `lægeId` (String), `navn` (String).
     * - Konstruktør. Getters.
     *
     * Specificeret Associering:
     * - Mellem `Læge` og `PatientJournal` er der en **dobbeltrettet en-til-mange (1 til 0..*) associering**.
     * - En `Læge` har en liste over de `PatientJournaler`, lægen er primær ansvarlig for.
     * - En `PatientJournal` har én `primærLæge` (af typen `Læge`).
     *
     * TODO: Implementer linkattributter og metoder.
     * - `Læge` skal have `void tildelJournal(PatientJournal pj)` og `void fjernJournal(PatientJournal pj)`.
     * - `PatientJournal` skal have `void setPrimærLæge(Læge læge)` og `Læge getPrimærLæge()`.
     * - Sørg for konsistens:
     * - Når `Læge.tildelJournal(pj)` kaldes, skal `pj.setPrimærLæge(thisLæge)` også kaldes.
     * - Hvis `pj` allerede havde en primærlæge, skal den fjernes fra den gamle læges liste.
     * - Når `PatientJournal.setPrimærLæge(nyLæge)` kaldes, skal journalen fjernes fra evt. gammel læges liste
     * og tilføjes til den nye læges liste.
     */

    /**
     * Opgave 9.11: Aggregering - `Universitet` og `ProfessorAGG`
     * -------------------------------------------------------
     * Filnavne: ProfessorAGG.java, Universitet.java
     * (Brug ProfessorAGG for at undgå navnekonflikt med evt. tidligere Professor klasse)
     *
     * Beskrivelse af klasser:
     * 1. Klasse `ProfessorAGG`: Attributter: `navn` (String), `fagområde` (String). Konstruktør, Getters, `toString()`.
     * 2. Klasse `Universitet`: Attributter: `universitetsNavn` (String).
     *
     * Specificeret Relation (Aggregering):
     * - Et `Universitet` "har en" gruppe af `ProfessorAGG` objekter (en-til-mange).
     * - Professorerne kan eksistere uafhængigt af universitetet.
     *
     * TODO: I `Universitet.java`:
     * a) Implementer de nødvendige attributter og metoder for at håndtere en aggregeringsrelation
     * til `ProfessorAGG` objekter. Dette skal inkludere funktionalitet til at:
     * - Tilknytte et *eksisterende* `ProfessorAGG` objekt til universitetet.
     * - Fjerne en professor (så denne kan eksistere videre - metoden skal returnere den fjernede professor).
     * - Hente en liste over universitetets tilknyttede professorer (med hensyn til indkapsling - returner kopi).
     * b) I en kommentar i `Universitet.java`, forklar kort, hvorfor denne relation
     * bedst beskrives som en aggregering.
     */

    /**
     * Opgave 9.12: Komposition - `Bygning` og `Værelse`
     * -------------------------------------------------
     * Filnavne: Værelse.java, BygningKOM.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `Værelse`: Attributter: `værelseType` (String), `arealKvm` (double). Konstruktør, Getters, `toString()`.
     * 2. Klasse `BygningKOM`: Attributter: `adresse` (String).
     *
     * Specificeret Relation (Komposition):
     * - En `BygningKOM` "består af" flere `Værelse`-objekter (en-til-mange).
     * - Et `Værelse` kan ikke eksistere uden sin `BygningKOM`. Bygningen styrer værelsernes livscyklus.
     *
     * TODO: I `BygningKOM.java`:
     * a) Implementer de nødvendige attributter (f.eks. en `final List<Værelse>`) og metoder
     * for at håndtere en kompositionsrelation til `Værelse` objekter.
     * b) Bygningens konstruktør skal kunne modtage specifikationer for initielle værelser
     * og *oprette* disse `Værelse`-objekter internt.
     * c) Sørg for en metode til at tilføje nye værelser, hvor `BygningKOM` *opretter* `Værelse`-objektet.
     * d) Lav en metode til at hente information om alle bygningens værelser (med hensyn til indkapsling).
     * e) Lav en metode til at beregne bygningens totale værelsesareal.
     * f) I en kommentar i `BygningKOM.java`, forklar kort, hvorfor denne relation
     * bedst beskrives som en komposition.
     */

    /**
     * Opgave 9.13: Komposition vs. Aggregering - `PersonligComputer`
     * ------------------------------------------------------------
     * Filnavne: CPU.java, HukommelsesModul.java, EksternHarddisk.java, PersonligComputer.java
     *
     * Beskrivelse af klasser:
     * 1. Klasse `CPU`: `modelNavn` (String), `kerner` (int). Konstruktør, getters.
     * 2. Klasse `HukommelsesModul`: `kapacitetGB` (int), `type` (String). Konstruktør, getters.
     * 3. Klasse `EksternHarddisk`: `mærke` (String), `kapacitetTB` (int). Konstruktør, getters.
     * 4. Klasse `PersonligComputer`: Attributter: `pcModel` (String).
     *
     * Specificerede Relationer:
     * - Komposition: `PersonligComputer` "består af" én `CPU` og et fast antal `HukommelsesModul`er.
     * Disse dele oprettes og ejes eksklusivt af computeren.
     * - Aggregering: `PersonligComputer` "kan have tilsluttet" én valgfri `EksternHarddisk` (0..1).
     * Denne oprettes eksternt og kan tilsluttes/fjernes.
     *
     * TODO: I `PersonligComputer.java`:
     * a) Implementer de nødvendige attributter og metoder for at modellere disse relationer.
     * b) Computeren skal oprette sin egen `CPU` og `HukommelsesModul`er (f.eks. i konstruktøren).
     * c) Der skal være metoder til at tilslutte og fjerne en (eksternt oprettet) `EksternHarddisk`.
     * d) Sørg for metoder til at hente information om computerens komponenter (med hensyn til indkapsling for de "ejede" dele).
     * e) I kommentarer, forklar forskellen i din implementering af håndteringen af
     * `CPU`/`HukommelsesModul`er (komposition) versus `EksternHarddisk` (aggregering).
     */

    public static void main(String[] args) {
        System.out.println("=== Emne 9: Associering (Revideret) - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for hver klasse og brug JUnit-tests til verificering. ===");
    }
}