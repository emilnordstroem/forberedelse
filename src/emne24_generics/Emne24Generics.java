package emne24_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException; // For Opgave 24.10
import java.util.Objects; // For equals/hashCode i evt. hjælpeklasser

/**
 * Generel Beskrivelse for Opgavesættet Emne 24: Generics
 * ======================================================
 * Dette opgavesæt fokuserer på Emne 24: Generics i Java.
 * Formålet er at øve definition og anvendelse af generiske klasser,
 * generiske interfaces og generiske metoder for at skrive mere typesikker
 * og genbrugelig kode.
 * Opret separate .java filer for hver klasse/interface.
 */
public class Emne24Generics {

    /**
     * Opgave 24.1: Simpel Generisk `Holder<T>` Klasse
     * ---------------------------------------------
     * Filnavn: Holder.java
     *
     * Beskrivelse:
     * Definér en generisk klasse `Holder<T>`.
     * - Klassen skal have én privat attribut `værdi` af typen `T`.
     * - Implementer en konstruktør, der tager et argument af typen `T` og initialiserer `værdi`.
     * - Implementer en `getVærdi()` metode, der returnerer `værdi`.
     * - Implementer en `setVærdi(T nyVærdi)` metode.
     * - Implementer en `toString()` metode, der returnerer en strengrepræsentation af den holdte værdi.
     *
     * TODO: Opret Holder.java og implementer klassen.
     */

    /**
     * Opgave 24.2: Generisk Metode til at Bytte To Elementer i et Array
     * ----------------------------------------------------------------
     * Filnavn: ArrayUtilGenerics.java (eller direkte her som statisk metode)
     *
     * Beskrivelse:
     * Implementer en public static generisk metode `<T> void bytElementer(T[] array, int i, int j)`.
     * - Metoden skal bytte om på elementerne på indeks `i` og `j` i det givne `array`.
     * - Håndter tilfælde hvor indekser er ugyldige (uden for arrayets grænser) ved f.eks.
     * ikke at gøre noget eller kaste en `IndexOutOfBoundsException`.
     * - Håndter hvis arrayet er null eller har færre end `max(i,j)+1` elementer.
     *
     * TODO: Implementer den statiske generiske metode.
     */
    public static <T> void opgave24_2_bytElementer(T[] array, int i, int j) {
        // TODO: Implementer generisk bytElementer metode.
    }

    /**
     * Opgave 24.3: Generisk `Par<K, V>` Klasse (Revideret)
     * ----------------------------------------------------
     * Filnavn: Par.java
     *
     * Beskrivelse:
     * Definér en generisk klasse `Par<K, V>` der kan holde et par af værdier af to forskellige typer.
     * - Klassen skal have to private attributter: `nøgle` af typen `K` og `værdi` af typen `V`.
     * - Implementer en konstruktør: `Par(K nøgle, V værdi)`.
     * - Implementer get-metoder: `getNøgle()` og `getVærdi()`.
     * - Implementer `toString()` og en `equals(Object o)` metode. `equals` skal sammenligne
     * både `nøgle` og `værdi` (brug `Objects.equals()`).
     *
     * TODO: Opret Par.java og implementer klassen.
     */

    /**
     * Opgave 24.4: Generisk Metode til at Tælle Specifikke Elementer i en Liste
     * -----------------------------------------------------------------------
     * Filnavn: ListUtilGenerics.java (eller direkte her som statisk metode)
     *
     * Beskrivelse:
     * Implementer en public static generisk metode `<T> int tælElement(List<T> liste, T elementDerSkalTælles)`.
     * - Metoden skal tælle og returnere antallet af gange `elementDerSkalTælles` forekommer i `liste`.
     * - Brug `equals()` metoden til at sammenligne elementer.
     * - Håndter hvis `liste` eller `elementDerSkalTælles` er `null`.
     *
     * TODO: Implementer den statiske generiske metode.
     */
    public static <T> int opgave24_4_tælElement(List<T> liste, T elementDerSkalTælles) {
        // TODO: Implementer generisk tælElement metode.
        return 0; // Placeholder
    }

    /**
     * Opgave 24.5: Generisk Interface `Transformator<I, O>`
     * -----------------------------------------------------
     * Filnavne: Transformator.java (interface), StrengTilLængde.java, HeltalTilKvadrat.java
     *
     * Beskrivelse:
     * 1. Definér et generisk interface `Transformator<I, O>` (Input type, Output type):
     * - Metode: `O transformer(I input)`
     * 2. Klasse `StrengTilLængde` implements `Transformator<String, Integer>`:
     * - `transformer` metoden skal returnere længden af input-strengen.
     * 3. Klasse `HeltalTilKvadrat` implements `Transformator<Integer, Integer>`:
     * - `transformer` metoden skal returnere kvadratet af input-heltallet.
     *
     * TODO: Opret interface og de to implementerende klasser.
     */

    /**
     * Opgave 24.6: Generisk Klasse `Datatrio<T1, T2, T3>`
     * --------------------------------------------------
     * Filnavn: Datatrio.java
     *
     * Beskrivelse:
     * Definér en generisk klasse `Datatrio<T1, T2, T3>` der kan holde tre værdier af potentielt forskellige typer.
     * - Klassen skal have tre private `final` attributter: `element1` (type T1), `element2` (type T2), `element3` (type T3).
     * - Implementer en konstruktør, der initialiserer alle tre attributter.
     * - Implementer get-metoder for hver af de tre elementer.
     * - Implementer en `toString()` metode.
     *
     * TODO: Opret Datatrio.java og implementer klassen.
     */

