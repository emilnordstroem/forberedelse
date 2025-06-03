package emne11_observer_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random; // Kan blive relevant

/**
 * Generel Beskrivelse for Opgavesættet Emne 11: Observer-Pattern
 * ==============================================================
 * Dette opgavesæt fokuserer på Emne 11: Observer-Pattern.
 * Formålet er at designe og implementere Observer-mønsteret for at opnå
 * løs kobling mellem objekter, hvor ændringer i ét objekt (Subject)
 * automatisk notificerer en række andre objekter (Observers).
 * Du vil definere Subject- og Observer-interfaces samt konkrete klasser.
 * Opret separate .java filer for hvert interface og klasse.
 */
public class Emne11ObserverPattern {

    /**
     * Opgave 11.1: Simpel Vejrstation
     * ------------------------------
     * Filnavne: VejrDataSubject.java (interface), VejrObservatør.java (interface),
     * VejrStation.java (ConcreteSubject), NuværendeForholdDisplay.java (ConcreteObserver),
     * StatistikDisplay.java (ConcreteObserver)
     *
     * Beskrivelse:
     * Modelér en vejrstation (baseret på eksemplet i dine noter).
     * 1. Interface `VejrDataSubject`:
     * - `void tilmeldObservatør(VejrObservatør o)`
     * - `void fjernObservatør(VejrObservatør o)`
     * - `void notificerObservatører()`
     * 2. Interface `VejrObservatør`:
     * - `void opdater(float temperatur, float fugtighed, float lufttryk)` (Push model)
     * 3. Klasse `VejrStation` implements `VejrDataSubject`:
     * - Private attributter for `temperatur`, `fugtighed`, `lufttryk` og en `List<VejrObservatør>`.
     * - Implementer Subject-metoderne.
     * - Metode `void setMålinger(float temp, float fugt, float tryk)`: Opdaterer attributter og kalder `notificerObservatører()`.
     * 4. Klasse `NuværendeForholdDisplay` implements `VejrObservatør`:
     * - `opdater` metoden gemmer de modtagne værdier og har en `display()` metode, der returnerer en streng med dem.
     * 5. Klasse `StatistikDisplay` implements `VejrObservatør`:
     * - `opdater` metoden modtager temperaturer og holder styr på min, max og gennemsnitstemperatur.
     * - En `displayStatistik()` metode returnerer en streng med disse statistikker.
     *
     * TODO: Opret interfaces og klasser. Implementer.
     */

    /**
     * Opgave 11.2: Nyhedsbrev Abonnement
     * ---------------------------------
     * Filnavne: NyhedsbrevAbonnent.java (interface Observer), NyhedsbrevUdgiverEmne.java (interface Subject),
     * OnlineMagasin.java (ConcreteSubject), EmailKlient.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Interface `NyhedsbrevAbonnent`:
     * - `void modtagNyhed(String udgiverNavn, String nyhedsOverskrift, String nyhedsIndhold)`
     * 2. Interface `NyhedsbrevUdgiverEmne`:
     * - `void tilføjAbonnent(NyhedsbrevAbonnent a)`
     * - `void fjernAbonnent(NyhedsbrevAbonnent a)`
     * - `void udsendNyhedsbrev(String overskrift, String indhold)` (notificerer abonnenter)
     * 3. Klasse `OnlineMagasin` implements `NyhedsbrevUdgiverEmne`:
     * - Attribut `magasinNavn`. Holder en liste af `NyhedsbrevAbonnent`.
     * - Implementer Subject-metoderne. `udsendNyhedsbrev` kalder `modtagNyhed` på alle abonnenter.
     * 4. Klasse `EmailKlient` implements `NyhedsbrevAbonnent`:
     * - Attribut `emailAdresse`.
     * - `modtagNyhed` metoden simulerer modtagelse, f.eks. ved at gemme den seneste nyhed eller formatere en streng.
     * - En metode `String getSenesteModtagneNyhedFormatted()` for testbarhed.
     *
     * TODO: Opret interfaces og klasser. Implementer.
     */

