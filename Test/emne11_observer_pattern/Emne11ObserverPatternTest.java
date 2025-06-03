package emne11_observer_pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// Når du har oprettet dine interfaces og klasser for Emne 11,
// fjern kommenteringen for de relevante imports.
/*
// Opgave 11.1
import emne11_observer_pattern.VejrDataSubject;
import emne11_observer_pattern.VejrObservatør;
import emne11_observer_pattern.VejrStation;
import emne11_observer_pattern.NuværendeForholdDisplay;
import emne11_observer_pattern.StatistikDisplay;

// Opgave 11.2
import emne11_observer_pattern.NyhedsbrevAbonnent;
import emne11_observer_pattern.NyhedsbrevUdgiverEmne;
import emne11_observer_pattern.OnlineMagasin;
import emne11_observer_pattern.EmailKlient;

// Opgave 11.3
import emne11_observer_pattern.VareLagerInfo;
import emne11_observer_pattern.LagerObservatør;
import emne11_observer_pattern.LagerSystemSubject;
import emne11_observer_pattern.HovedLager;
import emne11_observer_pattern.IndkøbsPortal;

// Opgave 11.4
import emne11_observer_pattern.Budgiver;
import emne11_observer_pattern.AuktionsVareEmne;
import emne11_observer_pattern.KunstAuktionVare;
import emne11_observer_pattern.OnlineTilskuer;

// Opgave 11.5
import emne11_observer_pattern.DownloadLytter;
import emne11_observer_pattern.DownloadTaskSubject;
import emne11_observer_pattern.FilDownload;
import emne11_observer_pattern.BrugerNotifikation;

// Opgave 11.6
import emne11_observer_pattern.BilletObservatør;
import emne11_observer_pattern.EventSubject;
import emne11_observer_pattern.KoncertArrangement;
import emne11_observer_pattern.SmartBilletKøber;

// Opgave 11.7
import emne11_observer_pattern.ScoreOpdateringsLytter;
import emne11_observer_pattern.SpilScoreSubject;
import emne11_observer_pattern.SpillerScore;
import emne11_observer_pattern.DynamiskHighscoreDisplay;
import emne11_observer_pattern.PointMilepælNotifier;

// Opgave 11.8
import emne11_observer_pattern.AktieKursObservatør;
import emne11_observer_pattern.AktieDataFeed;
import emne11_observer_pattern.BørsnoteretAktie;
import emne11_observer_pattern.PorteføljeVærdiBeregner;
import emne11_observer_pattern.KursAlarm;

// Opgave 11.9
import emne11_observer_pattern.TemperaturAlarmLytter;
import emne11_observer_pattern.TemperaturSensorSubject;
import emne11_observer_pattern.RumTermostat;
import emne11_observer_pattern.KritiskFrostAlarm;
import emne11_observer_pattern.OverophedningsAlarm;

// Opgave 11.10
import emne11_observer_pattern.HandlingObservatør;
import emne11_observer_pattern.AktivitetsTrackerSubject;
import emne11_observer_pattern.SpilSession;
import emne11_observer_pattern.TrofæSystem;
import emne11_observer_pattern.MistænkeligAktivitetsRapport;
*/

class Emne11ObserverPatternTest {

    // --- Opgave 11.1: Simpel Vejrstation ---
    @Test
    void testVejrstation_Notifikation_11_1() {
        // Antag at VejrStation, NuværendeForholdDisplay, og StatistikDisplay er implementeret
        // VejrStation vejrStation = new VejrStation();
        // NuværendeForholdDisplay currentDisplay = new NuværendeForholdDisplay();
        // StatistikDisplay statsDisplay = new StatistikDisplay();
        //
        // vejrStation.tilmeldObservatør(currentDisplay);
        // vejrStation.tilmeldObservatør(statsDisplay);
        //
        // vejrStation.setMålinger(25.0f, 60.0f, 1012.5f);
        // assertTrue(currentDisplay.display().contains("25.0") && currentDisplay.display().contains("60.0"));
        // assertTrue(statsDisplay.displayStatistik().contains("25.0/25.0/25.0"));
        //
        // vejrStation.setMålinger(27.5f, 55.0f, 1010.0f);
        // assertTrue(currentDisplay.display().contains("27.5"));
        // assertTrue(statsDisplay.displayStatistik().contains("25.0/27.5/26.25"));
        //
        // vejrStation.fjernObservatør(currentDisplay);
        // vejrStation.setMålinger(20.0f, 70.0f, 1015.0f);
        // assertTrue(currentDisplay.display().contains("27.5"), "CurrentDisplay should not have updated.");
        // float expectedAvg = (25.0f + 27.5f + 20.0f) / 3.0f;
        // assertTrue(statsDisplay.displayStatistik().contains("Min:20.0") && statsDisplay.displayStatistik().contains("Max:27.5") && statsDisplay.displayStatistik().contains("Gns:" + String.format("%.2f", expectedAvg).replace(",", ".")));
        assertTrue(true, "Test for 11.1 skal implementeres fuldt ud, når klasser er klar."); // Placeholder
    }

