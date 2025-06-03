package emne26_stak;

import java.util.List; // Kan blive relevant
import java.util.ArrayList; // Kan blive relevant
import java.util.Deque; // Anbefalet til stak-implementering
import java.util.ArrayDeque; // Anbefalet til stak-implementering
import java.util.Map; // For Opgave 26.9
import java.util.Set; // For Opgave 26.9
import java.util.HashSet; // For Opgave 26.9
import java.util.Collections; // For Opgave 26.9
import java.util.EmptyStackException; // Standard exception for tom stak operationer

/**
 * Generel Beskrivelse for Opgavesættet Emne 26: Stak
 * ===================================================
 * Dette opgavesæt fokuserer på Emne 26: Stak (Stack).
 * Formålet er at implementere stak-datastrukturen på forskellige måder
 * (array-baseret, kæde-baseret) og at anvende stakke til at løse
 * klassiske problemer som parentes-balancering, streng-omvending, m.m.
 * Opret separate .java filer for de klasser, der skal defineres.
 */
public class Emne26Stak {

    /**
     * Opgave 26.1: Array-baseret Stak (Fast Størrelse)
     * ------------------------------------------------
     * Filnavn: ArrayStak.java
     *
     * Beskrivelse:
     * Implementer en generisk klasse `ArrayStak<E>` der repræsenterer en stak
     * med en fast maksimal kapacitet, som angives i konstruktøren.
     * Stakken skal internt bruge et array til at gemme elementerne.
     * Metoder:
     * 1. Konstruktør: `ArrayStak(int kapacitet)`.
     * 2. `void push(E element)`: Tilføjer element til toppen. Kaster en custom (unchecked)
     * `StakFuldException` (som du selv definerer) hvis stakken er fuld.
     * 3. `E pop()`: Fjerner og returnerer elementet fra toppen. Kaster `EmptyStackException` hvis tom.
     * 4. `E peek()`: Returnerer elementet fra toppen uden at fjerne det. Kaster `EmptyStackException` hvis tom.
     * 5. `boolean erTom()`.
     * 6. `int size()`.
     * 7. `boolean erFuld()`.
     *
     * TODO: Opret StakFuldException.java og ArrayStak.java. Implementer.
     */

    /**
     * Opgave 26.2: Array-baseret Stak (Dynamisk Størrelse)
     * ----------------------------------------------------
     * Filnavn: DynamiskArrayStak.java
     *
     * Beskrivelse:
     * Implementer en generisk klasse `DynamiskArrayStak<E>`.
     * Ligesom `ArrayStak`, men det interne array skal automatisk udvide sin kapacitet
     * (f.eks. fordobles), når `push` kaldes på en fuld stak. Start med en lille default kapacitet (f.eks. 10).
     * Metoder: `push(E element)`, `pop()`, `peek()`, `erTom()`, `size()`.
     * (Behøver ikke `erFuld()` eller `StakFuldException` her).
     *
     * TODO: Opret DynamiskArrayStak.java. Implementer.
     */

    /**
     * Opgave 26.3: Kædet Stak (Implementering)
     * ----------------------------------------
     * Filnavn: MinKædetStak.java (indeholder evt. intern Node klasse)
     * (Genbesøg af Opgave 25.10, nu som en kernestak-implementering)
     *
     * Beskrivelse:
     * Implementer en generisk klasse `MinKædetStak<E>` der opfører sig som en stak (LIFO).
     * Internt skal den bruge en enkeltkædet liste (du definerer selv Node-klassen og `head` reference).
     * Metoder: `void push(E element)`, `E pop()`, `E peek()`, `boolean erTom()`, `int size()`.
     * `pop()` og `peek()` skal kaste `EmptyStackException` hvis stakken er tom.
     *
     * TODO: Opret MinKædetStak.java. Implementer metoderne.
     */

    /**
     * Opgave 26.4: Omvend en Streng med en Stak
     * ----------------------------------------
     * Filnavn: StakAnvendelser.java (eller direkte her som statisk metode)
     *
     * Beskrivelse:
     * Implementer en statisk metode `String omvendStrengMedStak(String input)`.
     * Metoden skal bruge en stak (f.eks. `java.util.Deque<Character> anlagt som stak = new ArrayDeque<>();`)
     * til at omvende `input`-strengen.
     * Algoritme: Push hvert tegn fra `input` på stakken. Pop derefter alle tegn fra
     * stakken og byg den omvendte streng.
     * Håndter `null` input (returner `null` eller tom streng).
     *
     * TODO: Implementer metoden.
     */
    public static String opgave26_4_omvendStrengMedStak(String input) {
        // TODO: Implementer strengomvending med stak.
        return null; // Placeholder
    }

