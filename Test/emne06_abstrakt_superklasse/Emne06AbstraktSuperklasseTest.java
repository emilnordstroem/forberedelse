package emne06_abstrakt_superklasse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Når du har oprettet dine klasser, fjern kommenteringen for de relevante imports.
/*
// Opgave 6.1
import emne06_abstrakt_superklasse.FigurBase;
import emne06_abstrakt_superklasse.CirkelFigurAbs;
import emne06_abstrakt_superklasse.RektangelFigurAbs;

// Opgave 6.2
import emne06_abstrakt_superklasse.MusikinstrumentBase;
import emne06_abstrakt_superklasse.StrengeinstrumentAbs;
import emne06_abstrakt_superklasse.BlæseinstrumentAbs;

// Opgave 6.3
import emne06_abstrakt_superklasse.AnsatBase;
import emne06_abstrakt_superklasse.FuldtidsMedarbejder;
import emne06_abstrakt_superklasse.DeltidsMedarbejder;

// Opgave 6.4
import emne06_abstrakt_superklasse.Fødevare;
import emne06_abstrakt_superklasse.FrugtAbs;
import emne06_abstrakt_superklasse.GrøntsagAbs;

// Opgave 6.5
import emne06_abstrakt_superklasse.Kunstværk;
import emne06_abstrakt_superklasse.Maleri;
import emne06_abstrakt_superklasse.Skulptur;

// Opgave 6.6
import emne06_abstrakt_superklasse.DatastrukturOperation;
import emne06_abstrakt_superklasse.ArraySumOperation;
import emne06_abstrakt_superklasse.ListeMaxOperation; // Bemærk navnejustering til ListeMaxOperation

// Opgave 6.7
import emne06_abstrakt_superklasse.SpilKarakter;
import emne06_abstrakt_superklasse.Kriger;
import emne06_abstrakt_superklasse.Magiker;
// import emne06_abstrakt_superklasse.SpilVerden; // Hvis SpilVerden er en defineret klasse

// Opgave 6.8
import emne06_abstrakt_superklasse.Transportmiddel;
import emne06_abstrakt_superklasse.Tog;
import emne06_abstrakt_superklasse.Bus;

// Opgave 6.9
import emne06_abstrakt_superklasse.ByggeMateriale;
import emne06_abstrakt_superklasse.TræMateriale;
import emne06_abstrakt_superklasse.MetalMateriale;

// Opgave 6.10
import emne06_abstrakt_superklasse.FinansieltInstrument;
import emne06_abstrakt_superklasse.Aktie;
import emne06_abstrakt_superklasse.Obligation;
*/

class Emne06AbstraktSuperklasseTest {

    // --- Opgave 6.1: Abstrakt FigurBase ---
    @Test
    void testFigurBase_CirkelOgRektangel_6_1() {
//        // FigurBase kan ikke instantieres: assertThrows(Error.class, () -> new FigurBase("Test"));
//
//        CirkelFigurAbs cirkel = new CirkelFigurAbs("Rød", 10.0);
//        assertEquals("Rød", cirkel.getFarve());
//        assertEquals("Cirkel", cirkel.getFigurNavn());
//        assertEquals(Math.PI * 100, cirkel.beregnAreal(), 0.01);
//        assertTrue(cirkel.getInfo().contains("Cirkel er Rød") && cirkel.getInfo().contains(String.format("%.2f", Math.PI * 100).replace(",", ".")));
//
//        RektangelFigurAbs rekt = new RektangelFigurAbs("Blå", 4.0, 5.0);
//        assertEquals("Blå", rekt.getFarve());
//        assertEquals("Rektangel", rekt.getFigurNavn());
//        assertEquals(20.0, rekt.beregnAreal(), 0.01);
//        assertTrue(rekt.getInfo().contains("Rektangel er Blå") && rekt.getInfo().contains("areal på 20.0"));
//
//        // Test validering i konstruktør (hvis du implementerer det til at kaste fejl)
//        // assertThrows(IllegalArgumentException.class, () -> new CirkelFigurAbs("Grøn", -5.0));
    }