    // --- Opgave 11.2: Nyhedsbrev Abonnement ---
    @Test
    void testNyhedsbrev_Udsendelse_11_2() {
        // Antag OnlineMagasin og EmailKlient er implementeret
        // OnlineMagasin techMag = new OnlineMagasin("TechVerden");
        // EmailKlient abonnent1 = new EmailKlient("test1@example.com");
        // EmailKlient abonnent2 = new EmailKlient("test2@example.com");
        //
        // techMag.tilføjAbonnent(abonnent1);
        // techMag.tilføjAbonnent(abonnent2);
        // techMag.udsendNyhedsbrev("Breaking News", "AI overtager verden!");
        //
        // assertTrue(abonnent1.getSenesteModtagneNyhedFormatted().contains("TechVerden: Breaking News"));
        // assertTrue(abonnent2.getSenesteModtagneNyhedFormatted().contains("TechVerden: Breaking News"));
        //
        // techMag.fjernAbonnent(abonnent1);
        // techMag.udsendNyhedsbrev("Opfølgning", "AI er venlig.");
        // assertTrue(abonnent1.getSenesteModtagneNyhedFormatted().contains("TechVerden: Breaking News"));
        // assertTrue(abonnent2.getSenesteModtagneNyhedFormatted().contains("TechVerden: Opfølgning"));
        assertTrue(true, "Test for 11.2 skal implementeres fuldt ud, når klasser er klar."); // Placeholder
    }

    // --- Opgave 11.3: ProduktLager Notifikation (Pull Model) ---
    @Test
    void testProduktLager_PullModel_11_3() {
        // Antag HovedLager, VareLagerInfo, IndkøbsPortal er implementeret
        // HovedLager lager = new HovedLager();
        // IndkøbsPortal portal = new IndkøbsPortal("V001", 20); // Antag portal kan konfigureres
        // lager.tilknytLagerObservatør(portal);
        //
        // lager.tilføjNyVare(new VareLagerInfo("V001", "Bolte", 50));
        // assertTrue(portal.getBestillingsStatusForVare().contains("V001 OK"));
        //
        // lager.opdaterLagerAntal("V001", 15);
        // assertTrue(portal.getBestillingsStatusForVare().contains("Bestiller V001"));
        assertTrue(true, "Test for 11.3 skal implementeres fuldt ud, når klasser er klar."); // Placeholder
    }

    // --- Opgave 11.4: Simpelt Auktionsbud System ---
    @Test
    void testAuktion_NytHøjesteBud_11_4() {
        // Antag KunstAuktionVare og OnlineTilskuer er implementeret
        // KunstAuktionVare vase = new KunstAuktionVare("Ming Vase", 1000.0);
        // OnlineTilskuer tilskuer1 = new OnlineTilskuer("Tilskuer Alpha");
        // vase.registrerBudgiver(tilskuer1);
        //
        // vase.afgivBud("Samler A", 1200.0);
        // assertTrue(tilskuer1.getSenesteBudInfo().contains("1200.0 af Samler A"));
        //
        // vase.afgivBud("Samler B", 1100.0); // Lavere bud
        // assertTrue(tilskuer1.getSenesteBudInfo().contains("1200.0 af Samler A"), "Info should not change");
        assertTrue(true, "Test for 11.4 skal implementeres fuldt ud, når klasser er klar."); // Placeholder
    }

    // --- Opgave 11.5: Download Status Notifikation ---
    @Test
    void testDownload_ProgressOgFærdig_11_5() {
        // Antag FilDownload og BrugerNotifikation er implementeret
        // FilDownload fil = new FilDownload("video.mkv", 200);
        // BrugerNotifikation noti = new BrugerNotifikation();
        // fil.tilføjLytter(noti);
        // fil.startDownload();
        // assertEquals("video.mkv: 0%", noti.getSenesteProgress());
        //
        // fil.simulerDownload(100); // 50%
        // assertEquals("video.mkv: 50%", noti.getSenesteProgress());
        // assertEquals("", noti.getFærdigStatus());
        //
        // fil.simulerDownload(100); // 100%
        // assertEquals("video.mkv: 100%", noti.getSenesteProgress());
        // assertEquals("video.mkv færdig: OK", noti.getFærdigStatus());
        assertTrue(true, "Test for 11.5 skal implementeres fuldt ud, når klasser er klar."); // Placeholder
    }

    // --- Opgave 11.6: Event Billetsalg System x ---
    @Test
    void testEventBilletsalg_SmartKøber_11_6() {
        // Antag KoncertArrangement og SmartBilletKøber er implementeret
        // KoncertArrangement koncert = new KoncertArrangement("MegaRock Koncert", 250.0, 5);
        // SmartBilletKøber anders = new SmartBilletKøber("Anders", 600.0, 2);
        // koncert.tilmeldObservatør(anders);
        //
        // koncert.frigivBilletBatch(3);
        // assertEquals(1, anders.getKøbteBilletter());
        // assertEquals(350.0, anders.getResterendeBudget(), 0.01);
        //
        // koncert.frigivBilletBatch(1);
        // assertEquals(2, anders.getKøbteBilletter());
        // assertEquals(100.0, anders.getResterendeBudget(), 0.01);
        //
        // koncert.frigivBilletBatch(1); // Anders har ikke råd til flere eller har nået sit ønske
        // assertEquals(2, anders.getKøbteBilletter());
        assertTrue(true, "Test for 11.6 skal implementeres fuldt ud, når klasser er klar."); // Placeholder
    }

