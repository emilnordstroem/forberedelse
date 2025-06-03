package emne25_kaededestrukturer;

import java.util.List; // For Opgave 25.8
import java.util.ArrayList; // For Opgave 25.8
import java.util.NoSuchElementException; // For stak/kø/liste operationer på tomme strukturer

/**
 * Generel Beskrivelse for Opgavesættet Emne 25: Kædede Strukturer
 * ==============================================================
 * Dette opgavesæt fokuserer på Emne 25: Kædede Strukturer.
 * Formålet er at designe og implementere forskellige typer kædede lister
 * (enkeltkædede, dobbeltkædede, cirkulære) samt anvende dem.
 * Du skal selv definere Node-klasserne og implementere listestrukturernes logik.
 * Opret separate .java filer for hver klasse/interface.
 */
public class Emne25KædedeStrukturer {

    // Bemærk: For opgaverne nedenfor, hvor du skal implementere en listestruktur,
    // forventes det, at du også definerer den tilsvarende Node-klasse
    // (f.eks. SimpelSLLNode<E>, SimpelDLLNode<E>) enten som en indre klasse
    // eller i sin egen fil. For testbarhedens skyld kan det være nemmest
    // at gøre dem til indre public static klasser i dine listeklasser,
    // eller separate public klasser i samme pakke.

    /**
     * Opgave 25.1: Grundlæggende Enkeltkædet Liste
     * -------------------------------------------
     * Filnavne: MinEnkeltKædetListe.java (indeholder evt. Node klasse)
     *
     * Beskrivelse:
     * Implementer en generisk klasse `MinEnkeltKædetListe<E>`.
     * - Den skal internt bruge en Node-klasse (f.eks. `SimpelSLLNode<E>`) med `data` og `next` reference.
     * - Listen skal have en `head` reference og en `size` attribut.
     * Metoder der skal implementeres:
     * 1. `void tilføjFørst(E element)`: Tilføjer et element forrest i listen.
     * 2. `void tilføjSidst(E element)`: Tilføjer et element bagerst i listen.
     * 3. `E fjernFørst()`: Fjerner og returnerer det forreste element. Kaster `NoSuchElementException` hvis listen er tom.
     * 4. `int getSize()`: Returnerer antallet af elementer.
     * 5. `boolean erTom()`: Returnerer true hvis listen er tom.
     * 6. `String toString()`: Returnerer en strengrepræsentation af listens elementer (f.eks. "[A, B, C]").
     *
     * TODO: Opret MinEnkeltKædetListe.java (og dens Node). Implementer metoderne.
     */

    /**
     * Opgave 25.2: Udvidede Operationer for Enkeltkædet Liste
     * ------------------------------------------------------
     * Filnavn: MinEnkeltKædetListe.java (udvid den fra 25.1)
     *
     * Beskrivelse:
     * Tilføj følgende metoder til din `MinEnkeltKædetListe<E>` klasse:
     * 1. `E getElementPå(int index)`: Returnerer elementet på det givne `index`.
     * Kaster `IndexOutOfBoundsException` hvis `index` er ugyldigt.
     * 2. `boolean indeholder(E element)`: Returnerer `true` hvis listen indeholder `element` (brug `equals()`).
     * 3. `void indsætEfter(E søgElement, E nytElement)`: Indsætter `nytElement` *efter* den
     * *første* forekomst af `søgElement`. Gør intet hvis `søgElement` ikke findes eller `nytElement` er null.
     *
     * TODO: Udvid MinEnkeltKædetListe.java med de nye metoder.
     */

    /**
     * Opgave 25.3: Fjernelse af Elementer fra Enkeltkædet Liste
     * --------------------------------------------------------
     * Filnavn: MinEnkeltKædetListe.java (udvid den fra 25.1/25.2)
     *
     * Beskrivelse:
     * Tilføj følgende metoder til din `MinEnkeltKædetListe<E>` klasse:
     * 1. `boolean fjernElement(E element)`: Fjerner den *første* forekomst af `element` fra listen.
     * Returnerer `true` hvis et element blev fjernet, ellers `false`.
     * 2. `E fjernSidst()`: Fjerner og returnerer det *sidste* element i listen.
     * Kaster `NoSuchElementException` hvis listen er tom. (Bemærk: Denne er O(N) for en SLL).
     *
     * TODO: Udvid MinEnkeltKædetListe.java med de nye metoder.
     */