    /**
     * Opgave 24.7: Generisk Metode til at Finde Første Element der Opfylder Betingelse
     * ------------------------------------------------------------------------------
     * Filnavne: Betingelse.java (interface), ListUtilGenerics.java (udvid)
     *
     * Beskrivelse:
     * 1. Definér et generisk funktionelt interface `Betingelse<T>`:
     * - Metode: `boolean test(T element)`
     * 2. I klassen `ListUtilGenerics` (eller en ny klasse):
     * Implementer en public static generisk metode `<T> T findFørsteMatch(List<T> liste, Betingelse<T> betingelse)`:
     * - Metoden skal iterere gennem `liste`.
     * - For hvert element, kald `betingelse.test(element)`.
     * - Returner det *første* element for hvilket `test()` returnerer `true`.
     * - Hvis intet element opfylder betingelsen, eller listen er tom/null, returner `null`.
     *
     * TODO: Opret Betingelse.java. Implementer den statiske generiske metode i ListUtilGenerics.java (eller Emne24Generics).
     */
//    public static <T> T opgave24_7_findFørsteMatch(List<T> liste, Betingelse<T> betingelse) {
//        // Din implementering her
//        // (Betingelse<T> interface skal defineres separat)
//        // public interface Betingelse<T> { boolean test(T element); }
//        return null; // Placeholder
//    }

    /**
     * Opgave 24.8: Generisk Klasse `BegrænsetStak<E>`
     * ----------------------------------------------
     * Filnavn: BegrænsetStak.java
     *
     * Beskrivelse:
     * Definér en generisk klasse `BegrænsetStak<E>` der implementerer en stak med en fast maksimal størrelse.
     * - Attributter (private): `elementer` (ArrayList<E>), `maksKapacitet` (int).
     * - Konstruktør: `BegrænsetStak(int kapacitet)`. Sæt `maksKapacitet`.
     * - Metode: `boolean push(E element)`: Tilføjer `element` til toppen af stakken, hvis der er plads. Returnerer `true` ved succes, `false` hvis stakken er fuld.
     * - Metode: `E pop()`: Fjerner og returnerer elementet fra toppen. Kaster `EmptyStackException` hvis stakken er tom.
     * - Metode: `E peek()`: Returnerer elementet fra toppen uden at fjerne det. Kaster `EmptyStackException` hvis tom.
     * - Metode: `boolean erFuldt()`, `boolean erTom()`, `int getAntalElementer()`.
     *
     * TODO: Opret BegrænsetStak.java. Implementer. Brug `java.util.EmptyStackException`.
     */

    /**
     * Opgave 24.9: Generisk Metode til at Sammenflette To Lister
     * ---------------------------------------------------------
     * Filnavn: ListUtilGenerics.java (udvid)
     *
     * Beskrivelse:
     * I klassen `ListUtilGenerics` (eller en ny klasse):
     * Implementer en public static generisk metode `<T> List<T> fletLister(List<T> liste1, List<T> liste2)`:
     * - Metoden skal tage to lister af samme generiske type `T`.
     * - Den skal returnere en *ny* `ArrayList<T>`, der indeholder alle elementer fra `liste1`
     * efterfulgt af alle elementer fra `liste2`.
     * - Håndter hvis en eller begge inputlister er `null` (returner f.eks. den anden liste, en ny tom liste, eller kast fejl).
     *
     * TODO: Implementer den statiske generiske metode.
     */
    public static <T> List<T> opgave24_9_fletLister(List<T> liste1, List<T> liste2) {
        // Din implementering her
        return new ArrayList<>(); // Placeholder
    }

    /**
     * Opgave 24.10: Generisk Metode til at Filtrere en Liste (NY OPGAVE)
     * -----------------------------------------------------------------
     * Filnavne: (Bruger `Betingelse.java` fra Opgave 24.7), ListUtilGenerics.java (eller i denne klasse)
     *
     * Beskrivelse:
     * I klassen `ListUtilGenerics` (eller en ny klasse, eller direkte her som en statisk metode):
     * Implementer en public static generisk metode `<T> List<T> filtrerListe(List<T> originalListe, Betingelse<T> betingelse)`:
     * - Metoden tager en `originalListe` og en `Betingelse<T>` (samme interface som i Opgave 24.7).
     * - Den skal returnere en *ny* `ArrayList<T>`, der kun indeholder de elementer fra `originalListe`,
     * for hvilke `betingelse.test(element)` returnerer `true`.
     * - Rækkefølgen af elementer i den returnerede liste skal være den samme som i `originalListe`.
     * - Håndter hvis `originalListe` eller `betingelse` er `null` (returner f.eks. en tom liste).
     *
     * Eksempel (antag Betingelse<Integer> der tjekker for lige tal):
     * originalListe = {1, 2, 3, 4, 5, 6}, betingelse = (tal -> tal % 2 == 0)
     * => returnerer {2, 4, 6}
     *
     * TODO: Implementer den statiske generiske metode.
     */
//    public static <T> List<T> opgave24_10_filtrerListe(List<T> originalListe, Betingelse<T> betingelse) {
        // Din implementering her
//        return new ArrayList<>(); // Placeholder
//    }


    public static void main(String[] args) {
        System.out.println("=== Emne 24: Generics - Main metode til VALGFRI manuel test ===");
    }
}