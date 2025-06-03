package emne15_comparable_comparator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue; // For opgave 15.10
import java.util.TreeSet;     // For opgave 15.5

/**
 * Generel Beskrivelse for Opgavesættet Emne 15: Comparable og Comparator
 * =======================================================================
 * Dette opgavesæt fokuserer på Emne 15: Comparable og Comparator.
 * Formålet er at øve implementering af Comparable-interfacet for at definere
 * en klasses naturlige ordning, samt at oprette separate Comparator-klasser
 * og lambda-udtryk for at definere alternative sorteringsrækkefølger.
 * Opgaverne vil også involvere brug af disse i sortering af lister og i
 * ordnede collections.
 * Opret separate .java filer for hver klasse/interface.
 */
public class Emne15ComparableComparator {

    /**
     * Opgave 15.1: `FilmComparable` - Naturlig Orden
     * ----------------------------------------------
     * Filnavn: FilmComparable.java
     *
     * Beskrivelse:
     * Definér en klasse `FilmComparable`.
     * Attributter: `titel` (String), `udgivelsesår` (int), `rating` (double, 0.0-10.0).
     * Metoder:
     * 1. Konstruktør, Get-metoder, `toString()`.
     * 2. Implementer `Comparable<FilmComparable>` interfacet.
     * - Film skal sorteres primært efter `rating` i FALDENDE rækkefølge (højeste rating først).
     * - Sekundært (hvis ratings er ens) skal de sorteres efter `titel` i STIGENDE (alfabetisk) rækkefølge.
     *
     * TODO: Opret FilmComparable.java og implementer klassen og Comparable-interfacet.
     */

    /**
     * Opgave 15.2: `ProduktData` og Flere `Comparatorer`
     * -------------------------------------------------
     * Filnavne: ProduktData.java, ProduktNavnComparator.java, ProduktPrisComparator.java, ProduktLagerComparator.java
     *
     * Beskrivelse:
     * 1. Klasse `ProduktData`: (Denne klasse skal IKKE implementere Comparable)
     * - Attributter: `produktId` (String), `navn` (String), `pris` (double), `lagerAntal` (int).
     * - Konstruktør, Get-metoder, `toString()`.
     * 2. Klasse `ProduktNavnComparator` implements `Comparator<ProduktData>`:
     * - Sammenligner `ProduktData`-objekter baseret på deres `navn` (alfabetisk stigende).
     * 3. Klasse `ProduktPrisComparator` implements `Comparator<ProduktData>`:
     * - Sammenligner `ProduktData`-objekter baseret på deres `pris` (laveste pris først).
     * - Hvis priser er ens, kan den sekundært sortere på `produktId` (alfabetisk).
     * 4. Klasse `ProduktLagerComparator` implements `Comparator<ProduktData>`:
     * - Sammenligner `ProduktData`-objekter baseret på deres `lagerAntal` (højeste antal først).
     *
     * TODO: Opret klasserne. Implementer Comparator-klasserne.
     */

    /**
     * Opgave 15.3: Sortering af Strenge med Lambda `Comparator`
     * --------------------------------------------------------
     * Filnavn: StrengSortering.java (en klasse med statiske metoder)
     *
     * Beskrivelse:
     * Opret en klasse `StrengSortering`. Implementer følgende statiske metoder:
     * 1. `public static List<String> sorterEfterLængdeKortestFørst(List<String> liste)`:
     * - Tager en `List<String>` og returnerer en *ny* liste, hvor strengene er sorteret
     * efter deres længde (korteste streng først).
     * - Brug et lambda-udtryk til at definere `Comparator`en direkte i kaldet til `Collections.sort()`
     * eller `list.sort()`.
     * 2. `public static List<String> sorterEfterSidsteBogstav(List<String> liste)`:
     * - Tager en `List<String>` og returnerer en *ny* liste, hvor strengene er sorteret
     * alfabetisk baseret på deres *sidste* bogstav. Håndter tomme strenge (f.eks. placer dem først).
     * - Brug et lambda-udtryk til `Comparator`en.
     *
     * TODO: Opret StrengSortering.java. Implementer metoderne.
     */

