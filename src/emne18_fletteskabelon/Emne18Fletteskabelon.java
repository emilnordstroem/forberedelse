package emne18_fletteskabelon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Generel Beskrivelse for Opgavesættet Emne 18: Fletteskabelonen (Revideret)
 * =========================================================================
 * Dette opgavesæt fokuserer på Emne 18: Fletteskabelonen (Merge Pattern).
 * Formålet er at implementere og anvende flettelogikken til at kombinere
 * sorterede datasekvenser. Dette inkluderer grundlæggende fletning,
 * fletning af objekter, modificeret fletning for mængdeoperationer,
 * og implementering af Merge Sort algoritmen.
 * Opret separate .java filer for de klasser, der evt. skal defineres.
 */
public class Emne18Fletteskabelon {

    /**
     * Opgave 18.1: Grundlæggende Fletning af to Sorterede Heltalsarrays
     * Beskrivelse: Tager to sorterede (stigende) heltalsarrays.
     * Returnerer et *nyt* flettet array, også sorteret stigende.
     * TODO: Implementer metoden. Håndter null/tomme input-arrays.
     */
    public static int[] opgave18_1_fletToSorteredeArrays(int[] arr1, int[] arr2) {
        // TODO: Implementer fletning af to sorterede int arrays.
        return null;
    }

    /**
     * Opgave 18.2: Fletning af to Sorterede Lister af Strenge
     * Beskrivelse: Tager to lister af strenge, sorteret alfabetisk.
     * Returnerer en *ny* flettet ArrayList<String>, også sorteret alfabetisk.
     * TODO: Implementer metoden. Håndter null/tomme input-lister.
     */
    public static List<String> opgave18_2_fletToSorteredeStrengeLister(List<String> liste1, List<String> liste2) {
        // TODO: Implementer fletning af to sorterede String lister.
        return new ArrayList<>();
    }

    /**
     * Opgave 18.3: Fletning af Sorterede Lister med `Comparable` Objekter
     * Filnavne: OrdreFlet.java, FletteFunktionerForObjekter.java
     * Beskrivelse:
     * 1. Klasse `OrdreFlet` implements `Comparable<OrdreFlet>` (sorter på totalBeløb (ASC), så ordreId (ASC)).
     * 2. I `FletteFunktionerForObjekter`: Statisk metode `List<OrdreFlet> fletToSorteredeOrdreLister(...)`.
     * TODO: Opret klasserne. Implementer `Comparable` og flettemetoden.
     */
    // Selve flettemetoden forventes i FletteFunktionerForObjekter.java

    /**
     * Opgave 18.4: Fletning af Sorterede Lister med `Comparator`
     * Filnavne: TransaktionFlet.java, TransaktionBeløbDescComparator.java, FletteFunktionerForObjekter.java (udvid)
     * Beskrivelse:
     * 1. Klasse `TransaktionFlet` (IKKE Comparable). Attributter: transaktionsId, beløb, dato.
     * 2. Klasse `TransaktionBeløbDescComparator` implements `Comparator<TransaktionFlet>` (sorter på beløb FALDENDE).
     * 3. I `FletteFunktionerForObjekter`: Statisk metode `List<TransaktionFlet> fletToSorteredeTransaktionsLister(..., Comparator<TransaktionFlet> comparator)`.
     * TODO: Opret/udvid klasserne. Implementer Comparator og flettemetoden.
     */
    // Selve flettemetoden forventes i FletteFunktionerForObjekter.java

    /**
     * Opgave 18.5: Find Snit (Intersection) af to Sorterede Heltalsarrays
     * Beskrivelse: Tager to sorterede (stigende) heltalsarrays.
     * Returnerer et *nyt* sorteret array med kun de elementer, der findes i *begge* input-arrays.
     * Resultatet må ikke indeholde duplikater (hvis et tal findes i begge, medtages det én gang).
     * TODO: Implementer metoden med flette-lignende logik. Håndter null/tomme arrays.
     */
    public static int[] opgave18_5_findSnitAfToSorteredeArrays(int[] arr1, int[] arr2) {
        // TODO: Implementer find snit.
        return new int[0];
    }

    /**
     * Opgave 18.6: Find Foreningsmængde (Union) af to Sorterede Lister UDEN Duplikater
     * Beskrivelse: Tager to sorterede (stigende) lister af heltal.
     * Returnerer en *ny* sorteret `ArrayList<Integer>` med alle unikke elementer fra begge lister.
     * TODO: Implementer metoden med flette-lignende logik, undgå duplikater. Håndter null/tomme lister.
     */
    public static List<Integer> opgave18_6_findUnionAfToSorteredeLister(List<Integer> liste1, List<Integer> liste2) {
        // TODO: Implementer find union (uden duplikater).
        return new ArrayList<>();
    }

    /**
     * Opgave 18.7: Fletning af K Sorterede Lister (Simpel Iterativ Tilgang)
     * Beskrivelse: Tager en liste af sorterede heltalslister (`List<List<Integer>>`).
     * Fletter alle disse til én enkelt, sorteret `ArrayList<Integer>`.
     * TODO: Implementer metoden. En simpel tilgang er at flette to lister ad gangen iterativt.
     * Håndter null/tom inputliste, eller lister der indeholder null/tomme dellister.
     */
    public static List<Integer> opgave18_7_fletKListsIterativt(List<List<Integer>> listerAfLister) {
        // TODO: Implementer iterativ fletning af K sorterede lister.
        return new ArrayList<>();
    }

