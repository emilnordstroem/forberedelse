package emne12_strategy_pattern;

import java.time.LocalDateTime; // For Opgave 12.7
import java.time.format.DateTimeFormatter; // For Opgave 12.7
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects; // For equals/hashCode i evt. hjælpeklasser

/**
 * Generel Beskrivelse for Opgavesættet Emne 12: Strategy-Pattern (Fuldt Revideret)
 * ================================================================================
 * Dette opgavesæt fokuserer på Emne 12: Strategy-Pattern.
 * Formålet er at designe og implementere Strategy-mønsteret, hvor en familie
 * af algoritmer indkapsles i separate klasser (strategier), der implementerer
 * et fælles interface. En Context-klasse vil bruge disse strategier til at
 * udføre opgaver, og strategien kan ændres dynamisk ved køretid.
 * Beskrivelserne specificerer den *forventede adfærd* for hver strategi.
 * Opret separate .java filer for hvert interface og klasse.
 */
public class Emne12StrategyPattern {

    /**
     * Opgave 12.1: Simpel Regnemaskine med Strategier
     * -----------------------------------------------
     * Filnavne: RegneStrategi.java (interface), PlusStrategi.java, MinusStrategi.java,
     * GangeStrategi.java, DividerStrategi.java, KalkulatorContext.java
     *
     * Beskrivelse:
     * 1. Interface `RegneStrategi`:
     * - Metode: `int beregn(int a, int b)`
     * 2. Konkrete Strategier (implementer `RegneStrategi`):
     * - `PlusStrategi`: Returnerer `a + b`.
     * - `MinusStrategi`: Returnerer `a - b`.
     * - `GangeStrategi`: Returnerer `a * b`.
     * - `DividerStrategi`: Returnerer `a / b`. Håndter division med nul (f.eks. returner 0 eller kast `ArithmeticException`).
     * 3. Klasse `KalkulatorContext`:
     * - Attribut (private): `aktivStrategi` (RegneStrategi).
     * - Konstruktør: `KalkulatorContext(RegneStrategi startStrategi)`.
     * - Metode: `void setStrategi(RegneStrategi nyStrategi)`.
     * - Metode: `int udførBeregning(int tal1, int tal2)` (delegerer til den aktive strategi).
     *
     * TODO: Opret interface og klasser. Implementer.
     */

    /**
     * Opgave 12.2: Tekstformateringsstrategier
     * ----------------------------------------
     * Filnavne: FormateringsStrategi.java (interface), StorBogstavStrategi.java,
     * LilleBogstavStrategi.java, CamelCaseStrategi.java, TekstProcessor.java (Context)
     *
     * Beskrivelse:
     * 1. Interface `FormateringsStrategi`:
     * - Metode: `String formater(String tekst)`
     * 2. Konkrete Strategier (implementer `FormateringsStrategi`):
     * - `StorBogstavStrategi`: Konverterer hele `tekst` til store bogstaver.
     * - `LilleBogstavStrategi`: Konverterer hele `tekst` til små bogstaver.
     * - `CamelCaseStrategi`: Konverterer en `tekst` med mellemrum (f.eks. "hej med dig") til camelCase ("hejMedDig").
     * Første ord med lille, efterfølgende ord med stort startbogstav, mellemrum fjernes.
     * 3. Klasse `TekstProcessor` (Context):
     * - Attribut (private): `formateringsRegel` (FormateringsStrategi).
     * - Metode: `void setFormateringsStrategi(FormateringsStrategi strategi)`.
     * - Metode: `String anvendFormatering(String inputTekst)` (bruger den satte strategi).
     *
     * TODO: Opret interface og klasser. Implementer.
     */