    // --- Opgave 6.2: Abstrakt MusikinstrumentBase ---
    @Test
    void testMusikinstrumentBase_Subklasser_6_2() {
//        StrengeinstrumentAbs guitar = new StrengeinstrumentAbs("Guitar", 6);
//        assertEquals("Guitar", guitar.getInstrumentNavn());
//        assertEquals("Kling-klang", guitar.spilGrundLyd());
//        assertEquals(6, guitar.getAntalNøgleDele());
//        assertTrue(guitar.getVedligeholdelsesInfo().contains("Guitar") && guitar.getVedligeholdelsesInfo().contains("6 nøgledele"));
//
//        BlæseinstrumentAbs trompet = new BlæseinstrumentAbs("Trompet", "Messing");
//        assertEquals("Trompet", trompet.getInstrumentNavn());
//        assertEquals("Trut-trut", trompet.spilGrundLyd());
//        assertEquals(3, trompet.getAntalNøgleDele()); // Antager 3 for ventiler som i opg.
//        assertTrue(trompet.getVedligeholdelsesInfo().contains("Trompet") && trompet.getVedligeholdelsesInfo().contains("3 nøgledele"));
    }

    // --- Opgave 6.3: Abstrakt AnsatBase ---
    @Test
    void testAnsatBase_Lønberegning_6_3() {
//        FuldtidsMedarbejder fuldtid = new FuldtidsMedarbejder("Anders And", 1, 30000.0, 5000.0);
//        // Grundløn/12 + bonus/12 = 30000/12 + 5000/12 = 2500 + 416.66 = 2916.66
//        assertEquals(2916.66, fuldtid.beregnMånedsløn(), 0.01);
//
//        DeltidsMedarbejder deltid = new DeltidsMedarbejder("Mickey Mouse", 2, 150.0);
//        deltid.registrerTimer(80.0); // 80 timer
//        assertEquals(150.0 * 80.0, deltid.beregnMånedsløn(), 0.01); // 12000
//        // Test udskrivLønseddel ved manuel inspektion af output, eller ved at fange System.out
    }

    // --- Opgave 6.4: Abstrakt Fødevare ---
    @Test
    void testFødevare_KategoriOgSundhed_6_4() {
//        FrugtAbs æble = new FrugtAbs("Æble", 52, true); // 52 kcal/100g
//        assertEquals("Frugt", æble.getKategori());
//        assertTrue(æble.erSund()); // 52 < 100
//        assertTrue(æble.getBeskrivelse().contains("Æble (Frugt)") && æble.getBeskrivelse().contains("Sund: Ja"));
//
//        FrugtAbs banan = new FrugtAbs("Banan", 105, false); // 105 kcal/100g
//        assertFalse(banan.erSund()); // 105 >= 100
//
//        GrøntsagAbs broccoli = new GrøntsagAbs("Broccoli", 34, true);
//        assertEquals("Grøntsag", broccoli.getKategori());
//        assertTrue(broccoli.erSund()); // Altid sand for grøntsager i denne model
//        assertTrue(broccoli.getBeskrivelse().contains("Broccoli (Grøntsag)") && broccoli.getBeskrivelse().contains("Sund: Ja"));
    }

    // --- Opgave 6.5: Abstrakt Kunstværk ---
    @Test
    void testKunstværk_VærdiEstimat_6_5() {
//        Maleri mona = new Maleri("Mona Lisa", "Leonardo da Vinci", 1506, "Olie på poppeltræ");
//        // Alder i f.eks. år 2006 = 500 år. Værdi = 1000 * 500 = 500000 (uden teknik-bonus)
//        // Hvis "Olie på lærred" giver bonus, men her er det "Olie på poppeltræ".
//        // Juster testen baseret på din præcise logik for teknik-bonus.
//        // Antag for nu at "Olie på poppeltræ" ikke giver den specifikke bonus på 5000.
//        assertEquals(1000.0 * (2025 - 1506), mona.estimerVærdi(2025 - 1506), 0.01);
//        assertEquals("Olie på poppeltræ", mona.getTeknik());
//
//        Skulptur david = new Skulptur("David", "Michelangelo", 1504, "Marmor", 5660.0); // 5660 kg
//        // Alder i f.eks. år 2004 = 500 år. Værdi = 500 * 500 * 5660
//        assertEquals(500.0 * (2025 - 1504) * 5660.0, david.estimerVærdi(2025 - 1504), 0.01);
//        assertEquals("Skulptur i Marmor", david.getTeknik());
    }

    // --- Opgave 6.6: Abstrakt DatastrukturOperation ---
    @Test
    void testDatastrukturOperation_SumOgMax_6_6() {
//        int[] data = {1, 5, 2, 8, 3, 9, 4, 6, 7};
//
//        DatastrukturOperation sumOp = new ArraySumOperation();
//        assertEquals(1+5+2+8+3+9+4+6+7, sumOp.udførOperationPåData(data));
//
//        DatastrukturOperation maxOp = new ListeMaxOperation(); // Omdøbt fra ListeMaxOperation
//        assertEquals(9, maxOp.udførOperationPåData(data));
//
//        int[] emptyData = {};
//        assertEquals(0, sumOp.udførOperationPåData(emptyData)); // Initialiseret til 0
//        assertEquals(Integer.MIN_VALUE, maxOp.udførOperationPåData(emptyData)); // Initialiseret til MIN_VALUE
    }