    /**
     * Opgave 18.8: Merge Sort - Implementer Flette-Hjælpemetoden
     * Beskrivelse: Implementer den centrale flette-hjælpemetode til Merge Sort.
     * `void fletteHjælperForMergeSort(int[] arr, int[] tempArr, int start, int mid, int slut)`
     * - `arr`: Arrayet der indeholder de to sorterede del-sekvenser: `arr[start...mid]` og `arr[mid+1...slut]`.
     * - `tempArr`: Et hjælpearray til midlertidig lagring.
     * - Metoden skal flette de to specificerede, sorterede del-sekvenser fra `arr`
     * således at `arr[start...slut]` bliver den samlede, sorterede sekvens.
     * TODO: Implementer flette-hjælperen. Dette er kernen i fletteskabelonen.
     */
    public static void opgave18_8_fletteHjælperForMergeSort(int[] arr, int[] tempArr, int start, int mid, int slut) {
        // TODO: Implementer flette-logikken, der bruger tempArr og opdaterer arr.
    }

    /**
     * Opgave 18.9: Implementer Fuld Merge Sort (Top-Down Rekursiv)
     * ------------------------------------------------------------
     * Beskrivelse:
     * Implementer den fulde Merge Sort algoritme.
     * 1. Opret en public statisk "wrapper"-metode `void mergeSort(int[] arr)`:
     * - Denne metode håndterer null/tomt array.
     * - Opretter et hjælpearray (`tempArr`) af samme størrelse som `arr`.
     * - Kalder en rekursiv hjælpemetode (f.eks. `mergeSortRekursiv`) med `arr`, `tempArr`, start=0, slut=arr.length-1.
     * 2. Opret en privat statisk, rekursiv hjælpemetode `void mergeSortRekursiv(int[] arr, int[] tempArr, int start, int slut)`:
     * - Basistilfælde: Hvis `start >= slut`, returner (del-array har 0 eller 1 element).
     * - Find midtpunktet `mid = start + (slut - start) / 2`.
     * - Kald rekursivt `mergeSortRekursiv` for venstre halvdel (`start` til `mid`).
     * - Kald rekursivt `mergeSortRekursiv` for højre halvdel (`mid + 1` til `slut`).
     * - Kald `fletteHjælperForMergeSort` (fra Opgave 18.8) for at flette de to nu sorterede halvdele.
     *
     * TODO: Implementer `mergeSort` og den rekursive hjælpemetode.
     */
    public static void opgave18_9_mergeSort(int[] arr) {
        // TODO: Implementer wrapper-metoden for Merge Sort.
    }
    // TODO: Definer den private rekursive hjælpemetode 'mergeSortRekursiv' her.


    /**
     * Opgave 18.10: Verificer Korrekt Fletning (NY OPGAVE)
     * ----------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `boolean verificerKorrektFletning(List<Integer> muligFlettetListe, List<Integer> listeA, List<Integer> listeB)`:
     * - Alle tre inputlister (`muligFlettetListe`, `listeA`, `listeB`) antages at være sorterede.
     * - `listeA` og `listeB` antages at indeholde unikke elementer *inden for hver liste*, men de kan have fælles elementer.
     * - Metoden skal returnere `true` hvis `muligFlettetListe` repræsenterer en korrekt, sorteret fletning
     * af *alle* elementer fra `listeA` og `listeB` (hvor duplikater fra den samlede mængde bevares, f.eks. hvis 5 er i A og 5 er i B, skal to 5-taller være i den flettede liste).
     * - Den nemmeste måde at verificere dette på er ved selv at udføre en korrekt fletning af `listeA` og `listeB`
     * (brug f.eks. logikken fra Opgave 18.2, tilpasset til heltal) og derefter sammenligne resultatet
     * med `muligFlettetListe`.
     * - Håndter `null` input for listerne (f.eks. hvis `muligFlettetListe` er `null`, returner `false` medmindre `listeA` og `listeB` også er `null` og det anses som en "korrekt" tom fletning).
     *
     * Eksempel:
     * A={1,3}, B={2,4}, Flettet={1,2,3,4} => true
     * A={1,3}, B={2,3}, Flettet={1,2,3,3} => true
     * A={1,3}, B={2,4}, Flettet={1,2,4} => false (mangler 3)
     * A={1,3}, B={2,4}, Flettet={1,3,2,4} => false (ikke sorteret)
     *
     * TODO: Implementer metoden.
     */
    public static boolean opgave18_10_verificerKorrektFletning(List<Integer> muligFlettetListe, List<Integer> listeA, List<Integer> listeB) {
        // TODO: Implementer verifikationen. Overvej edge cases som null lister.
        return false; // Placeholder
    }


    public static void main(String[] args) {
        System.out.println("=== Emne 18: Fletteskabelonen (Revideret) - Main metode til VALGFRI manuel test ===");
    }
}