    /**
     * Opgave 26.5: Balancerede Parenteser Tjek
     * ----------------------------------------
     * Filnavn: StakAnvendelser.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `boolean erParenteserBalanceret(String udtryk)`.
     * Metoden skal tjekke, om et `udtryk` (en streng) indeholder korrekt balancerede
     * parenteser: `()`, krølleparenteser `{}`, og firkantparenteser `[]`.
     * Andre tegn i strengen ignoreres.
     * Eksempler på balancerede: "({[]})", "()[]{}", "(a * (b + c))"
     * Eksempler på ubalancerede: "([)]", "{{", ")("
     * Brug en stak til at holde styr på åbne parenteser.
     *
     * TODO: Implementer metoden. Håndter null eller tom streng (anses som balanceret).
     */
    public static boolean opgave26_5_erParenteserBalanceret(String udtryk) {
        // TODO: Implementer tjek for balancerede parenteser med stak.
        return false; // Placeholder
    }

    /**
     * Opgave 26.6: Evaluer Simpelt Postfix Udtryk
     * ------------------------------------------
     * Filnavn: StakAnvendelser.java (eller direkte her)
     *
     * Beskrivelse:
     * Implementer en statisk metode `int evaluerPostfix(String postfixUdtryk)`.
     * Metoden skal evaluere et postfix-udtryk (Reverse Polish Notation).
     * Udtrykket består af heltal og operatorerne `+`, `-`, `*`, `/`.
     * Elementer (tal og operatorer) i strengen er adskilt af ét mellemrum.
     * Brug en stak til at holde tal undervejs.
     * - Når et tal læses, push det på stakken.
     * - Når en operator læses, pop de to øverste tal, udfør operationen, og push resultatet.
     * - Det endelige resultat er det tal, der er tilbage på stakken.
     * Håndter ugyldige udtryk (f.eks. for få operander, ukendt operator) ved at kaste
     * `IllegalArgumentException`. Håndter division med nul.
     *
     * Eksempel: "3 4 + 2 *" -> (3+4)*2 = 14. "10 2 3 + * 4 -" -> 10*(2+3) - 4 = 46.
     *
     * TODO: Implementer metoden.
     */
    public static int opgave26_6_evaluerPostfix(String postfixUdtryk) {
        // TODO: Implementer postfix evaluering med stak.
        return 0; // Placeholder
    }

    /**
     * Opgave 26.7: Simuler "Undo" Funktion for Tekstinput
     * --------------------------------------------------
     * Filnavn: TekstEditorMedUndo.java
     *
     * Beskrivelse:
     * Opret klassen `TekstEditorMedUndo`.
     * - Attributter (private): `nuværendeTekst` (StringBuilder), `undoStak` (Deque<String> brugt som stak, f.eks. ArrayDeque).
     * - Metoder:
     * 1. Konstruktør: `TekstEditorMedUndo()`. Initialiserer `nuværendeTekst` til tom, og `undoStak`.
     * 2. `void tilføjTekst(String tekst)`:
     * - Før `nuværendeTekst` ændres, push den *nuværende* `nuværendeTekst.toString()` på `undoStak`.
     * - Tilføj `tekst` til `nuværendeTekst`.
     * 3. `boolean fortryd()`:
     * - Hvis `undoStak` ikke er tom: Sæt `nuværendeTekst` til den værdi, der poppes fra `undoStak`. Returner `true`.
     * - Ellers (stakken er tom), returner `false` (ingen undo mulig).
     * 4. `String getTekst()`: Returnerer `nuværendeTekst.toString()`.
     *
     * TODO: Opret TekstEditorMedUndo.java. Implementer.
     */