    // --- Opgave 11.7: Spil Score og Milepæle (Revideret) ---
    // (Skelet - kræver implementering af dine klasser)
    @Test
    void testSpilScore_HighscoreOgMilepæle_11_7() {
        // SpillerScore spiller = new SpillerScore("SuperSpiller");
        // DynamiskHighscoreDisplay highscore = new DynamiskHighscoreDisplay(2); // Top 2
        // PointMilepælNotifier milepæle = new PointMilepælNotifier(Arrays.asList(50, 150));
        // spiller.tilføjScoreLytter(highscore);
        // spiller.tilføjScoreLytter(milepæle);

        // spiller.tilføjPoint(60); // Milepæl 50 nået, score 60
        // assertEquals(1, milepæle.getOpnåedeMilepæleBeskeder().size());
        // assertEquals("SuperSpiller: 60", highscore.getTopScoresFormatted().get(0));

        // spiller.tilføjPoint(100); // Score 160, milepæl 150 nået
        // assertEquals(2, milepæle.getOpnåedeMilepæleBeskeder().size());
        fail("JUnit test for 11.7 skal implementeres når klasser er klar.");
    }


    // --- Opgave 11.8: Aktiekurs Overvågning (Revideret) ---
    // (Skelet)
    @Test
    void testAktiekurs_PorteføljeOgAlarm_11_8() {
        // BørsnoteretAktie aktie = new BørsnoteretAktie("TECH", 100.0);
        // PorteføljeVærdiBeregner portefølje = new PorteføljeVærdiBeregner();
        // portefølje.tilføjAktieTilPortefølje("TECH", 10); // 10 stk
        // KursAlarm alarm = new KursAlarm(10.0); // Alarm ved 10% ændring

        // aktie.registrerObservatør(portefølje);
        // aktie.registrerObservatør(alarm);

        // aktie.opdaterKurs(105.0); // 5% stigning, ingen alarm
        // assertEquals(10 * 105.0, portefølje.getTotalPorteføljeVærdi());
        // assertNull(alarm.getSenesteAlarmBesked());

        // aktie.opdaterKurs(90.0); // Fra 105 til 90 er fald på (15/105)*100 = ca 14%
        // assertNotNull(alarm.getSenesteAlarmBesked());
        fail("JUnit test for 11.8 skal implementeres når klasser er klar.");
    }

    // --- Opgave 11.9: Temperatur Alarm System (Revideret) ---
    // (Skelet)
    @Test
    void testTemperaturAlarm_GrænseKrydsning_11_9() {
        // RumTermostat termostat = new RumTermostat("Kølerum", -5.0, 2.0); // Frost <= -5, Varme >= 2
        // KritiskFrostAlarm frostVagt = new KritiskFrostAlarm();
        // OverophedningsAlarm varmeVagt = new OverophedningsAlarm();
        // termostat.tilføjLytter(frostVagt);
        // termostat.tilføjLytter(varmeVagt);

        // termostat.målNyTemperatur(0.0); // Normal
        // assertFalse(frostVagt.erAlarmAktiv()); assertFalse(varmeVagt.erAlarmAktiv());

        // termostat.målNyTemperatur(-6.0); // Frost
        // assertTrue(frostVagt.erAlarmAktiv());

        // termostat.målNyTemperatur(3.0); // Varme
        // assertTrue(varmeVagt.erAlarmAktiv()); assertFalse(frostVagt.erAlarmAktiv());
        fail("JUnit test for 11.9 skal implementeres når klasser er klar.");
    }


    // --- Opgave 11.10: Brugeraktivitets Tracker (Revideret) ---
    // (Skelet)
    @Test
    void testBrugerAktivitet_TrofæOgSikkerhed_11_10() {
        // SpilSession session = new SpilSession("PlayerX");
        // TrofæSystem trofæer = new TrofæSystem(Arrays.asList("MONSTER_BESEJRET"), 2);
        // MistænkeligAktivitetsRapport sikkerhed = new MistænkeligAktivitetsRapport(2, 3); // 2 fejl indenfor 3 handlinger

        // session.registrerObservatør(trofæer);
        // session.registrerObservatør(sikkerhed);

        // session.logHandling("MONSTER_BESEJRET", null);
        // session.logHandling("MONSTER_BESEJRET", null); // Trofæ!
        // assertEquals(1, trofæer.getUdløsteTrofæer().size());

        // session.logHandling("LOGIN_FEJL", null);
        // session.logHandling("ANDEN_HANDLING", null);
        // session.logHandling("LOGIN_FEJL", null); // 2. LOGIN_FEJL indenfor 3 handlinger
        // assertTrue(sikkerhed.getSenesteSikkerhedsstatus().contains("HØJ PRIORITET"));
        fail("JUnit test for 11.10 skal implementeres når klasser er klar.");
    }
}