    /**
     * Opgave 25.4: Grundlæggende Dobbeltkædet Liste
     * --------------------------------------------
     * Filnavn: MinDobbeltKædetListe.java (indeholder evt. Node klasse)
     *
     * Beskrivelse:
     * Implementer en generisk klasse `MinDobbeltKædetListe<E>`.
     * - Den skal internt bruge en Node-klasse (f.eks. `SimpelDLLNode<E>`) med `data`, `next` og `prev` referencer.
     * - Listen skal have `head` og `tail` referencer og en `size` attribut.
     * Metoder der skal implementeres:
     * 1. `void tilføjFørst(E element)`
     * 2. `void tilføjSidst(E element)`
     * 3. `E fjernFørst()`: Kaster `NoSuchElementException` hvis tom.
     * 4. `E fjernSidst()`: Kaster `NoSuchElementException` hvis tom.
     * 5. `int getSize()`, `boolean erTom()`.
     *
     * TODO: Opret MinDobbeltKædetListe.java (og dens Node). Implementer metoderne.
     */

    /**
     * Opgave 25.5: Udvidede Operationer for Dobbeltkædet Liste
     * -------------------------------------------------------
     * Filnavn: MinDobbeltKædetListe.java (udvid den fra 25.4)
     *
     * Beskrivelse:
     * Tilføj følgende metoder til din `MinDobbeltKædetListe<E>` klasse:
     * 1. `void indsætPåPosition(int index, E element)`: Indsætter `element` på det specificerede `index`.
     * Håndter `index=0` (indsæt først), `index=size` (indsæt sidst), og indekser midt i.
     * Kaster `IndexOutOfBoundsException` for ugyldige `index` (f.eks. < 0 eller > size).
     * 2. `E fjernPåPosition(int index)`: Fjerner og returnerer elementet på `index`.
     * Kaster `IndexOutOfBoundsException` for ugyldige `index`.
     * 3. `String toStringFremad()`: Returnerer en strengrepræsentation af listen fra `head` til `tail`.
     * 4. `String toStringBaglæns()`: Returnerer en strengrepræsentation af listen fra `tail` til `head`.
     *
     * TODO: Udvid MinDobbeltKædetListe.java med de nye metoder.
     */

    /**
     * Opgave 25.6: Find og Erstat i Dobbeltkædet Liste
     * ------------------------------------------------
     * Filnavn: MinDobbeltKædetListe.java (udvid den fra 25.4/25.5)
     *
     * Beskrivelse:
     * Tilføj følgende metode til din `MinDobbeltKædetListe<E>` klasse:
     * 1. `boolean findOgErstat(E gammeltElement, E nytElement)`:
     * - Finder den *første* forekomst af `gammeltElement` (brug `equals()`) i listen.
     * - Hvis fundet, erstattes dens data med `nytElement`.
     * - Returnerer `true` hvis en erstatning blev foretaget, ellers `false`.
     * - Håndter hvis `gammeltElement` eller `nytElement` er `null`.
     *
     * TODO: Udvid MinDobbeltKædetListe.java med metoden.
     */

    /**
     * Opgave 25.7: Simpel Cirkulær Enkeltkædet Liste (med Tail Pointer)
     * ---------------------------------------------------------------
     * Filnavn: MinCirkulærSLL.java (indeholder evt. Node klasse)
     *
     * Beskrivelse:
     * Implementer en generisk klasse `MinCirkulærSLL<E>` (enkeltkædet cirkulær).
     * - Brug en `tail` reference, der peger på det "sidste" element. `tail.next` peger på "hovedet".
     * - Hvis listen er tom, er `tail` null. Hvis listen har ét element, peger `tail` (og `head`) på sig selv.
     * - Hold styr på `size`.
     * Metoder:
     * 1. `void tilføjSidst(E element)`: Tilføjer et element "sidst" i den cirkulære struktur.
     * 2. `E fjernFørst()`: Fjerner og returnerer det element, der følger efter `tail` (hovedet). Kaster `NoSuchElementException` hvis tom.
     * 3. `void roter()`: Flytter `tail` referencen én position "fremad" i listen (dvs. det gamle `tail.next` bliver det nye `tail`).
     * 4. `String toStringMedStart(int antalElementer)`: Returnerer en streng med de første `antalElementer`
     * startende fra "hovedet" (elementet efter `tail`). Hvis listen har færre elementer, vises alle.
     *
     * TODO: Opret MinCirkulærSLL.java. Implementer metoderne.
     */