    /**
     * Opgave 15.4: `ScoreEntry` med `Comparable` og Statisk `Comparator`
     * ------------------------------------------------------------------
     * Filnavn: ScoreEntry.java
     *
     * Beskrivelse:
     * Klasse `ScoreEntry` implements `Comparable<ScoreEntry>`:
     * - Attributter: `spillerNavn` (String), `score` (int), `spilDato` (LocalDate).
     * - Konstruktør, Get-metoder, `toString()`.
     * - Implementer `compareTo(ScoreEntry other)`:
     * - Primær sortering: Efter `score` (højeste score først).
     * - Sekundær sortering (hvis scores er ens): Efter `spilDato` (nyeste dato først).
     * - Tertiær sortering (hvis datoer også er ens): Efter `spillerNavn` (alfabetisk).
     * - Inde i `ScoreEntry` klassen, definer en `public static final Comparator<ScoreEntry> NAVN_COMPARATOR`:
     * - Denne comparator skal sortere `ScoreEntry`-objekter udelukkende alfabetisk på `spillerNavn`.
     *
     * TODO: Opret ScoreEntry.java. Implementer Comparable og den statiske Comparator.
     */

    /**
     * Opgave 15.5: `BogTilTreeSet` og `TreeSet` med `Comparable` og `Comparator` (Præciseret)
     * ------------------------------------------------------------------------------------
     * Filnavne: BogTilTreeSet.java, BogSideantalComparator.java
     *
     * Beskrivelse:
     * 1. Klasse `BogTilTreeSet` implements `Comparable<BogTilTreeSet>`:
     * - Attributter: `titel` (String), `forfatter` (String), `sideantal` (int).
     * - Konstruktør, Get-metoder, `toString()`, `equals/hashCode` (baseret på titel og forfatter).
     * - Implementer `compareTo` så den naturlige orden er sortering efter `titel` (alfabetisk).
     * 2. Klasse `BogSideantalComparator` implements `Comparator<BogTilTreeSet>`:
     * - Sammenligner `BogTilTreeSet`-objekter baseret på `sideantal` (stigende).
     *
     * TODO: Opret klasserne BogTilTreeSet.java og BogSideantalComparator.java. Implementer dem i henhold til beskrivelsen.
     */

    /**
     * Opgave 15.6: `PlanlagtEvent` Sortering med `Comparator.comparing` og `thenComparing`
     * -----------------------------------------------------------------------------------
     * Filnavn: PlanlagtEvent.java, EventSorterer.java
     *
     * Beskrivelse:
     * 1. Klasse `PlanlagtEvent`:
     * - Attributter: `eventNavn` (String), `startDato` (LocalDate), `lokationBy` (String).
     * - Konstruktør, Get-metoder, `toString()`.
     * 2. Klasse `EventSorterer`:
     * - Metode: `public static void sorterEvents(List<PlanlagtEvent> events)`:
     * - Sorterer den givne `events`-liste *in-place*.
     * - Sorteringskriterie:
     * 1. Primært efter `startDato` (ældste dato først).
     * 2. Sekundært efter `lokationBy` (alfabetisk).
     * 3. Tertiært efter `eventNavn` (alfabetisk).
     * - Brug `Comparator.comparing()`, `thenComparing()` og method references (f.eks. `PlanlagtEvent::getStartDato`).
     *
     * TODO: Opret PlanlagtEvent.java og EventSorterer.java. Implementer sorteringsmetoden.
     */

    /**
     * Opgave 15.7: `SpilResultat` Sortering (flere `Comparator` lambda-udtryk)
     * ----------------------------------------------------------------------
     * Filnavn: SpilResultat.java, ResultatAnalyser.java
     *
     * Beskrivelse:
     * 1. Klasse `SpilResultat`:
     * - Attributter: `spillerId` (String), `scoreOpnået` (int), `tidBrugtSekunder` (int), `levelGennemført` (int).
     * - Konstruktør, Get-metoder, `toString()`.
     * 2. Klasse `ResultatAnalyser`:
     * - Har en `List<SpilResultat>` som attribut. Konstruktør tager listen.
     * - Metode: `List<SpilResultat> getSorteretEfterScoreFaldende()`: Returnerer en *ny* liste sorteret efter `scoreOpnået` (højeste først). Brug lambda.
     * - Metode: `List<SpilResultat> getSorteretEfterTidStigende()`: Returnerer en *ny* liste sorteret efter `tidBrugtSekunder` (hurtigste først). Brug lambda.
     * - Metode: `List<SpilResultat> getSorteretEfterLevelSåScore()`: Returnerer en *ny* liste sorteret primært efter `levelGennemført` (højeste først), sekundært efter `scoreOpnået` (højeste først). Brug `Comparator.comparing().thenComparing()` med lambdaer.
     *
     * TODO: Opret klasserne. Implementer sorteringsmetoderne i `ResultatAnalyser`.
     */

