package emne07_interface;

import java.time.LocalDate; // Kan blive relevant
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; // For Opgave 7.7
import java.util.List;
import java.util.HashMap; // For Opgave 7.3
import java.util.Map;   // For Opgave 7.3


/**
 * Generel Beskrivelse for Opgavesættet Emne 7: Interface
 * =======================================================
 * Dette opgavesæt fokuserer på Emne 7: Interface.
 * Formålet er at designe, definere og implementere interfaces for at specificere
 * kontrakter for adfærd. Opgaverne vil demonstrere, hvordan interfaces
 * muliggør polymorfi, løs kobling, og hvordan en klasse kan implementere
 * flere interfaces. Inkluderer også brug af standard Java interfaces
 * som Comparable og Comparator, samt default metoder.
 * Opret separate .java filer for hver interface og klasse.
 */
public class Emne07Interface {

    /**
     * Opgave 7.1: `Logføringsbar` Interface
     * -------------------------------------
     * Filnavne: Logføringsbar.java, FilLogger.java, KonsolLogger.java, SystemMonitor.java
     *
     * Beskrivelse:
     * 1. Interface `Logføringsbar`:
     * - Metode: `void logInfo(String besked)`
     * - Metode: `void logAdvarsel(String advarsel)`
     * - Metode: `void logFejl(String fejlBesked, Exception e)` (e kan være null)
     * - Metode: `List<String> hentSenesteLogs(int antal)`
     * 2. Klasse `FilLogger` implements `Logføringsbar`:
     * - Gemmer logs i en intern `ArrayList<String>`. Hver log-entry formateres med type (INFO, ADV, FEJL) og tidspunkt (simuleret).
     * - `hentSenesteLogs` returnerer de `antal` seneste entries.
     * 3. Klasse `KonsolLogger` implements `Logføringsbar`:
     * - Udskriver logs til konsollen (System.out/err).
     * - For testbarhed, gemmer den også de seneste logs i en intern liste (ligesom FilLogger).
     * 4. Klasse `SystemMonitor`:
     * - Har en `Logføringsbar` attribut (kan sættes via konstruktør).
     * - Metode `void udførSystemTjek()`: Simulerer et tjek. Hvis alt ok, logInfo. Hvis mindre problem, logAdvarsel. Hvis kritisk, logFejl.
     *
     * TODO: Opret interface og klasser. Implementer.
     */

    /**
     * Opgave 7.2: `Flyvende` og `Svømmende` Interfaces
     * ------------------------------------------------
     * Filnavne: Flyvende.java, Svømmende.java, And.java, Fisk.java, Flyvefisk.java
     *
     * Beskrivelse:
     * 1. Interface `Flyvende`:
     * - Metode: `String tagAf()`
     * - Metode: `String flyv()`
     * - Metode: `String land()`
     * 2. Interface `Svømmende`:
     * - Metode: `String dykNed()`
     * - Metode: `String svøm()`
     * - Metode: `String komOpTilOverfladen()`
     * 3. Klasse `And` implements `Flyvende`, `Svømmende`:
     * - Implementer alle metoder med passende ande-lyde/beskrivelser.
     * 4. Klasse `Fisk` implements `Svømmende`:
     * - Implementer metoderne.
     * 5. Klasse `Flyvefisk` implements `Flyvende`, `Svømmende`: (Ja, de kan glide over vandet!)
     * - Implementer metoderne. `tagAf` kan være "Springer op af vandet!", `land` kan være "Plasker tilbage i vandet!".
     *
     * Opgave (i en main metode eller test):
     * Opret en `List` der kan holde både `Flyvende` og `Svømmende` objekter (hvordan?).
     * Iterer over en liste af blandede objekter. Brug `instanceof` til at tjekke, hvad de kan,
     * og kald de relevante metoder. Saml resultaterne i en log-liste.
     * TODO: Opret interfaces og klasser.
     */

    /**
     * Opgave 7.3: Generisk `Datakilde` Interface
     * -------------------------------------------
     * Filnavne: Datakilde.java, Produkt.java, ProduktHukommelsesDatakilde.java
     *
     * Beskrivelse:
     * 1. Klasse `Produkt`: Simpel klasse med `id` (String), `navn` (String), `pris` (double).
     * Implementer en passende `equals(Object o)` metode baseret på produktets `id`.
     * Inkluder også en konstruktør og get-metoder.
     * 2. Interface `Datakilde<T>` (generisk type `T`):
     * - Metode: `boolean gem(T data)` (returnerer true hvis gemt, false hvis f.eks. ID allerede eksisterer)
     * - Metode: `T hent(String id)` (returnerer dataobjekt eller null)
     * - Metode: `List<T> hentAlle()`
     * - Metode: `boolean opdater(T data)` (opdaterer eksisterende data, returner false hvis ID ikke findes)
     * - Metode: `boolean slet(String id)` (returnerer true hvis slettet, false hvis ID ikke findes)
     * 3. Klasse `ProduktHukommelsesDatakilde` implements `Datakilde<Produkt>`:
     * - Bruger en `HashMap<String, Produkt>` internt til at lagre produkter (produktets ID er nøglen).
     * - Implementer alle metoder fra `Datakilde` interfacet.
     *
     * TODO: Opret Produkt.java, Datakilde.java, ProduktHukommelsesDatakilde.java. Implementer.
     */