    /**
     * Opgave 25.8: Josephus Problem (simpel version - Revideret Forklaring)
     * --------------------------------------------------------------------
     * Filnavn: JosephusLøser.java
     *
     * Forklaring af Josephus Problemet:
     * Forestil dig en gruppe personer (repræsenteret ved navne), der står i en cirkel.
     * Man starter ved en bestemt person (den første i inputlisten). Man tæller et fast
     * antal `hop` personer med uret rundt i cirklen (inklusive startpersonen i tællingen).
     * Den person, man lander på (den `hop`-te person i tællingen fra den nuværende position),
     * fjernes fra cirklen og tilføjes til en resultatliste.
     * Processen fortsætter fra personen *efter* den, der lige blev fjernet i den (nu mindre) cirkel:
     * man tæller igen `hop` personer, fjerner den næste, og så videre.
     * Dette fortsætter, indtil cirklen er tom.
     *
     * Beskrivelse af Metode:
     * Implementer en statisk metode i `JosephusLøser`:
     * `public static List<String> løsJosephusProblem(List<String> navne, int hop)`:
     * - Metoden simulerer Josephus problemet som beskrevet ovenfor.
     * - Opret en cirkulær kædet liste (du kan genbruge/instantiere din `MinCirkulærSLL` fra opg. 25.7,
     * eller implementere den nødvendige logik direkte her med noder, hvis du foretrækker det for denne opgave).
     * - Tilføj alle `navne` fra inputlisten til den cirkulære liste i den givne rækkefølge.
     * - Implementer logikken til at fjerne personer og returner en `ArrayList<String>`
     * med navne i den rækkefølge, de blev fjernet.
     * - `hop` skal være >= 1. Hvis `hop < 1`, kan du returnere en tom liste eller kaste en fejl.
     * - Håndter `null` eller tom `navne`-liste.
     *
     * Eksempel: navne = {"A", "B", "C", "D", "E"}, hop = 3
     * Cirkel: A-B-C-D-E-A...
     * 1. Start A. Tæl 3: A,B,C. Fjern C. Resultat: {C}. Cirkel: A-B-D-E-A...
     * 2. Start D. Tæl 3: D,E,A. Fjern A. Resultat: {C,A}. Cirkel: B-D-E-B...
     * 3. Start B. Tæl 3: B,D,E. Fjern E. Resultat: {C,A,E}. Cirkel: B-D-B...
     * 4. Start B. Tæl 3: B,D,B. Fjern B. Resultat: {C,A,E,B}. Cirkel: D-D...
     * 5. Start D. Tæl 3: D,D,D. Fjern D. Resultat: {C,A,E,B,D}. Cirkel: Tom.
     *
     * TODO: Opret JosephusLøser.java. Implementer metoden.
     */

    /**
     * Opgave 25.9: Find Midterste Element i Enkeltkædet Liste (NY OPGAVE)
     * ------------------------------------------------------------------
     * Filnavn: MinEnkeltKædetListe.java (tilføj metode) eller en ny utility-klasse.
     *
     * Beskrivelse:
     * Tilføj en metode til din `MinEnkeltKædetListe<E>` klasse (eller lav en statisk
     * utility-metode, der tager en `MinEnkeltKædetListe<E>` som parameter):
     * `public E findMidtersteElement()` (hvis instansmetode) eller
     * `public static <E> E findMidtersteIListe(MinEnkeltKædetListe<E> liste)` (hvis statisk).
     *
     * - Metoden skal finde og returnere det midterste element i den enkeltkædede liste.
     * - Hvis listen har et lige antal elementer, kan du returnere et af de to midterste
     * (f.eks. det første af de to midterste - det på indeks `(size-1)/2`).
     * - Hvis listen er tom, kast `NoSuchElementException`.
     * - Overvej en effektiv løsning. En klassisk metode er at bruge to pointere/referencer:
     * en "langsom" der flytter sig én node ad gangen, og en "hurtig" der flytter sig
     * to noder ad gangen. Når den hurtige når enden, vil den langsomme være ved midten.
     * (Du kan også først tælle elementerne og så iterere halvvejs, men prøv gerne to-pointer tilgangen).
     *
     * TODO: Implementer metoden.
     */

    /**
     * Opgave 25.10: Implementer en Simpel Kædet Stak (LIFO)
     * ----------------------------------------------------
     * Filnavn: KædetStak.java (indeholder evt. Node klasse)
     *
     * Beskrivelse:
     * Implementer en generisk klasse `KædetStak<E>` der opfører sig som en stak (Last-In, First-Out).
     * - Internt skal den bruge en enkeltkædet liste (du definerer selv Node-klassen og `head` reference).
     * - Metoder der skal implementeres:
     * 1. `void push(E element)`: Tilføjer et element øverst på stakken.
     * 2. `E pop()`: Fjerner og returnerer elementet øverst på stakken. Kaster `NoSuchElementException` hvis stakken er tom.
     * 3. `E peek()`: Returnerer elementet øverst på stakken uden at fjerne det. Kaster `NoSuchElementException` hvis stakken er tom.
     * 4. `boolean erTom()`: Returnerer true hvis stakken er tom.
     * 5. `int size()`: Returnerer antallet af elementer på stakken.
     *
     * TODO: Opret KædetStak.java. Implementer metoderne.
     */

    public static void main(String[] args) {
        System.out.println("=== Emne 25: Kædede Strukturer - Main metode til VALGFRI manuel test ===");
        System.out.println("=== Opret separate .java filer for klasser/interfaces og brug JUnit-tests. ===");
    }
}