    /**
     * Opgave 12.3: Beregning af Forsendelsesomkostninger
     * --------------------------------------------------
     * Filnavne: ForsendelsesMetode.java (interface), PakkeForsendelse.java,
     * BrevForsendelse.java, PalletForsendelse.java, ForsendelsesKalkulator.java (Context)
     *
     * Beskrivelse:
     * 1. Klasse `ForsendelsesInfo`: Indeholder `vægtKg` (double), `distanceKm` (double), `volumenM3` (double). (Simpel dataklasse)
     * 2. Interface `ForsendelsesMetode`:
     * - Metode: `double beregnFragtPris(ForsendelsesInfo info)`
     * 3. Konkrete Strategier (implementer `ForsendelsesMetode`):
     * - `PakkeForsendelse`: Pris = 30 + (`info.vægtKg` * 10) + (`info.distanceKm` * 0.2). Min pris 50.
     * - `BrevForsendelse`: Hvis `info.vægtKg` <= 0.1, Pris = 15. Ellers, Pris = 15 + (`info.vægtKg` - 0.1) * 50. Distance irrelevant.
     * - `PalletForsendelse`: Pris = 200 + (`info.volumenM3` * 100) + (`info.distanceKm` * 1.5).
     * 4. Klasse `ForsendelsesKalkulator` (Context):
     * - Metode: `void setAktivMetode(ForsendelsesMetode metode)`.
     * - Metode: `double kalkulerForsendelse(ForsendelsesInfo info)`.
     *
     * TODO: Opret ForsendelsesInfo.java, interface og klasser. Implementer.
     */

    /**
     * Opgave 12.4: Valideringsstrategier for Datafelter
     * -------------------------------------------------
     * Filnavne: FeltValideringsRegel.java (interface), TalfeltValidering.java,
     * TekstfeltLængdeValidering.java, DatoFormatValidering.java, DataFormular.java (Context)
     *
     * Beskrivelse:
     * 1. Interface `FeltValideringsRegel`:
     * - Metode: `boolean erInputGyldigt(String input)`
     * - Metode: `String hentStandardFejlbesked()`
     * 2. Konkrete Strategier (implementer `FeltValideringsRegel`):
     * - `TalfeltValidering`: `erInputGyldigt` tjekker om `input` kan parses til et heltal. Fejlbesked: "Skal være et heltal."
     * - `TekstfeltLængdeValidering`: Konstruktør tager `minLængde` og `maxLængde`. `erInputGyldigt` tjekker dette. Fejlbesked: "Tekst skal være mellem [min] og [max] tegn."
     * - `DatoFormatValidering`: Konstruktør tager et `DateTimeFormatter` mønster (String, f.eks. "dd-MM-yyyy").
     * `erInputGyldigt` tjekker om `input` kan parses til en `LocalDate` med dette format. Fejlbesked: "Dato skal være i formatet [mønster]."
     * 3. Klasse `DataFormular` (Context):
     * - Har en `Map<String, FeltValideringsRegel>` for forskellige felter (f.eks. "alder" -> TalfeltValidering).
     * - Metode: `void tilføjValideringsRegel(String feltNavn, FeltValideringsRegel regel)`.
     * - Metode: `boolean validerFelt(String feltNavn, String inputVærdi)`: Finder reglen og validerer. Returner `false` hvis feltNavn ikke kendes.
     * - Metode: `String getFeltFejlbesked(String feltNavn)`: Returner fejlbesked for reglen, hvis den findes.
     *
     * TODO: Opret interface og klasser. Implementer.
     */

    /**
     * Opgave 12.5: Afsendelse af Bruger-Notifikationer
     * -----------------------------------------------
     * Filnavne: NotifikationsSender.java (interface), DesktopNotifikation.java,
     * MobilPushNotifikation.java, BrugerAlertService.java (Context)
     *
     * Beskrivelse:
     * 1. Interface `NotifikationsSender`:
     * - Metode: `String sendBesked(String brugerId, String titel, String indhold)` (Returnerer status/log streng).
     * 2. Konkrete Strategier (implementer `NotifikationsSender`):
     * - `DesktopNotifikation`: Returnerer f.eks. "DESKTOP NOTIFIKATION til [brugerId]: ([titel]) - [indhold]".
     * - `MobilPushNotifikation`: Returnerer f.eks. "PUSH til mobil for [brugerId]: ([titel]) - [indhold]".
     * 3. Klasse `BrugerAlertService` (Context):
     * - Kan have en `List<NotifikationsSender>` for at sende via flere kanaler, eller én aktiv. For denne opgave, én aktiv.
     * - Metode: `void setNotifikationsMetode(NotifikationsSender metode)`.
     * - Metode: `String sendBrugerAlert(String userId, String alertTitel, String alertIndhold)`.
     *
     * TODO: Opret interface og klasser. Implementer.
     */