    /**
     * Opgave 7.4: `Skalerbar` Interface for Figurer
     * --------------------------------------------
     * Filnavne: Skalerbar.java, SkalerbarCirkel.java, SkalerbartRektangel.java
     *
     * Beskrivelse:
     * 1. Interface `Skalerbar`:
     * - Metode: `void skaler(double faktor)` (skalerer figurens størrelse med faktoren)
     * - Metode: `double getAreal()`
     * - Metode: `String getFigurBeskrivelse()`
     * 2. Klasse `SkalerbarCirkel` implements `Skalerbar`:
     * - Attribut: `radius`. Konstruktør.
     * - `skaler(faktor)` multiplicerer `radius` med `faktor`.
     * - Implementer `getAreal()` og `getFigurBeskrivelse()`.
     * 3. Klasse `SkalerbartRektangel` implements `Skalerbar`:
     * - Attributter: `længde`, `bredde`. Konstruktør.
     * - `skaler(faktor)` multiplicerer både `længde` og `bredde` med `faktor`.
     * - Implementer `getAreal()` og `getFigurBeskrivelse()`.
     *
     * TODO: Opret interface og klasser. Implementer.
     */

    /**
     * Opgave 7.5: `Krypterbar` Interface
     * ---------------------------------
     * Filnavne: Krypterbar.java, CaesarKryptering.java, OmvendtKryptering.java
     *
     * Beskrivelse:
     * 1. Interface `Krypterbar`:
     * - Metode: `String krypter(String tekst)`
     * - Metode: `String dekrypter(String krypteretTekst)`
     * 2. Klasse `CaesarKryptering` implements `Krypterbar`:
     * - Har en `forskydning` (int) attribut, sat i konstruktøren.
     * - Implementer Caesar-kryptering/dekryptering (flyt hvert bogstav `forskydning` pladser i alfabetet,
     * kun for engelske bogstaver a-z, A-Z, wrap around, ignorer andre tegn).
     * 3. Klasse `OmvendtKryptering` implements `Krypterbar`:
     * - `krypter(tekst)` returnerer teksten baglæns.
     * - `dekrypter(krypteretTekst)` returnerer også den krypterede tekst baglæns (da det er symmetrisk).
     *
     * TODO: Opret interface og klasser. Implementer.
     */

    /**
     * Opgave 7.6: Sortering af `Bruger` objekter med `Comparable`
     * ----------------------------------------------------------
     * Filnavne: Bruger.java
     *
     * Beskrivelse:
     * 1. Klasse `Bruger` implements `Comparable<Bruger>`:
     * - Attributter: `id` (int), `navn` (String), `email` (String), `oprettelsesDato` (LocalDate).
     * - Konstruktør. Getters.
     * - Implementer `compareTo(Bruger andenBruger)`:
     * - Primær sortering: Efter `oprettelsesDato` (ældste først).
     * - Sekundær sortering (hvis datoer er ens): Efter `navn` (alfabetisk).
     * - Tertiær sortering (hvis navne også er ens): Efter `id` (mindste først).
     *
     * TODO: Opret Bruger.java. Implementer Comparable og de andre dele.
     */

    /**
     * Opgave 7.7: Sortering af `Film` objekter med `Comparator`
     * --------------------------------------------------------
     * Filnavne: Film.java, FilmTitelComparator.java, FilmÅrstalComparator.java, FilmRatingComparator.java
     *
     * Beskrivelse:
     * 1. Klasse `Film`:
     * - Attributter: `titel` (String), `instruktør` (String), `udgivelsesår` (int), `rating` (double, 0.0-10.0).
     * - Konstruktør. Getters. `toString()`.
     * 2. Klasse `FilmTitelComparator` implements `Comparator<Film>`:
     * - Sammenligner Film-objekter baseret på deres `titel` (alfabetisk).
     * 3. Klasse `FilmÅrstalComparator` implements `Comparator<Film>`:
     * - Sammenligner Film-objekter baseret på deres `udgivelsesår` (ældste først).
     * - Hvis årstal er ens, kan den sekundært sortere på titel.
     * 4. Klasse `FilmRatingComparator` implements `Comparator<Film>`:
     * - Sammenligner Film-objekter baseret på deres `rating` (højeste rating først).
     *

     * TODO: Opret klasserne og comparatorerne. Implementer.
     */