    /**
     * Opgave 26.8: Stak-baseret Sortering (Simpel "To-Stakke" Sortering) - NY OPGAVE
     * ---------------------------------------------------------------------------
     * Filnavn: StakSortering.java
     *
     * Beskrivelse:
     * Implementer en statisk metode i klassen `StakSortering`:
     * `public static List<Integer> sorterListeMedToStakke(List<Integer> usorteretInputListe)`
     * - Metoden skal sortere den givne liste af heltal i STIGENDE rækkefølge ved udelukkende
     * at bruge to stakke (plus den endelige resultatliste). Du må bruge `java.util.Deque<Integer>`
     * implementeret som `ArrayDeque<Integer>` til dine stakke.
     * - Algoritme-idé (en mulig tilgang):
     * 1. Flyt alle elementer fra `usorteretInputListe` over på en `inputStak`.
     * 2. Opret en tom `sorteretStak`.
     * 3. Mens `inputStak` ikke er tom:
     * a. Pop et element `temp` fra `inputStak`.
     * b. Mens `sorteretStak` ikke er tom OG toppen af `sorteretStak` er STØRRE end `temp`:
     * Pop fra `sorteretStak` og push tilbage på `inputStak`.
     * c. Push `temp` på `sorteretStak`. (Nu er `sorteretStak`'s elementer sorteret med mindste øverst)
     * 4. Flyt alle elementer fra `sorteretStak` over i en ny `ArrayList<Integer>`. Da elementerne
     * poppes fra stakken (mindste først), vil de komme i stigende rækkefølge i listen.
     * - Returner den sorterede `ArrayList<Integer>`.
     * - Håndter `null` eller tom inputliste (returner en tom liste).
     *
     * TODO: Opret StakSortering.java. Implementer metoden.
     */
    // Metoden forventes i StakSortering.java

    /**
     * Opgave 26.9: Overfør Elementer mellem Stakke med Bevaret Rækkefølge - NY OPGAVE
     * ------------------------------------------------------------------------------
     * Filnavn: StakManipulation.java (eller direkte her som statisk metode)
     *
     * Beskrivelse:
     * Implementer en statisk metode `void overførOgBevarOrden(Deque<Integer> kildeStak, Deque<Integer> destinationsStak)`:
     * - Metoden skal flytte alle elementer fra `kildeStak` over til `destinationsStak`.
     * - Den vigtige betingelse er, at elementerne skal ende i `destinationsStak` i præcis
     * samme rækkefølge, som de oprindeligt var i `kildeStak`. Dvs. det element, der var
     * øverst på `kildeStak`, skal også være øverst på `destinationsStak` efter overførslen,
     * og elementet i bunden af `kildeStak` skal være i bunden af `destinationsStak`.
     * - Efter operationen skal `kildeStak` være tom.
     * - `destinationsStak` kan indeholde elementer i forvejen; de nye elementer skal
     * placeres ovenpå disse eksisterende elementer (dvs. de "pushes" på `destinationsStak`).
     * - Hint: Du får sandsynligvis brug for en tredje, midlertidig stak for at løse dette.
     * - Antag at Deque bruges som stak (push = addFirst, pop = removeFirst, peek = peekFirst).
     *
     * Eksempel:
     * kildeStak (top->bund): [1, 2, 3]
     * destinationsStak (top->bund): [4, 5] (før kald)
     * Efter kald:
     * kildeStak: []
     * destinationsStak (top->bund): [1, 2, 3, 4, 5]
     *
     * TODO: Implementer metoden. Håndter null input for stakkene.
     */
    public static void opgave26_9_overførOgBevarOrden(Deque<Integer> kildeStak, Deque<Integer> destinationsStak) {
        // TODO: Implementer overførsel af elementer med bevaret rækkefølge vha. en midlertidig stak.
    }

    /**
     * Opgave 26.10: Fjern Specifikke Elementer fra en Stak (Bevar Orden) - NY OPGAVE
     * ----------------------------------------------------------------------------
     * Filnavn: StakManipulation.java (eller direkte her som statisk metode)
     *
     * Beskrivelse:
     * Implementer en statisk metode `void fjernSpecifiktElementFraStak(Deque<String> stak, String elementDerSkalFjernes)`:
     * - Metoden skal fjerne *alle* forekomster af `elementDerSkalFjernes` fra den givne `stak`.
     * - Rækkefølgen af de resterende elementer i stakken skal bevares.
     * - Brug `equals()` til at sammenligne strenge.
     * - Hint: Du får brug for en midlertidig stak til at gemme de elementer, der ikke skal fjernes,
     * mens du gennemgår den oprindelige stak. Derefter skal de flyttes tilbage.
     *
     * Eksempel:
     * stak (top->bund): ["A", "B", "C", "A", "D", "A"], elementDerSkalFjernes = "A"
     * Efter kald, stak (top->bund): ["B", "C", "D"]
     *
     * TODO: Implementer metoden. Håndter null input for stak eller elementDerSkalFjernes.
     */
    public static void opgave26_10_fjernSpecifiktElementFraStak(Deque<String> stak, String elementDerSkalFjernes) {
        // TODO: Implementer fjernelse af specifikke elementer med bevaret rækkefølge.
    }

    public static void main(String[] args) {
        System.out.println("=== Emne 26: Stak - Main metode til VALGFRI manuel test ===");
    }
}