    /**
     * Opgave 12.6: Prisberegning med Dynamiske Rabatter
     * ------------------------------------------------
     * Filnavne: PrisberegningsStrategi.java (interface), BasisPris.java, TiProcentRabat.java,
     * SommerUdsalgsRabat.java, VarePriser.java (Context)
     *
     * Beskrivelse:
     * 1. Interface `PrisberegningsStrategi`:
     * - Metode: `double beregnPris(double listepris)`
     * 2. Konkrete Strategier (implementer `PrisberegningsStrategi`):
     * - `BasisPris`: Returnerer `listepris` uændret.
     * - `TiProcentRabat`: Returnerer `listepris * 0.90`.
     * - `SommerUdsalgsRabat`: Returnerer `listepris * 0.75` (25% rabat).
     * 3. Klasse `VarePriser` (Context):
     * - Attribut `prisStrategi`.
     * - Metoder: `setPrisStrategi()`, `double getSalgspris(double oprindeligPris)`.
     *
     * TODO: Opret interface og klasser. Implementer.
     */

    /**
     * Opgave 12.7: Log Formatteringsstrategier (NY)
     * --------------------------------------------
     * Filnavne: LogFormatter.java (interface), SimpelLogFormatter.java,
     * JsonLogFormatter.java, CsvLogFormatter.java, AppLogger.java (Context)
     *
     * Beskrivelse:
     * 1. Enum `LogLevel` med værdierne `INFO`, `WARNING`, `ERROR`.
     * 2. Interface `LogFormatter`:
     * - Metode: `String formater(LocalDateTime tidspunkt, LogLevel level, String besked)`
     * 3. Konkrete Strategier (implementer `LogFormatter`):
     * - `SimpelLogFormatter`: Returnerer f.eks. "[yyyy-MM-dd HH:mm:ss] [LEVEL]: Besked"
     * - `JsonLogFormatter`: Returnerer en JSON-lignende streng, f.eks. `{"timestamp": "...", "level": "...", "message": "..."}`
     * - `CsvLogFormatter`: Returnerer en CSV-lignende streng, f.eks. `"tidspunkt","LEVEL","besked"`
     * 4. Klasse `AppLogger` (Context):
     * - Attribut `aktivFormatter` (LogFormatter).
     * - Metoder: `setFormatter(LogFormatter formatter)`, `String log(LogLevel level, String besked)` (bruger `LocalDateTime.now()` og den aktive formatter).
     *
     * TODO: Opret enum, interface og klasser. Implementer formateringslogikken.
     */

    /**
     * Opgave 12.8: Data Lagringsstrategier (Præciseret Simuleret Adfærd)
     * ------------------------------------------------------------------
     * Filnavne: LagringsStrategi.java (interface), FilSystemLagring.java, CloudDatabaseLagring.java,
     * LokalCacheLagring.java, AppDataManager.java (Context)
     *
     * Beskrivelse:
     * 1. Interface `LagringsStrategi`:
     * - Metode: `boolean gem(String nøgle, String data)` (returnerer succes)
     * - Metode: `String hent(String nøgle)` (returnerer data eller null hvis ikke fundet)
     * 2. Konkrete Strategier (implementer `LagringsStrategi`):
     * - `FilSystemLagring`:
     * - `gem`: Simulerer gemning, returnerer `true`. Kan internt printe "Gemmer '[nøgle]' til filsystem med data: '[data]'".
     * - `hent`: Simulerer hentning, returnerer f.eks. "FilData for [nøgle]" hvis den "findes" (du kan hardcode et par nøgler, den genkender).
     * - `CloudDatabaseLagring`:
     * - `gem`: Simulerer gemning, returnerer `true`. Kan internt printe "Sender '[nøgle]' til cloud DB...".
     * - `hent`: Returnerer f.eks. "CloudData for [nøgle]".
     * - `LokalCacheLagring`:
     * - Bruger en intern `HashMap<String, String>` til faktisk at gemme og hente data.
     * 3. Klasse `AppDataManager` (Context):
     * - Attribut `aktivLagringsStrategi`.
     * - Metoder: `setLagringsStrategi()`, `boolean gemAppSetting(String key, String value)`, `String hentAppSetting(String key)`.
     *
     * TODO: Opret interface og klasser. Implementer den specificerede (simulerede) adfærd.
     */