    /**
     * Opgave 11.3: ProduktLager Notifikation (Pull Model)
     * --------------------------------------------------
     * Filnavne: VareLagerInfo.java, LagerObservatør.java (interface), LagerSystemSubject.java (interface),
     * HovedLager.java (ConcreteSubject), IndkøbsPortal.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Klasse `VareLagerInfo`: `vareNummer` (String), `navn` (String), `antalPåLager` (int). Getters/Setters.
     * 2. Interface `LagerObservatør`:
     * - `void lagerOpdateret(LagerSystemSubject lager)` (Pull model: Observatøren får subject og skal selv hente data)
     * 3. Interface `LagerSystemSubject`:
     * - `void tilknytLagerObservatør(LagerObservatør o)`
     * - `void fjernLagerObservatør(LagerObservatør o)`
     * - `void notificerLagerObservatører()`
     * - (Metoder til at hente data, f.eks. `VareLagerInfo getVareInfo(String vareNummer)`)
     * 4. Klasse `HovedLager` implements `LagerSystemSubject`:
     * - Bruger en `Map<String, VareLagerInfo>` til at holde styr på varer.
     * - Implementer Subject-metoderne.
     * - Metoder `void opdaterLagerAntal(String vareNummer, int nytAntal)` og
     * `void tilføjNyVare(VareLagerInfo vare)` som opdaterer lageret og kalder `notificerLagerObservatører()`.
     * - Implementer `VareLagerInfo getVareInfo(String vareNummer)`.
     * 5. Klasse `IndkøbsPortal` implements `LagerObservatør`:
     * - `lagerOpdateret(LagerSystemSubject lager)`: Henter info om en specifik vare (f.eks. "V001") fra `lager`
     * og "bestiller flere", hvis antallet er under en grænse (simuleret ved at sætte en boolean flag eller en streng).
     * - En metode `String getBestillingsStatusForV001()` for testbarhed.
     *
     * TODO: Opret klasse og interfaces. Implementer.
     */

    /**
     * Opgave 11.4: Simpelt Auktionsbud System
     * ---------------------------------------
     * Filnavne: Budgiver.java (interface Observer), AuktionsVareEmne.java (interface Subject),
     * KunstAuktionVare.java (ConcreteSubject), OnlineTilskuer.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Interface `Budgiver`:
     * - `void nytBudModtaget(String vareNavn, String højesteBudgiver, double nytBud)`
     * 2. Interface `AuktionsVareEmne`:
     * - `void registrerBudgiver(Budgiver b)`
     * - `void fjernBudgiver(Budgiver b)`
     * - `void afgivBud(String budgiverNavn, double bud)` (notificerer hvis nyt højeste bud)
     * 3. Klasse `KunstAuktionVare` implements `AuktionsVareEmne`:
     * - Attributter: `vareNavn`, `højesteBud` (double), `højesteBudgiverNavn` (String), liste af `Budgiver`.
     * - Implementer Subject-metoderne. `afgivBud` opdaterer `højesteBud` og notificerer kun, hvis det nye bud er højere.
     * 4. Klasse `OnlineTilskuer` implements `Budgiver`:
     * - Holder styr på den seneste budinformation, den har modtaget for en bestemt vare.
     * - En metode `String getSenesteBudInfo()` for testbarhed.
     *
     * TODO: Opret interfaces og klasser. Implementer.
     */

