package emne01_arrays; // Sørg for at denne matcher din pakke

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Importer den klasse der testes. Hvis dine klasser Participant og Course er separate filer:
// import emne01_arrays.Emne01OpgaverArrays.Participant; // Eksempel hvis de er public static inner
// import emne01_arrays.Emne01OpgaverArrays.Course;    // Eksempel hvis de er public static inner
// Hvis Participant og Course er top-level public klasser i samme pakke, er ingen specifik import nødvendig her.

class Emne01OpgaverArraysTest {

    // --- Tests for Opgave 1.1: opgave1_1_rotateLeft ---
    @Test
    void testRotateLeft_typicalCase() {
        int[] arr = {1, 2, 3, 4, 5}; int[] expected = {3, 4, 5, 1, 2};
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, 2); assertArrayEquals(expected, arr);
    }
    @Test
    void testRotateLeft_zeroRotations() {
        int[] arr = {1, 2, 3}; int[] expected = {1, 2, 3};
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, 0); assertArrayEquals(expected, arr);
    }
    @Test
    void testRotateLeft_fullLengthRotation() {
        int[] arr = {1, 2, 3, 4}; int[] expected = {1, 2, 3, 4};
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, 4); assertArrayEquals(expected, arr);
    }
    @Test
    void testRotateLeft_moreThanLengthRotation() {
        int[] arr = {1, 2, 3}; int[] expected = {3, 1, 2}; // 5 % 3 = 2 rotations
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, 5); assertArrayEquals(expected, arr);
    }
    @Test
    void testRotateLeft_negativeRotation() {
        int[] arr = {1, 2, 3, 4, 5};
        // -2 rotations on length 5: effective positive rotations = -2 + 5 = 3.
        // {1,2,3,4,5} rotated left by 3 is {4,5,1,2,3}
        int[] expected = {4, 5, 1, 2, 3};
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, -2); assertArrayEquals(expected, arr);
    }
    @Test
    void testRotateLeft_largeNegativeRotation() {
        int[] arr = {1, 2, 3, 4, 5};
        // -7 rotations on length 5: -7 % 5 = -2. Effective positive rotations = -2 + 5 = 3.
        int[] expected = {4, 5, 1, 2, 3};
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, -7); assertArrayEquals(expected, arr);
    }
    @Test
    void testRotateLeft_singleElementArray() {
        int[] arr = {42}; int[] expected = {42};
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, 5); assertArrayEquals(expected, arr);
    }
    @Test
    void testRotateLeft_emptyArray() {
        int[] arr = {}; int[] expected = {};
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, 2); assertArrayEquals(expected, arr);
    }
    @Test
    void testRotateLeft_nullArray() {
        int[] arr = null;
        Emne01OpgaverArrays.opgave1_1_rotateLeft(arr, 2); // Forventer at metoden håndterer null uden at crashe
        assertNull(arr);
    }

    // --- Tests for Opgave 1.2: opgave1_2_mergeSortedArrays ---
    @Test
    void testMergeSorted_typicalCase() {
        int[] arr1 = {1, 5, 9}; int[] arr2 = {2, 6, 10}; int[] expected = {1, 2, 5, 6, 9, 10};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(arr1, arr2));
    }
    @Test
    void testMergeSorted_arr1Empty() {
        int[] arr1 = {}; int[] arr2 = {2,6,10}; int[] expected = {2,6,10};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(arr1, arr2));
    }
    @Test
    void testMergeSorted_arr2Empty() {
        int[] arr1 = {1,5,9}; int[] arr2 = {}; int[] expected = {1,5,9};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(arr1, arr2));
    }
    @Test
    void testMergeSorted_bothEmpty() {
        int[] arr1 = {}; int[] arr2 = {}; int[] expected = {};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(arr1, arr2));
    }
    @Test
    void testMergeSorted_arr1Null() {
        int[] arr2 = {2,6,10}; int[] expected = {2,6,10}; // Antager at hvis arr1 er null, returneres en kopi af arr2
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(null, arr2));
    }
    @Test
    void testMergeSorted_arr2Null() {
        int[] arr1 = {1,5,9}; int[] expected = {1,5,9}; // Antager at hvis arr2 er null, returneres en kopi af arr1
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(arr1, null));
    }
    @Test
    void testMergeSorted_bothNull() {
        int[] expected = {}; // Antager at hvis begge er null, returneres et tomt array
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(null, null));
    }
    @Test
    void testMergeSorted_withDuplicates() {
        int[] arr1 = {1, 2, 2, 5}; int[] arr2 = {2, 3, 5, 6};
        int[] expected = {1, 2, 2, 2, 3, 5, 5, 6};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(arr1, arr2));
    }
    @Test
    void testMergeSorted_oneArrayExhaustedFirst() {
        int[] arr1 = {1, 2}; int[] arr2 = {3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(arr1, arr2));

        int[] arr3 = {3, 4, 5, 6}; int[] arr4 = {1, 2};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_2_mergeSortedArrays(arr3, arr4));
    }

    // --- Tests for Opgave 1.3: Course and Participant ---
    @Test
    void testCourse_addAndFindParticipant() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Java Basics", 2);
        Emne01OpgaverArrays.Participant p1 = new Emne01OpgaverArrays.Participant("Alice", 101);
        Emne01OpgaverArrays.Participant p2 = new Emne01OpgaverArrays.Participant("Bob", 102);

        assertTrue(course.opgave1_3_addParticipant(p1));
        assertEquals(1, course.getCurrentNumberOfParticipants());
        assertTrue(course.opgave1_3_addParticipant(p2));
        assertEquals(2, course.getCurrentNumberOfParticipants());

        assertFalse(course.opgave1_3_addParticipant(new Emne01OpgaverArrays.Participant("Charlie", 103))); // Course full
        assertEquals(2, course.getCurrentNumberOfParticipants());

        assertEquals(p1, course.opgave1_3_findParticipantById(101));
        assertEquals(p2, course.opgave1_3_findParticipantById(102));
        assertNull(course.opgave1_3_findParticipantById(999)); // Non-existent ID
    }
    @Test
    void testCourse_addNullParticipant() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Test Course", 1);
        assertFalse(course.opgave1_3_addParticipant(null));
        assertEquals(0, course.getCurrentNumberOfParticipants());
    }
    @Test
    void testCourse_addDuplicateParticipant() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Dup Course", 2);
        Emne01OpgaverArrays.Participant p1 = new Emne01OpgaverArrays.Participant("Alice", 101);
        assertTrue(course.opgave1_3_addParticipant(p1));
        // Antager at addParticipant (eller Course logik) forhindrer duplikater baseret på equals (ID)
        // Hvis din addParticipant ikke tjekker for duplikater, vil denne test måske feje eller opføre sig anderledes.
        // For nu, antager vi, at den *ikke* tilføjer duplikat-ID'er, hvis du implementerer det
        // (eller juster testen hvis duplikater er tilladt, og kun array-grænsen tæller).
        // For simpel array-baseret, er det typisk kun plads der tjekkes, medmindre du tilføjer duplikat-tjek.
        // Lad os sige for nu, at den tilføjer, hvis der er plads, uanset ID (som en simpel array-liste)
        Emne01OpgaverArrays.Participant p1_dup = new Emne01OpgaverArrays.Participant("Alice Again", 101);
        assertTrue(course.opgave1_3_addParticipant(p1_dup)); // Anden plads, selvom ID er ens
        assertEquals(2, course.getCurrentNumberOfParticipants());
    }
    @Test
    void testCourse_removeParticipantAndShift() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Adv Java", 3);
        Emne01OpgaverArrays.Participant p1 = new Emne01OpgaverArrays.Participant("P1", 1);
        Emne01OpgaverArrays.Participant p2 = new Emne01OpgaverArrays.Participant("P2", 2);
        Emne01OpgaverArrays.Participant p3 = new Emne01OpgaverArrays.Participant("P3", 3);
        course.opgave1_3_addParticipant(p1); course.opgave1_3_addParticipant(p2); course.opgave1_3_addParticipant(p3);

        assertTrue(course.opgave1_3_removeParticipantById(2)); // Remove P2
        assertEquals(2, course.getCurrentNumberOfParticipants());
        assertNull(course.opgave1_3_findParticipantById(2));

        Emne01OpgaverArrays.Participant[] internalArray = course.getParticipantsDirectlyForTest();
        assertEquals(p1, internalArray[0]);
        assertEquals(p3, internalArray[1]); // P3 should have shifted to P2's spot
        assertNull(internalArray[2]); // Last active spot should be nullified
    }
    @Test
    void testCourse_removeFirstParticipant() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Remove First", 2);
        Emne01OpgaverArrays.Participant p1 = new Emne01OpgaverArrays.Participant("P1", 1);
        Emne01OpgaverArrays.Participant p2 = new Emne01OpgaverArrays.Participant("P2", 2);
        course.opgave1_3_addParticipant(p1); course.opgave1_3_addParticipant(p2);
        assertTrue(course.opgave1_3_removeParticipantById(1));
        assertEquals(1, course.getCurrentNumberOfParticipants());
        assertEquals(p2, course.getParticipantsDirectlyForTest()[0]);
        assertNull(course.getParticipantsDirectlyForTest()[1]);
    }
    @Test
    void testCourse_removeLastParticipant() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Remove Last", 2);
        Emne01OpgaverArrays.Participant p1 = new Emne01OpgaverArrays.Participant("P1", 1);
        Emne01OpgaverArrays.Participant p2 = new Emne01OpgaverArrays.Participant("P2", 2);
        course.opgave1_3_addParticipant(p1); course.opgave1_3_addParticipant(p2);
        assertTrue(course.opgave1_3_removeParticipantById(2));
        assertEquals(1, course.getCurrentNumberOfParticipants());
        assertEquals(p1, course.getParticipantsDirectlyForTest()[0]);
        assertNull(course.getParticipantsDirectlyForTest()[1]);
    }
    @Test
    void testCourse_removeNonExistentParticipant() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Test", 1);
        course.opgave1_3_addParticipant(new Emne01OpgaverArrays.Participant("P1",1));
        assertFalse(course.opgave1_3_removeParticipantById(99));
        assertEquals(1, course.getCurrentNumberOfParticipants());
    }
    @Test
    void testCourse_removeFromEmptyCourse() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Empty", 3);
        assertFalse(course.opgave1_3_removeParticipantById(101));
    }
    @Test
    void testCourse_courseWithZeroMaxParticipants() {
        Emne01OpgaverArrays.Course course = new Emne01OpgaverArrays.Course("Zero Max", 0);
        assertFalse(course.opgave1_3_addParticipant(new Emne01OpgaverArrays.Participant("Alice", 101)));
        assertEquals(0, course.getCurrentNumberOfParticipants());
    }

    // --- Tests for Opgave 1.4: opgave1_4_addElement ---
    @Test
    void testAddElement_typicalCase() {
        int[] original = {10, 20, 30}; int element = 40; int[] expected = {10, 20, 30, 40};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_4_addElement(original, element));
    }
    @Test
    void testAddElement_emptyOriginal() {
        int[] original = {}; int element = 5; int[] expected = {5};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_4_addElement(original, element));
    }
    @Test
    void testAddElement_nullOriginal() {
        int[] original = null; int element = 10; int[] expected = {10};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_4_addElement(original, element));
    }

    // --- Tests for Opgave 1.5: Multiple Choice / Demo Methods ---
    @Test
    void testOpgave1_5_DelA_SvarProblem() {
        // Forudsætter at det korrekte svar er 2
        assertEquals(2, Emne01OpgaverArrays.opgave1_5_delA_svarProblem(), "Svar for 1.5 Del A (problem) er ikke 2.");
    }
    @Test
    void testOpgave1_5_DelA_UdvidArrayKode() {
        String[] original1 = {"a", "b"}; String[] expected1 = {"a", "b", "c"};
        assertArrayEquals(expected1, Emne01OpgaverArrays.opgave1_5_delA_udvidArrayKode(original1, "c"));
        String[] original2 = {}; String[] expected2 = {"first"};
        assertArrayEquals(expected2, Emne01OpgaverArrays.opgave1_5_delA_udvidArrayKode(original2, "first"));
        String[] expected3 = {"onlyOne"};
        assertArrayEquals(expected3, Emne01OpgaverArrays.opgave1_5_delA_udvidArrayKode(null, "onlyOne"));
    }
    @Test
    void testOpgave1_5_DelB_DemonstrerArrayList() {
        ArrayList<String> actualList = Emne01OpgaverArrays.opgave1_5_delB_demonstrerArrayList();
        List<String> expectedList = Arrays.asList("Alice", "Charlie", "David"); // Efter add A,B,C; add D; remove B (index 1)
        assertEquals(expectedList, actualList);
    }
    @Test
    void testOpgave1_5_DelC_SvarDiskussion() {
        // Forudsætter at det korrekte svar er "1:A,2:L,3:A,4:L,5:A" (uden whitespace)
        String expected = "1:A,2:L,3:A,4:L,5:A";
        assertEquals(expected, Emne01OpgaverArrays.opgave1_5_delC_svarDiskussion().replaceAll("\\s",""));
    }

    // --- Tests for Opgave 1.6: opgave1_6_reverseArrayInPlace ---
    @Test
    void testReverseArray_evenLength() {
        int[] arr = {1, 2, 3, 4}; int[] expected = {4, 3, 2, 1};
        Emne01OpgaverArrays.opgave1_6_reverseArrayInPlace(arr); assertArrayEquals(expected, arr);
    }
    @Test
    void testReverseArray_oddLength() {
        int[] arr = {1, 2, 3, 4, 5}; int[] expected = {5, 4, 3, 2, 1};
        Emne01OpgaverArrays.opgave1_6_reverseArrayInPlace(arr); assertArrayEquals(expected, arr);
    }
    @Test
    void testReverseArray_twoElements() {
        int[] arr = {10, 20}; int[] expected = {20, 10};
        Emne01OpgaverArrays.opgave1_6_reverseArrayInPlace(arr); assertArrayEquals(expected, arr);
    }
    @Test
    void testReverseArray_oneElement() {
        int[] arr = {5}; int[] expected = {5};
        Emne01OpgaverArrays.opgave1_6_reverseArrayInPlace(arr); assertArrayEquals(expected, arr);
    }
    @Test
    void testReverseArray_empty() {
        int[] arr = {}; int[] expected = {};
        Emne01OpgaverArrays.opgave1_6_reverseArrayInPlace(arr); assertArrayEquals(expected, arr);
    }
    @Test
    void testReverseArray_null() {
        int[] arr = null;
        Emne01OpgaverArrays.opgave1_6_reverseArrayInPlace(arr); assertNull(arr);
    }

    // --- Tests for Opgave 1.7: opgave1_7_findAllIndices ---
    @Test
    void testFindAllIndices_multipleOccurrences() {
        int[] arr = {1, 5, 2, 5, 3, 5}; int[] expected = {1, 3, 5};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_7_findAllIndices(arr, 5));
    }
    @Test
    void testFindAllIndices_singleOccurrence() {
        int[] arr = {1, 2, 3, 4, 5}; int[] expected = {2};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_7_findAllIndices(arr, 3));
    }
    @Test
    void testFindAllIndices_noOccurrences() {
        int[] arr = {1, 2, 3, 4, 5}; int[] expected = {};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_7_findAllIndices(arr, 7));
    }
    @Test
    void testFindAllIndices_emptyArray() {
        int[] arr = {}; int[] expected = {};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_7_findAllIndices(arr, 5));
    }
    @Test
    void testFindAllIndices_nullArray() {
        int[] expected = {};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_7_findAllIndices(null, 5));
    }
    @Test
    void testFindAllIndices_allElementsMatch() {
        int[] arr = {5, 5, 5, 5}; int[] expected = {0, 1, 2, 3};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_7_findAllIndices(arr, 5));
    }

    // --- Tests for Opgave 1.8: opgave1_8_isArraySorted ---
    @Test
    void testIsArraySorted_ascendingCorrect() {
        assertTrue(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{1, 2, 3, 4, 5}, true));
        assertTrue(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{1, 2, 2, 4, 5}, true)); // With duplicates
    }
    @Test
    void testIsArraySorted_ascendingIncorrect() {
        assertFalse(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{1, 3, 2, 4, 5}, true));
    }
    @Test
    void testIsArraySorted_descendingCorrect() {
        assertTrue(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{5, 4, 3, 2, 1}, false));
        assertTrue(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{5, 4, 4, 2, 1}, false)); // With duplicates
    }
    @Test
    void testIsArraySorted_descendingIncorrect() {
        assertFalse(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{5, 3, 4, 2, 1}, false));
    }
    @Test
    void testIsArraySorted_singleElement() {
        assertTrue(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{5}, true));
        assertTrue(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{5}, false));
    }
    @Test
    void testIsArraySorted_emptyArray() {
        assertTrue(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{}, true));
        assertTrue(Emne01OpgaverArrays.opgave1_8_isArraySorted(new int[]{}, false));
    }
    @Test
    void testIsArraySorted_nullArray() {
        // Antager at null array ikke er sorteret, eller at metoden håndterer det ved f.eks. at returnere false.
        assertFalse(Emne01OpgaverArrays.opgave1_8_isArraySorted(null, true));
    }

    // --- Tests for Opgave 1.9: opgave1_9_removeDuplicates ---
    @Test
    void testRemoveDuplicates_typicalCase() {
        int[] arr = {1, 5, 2, 5, 3, 1, 5, 2, 2}; int[] expected = {1, 5, 2, 3};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_9_removeDuplicates(arr));
    }
    @Test
    void testRemoveDuplicates_noDuplicates() {
        int[] arr = {10, 20, 30, 40}; int[] expected = {10, 20, 30, 40};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_9_removeDuplicates(arr));
    }
    @Test
    void testRemoveDuplicates_allDuplicates() {
        int[] arr = {7, 7, 7, 7, 7}; int[] expected = {7};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_9_removeDuplicates(arr));
    }
    @Test
    void testRemoveDuplicates_emptyArray() {
        int[] arr = {}; int[] expected = {};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_9_removeDuplicates(arr));
    }
    @Test
    void testRemoveDuplicates_nullArray() {
        int[] expected = {};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_9_removeDuplicates(null));
    }
    @Test
    void testRemoveDuplicates_singleElement() {
        int[] arr = {100}; int[] expected = {100};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_9_removeDuplicates(arr));
    }

    // --- Tests for Opgave 1.10: opgave1_10_calculateRunningAverage ---
    @Test
    void testCalculateRunningAverage_typicalCase() {
        int[] arr = {2, 4, 6, 8}; double[] expected = {2.0, 3.0, 4.0, 5.0};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_10_calculateRunningAverage(arr), 0.001);
    }
    @Test
    void testCalculateRunningAverage_singleElement() {
        int[] arr = {10}; double[] expected = {10.0};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_10_calculateRunningAverage(arr), 0.001);
    }
    @Test
    void testCalculateRunningAverage_mixedValues() {
        int[] arr = {1, 2, 3, 0, 4}; double[] expected = {1.0, 1.5, 2.0, 1.5, 2.0}; // (1+2+3+0+4)/5 = 10/5=2
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_10_calculateRunningAverage(arr), 0.001);
    }
    @Test
    void testCalculateRunningAverage_emptyArray() {
        int[] arr = {}; double[] expected = {};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_10_calculateRunningAverage(arr), 0.001);
    }
    @Test
    void testCalculateRunningAverage_nullArray() {
        double[] expected = {};
        assertArrayEquals(expected, Emne01OpgaverArrays.opgave1_10_calculateRunningAverage(null), 0.001);
    }
}