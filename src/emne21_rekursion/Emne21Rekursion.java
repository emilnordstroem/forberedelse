package emne21_rekursion;

import java.util.List; // Kan blive relevant
import java.util.ArrayList; // Kan blive relevant

/**
 * Generel Beskrivelse for Opgavesættet Emne 21: Rekursion
 * =======================================================
 * Dette opgavesæt fokuserer på Emne 21: Rekursion.
 * Formålet er at øve design og implementering af rekursive metoder
 * til at løse forskellige problemer. For hver opgave skal du identificere
 * et eller flere basistilfælde og det rekursive trin.
 * Mange opgaver kan løses ved at definere en public "wrapper" metode,
 * der kalder en privat, rekursiv hjælpemetode med flere parametre (f.eks. et indeks).
 */
public class Emne21Rekursion {

    /**
     * Opgave 21.1: Fibonacci-tal (Rekursiv)
     * ------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `int fibonacci(int n)`, der returnerer det n'te
     * Fibonacci-tal. Fibonacci-sekvensen er defineret som:
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n-1) + F(n-2) for n > 1
     * Håndter ugyldigt input (n < 0) ved at kaste en `IllegalArgumentException`.
     *
     * TODO: Implementer metoden rekursivt.
     */
    public static int opgave21_1_fibonacci(int n) {
        // TODO: Implementer fibonacci rekursivt. Husk basistilfælde for n=0 og n=1.
        return 0; // Placeholder
    }

    /**
     * Opgave 21.2: Sum af Cifre i et Heltal (Rekursiv)
     * -----------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `int sumAfCifre(int n)`, der returnerer summen
     * af cifrene i et ikke-negativt heltal `n`.
     * F.eks. `sumAfCifre(123)` skal returnere `1 + 2 + 3 = 6`.
     * `sumAfCifre(4)` skal returnere `4`.
     * `sumAfCifre(0)` skal returnere `0`.
     * Hint: Brug modulo (`% 10`) for at få det sidste ciffer, og heltalsdivision (`/ 10`) for at fjerne det.
     * Håndter `n < 0` ved at kaste en `IllegalArgumentException`.
     *
     * TODO: Implementer metoden rekursivt.
     */
    public static int opgave21_2_sumAfCifre(int n) {
        // TODO: Implementer sumAfCifre rekursivt. Basistilfælde er når n < 10.
        return 0; // Placeholder
    }

    /**
     * Opgave 21.3: Potensopløftning (Rekursiv)
     * ---------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `double potens(double base, int eksponent)`,
     * der beregner `base` opløftet i `eksponent`.
     * Antag at `eksponent` altid er >= 0.
     * Definition:
     * base^0 = 1
     * base^eksponent = base * base^(eksponent-1) for eksponent > 0
     *
     * TODO: Implementer metoden rekursivt.
     */
    public static double opgave21_3_potens(double base, int eksponent) {
        // TODO: Implementer potens rekursivt. Husk basistilfælde for eksponent = 0.
        return 0.0; // Placeholder
    }

    /**
     * Opgave 21.4: Omvend en Streng (Rekursiv)
     * ---------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `String omvendStreng(String s)`, der returnerer
     * en ny streng, som er den omvendte af input-strengen `s`.
     * F.eks. `omvendStreng("java")` skal returnere "avaj".
     * Hint: Den omvendte af en streng `s` er det sidste tegn i `s` efterfulgt af
     * den omvendte af resten af strengen (uden det sidste tegn).
     * Håndter `null` input ved at returnere `null`. En tom streng omvendt er en tom streng.
     *
     * TODO: Implementer metoden rekursivt.
     */
    public static String opgave21_4_omvendStreng(String s) {
        // TODO: Implementer omvendStreng rekursivt. Basistilfælde: null, tom streng eller streng med 1 tegn.
        return null; // Placeholder
    }

    /**
     * Opgave 21.5: Tæl Forekomster af et Tegn i en Streng (Rekursiv)
     * -------------------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `int tælTegn(String s, char tegn)`, der tæller
     * og returnerer antallet af gange, `tegn` forekommer i strengen `s`.
     * Søgningen skal være case-sensitiv.
     * Hint: Antallet af `tegn` i `s` er (hvis `s` ikke er tom):
     * (1 hvis første tegn i `s` er lig `tegn`, ellers 0) + (antallet af `tegn` i resten af `s`).
     * Håndter `null` input for `s` (returner 0).
     *
     * TODO: Implementer metoden rekursivt. Du kan bruge en hjælpemetode med et startindeks.
     */
    public static int opgave21_5_tælTegn(String s, char tegn) {
        // TODO: Implementer tælTegn rekursivt.
        return 0; // Placeholder
    }
    // Evt. privat rekursiv hjælpemetode: private static int tælTegnRekursiv(String s, char tegn, int index) { ... }


    /**
     * Opgave 21.6: Tæl Lige Tal i et Array (Rekursivt) - NY OPGAVE
     * ----------------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `int tælLigeTalRekursivt(int[] arr)`, der tæller
     * og returnerer antallet af lige tal i heltalsarrayet `arr`.
     * Metoden skal løses ved hjælp af rekursion. Du skal sandsynligvis oprette
     * en privat, statisk hjælpemetode, der tager et startindeks som parameter.
     *
     * Et tal `x` er lige, hvis `x % 2 == 0`.
     * Håndter `null` eller tomt array ved at returnere 0.
     *
     * Eksempel:
     * arr = {1, 2, 3, 4, 5, 6} => returnerer 3 (tallene 2, 4, 6)
     * arr = {1, 3, 5} => returnerer 0
     *
     * TODO: Implementer wrapper-metoden og den private rekursive hjælpemetode.
     */
    public static int opgave21_6_tælLigeTalRekursivt(int[] arr) {
        // TODO: Implementer wrapper-metode. Håndter null/tomt array.
        // Kald en privat rekursiv hjælpemetode med arrayet og startindeks 0.
        return 0; // Placeholder
    }
    // TODO: Definer din private static int tælLigeTalHjælper(int[] arr, int index) her.
    // Basistilfælde: Hvis index >= arr.length, returner 0.
    // Rekursivt trin: Tjek om arr[index] er lige.
    // Returner (1 hvis lige, ellers 0) + rekursivt kald for resten af arrayet (index + 1).