    /**
     * Opgave 11.5: Download Status Notifikation
     * -----------------------------------------
     * Filnavne: DownloadLytter.java (interface Observer), DownloadTaskSubject.java (interface Subject),
     * FilDownload.java (ConcreteSubject), BrugerNotifikation.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Interface `DownloadLytter`:
     * - `void progressOpdateret(String filnavn, int procentFuldført)`
     * - `void downloadFærdig(String filnavn, boolean succes)`
     * 2. Interface `DownloadTaskSubject`:
     * - `void tilføjLytter(DownloadLytter l)`
     * - `void fjernLytter(DownloadLytter l)`
     * - `void startDownload()`
     * - (Interne metoder til at simulere progress og afslutning, som så kalder notifikation)
     * 3. Klasse `FilDownload` implements `DownloadTaskSubject`:
     * - Attributter: `filnavn`, `totalStørrelseMB`, `downloadedMB`, liste af `DownloadLytter`.
     * - `startDownload()`: Sætter `downloadedMB` til 0.
     * - Metode `void simulerDownload(int mbDownloadedDenneIteration)`: Øger `downloadedMB`,
     * beregner procent, og notificerer `progressOpdateret`. Hvis `downloadedMB >= totalStørrelseMB`,
     * notificer `downloadFærdig` med succes.
     * 4. Klasse `BrugerNotifikation` implements `DownloadLytter`:
     * - Gemmer seneste status for en download (procent eller færdig-status).
     * - Metoder `String getSenesteProgress()` og `String getFærdigStatus()` for testbarhed.
     *
     * TODO: Opret interfaces og klasser. Implementer.
     */

    /**
     * Opgave 11.6: Event Billetsalg System (Revideret)
     * -------------------------------------------------
     * Filnavne: BilletObservatør.java (Observer), EventSubject.java (Subject),
     * KoncertArrangement.java (ConcreteSubject), SmartBilletKøber.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Interface `BilletObservatør`:
     * - `void billetterTilSalg(String eventNavn, int antalNyligtFrigivne, double billetPris)`
     * 2. Interface `EventSubject`:
     * - `void tilmeldObservatør(BilletObservatør o)`
     * - `void frameldObservatør(BilletObservatør o)`
     * - `void notificerOmBilletter(int antalNyligtFrigivne, double billetPris)`
     * 3. Klasse `KoncertArrangement` implements `EventSubject`:
     * - Attributter: `eventNavn` (String), `billetPris` (double), `totalAntalBilletter` (int), `tilgængeligeBilletter` (int).
     * - Konstruktør.
     * - Metode `void frigivBilletBatch(int antal)`: Reducerer `tilgængeligeBilletter` med `antal` (dog ikke under 0).
     * Kalder `notificerOmBilletter` med det faktiske antal billetter, der blev gjort tilgængelige i dette batch, og prisen.
     * 4. Klasse `SmartBilletKøber` implements `BilletObservatør`:
     * - Attributter: `køberNavn` (String), `budget` (double), `ønskedeBilletter` (int), `købteBilletter` (int).
     * - Konstruktør.
     * - `billetterTilSalg`: Hvis `antalNyligtFrigivne > 0` og `købteBilletter < ønskedeBilletter` og køberen har råd
     * til mindst én billet (`budget >= billetPris`), "køber" den én billet (reducer budget, inkrementer `købteBilletter`,
     * log en besked). Køberen reagerer kun på at købe én billet pr. notifikation, selvom flere er tilgængelige/affordable.
     * - Metoder til at hente `getKøbteBilletter()` og `getResterendeBudget()`.
     *
     * TODO: Implementer systemet med den specificerede logik for SmartBilletKøber.
     */