    /**
     * Opgave 7.8: `Validerbar` Interface med Default Metoder
     * ----------------------------------------------------
     * Filnavne: Validerbar.java, BrugerInput.java, PasswordInput.java
     *
     * Beskrivelse:
     * 1. Interface `Validerbar`:
     * - Metode (abstract): `boolean erGyldig()`
     * - Metode (abstract): `String getFejlBesked()` (returnerer fejlbesked hvis `erGyldig()` er false, ellers null/tom)
     * - Metode (default): `void validerOgLog()`:
     * - Hvis `erGyldig()` er true, print "Validering OK for: [resultat af getValideringsKontekst()]".
     * - Ellers, print "Validering FEJL for: [resultat af getValideringsKontekst()]: [resultat af getFejlBesked()]".
     * - Metode (default): `String getValideringsKontekst()`: Returnerer "Generisk input". Kan overrides af implementerende klasser.
     * 2. Klasse `BrugerInput` implements `Validerbar`:
     * - Attribut: `inputStreng` (String), `minLængde` (int). Konstruktør.
     * - Implementer `erGyldig()` (tjekker om `inputStreng.length() >= minLængde`).
     * - Implementer `getFejlBesked()`.
     * - Override `getValideringsKontekst()` til at returnere "BrugerInput streng".
     * 3. Klasse `PasswordInput` implements `Validerbar`:
     * - Attribut: `password` (String). Konstruktør.
     * - Implementer `erGyldig()` (tjekker f.eks. min. 8 tegn OG indeholder mindst ét tal).
     * - Implementer `getFejlBesked()`.
     *
     * TODO: Opret interface og klasser. Test `validerOgLog()` default metoden.
     */

    /**
     * Opgave 7.9: `Ressource` Interface til spilobjekter
     * -------------------------------------------------
     * Filnavne: Ressource.java, TræStamme.java, JernMalm.java, GuldÅre.java, Indsamler.java
     *
     * Beskrivelse:
     * 1. Interface `Ressource`:
     * - Metode: `String getRessourceType()` (f.eks. "Træ", "Jern", "Guld")
     * - Metode: `int getAntalEnhederTilbage()`
     * - Metode: `int indsamlEnheder(int ønsketAntal)` (forsøger at indsamle, reducerer enheder tilbage,
     * returnerer faktisk indsamlet antal - kan være mindre end ønsket hvis ikke nok).
     * 2. Klasse `TræStamme` implements `Ressource`. Konstruktør tager start antal enheder.
     * 3. Klasse `JernMalm` implements `Ressource`. Konstruktør tager start antal enheder.
     * 4. Klasse `GuldÅre` implements `Ressource`. Konstruktør tager start antal enheder.
     * 5. Klasse `Indsamler`:
     * - Metode: `void indsamlFraRessource(Ressource res, int antalAtForsøge)`:
     * - Kalder `indsamlEnheder` på `res`. Udskriver hvad der blev indsamlet af hvilken type.
     *
     * TODO: Opret interface og klasser. Test `Indsamler` med forskellige ressourcetyper.
     */

    /**
     * Opgave 7.10: `Konfigurerbar` Interface med Static Metoder
     * --------------------------------------------------------
     * Filnavne: Konfigurerbar.java, DatabaseForbindelse.java, WebServer.java
     *
     * Beskrivelse:
     * 1. Interface `Konfigurerbar`:
     * - Metode (abstract): `void setParameter(String parameterNavn, String værdi)`
     * - Metode (abstract): `String getParameter(String parameterNavn)`
     * - Metode (abstract): `boolean erKonfigureretKorrekt()` (tjekker om nødvendige parametre er sat)
     * - Metode (static): `Konfigurerbar opretFraProperties(Map<String, String> properties, String type)`:
     * - En factory-metode. Hvis `type` er "Database", opret og returner en `DatabaseForbindelse`.
     * - Hvis `type` er "WebServer", opret og returner en `WebServer`.
     * - For hver entry i `properties`, kald `setParameter` på det oprettede objekt.
     * - Returner `null` hvis type er ukendt.
     * 2. Klasse `DatabaseForbindelse` implements `Konfigurerbar`:
     * - Gemmer parametre (f.eks. "host", "port", " brugernavn", "password") i en intern HashMap.
     * - `erKonfigureretKorrekt` tjekker om "host", "port", "brugernavn" er sat.
     * 3. Klasse `WebServer` implements `Konfigurerbar`:
     * - Gemmer parametre (f.eks. "port", "rootDirectory", "maxConnections") i en intern HashMap.
     * - `erKonfigureretKorrekt` tjekker om "port" og "rootDirectory" er sat.
     *
     * TODO: Opret interface og klasser. Implementer. Test især den statiske factory-metode.
     */

    public static void main(String[] args) {
        System.out.println("=== Emne 7: Interface - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for hver klasse/interface og brug JUnit-tests. ===");
    }
}