    /**
     * Opgave 21.7: Er en Streng et Palindrom? (Rekursiv)
     * -------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `boolean erPalindrom(String s)`, der returnerer `true`
     * hvis strengen `s` er et palindrom (læses ens forfra og bagfra), og `false` ellers.
     * Ignorer store/små bogstaver for sammenligningen.
     * F.eks. er "Regninger" et palindrom. "Madam" er også.
     * Hint: En streng er et palindrom hvis det første og sidste tegn er ens (ignorer case),
     * OG resten af strengen (uden første og sidste tegn) også er et palindrom.
     * Håndter `null` input (returner `false`). Tom streng og streng med ét tegn er palindromer.
     *
     * TODO: Implementer metoden rekursivt.
     */
    public static boolean opgave21_7_erPalindrom(String s) {
        // TODO: Implementer erPalindrom rekursivt. Overvej en hjælpemetode med indekser.
        return false; // Placeholder
    }

    /**
     * Opgave 21.8: Find Mindste Element i et Heltalsarray (Rekursiv)
     * ------------------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `int findMindsteRekursivt(int[] arr)`, der finder
     * og returnerer det mindste element i et heltalsarray `arr`.
     * Du *skal* bruge en rekursiv hjælpemetode, der tager et startindeks som parameter.
     * Håndter `null` eller tomt array ved at kaste `IllegalArgumentException`.
     *
     * Hint for hjælpemetode `findMindsteHjælper(int[] arr, int index)`:
     * - Basistilfælde: Hvis `index` er det sidste element, returner `arr[index]`.
     * - Rekursivt trin: Returner minimum af `arr[index]` og resultatet af et rekursivt
     * kald for resten af arrayet (`index + 1`).
     *
     * TODO: Implementer wrapper-metoden og den private rekursive hjælpemetode.
     */
    public static int opgave21_8_findMindsteRekursivt(int[] arr) {
        // TODO: Implementer wrapper-metode. Håndter null/tomt array. Kald rekursiv hjælper.
        return 0; // Placeholder
    }
    // TODO: Definer din private static int findMindsteHjælper(int[] arr, int index) her.


    /**
     * Opgave 21.9: Generer Talrække som Streng (Rekursivt - Stigende og Faldende)
     * --------------------------------------------------------------------------
     * Beskrivelse:
     * Implementer to statiske rekursive metoder:
     * 1. `String talRækkeStigende(int start, int slut)`:
     * - Returnerer en streng med alle tal fra `start` til `slut` (inklusiv),
     * adskilt af komma og mellemrum. F.eks. `talRækkeStigende(3,7)` -> "3, 4, 5, 6, 7".
     * - Hvis `start > slut`, returneres en tom streng.
     * 2. `String talRækkeFaldende(int start, int slut)`:
     * - Returnerer en streng med alle tal fra `start` ned til `slut` (inklusiv),
     * adskilt af komma og mellemrum. F.eks. `talRækkeFaldende(7,3)` -> "7, 6, 5, 4, 3".
     * - Hvis `start < slut`, returneres en tom streng.
     * Undgå afsluttende komma.
     *
     * TODO: Implementer begge metoder rekursivt.
     */
    public static String opgave21_9_talRækkeStigende(int start, int slut) {
        // TODO: Implementer rekursivt. Basistilfælde: start > slut.
        // Rekursivt trin: start + ", " + rekursivt kald med start+1.
        return ""; // Placeholder
    }

    public static String opgave21_9_talRækkeFaldende(int start, int slut) {
        // TODO: Implementer rekursivt. Basistilfælde: start < slut.
        // Rekursivt trin: start + ", " + rekursivt kald med start-1.
        return ""; // Placeholder
    }

    /**
     * Opgave 21.10: Multiplikation via Gentagen Addition (Rekursiv)
     * ------------------------------------------------------------
     * Beskrivelse:
     * Implementer en statisk metode `int multiplicerRekursivt(int a, int b)`,
     * der beregner produktet `a * b` udelukkende ved hjælp af addition, subtraktion
     * og rekursion. Du må IKKE bruge `*` operatoren til multiplikation.
     * Håndter følgende tilfælde:
     * - Hvis `b` er 0, er resultatet 0. (Basistilfælde)
     * - Hvis `b` er positiv: `a * b = a + a * (b-1)`.
     * - Hvis `b` er negativ: `a * b = -(a * (-b))`. Dvs. konverter problemet til positiv `b`
     * og neger resultatet.
     *
     * TODO: Implementer metoden rekursivt.
     */
    public static int opgave21_10_multiplicerRekursivt(int a, int b) {
        // TODO: Implementer multiplikation vha. rekursiv addition.
        // Husk basistilfælde for b=0, og håndtering af negativ b.
        return 0; // Placeholder
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 21: Rekursion - Main metode til VALGFRI manuel test ===");
    }
}