    /**
     * Opgave 11.7: Spil Score og Milepæle (Revideret)
     * -----------------------------------------------
     * Filnavne: ScoreOpdateringsLytter.java (Observer), SpilScoreSubject.java (Subject),
     * SpillerScore.java (ConcreteSubject), DynamiskHighscoreDisplay.java (ConcreteObserver), PointMilepælNotifier.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Interface `ScoreOpdateringsLytter`:
     * - `void scoreOpdateret(String spillerNavn, int nyTotalScore, int pointÆndring)`
     * 2. Interface `SpilScoreSubject`:
     * - `void tilføjScoreLytter(ScoreOpdateringsLytter l)`
     * - `void fjernScoreLytter(ScoreOpdateringsLytter l)`
     * - `void notificerScoreLyttere(int pointÆndring)`
     * 3. Klasse `SpillerScore` implements `SpilScoreSubject`:
     * - Attributter: `spillerNavn` (String), `totalScore` (int).
     * - Metode `void tilføjPoint(int points)`: Øger `totalScore` med `points` (hvis `points > 0`) og kalder `notificerScoreLyttere` med `points`.
     * 4. Klasse `DynamiskHighscoreDisplay` implements `ScoreOpdateringsLytter`:
     * - Holder en sorteret liste af de (f.eks. top 3) højeste scores (navn + score), den har observeret.
     * - `scoreOpdateret` opdaterer denne interne highscore-liste.
     * - Metode `List<String> getTopScoresFormatted()`.
     * 5. Klasse `PointMilepælNotifier` implements `ScoreOpdateringsLytter`:
     * - Holder styr på en liste af milepæle (f.eks. 1000, 5000, 10000 points) og om de er nået.
     * - `scoreOpdateret` tjekker, om `nyTotalScore` har krydset en endnu ikke nået milepæl.
     * - Metode `List<String> getOpnåedeMilepæleBeskeder()` (returnerer beskeder som "Milepæl nået: 1000 points!").
     *
     * TODO: Implementer med fokus på stateful observers og varieret reaktion.
     */

    /**
     * Opgave 11.8: Aktiekurs Overvågning med Procentændring (Revideret)
     * ----------------------------------------------------------------
     * Filnavne: AktieKursObservatør.java (Observer), AktieDataFeed.java (Subject),
     * BørsnoteretAktie.java (ConcreteSubject), PorteføljeVærdiBeregner.java (ConcreteObserver), KursAlarm.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Interface `AktieKursObservatør`:
     * - `void kursÆndret(String aktieSymbol, double nyKurs, double gammelKurs, double procentÆndring)`
     * 2. Interface `AktieDataFeed`:
     * - `void registrerObservatør(AktieKursObservatør o)`
     * - `void fjernObservatør(AktieKursObservatør o)`
     * - `void opdaterKurs(double nyKurs)` (notificerer observatører)
     * 3. Klasse `BørsnoteretAktie` implements `AktieDataFeed`:
     * - Attributter: `symbol` (String), `nuværendeKurs` (double), `forrigeKurs` (double).
     * - `opdaterKurs(double nyKurs)`: Sætter `forrigeKurs` til `nuværendeKurs`, opdaterer `nuværendeKurs`,
     * beregner `procentÆndring` og kalder notifikationsmetoden.
     * 4. Klasse `PorteføljeVærdiBeregner` implements `AktieKursObservatør`:
     * - Holder en `Map<String, Integer> minPortefølje` (aktieSymbol -> antal).
     * - Holder en `Map<String, Double> nuværendeVærdiAfHoldninger` (aktieSymbol -> total værdi).
     * - `kursÆndret` opdaterer `nuværendeVærdiAfHoldninger` for den relevante aktie.
     * - Metode `double getTotalPorteføljeVærdi()`.
     * 5. Klasse `KursAlarm` implements `AktieKursObservatør`:
     * - Konstruktør tager en `alarmProcentGrænse` (f.eks. 5.0 for +/- 5%).
     * - `kursÆndret` tjekker om `Math.abs(procentÆndring)` overstiger `alarmProcentGrænse`.
     * - Metode `String getSenesteAlarmBesked()` (returnerer besked hvis alarm udløst, ellers null).
     *
     * TODO: Implementer. Fokus på data der sendes med notifikationen og stateful observers.
     */