    /**
     * Opgave 12.9: SpilKarakter Angrebsstrategier
     * -------------------------------------------
     * Filnavne: AngrebsStrategi.java (interface), NærkampAngreb.java, AfstandsAngreb.java,
     * MagiskAngreb.java, SpilKarakterKontekst.java (Context)
     *
     * Beskrivelse:
     * 1. Klasse `Mål`: Simpel klasse med `navn` (String) og `health` (int). `void tagSkade(int skade)`.
     * 2. Interface `AngrebsStrategi`:
     * - Metode: `String udførAngreb(String angriberNavn, Mål target)` (returnerer en beskrivelse af angrebet).
     * 3. Konkrete Strategier (implementer `AngrebsStrategi`):
     * - `NærkampAngreb`: Gør f.eks. 10 i skade. Returnerer "[angriberNavn] slår [target.navn] for 10 skade!".
     * - `AfstandsAngreb`: Gør f.eks. 7 i skade. Returnerer "[angriberNavn] skyder en pil mod [target.navn] for 7 skade!".
     * - `MagiskAngreb`: Gør f.eks. 15 i skade. Returnerer "[angriberNavn] kaster en ildkugle på [target.navn] for 15 skade!".
     * (Sørg for at `target.tagSkade()` kaldes i hver strategi).
     * 4. Klasse `SpilKarakterKontekst`:
     * - Attribut `navn`. Attribut `angrebsMetode` (AngrebsStrategi).
     * - Metoder: `setAngrebsMetode()`, `String angribMål(Mål fjende)`.
     *
     * TODO: Opret Mål.java, interface og klasser. Implementer.
     */

    /**
     * Opgave 12.10: Sorteringsalgoritme Strategier (Udfordring)
     * ---------------------------------------------------------
     * Filnavne: MinListeSorterer.java (interface), MinBobleSort.java,
     * MinSelectionSort.java, JavaIndbyggetSort.java, DataBeholder.java (Context)
     *
     * Beskrivelse:
     * 1. Interface `MinListeSorterer`:
     * - Metode: `void sorterListe(List<Integer> usorteretListe)` (modificerer listen in-place).
     * 2. Konkrete Strategier (implementer `MinListeSorterer`):
     * - `MinBobleSort`: Implementer BobleSort algoritmen.
     * - `MinSelectionSort`: Implementer SelectionSort algoritmen.
     * - `JavaIndbyggetSort`: Bruger `Collections.sort()` til at sortere.
     * 3. Klasse `DataBeholder` (Context):
     * - Har en `List<Integer> minDataListe`.
     * - Konstruktør tager en initial liste.
     * - Metode: `void setSorteringsAlgoritme(MinListeSorterer algoritme)`.
     * - Metode: `void anvendSortering()` (anvender den valgte algoritme på `minDataListe`).
     * - Metode: `List<Integer> getData()` (returnerer kopi).
     *
     * TODO: Opret interface og klasser. Implementer de simple sorteringsalgoritmer.
     */

    public static void main(String[] args) {
        System.out.println("=== Emne 12: Strategy-Pattern (Fuldt Revideret) - Main metode til VALGFRI manuel test ===");
    }
}