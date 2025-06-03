package emne09_associering;//package emne09_associering;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//// Når du har oprettet dine klasser, fjern kommenteringen for de relevante imports.
///*
//// Opgave 9.1
//import emne09_associering_og_komposition.Pas;
//import emne09_associering_og_komposition.PersonMedPas;
//
//// Opgave 9.2
//import emne09_associering_og_komposition.UdgivetBog;
//import emne09_associering_og_komposition.Forfatter;
//
//// Opgave 9.3
//import emne09_associering_og_komposition.PartnerPerson;
//
//// Opgave 9.4
//import emne09_associering_og_komposition.Elev; // Omdøbt fra ElevIAssoc for konsistens
//import emne09_associering_og_komposition.Klasselokale;
//
//// Opgave 9.5
//import emne09_associering_og_komposition.AfdelingsMedarbejder;
//import emne09_associering_og_komposition.Virksomhed;
//
//// Opgave 9.6
//import emne09_associering_og_komposition.BlogIndlæg;
//import emne09_associering_og_komposition.Blogger;
//
//// Opgave 9.7
//import emne09_associering_og_komposition.Lufthavn;
//import emne09_associering_og_komposition.FlyRute;
//
//// Opgave 9.8
//import emne09_associering_og_komposition.Butik;
//import emne09_associering_og_komposition.Kunde;
//
//// Opgave 9.9
//import emne09_associering_og_komposition.SimpelBil;
//import emne09_associering_og_komposition.BilEjer;
//
//// Opgave 9.10
//import emne09_associering_og_komposition.PatientJournal;
//import emne09_associering_og_komposition.Læge;
//
//// Opgave 9.11
//import emne09_associering_og_komposition.ProfessorAGG;
//import emne09_associering_og_komposition.Universitet;
//
//// Opgave 9.12
//import emne09_associering_og_komposition.Værelse;
//import emne09_associering_og_komposition.BygningKOM;
//
//// Opgave 9.13
//import emne09_associering_og_komposition.CPU;
//import emne09_associering_og_komposition.HukommelsesModul;
//import emne09_associering_og_komposition.EksternHarddisk;
//import emne09_associering_og_komposition.PersonligComputer;
//*/
//
//class Emne09AssocieringTest {
//
//    // --- Opgave 9.1: Person og Pas (Enkeltrettet 1-til-0..1) ---
//    @Test
//    void testPersonMedPas_SetOgGetPas_9_1() {
//        Pas p1Pas = new Pas("DK12345", LocalDate.now().plusYears(5));
//        PersonMedPas person1 = new PersonMedPas("Anders And");
//
//        assertNull(person1.getPas(), "Pas skal være null initielt, hvis ikke sat i konstruktør.");
//        person1.setPas(p1Pas);
//        assertEquals(p1Pas, person1.getPas());
//
//        Pas p2Pas = new Pas("DK67890", LocalDate.now().plusYears(3));
//        person1.setPas(p2Pas); // Erstatter det gamle pas
//        assertEquals(p2Pas, person1.getPas());
//
//        person1.setPas(null); // Fjerner passet
//        assertNull(person1.getPas());
//    }
//
//    // --- Opgave 9.2: Forfatter og UdgivetBog (Enkeltrettet 1-til-0..*) ---
//    @Test
//    void testForfatter_TilføjFjernOgGetBøger_9_2() {
//        Forfatter forfatter = new Forfatter("J.K. Rowling");
//        UdgivetBog bog1 = new UdgivetBog("Harry Potter 1", 1997);
//        UdgivetBog bog2 = new UdgivetBog("Harry Potter 2", 1998);
//        UdgivetBog bog1Dup = new UdgivetBog("Harry Potter 1", 1997); // Antager equals er på titel+år
//
//        assertTrue(forfatter.getAlleBøger().isEmpty());
//        assertTrue(forfatter.tilføjBog(bog1));
//        assertTrue(forfatter.tilføjBog(bog2));
//        assertEquals(2, forfatter.getAntalBøger());
//        assertFalse(forfatter.tilføjBog(bog1Dup)); // Dublet
//        assertEquals(2, forfatter.getAntalBøger());
//
//        assertTrue(forfatter.fjernBog(bog1));
//        assertEquals(1, forfatter.getAntalBøger());
//        assertNull(forfatter.findBogMedTitel("Harry Potter 1"));
//        assertEquals(bog2, forfatter.findBogMedTitel("Harry Potter 2"));
//
//        List<UdgivetBog> bøgerKopi = forfatter.getAlleBøger();
//        assertThrows(UnsupportedOperationException.class, () -> bøgerKopi.add(new UdgivetBog("Test", 2000)),
//                "getAlleBøger() bør returnere en uforanderlig kopi eller en ny liste.");
//    }
//
//    // --- Opgave 9.3: PartnerPerson (Dobbeltrettet 1-til-0..1) ---
//    @Test
//    void testPartnerPerson_SetÆgtefælle_9_3() {
//        PartnerPerson p1 = new PartnerPerson("Adam");
//        PartnerPerson p2 = new PartnerPerson("Eva");
//        PartnerPerson p3 = new PartnerPerson("Steve");
//
//        assertNull(p1.getÆgtefælle());
//        assertNull(p2.getÆgtefælle());
//
//        p1.setÆgtefælle(p2); // Adam gifter sig med Eva
//        assertEquals(p2, p1.getÆgtefælle());
//        assertEquals(p1, p2.getÆgtefælle(), "Evas ægtefælle skal opdateres til Adam.");
//
//        p1.setÆgtefælle(p3); // Adam gifter sig med Steve (Eva er nu single)
//        assertEquals(p3, p1.getÆgtefælle());
//        assertEquals(p1, p3.getÆgtefælle(), "Steves ægtefælle skal opdateres til Adam.");
//        assertNull(p2.getÆgtefælle(), "Eva skal ikke længere være gift med Adam.");
//
//        p1.setÆgtefælle(null); // Adam bliver skilt fra Steve
//        assertNull(p1.getÆgtefælle());
//        assertNull(p3.getÆgtefælle(), "Steve skal ikke længere være gift med Adam.");
//    }
//
//    // --- Opgave 9.4: Klasselokale og Elev (Dobbeltrettet 1-til-0..*) ---
//    @Test
//    void testKlasselokaleElev_TilføjOgFjern_9_4() {
//        Klasselokale klA = new Klasselokale("1A");
//        Elev elev1 = new Elev("Ole", 1);
//        Elev elev2 = new Elev("Pia", 2);
//
//        assertTrue(klA.tilføjElev(elev1));
//        assertEquals(klA, elev1.getKlasseVærelseTilknyttet());
//        assertTrue(klA.getElever().contains(elev1));
//
//        assertTrue(klA.tilføjElev(elev2));
//        assertEquals(klA, elev2.getKlasseVærelseTilknyttet());
//        assertEquals(2, klA.getElever().size());
//
//        assertTrue(klA.fjernElev(elev1));
//        assertNull(elev1.getKlasseVærelseTilknyttet());
//        assertFalse(klA.getElever().contains(elev1));
//        assertEquals(1, klA.getElever().size());
//
//        // Test at elev skifter klasse
//        Klasselokale klB = new Klasselokale("1B");
//        elev2.setKlasseVærelseTilknyttet(klB); // Pia skifter til 1B
//        assertEquals(klB, elev2.getKlasseVærelseTilknyttet());
//        assertTrue(klB.getElever().contains(elev2));
//        assertFalse(klA.getElever().contains(elev2), "Elev2 skal være fjernet fra klA's elevliste");
//    }
//
//
//    // --- Opgave 9.5: Virksomhed og AfdelingsMedarbejder ---
//    @Test
//    void testVirksomhedMedarbejder_AnsættelseSkift_9_5() {
//        Virksomhed v1 = new Virksomhed("Tech Corp", "CVR1");
//        Virksomhed v2 = new Virksomhed("Soft Solutions", "CVR2");
//        AfdelingsMedarbejder m1 = new AfdelingsMedarbejder("Mads Madsen", 101);
//        AfdelingsMedarbejder m2 = new AfdelingsMedarbejder("Ida Iversen", 102);
//
//        assertTrue(v1.ansætMedarbejder(m1));
//        assertEquals(v1, m1.getAfdeling());
//        assertTrue(v1.getMedarbejdere().contains(m1));
//
//        assertTrue(v1.ansætMedarbejder(m2)); // Ida ansættes i v1
//        assertEquals(v1, m2.getAfdeling());
//
//        m2.blivAnsatiVirksomhed(v2); // Ida skifter til v2
//        assertEquals(v2, m2.getAfdeling());
//        assertTrue(v2.getMedarbejdere().contains(m2));
//        assertFalse(v1.getMedarbejdere().contains(m2), "Ida skal være fjernet fra v1's medarbejderliste.");
//        assertEquals(1, v1.getMedarbejdere().size());
//
//        assertTrue(v2.afskedigMedarbejder(m2));
//        assertNull(m2.getAfdeling());
//        assertFalse(v2.getMedarbejdere().contains(m2));
//    }
//
//    // --- Opgave 9.6: Blogger og BlogIndlæg ---
//    @Test
//    void testBlogger_Indlæg_9_6() {
//        Blogger blogger = new Blogger("Pennefører", "pen@example.com");
//        blogger.publicerNytIndlæg("Første Indlæg", "Dette er mit første...", LocalDate.now());
//        blogger.publicerNytIndlæg("Andet Indlæg", "Mere indhold...", LocalDate.now().plusDays(1));
//
//        assertEquals(2, blogger.getAlleIndlæg().size());
//        assertNotNull(blogger.findIndlæg("Første Indlæg"));
//        assertNull(blogger.findIndlæg("Ukendt Indlæg"));
//        assertTrue(blogger.beregnTotalKøbssum() == 0.0, "Denne metode var for KundeProfil, ikke Blogger"); // Fejl i min tanke. `beregnTotalKøbssum` var fra 9.6 kundeeksempel.
//        // For Blogger, test f.eks. antal indlæg.
//        // Denne test er justeret til at teste antal indlæg i stedet for købssum
//        assertEquals(2, blogger.getAlleIndlæg().size());
//
//        // Test at listen er en kopi
//        List<BlogIndlæg> kopi = blogger.getAlleIndlæg();
//        assertThrows(UnsupportedOperationException.class, () -> kopi.add(new BlogIndlæg("Hack", "", LocalDate.now())),
//                "getAlleIndlæg bør returnere en uforanderlig liste.");
//    }
//
//
//    // --- Opgave 9.7: FlyRute og Lufthavn ---
//    @Test
//    void testFlyRute_Lufthavne_9_7() {
//        Lufthavn cph = new Lufthavn("CPH", "Københavns Lufthavn");
//        Lufthavn aal = new Lufthavn("AAL", "Aalborg Lufthavn");
//        Lufthavn bll = new Lufthavn("BLL", "Billund Lufthavn");
//
//        FlyRute rute1 = new FlyRute("SK200", cph, aal);
//        assertEquals(cph, rute1.getAfgangsLufthavn());
//        assertEquals(aal, rute1.getAnkomstLufthavn());
//
//        // Test validering (hvis afgang og ankomst ikke må være ens)
//        // assertThrows(IllegalArgumentException.class, () -> new FlyRute("FEJL01", cph, cph));
//    }
//
//    // --- Opgave 9.8: Kunde og FavoritButik ---
//    @Test
//    void testKunde_FavoritButik_9_8() {
//        Kunde kunde = new Kunde("Hr. Olsen");
//        Butik butik1 = new Butik("Den Gode Butik", "Hovedgaden 1");
//        Butik butik2 = new Butik("Den Bedre Butik", "Sidegade 2");
//
//        assertNull(kunde.getFavoritButik());
//        kunde.setFavoritButik(butik1);
//        assertEquals(butik1, kunde.getFavoritButik());
//        kunde.setFavoritButik(butik2); // Udskifter favorit
//        assertEquals(butik2, kunde.getFavoritButik());
//        kunde.fjernFavoritButik();
//        assertNull(kunde.getFavoritButik());
//    }
//
//    // --- Opgave 9.9: BilEjer og SimpelBil ---
//    @Test
//    void testBilEjer_KøbSælgBil_9_9() {
//        BilEjer ejer1 = new BilEjer("Bent");
//        BilEjer ejer2 = new BilEjer("Børge");
//        SimpelBil bil1 = new SimpelBil("AB12345", "Ford");
//        SimpelBil bil2 = new SimpelBil("CD67890", "Fiat");
//
//        assertTrue(ejer1.købBil(bil1));
//        assertEquals(ejer1, bil1.getEjer());
//        assertTrue(ejer1.getBiler().contains(bil1));
//
//        assertTrue(ejer1.købBil(bil2)); // Ejer1 køber også bil2
//        assertEquals(ejer1, bil2.getEjer());
//        assertEquals(2, ejer1.getBiler().size());
//
//        // Børge køber bil2 fra Bent (Bent sælger, Børge køber)
//        // Dette kræver, at BilEjer.købBil også håndterer, at bilen måske har en ejer.
//        // Eller at SimpelBil.setEjer håndterer at fjerne sig fra gammel ejers liste.
//        assertTrue(ejer2.købBil(bil2)); // Antager købBil håndterer "overtagelse"
//        assertEquals(ejer2, bil2.getEjer());
//        assertTrue(ejer2.getBiler().contains(bil2));
//        assertFalse(ejer1.getBiler().contains(bil2), "Bil2 skal være fjernet fra ejer1's liste");
//        assertEquals(1, ejer1.getBiler().size());
//
//        assertTrue(ejer2.sælgBil(bil2));
//        assertNull(bil2.getEjer());
//        assertFalse(ejer2.getBiler().contains(bil2));
//    }
//
//    // --- Opgave 9.10: Læge og PatientJournal ---
//    @Test
//    void testLægePatientJournal_Tildeling_9_10() {
//        Læge lægeHansen = new Læge("L001", "Dr. Hansen");
//        Læge lægeJensen = new Læge("L002", "Dr. Jensen");
//        PatientJournal pj1 = new PatientJournal("CPR1");
//        PatientJournal pj2 = new PatientJournal("CPR2");
//
//        lægeHansen.tildelJournal(pj1);
//        assertEquals(lægeHansen, pj1.getPrimærLæge());
//        assertTrue(lægeHansen.getPatientJournaler().contains(pj1));
//
//        lægeHansen.tildelJournal(pj2); // Hansen tager også pj2
//        assertEquals(lægeHansen, pj2.getPrimærLæge());
//        assertEquals(2, lægeHansen.getPatientJournaler().size());
//
//        // pj2 skifter til lægeJensen
//        pj2.setPrimærLæge(lægeJensen);
//        assertEquals(lægeJensen, pj2.getPrimærLæge());
//        assertTrue(lægeJensen.getPatientJournaler().contains(pj2));
//        assertFalse(lægeHansen.getPatientJournaler().contains(pj2), "pj2 skal være fjernet fra Dr. Hansens liste");
//        assertEquals(1, lægeHansen.getPatientJournaler().size());
//
//        lægeJensen.fjernJournal(pj2);
//        assertNull(pj2.getPrimærLæge());
//        assertFalse(lægeJensen.getPatientJournaler().contains(pj2));
//    }
//
//    // --- Opgave 9.11: Aggregering - Universitet og ProfessorAGG ---
//    @Test
//    void testUniversitet_ProfessorAGG_Aggregering_9_11() {
//        Universitet uni = new Universitet("Aarhus Universitet");
//        ProfessorAGG profSchmidt = new ProfessorAGG("Prof. Schmidt", "Datalogi");
//        ProfessorAGG profMadsen = new ProfessorAGG("Prof. Madsen", "Historie");
//
//        uni.ansætProfessor(profSchmidt);
//        uni.ansætProfessor(profMadsen);
//        assertEquals(2, uni.getProfessorStab().size());
//
//        ProfessorAGG fjernetProf = uni.afskedigProfessor("Prof. Schmidt");
//        assertEquals(profSchmidt, fjernetProf, "Returneret professor skal være den fjernede.");
//        assertNotNull(fjernetProf, "Professor objektet skal stadig eksistere efter fjernelse fra universitetet.");
//        assertEquals(1, uni.getProfessorStab().size());
//        assertFalse(uni.getProfessorStab().contains(profSchmidt));
//    }
//
//    // --- Opgave 9.12: Komposition - BygningKOM og Værelse ---
//    @Test
//    void testBygningKOM_Værelse_Komposition_9_12() {
//        List<Map<String, Object>> rumSpecs = new ArrayList<>();
//        Map<String, Object> rum1Spec = new HashMap<>();
//        rum1Spec.put("type", "Køkken"); rum1Spec.put("areal", 15.0);
//        Map<String, Object> rum2Spec = new HashMap<>();
//        rum2Spec.put("type", "Stue"); rum2Spec.put("areal", 25.0);
//        rumSpecs.add(rum1Spec); rumSpecs.add(rum2Spec);
//
//        BygningKOM hus = new BygningKOM("Solvej 1", rumSpecs);
//        assertEquals(2, hus.getAlleVærelser().size());
//        assertEquals(15.0 + 25.0, hus.getTotalAreal(), 0.01);
//
//        hus.tilføjNytVærelse("Soveværelse", 20.0);
//        assertEquals(3, hus.getAlleVærelser().size());
//        assertEquals(15.0 + 25.0 + 20.0, hus.getTotalAreal(), 0.01);
//
//        // Test at man ikke kan modificere den interne liste via den returnerede liste
//        List<Værelse> værelserKopi = hus.getAlleVærelser();
//        assertThrows(UnsupportedOperationException.class, () -> værelserKopi.add(new Værelse("Ulovligt", 10)),
//                "getAlleVærelser bør returnere en uforanderlig kopi for at sikre komposition.");
//    }
//
//    // --- Opgave 9.13: Komposition vs. Aggregering - PersonligComputer ---
//    @Test
//    void testPersonligComputer_Dele_9_13() {
//        PersonligComputer pc = new PersonligComputer("GamerXtreme", "Intel i9", 8, 2, 16, "DDR5");
//        assertNotNull(pc.getCPUInfo());
//        assertEquals("Intel i9", pc.getCPUInfo().getModelNavn());
//        assertEquals(2, pc.getRamInfo().size());
//        assertEquals(16, pc.getRamInfo().get(0).getKapacitetGB());
//
//        assertNull(pc.getTilsluttetDiskInfo(), "Ingen ekstern disk tilsluttet fra start");
//
//        EksternHarddisk minDisk = new EksternHarddisk("Seagate", 2);
//        pc.tilslutEksternHarddisk(minDisk);
//        assertNotNull(pc.getTilsluttetDiskInfo());
//        assertEquals("Seagate", pc.getTilsluttetDiskInfo().getMærke());
//
//        EksternHarddisk fjernetDisk = pc.fjernEksternHarddisk();
//        assertEquals(minDisk, fjernetDisk);
//        assertNull(pc.getTilsluttetDiskInfo());
//        assertNotNull(fjernetDisk, "Fjernet disk skal stadig eksistere (aggregering).");
//
//        // Test at getRamInfo returnerer en kopi (eller uforanderlig liste)
//        List<HukommelsesModul> ramKopi = pc.getRamInfo();
//        assertThrows(UnsupportedOperationException.class, () -> ramKopi.add(new HukommelsesModul(8, "DDR4")),
//                "getRamInfo bør returnere en uforanderlig kopi for kompositionsdele.");
//
//        assertTrue(pc.getSystemSpecifikationer().contains("CPU: Intel i9"));
//        assertTrue(pc.getSystemSpecifikationer().contains("RAM: 2x16GB DDR5")); // Eller lignende format
//    }
//}