    /**
     * Opgave 11.9: Temperatur Alarm System med Tilstand (Revideret)
     * ------------------------------------------------------------
     * Filnavne: TemperaturAlarmLytter.java (Observer), TemperaturSensorSubject.java (Subject),
     * RumTermostat.java (ConcreteSubject), KritiskFrostAlarm.java (ConcreteObserver), OverophedningsAlarm.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Interface `TemperaturAlarmLytter`:
     * - `void alarmStatusÆndret(String alarmType, String rumNavn, double temperatur, boolean erAktiv)`
     * 2. Interface `TemperaturSensorSubject`:
     * - `void tilføjLytter(TemperaturAlarmLytter l)`, `void fjernLytter(TemperaturAlarmLytter l)`, `void målNyTemperatur(double nyTemp)`
     * 3. Klasse `RumTermostat` implements `TemperaturSensorSubject`:
     * - Attributter: `rumNavn`, `nuværendeTemp`, `kritiskFrostGrænse` (f.eks. 0.0), `kritiskVarmeGrænse` (f.eks. 30.0).
     * - `målNyTemperatur`: Opdaterer `nuværendeTemp`. Notificerer *kun* lyttere, hvis en grænse *krydses*
     * (dvs. hvis temperaturen går fra at være over grænsen til under, eller omvendt), eller hvis en alarmtilstand
     * for en specifik alarmtype ændres (aktiv/inaktiv). Observatører skal informeres om hvilken alarmtype
     * ("FROST_ALARM", "VARME_ALARM") og om den er aktiv.
     * 4. Klasse `KritiskFrostAlarm` implements `TemperaturAlarmLytter`:
     * - Reagerer kun på `alarmStatusÆndret` hvis `alarmType` er "FROST_ALARM". Gemmer `erAktiv` status.
     * 5. Klasse `OverophedningsAlarm` implements `TemperaturAlarmLytter`:
     * - Reagerer kun på `alarmStatusÆndret` hvis `alarmType` er "VARME_ALARM". Gemmer `erAktiv` status.
     *
     * TODO: Implementer. Fokus på at Subject kun notificerer ved relevante tilstandsændringer ift. grænser.
     */

    /**
     * Opgave 11.10: Brugeraktivitets Tracker med Sekvens/Tælling (Revideret)
     * --------------------------------------------------------------------
     * Filnavne: HandlingObservatør.java (Observer), AktivitetsTrackerSubject.java (Subject),
     * SpilSession.java (ConcreteSubject), TrofæSystem.java (ConcreteObserver), MistænkeligAktivitetsRapport.java (ConcreteObserver)
     *
     * Beskrivelse:
     * 1. Interface `HandlingObservatør`:
     * - `void handlingRegistreret(String brugerId, String handlingstype, Map<String, Object> data)`
     * 2. Interface `AktivitetsTrackerSubject`:
     * - `void registrerObservatør(HandlingObservatør o)`, `void fjernObservatør(HandlingObservatør o)`, `void logHandling(String handlingstype, Map<String, Object> data)`
     * 3. Klasse `SpilSession` implements `AktivitetsTrackerSubject`:
     * - Attribut: `brugerId`. `logHandling` notificerer observatører med `brugerId`, `handlingstype`, `data`.
     * 4. Klasse `TrofæSystem` implements `HandlingObservatør`:
     * - Holder styr på, hvor mange gange specifikke handlingstyper er udført (f.eks. "MONSTER_BESEJRET", "SKAT_FUNDET").
     * - Når en handlingstype når et bestemt antal (f.eks. 5 "MONSTER_BESEJRET"), "udløses" et trofæ (log en besked eller sæt et flag).
     * - Metode `List<String> getUdløsteTrofæer()`.
     * 5. Klasse `MistænkeligAktivitetsRapport` implements `HandlingObservatør`:
     * - Holder styr på antallet af "LOGIN_FEJL" handlinger for en bruger inden for et kort tidsinterval (simuleret).
     * - Hvis der er f.eks. 3 "LOGIN_FEJL" i træk (eller inden for f.eks. 5 loggede handlinger), logges en "HØJ PRIORITET SIKKERHEDSADVARSEL".
     * - Metode `String getSenesteSikkerhedsstatus()`.
     *
     * TODO: Implementer. Fokus på stateful observers, der reagerer på tælling/sekvens af specifikke handlinger.
     */


    public static void main(String[] args) {
        System.out.println("=== Emne 11: Observer-Pattern - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for hver klasse/interface og brug JUnit-tests. ===");
    }
}