    // --- Opgave 6.7: Abstrakt SpilKarakter ---
    @Test
    void testSpilKarakter_Angreb_6_7() {
//        // Antag SpilVerden er null for disse tests, da den ikke er defineret endnu.
//        Kriger kriger = new Kriger("Konan", 150, 20); // health, mana
//        Magiker gandalf = new Magiker("Gandalf", 80, 100);
//
//        assertEquals("Konan (Kriger) udfører Sværdhug! på Gandalf (Magiker).", kriger.udførBasisAngreb(gandalf));
//        // Antag basisangreb gør skade - test gandalf.getHealth()
//
//        // gandalf.setMana(10); // For at teste specialangreb med for lidt mana
//        // assertEquals("Gandalf (Magiker) har ikke nok mana til Ildkugle!", gandalf.udførSpecialAngreb(kriger));
//
//        gandalf.setMana(100); // Sæt mana igen
//        assertTrue(gandalf.udførSpecialAngreb(kriger).contains("Ildkugle"));
//        assertEquals(100 - 25, gandalf.getMana()); // Antager Ildkugle koster 25 mana
//        // Test kriger.getHealth() efter angreb
    }


    // --- Opgave 6.8: Abstrakt Transportmiddel ---
    @Test
    void testTransportmiddel_BilletprisOgType_6_8() {
//        Tog intercity = new Tog("ICL 200", 400, true);
//        intercity.stigPå(50);
//        assertEquals(50, intercity.getNuværendePassagerer());
//        assertEquals(3 * 12.50, intercity.beregnBilletpris(3), 0.01);
//        assertTrue(intercity.getTransportTypeInfo().contains("Tog rute ICL 200"));
//
//        Bus bybus = new Bus("5A", 60, false); // Ikke natbus
//        bybus.stigPå(70); // Flere end kapacitet
//        assertEquals(60, bybus.getNuværendePassagerer()); // Skulle maxes ud ved kapacitet
//        assertEquals(2 * 10.0, bybus.beregnBilletpris(2), 0.01);
//
//        Bus natbus = new Bus("N5", 50, true);
//        assertEquals(2 * 10.0 + 5.0, natbus.beregnBilletpris(2), 0.01);
    }

    // --- Opgave 6.9: Abstrakt ByggeMateriale ---
    @Test
    void testByggeMateriale_Egenskaber_6_9() {
//        TræMateriale fyr = new TræMateriale("Fyrretræ", 450, "Fyr"); // Navn, densitet, sort
//        assertEquals(450 * 0.5, fyr.beregnVægt(0.5), 0.01); // 0.5 m^3
//        assertTrue(fyr.erBrandbart());
//        assertTrue(fyr.getStyrkeFaktor() >= 3 && fyr.getStyrkeFaktor() <= 6);
//
//        MetalMateriale stål = new MetalMateriale("Konstruktionsstål", 7850, "Stål");
//        assertFalse(stål.erBrandbart());
//        assertTrue(stål.getStyrkeFaktor() >= 7 && stål.getStyrkeFaktor() <= 10);
    }

    // --- Opgave 6.10: Abstrakt FinansieltInstrument ---
    @Test
    void testFinansieltInstrument_Afkast_6_10() {
//        Aktie apple = new Aktie("AAPL", 170.0, "Apple Inc.", 0.92); // symbol, pris, navn, dividende
//        // Afkast = (0.92 / 170.0) * 100 + 2.0 (antaget fast 2% kursstigning)
//        assertEquals((0.92 / 170.0) * 100.0 + 2.0, apple.beregnForventetAfkastProcent(), 0.01);
//        assertTrue(apple.getInstrumentTypeBeskrivelse().contains("Aktie i Apple Inc."));
//
//        Obligation statsObl = new Obligation("STATDK2030", 102.5, 1.5, LocalDate.of(2030,1,1)); // symbol, pris, kupon%, udløb
//        assertEquals(1.5, statsObl.beregnForventetAfkastProcent(), 0.01);
//        assertTrue(statsObl.getInstrumentTypeBeskrivelse().contains("Obligation (STATDK2030) med udløb 2030-01-01"));
//
//        statsObl.opdaterPris(103.0);
//        assertEquals(103.0, statsObl.getNuværendePris());
//        // assertThrows(IllegalArgumentException.class, () -> statsObl.opdaterPris(-5.0)); // Hvis validering kaster fejl
    }
}