    /**
     * Opgave 15.8: `MedarbejderStilling` med `Comparable` for Anciennitet
     * ------------------------------------------------------------------
     * Filnavn: MedarbejderStilling.java
     *
     * Beskrivelse:
     * Klasse `MedarbejderStilling` implements `Comparable<MedarbejderStilling>`:
     * - Attributter: `medarbejderNavn` (String), `stillingstitel` (String), `ansættelsesDato` (LocalDate), `afdeling` (String).
     * - Konstruktør, Get-metoder, `toString()`.
     * - Implementer `compareTo`: Skal sortere medarbejdere således:
     * 1. Primært efter `afdeling` (alfabetisk).
     * 2. Sekundært efter `ansættelsesDato` (dem med længst anciennitet, dvs. ældste dato, kommer først).
     * 3. Tertiært efter `medarbejderNavn` (alfabetisk).
     *
     * TODO: Opret MedarbejderStilling.java. Implementer Comparable.
     */

    /**
     * Opgave 15.9: `Transaktion` Sortering med Kompleks Lambda `Comparator`
     * --------------------------------------------------------------------
     * Filnavn: BankTransaktion.java, TransaktionsFilter.java
     *
     * Beskrivelse:
     * 1. Klasse `BankTransaktion`: `transaktionsId` (String), `datoTid` (LocalDateTime), `beløb` (double), `type` (String: "Indbetaling", "Udbetaling", "Overførsel").
     * - Konstruktør, Get-metoder, `toString()`.
     * 2. Klasse `TransaktionsFilter`:
     * - Metode `public static List<BankTransaktion> sorterTransaktioner(List<BankTransaktion> transaktioner)`:
     * - Returnerer en *ny* liste sorteret efter følgende kriterier:
     * 1. Først alle "Indbetaling" transaktioner, så "Overførsel", så "Udbetaling".
     * 2. Indenfor hver type, sorter efter `datoTid` (nyeste først).
     * 3. Hvis `datoTid` er ens, sorter efter `beløb` (største beløb først for "Indbetaling", mindste beløb først for "Udbetaling" og "Overførsel").
     * - Brug et lambda-udtryk (evt. med `Comparator.comparing().thenComparing()`) til at definere denne komplekse sortering.
     *
     * TODO: Opret klasserne. Implementer sorteringsmetoden.
     */

    /**
     * Opgave 15.10: `OpgaveMedPrioritet` i en `PriorityQueue` via `Comparable` (Præciseret)
     * ----------------------------------------------------------------------------------
     * Filnavn: OpgaveMedPrioritet.java
     *
     * Beskrivelse:
     * Klasse `OpgaveMedPrioritet` implements `Comparable<OpgaveMedPrioritet>`:
     * - Attributter: `beskrivelse` (String), `prioritet` (int: 1=Højeste, 2=Mellem, 3=Lavest),
     * `deadline` (LocalDate).
     * - Konstruktør, Get-metoder, `toString()`.
     * - Implementer `compareTo` således, at objekter sorteres med følgende prioritet:
     * 1. Først efter `prioritet` (laveste tal, dvs. højeste prioritet, kommer først).
     * 2. Hvis prioritet er ens, efter `deadline` (tidligste deadline kommer først).
     * 3. Hvis deadline også er ens, efter `beskrivelse` (alfabetisk).
     *
     * TODO: Opret OpgaveMedPrioritet.java. Implementer klassen og Comparable-interfacet i henhold til beskrivelsen.
     */

    public static void main(String[] args) {
        System.out.println("=== Emne 15: Comparable og Comparator - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for hver klasse/interface og brug JUnit-tests. ===");
    }
}