package emne02_multiarrays; // Matcher pakken for den klasse der testes

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream; // For at teste System.out
import java.io.PrintStream;           // For at teste System.out
import java.util.Arrays;              // For Arrays.deepEquals og Arrays.toString

// Importer den klasse der testes (hvis metoderne ikke er statiske og klassen er i en anden fil)
// import static emne02_multiarrays.Emne02OpgaverMultiArrays.*; // Hvis alle metoder er statiske

class Emne02OpgaverMultiArraysTest {

    // --- Tests for Opgave 2.1: opgave2_1_createChessboard ---
    // (Disse er uændrede)
    @Test
    void testCreateChessboard_size3_startsH() {
        char[][] expected = {
                {'H', 'S', 'H'},
                {'S', 'H', 'S'},
                {'H', 'S', 'H'}
        };
        assertTrue(Arrays.deepEquals(expected, Emne02OpgaverMultiArrays.opgave2_1_createChessboard(3)));
    }
    @Test
    void testCreateChessboard_size0() {
        char[][] actual = Emne02OpgaverMultiArrays.opgave2_1_createChessboard(0);
        if (actual == null) { assertNull(actual); }
        else { assertEquals(0, actual.length); }
    }
    @Test
    void testCreateChessboard_negativeSize() {
        char[][] actual = Emne02OpgaverMultiArrays.opgave2_1_createChessboard(-2);
        if (actual == null) { assertNull(actual); }
        else { assertEquals(0, actual.length); }
    }

    // --- Tests for Opgave 2.2: Sum af Diagonal(er) ---
    // (Disse er uændrede)
    int[][] matrix3x3_diag = {{1,2,3},{4,5,6},{7,8,9}};
    @Test
    void testSumMainDiagonal_3x3() {
        assertEquals(15, Emne02OpgaverMultiArrays.opgave2_2_sumMainDiagonal(matrix3x3_diag));
    }
    @Test
    void testSumAntiDiagonal_3x3() {
        assertEquals(15, Emne02OpgaverMultiArrays.opgave2_2_sumAntiDiagonal(matrix3x3_diag));
    }
    @Test
    void testSumDiagonals_nonSquare_shouldReturnZeroOrThrow() {
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_2_sumMainDiagonal(new int[][]{{1,2,3},{4,5,6}}));
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_2_sumAntiDiagonal(new int[][]{{1,2,3},{4,5,6}}));
    }
    @Test
    void testSumDiagonals_nullMatrix() {
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_2_sumMainDiagonal(null));
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_2_sumAntiDiagonal(null));
    }


    // --- Tests for Opgave 2.3: opgave2_3_findMaxValueInMatrix ---
    // (Disse er uændrede)
    @Test
    void testFindMaxValue_typicalCase() {
        int[][] matrix = {{1, 9, 2}, {8, 3, 7}, {4, 6, 5}};
        assertEquals(9, Emne02OpgaverMultiArrays.opgave2_3_findMaxValueInMatrix(matrix));
    }
    @Test
    void testFindMaxValue_negativeNumbers() {
        int[][] matrix = {{-5, -2}, {-10, -1}};
        assertEquals(-1, Emne02OpgaverMultiArrays.opgave2_3_findMaxValueInMatrix(matrix));
    }
    @Test
    void testFindMaxValue_emptyMatrix_returnsMinValue() {
        assertEquals(Integer.MIN_VALUE, Emne02OpgaverMultiArrays.opgave2_3_findMaxValueInMatrix(new int[][]{}));
    }
    @Test
    void testFindMaxValue_nullMatrix_returnsMinValue() {
        assertEquals(Integer.MIN_VALUE, Emne02OpgaverMultiArrays.opgave2_3_findMaxValueInMatrix(null));
    }
    @Test
    void testFindMaxValue_matrixWithEmptyRows() {
        int[][] matrix = {{1,2},{},{7,8}}; // Antager at tomme rækker ignoreres/håndteres
        assertEquals(8, Emne02OpgaverMultiArrays.opgave2_3_findMaxValueInMatrix(matrix));
    }
    @Test
    void testFindMaxValue_matrixWithOnlyEmptyRows() {
        assertEquals(Integer.MIN_VALUE, Emne02OpgaverMultiArrays.opgave2_3_findMaxValueInMatrix(new int[][]{{},{}}));
    }


    // --- Tests for Opgave 2.4: opgave2_4_findRowWithLargestSum ---
    // (Disse er uændrede)
    @Test
    void testFindRowWithLargestSum_typical() {
        int[][] data = {{1,5,2},{10,2,1},{0,0,1}}; assertEquals(1, Emne02OpgaverMultiArrays.opgave2_4_findRowWithLargestSum(data));
    }
    @Test
    void testFindRowWithLargestSum_firstRowLargestIfEqual() {
        int[][] data = {{10,20},{5,25},{1,2}};
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_4_findRowWithLargestSum(data));
    }
    @Test
    void testFindRowWithLargestSum_emptyData() {
        assertEquals(-1, Emne02OpgaverMultiArrays.opgave2_4_findRowWithLargestSum(new int[][]{}));
    }
    @Test
    void testFindRowWithLargestSum_nullData() {
        assertEquals(-1, Emne02OpgaverMultiArrays.opgave2_4_findRowWithLargestSum(null));
    }
    @Test
    void testFindRowWithLargestSum_matrixWithNullRow() {
        int[][] data = {{1,2,3},null,{10,20}};
        assertEquals(2, Emne02OpgaverMultiArrays.opgave2_4_findRowWithLargestSum(data));
    }


    // --- Tests for Opgave 2.5: opgave2_5_isValidSudokuSubgrid ---
    // (Disse er uændrede)
    int[][] validFullSudokuBoard_2_5 = {
            {5,3,4,6,7,8,9,1,2},{6,7,2,1,9,5,3,4,8},{1,9,8,3,4,2,5,6,7},
            {8,5,9,7,6,1,4,2,3},{4,2,6,8,5,3,7,9,1},{7,1,3,9,2,4,8,5,6},
            {9,6,1,5,3,7,2,8,4},{2,8,7,4,1,9,6,3,5},{3,4,5,2,8,6,1,7,9}
    };
    int[][] boardWithDuplicatesInSubgrid_2_5 = { {5,3,5,6,7,8,9,1,2}, {6,7,2,1,9,5,3,4,8}, {1,9,8,3,4,2,5,6,7},
            {8,5,9,7,6,1,4,2,3},{4,2,6,8,5,3,7,9,1},{7,1,3,9,2,4,8,5,6},
            {9,6,1,5,3,7,2,8,4},{2,8,7,4,1,9,6,3,5},{3,4,5,2,8,6,1,7,9}
    };
    @Test
    void testIsValidSudokuSubgrid_validTopLeft() {
        assertTrue(Emne02OpgaverMultiArrays.opgave2_5_isValidSudokuSubgrid(validFullSudokuBoard_2_5, 0, 0));
    }
    @Test
    void testIsValidSudokuSubgrid_invalidDueToDuplicate() {
        assertFalse(Emne02OpgaverMultiArrays.opgave2_5_isValidSudokuSubgrid(boardWithDuplicatesInSubgrid_2_5, 0, 0));
    }
    @Test
    void testIsValidSudokuSubgrid_nullBoard_returnsFalse() {
        assertFalse(Emne02OpgaverMultiArrays.opgave2_5_isValidSudokuSubgrid(null, 0, 0));
    }
    @Test
    void testIsValidSudokuSubgrid_boardNot9x9_returnsFalse() {
        assertFalse(Emne02OpgaverMultiArrays.opgave2_5_isValidSudokuSubgrid(new int[8][9], 0, 0));
    }
    @Test
    void testIsValidSudokuSubgrid_invalidStartIndices_returnsFalse() {
        assertFalse(Emne02OpgaverMultiArrays.opgave2_5_isValidSudokuSubgrid(validFullSudokuBoard_2_5, 7, 0));
    }


    // --- Tests for NY (ændret) Opgave 2.6: opgave2_6_getFormattedMatrixString ---
    @Test
    void testGetFormattedMatrixString_typicalCase() {
        int[][] matrix = {{1,2,3},{40,5,600}};
        String expectedOutput = "1\t2\t3" + System.lineSeparator() +
                "40\t5\t600";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }

    @Test
    void testGetFormattedMatrixString_singleRow() {
        int[][] matrix = {{10, 20, 30}};
        String expectedOutput = "10\t20\t30";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }

    @Test
    void testGetFormattedMatrixString_singleCol() {
        int[][] matrix = {{10},{20},{30}};
        String expectedOutput = "10" + System.lineSeparator() +
                "20" + System.lineSeparator() +
                "30";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }

    @Test
    void testGetFormattedMatrixString_singleElement() {
        int[][] matrix = {{42}};
        String expectedOutput = "42";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }

    @Test
    void testGetFormattedMatrixString_emptyMatrix() {
        // matrix.length == 0
        assertEquals("", Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(new int[][]{}));
    }

    @Test
    void testGetFormattedMatrixString_matrixWithEmptyRow() {
        // Række med 0 kolonner
        int[][] matrix = {{1,2},{},{7,8}};
        String expectedOutput = "1\t2" + System.lineSeparator() +
                "" + System.lineSeparator() + // Tom linje for den tomme række
                "7\t8";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }

    @Test
    void testGetFormattedMatrixString_matrixWithOnlyEmptyRows() {
        int[][] matrix = {{},{},{}};
        String expectedOutput = "" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }


    @Test
    void testGetFormattedMatrixString_nullMatrix() {
        assertEquals("Matrix er null.", Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(null));
    }

    @Test
    void testGetFormattedMatrixString_matrixWithNullRow() {
        int[][] matrix = {{1,2}, null, {7,8}};
        String expectedOutput = "1\t2" + System.lineSeparator() +
                "[null række]" + System.lineSeparator() +
                "7\t8";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }

    @Test
    void testGetFormattedMatrixString_matrixEndsWithEmptyRow() {
        int[][] matrix = {{1,2},{}};
        String expectedOutput = "1\t2" + System.lineSeparator() + "";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }

    @Test
    void testGetFormattedMatrixString_matrixEndsWithNullRow() {
        int[][] matrix = {{1,2}, null};
        String expectedOutput = "1\t2" + System.lineSeparator() + "[null række]";
        assertEquals(expectedOutput, Emne02OpgaverMultiArrays.opgave2_6_getFormattedMatrixString(matrix));
    }



    // --- Tests for NY Opgave 2.7: opgave2_7_initializeWithSequentialNumbers ---
    @Test
    void testInitializeWithSequentialNumbers_2x3() {
        int[][] expected = {{1,2,3},{4,5,6}};
        assertTrue(Arrays.deepEquals(expected, Emne02OpgaverMultiArrays.opgave2_7_initializeWithSequentialNumbers(2,3)));
    }
    @Test
    void testInitializeWithSequentialNumbers_3x2() {
        int[][] expected = {{1,2},{3,4},{5,6}};
        assertTrue(Arrays.deepEquals(expected, Emne02OpgaverMultiArrays.opgave2_7_initializeWithSequentialNumbers(3,2)));
    }
    @Test
    void testInitializeWithSequentialNumbers_1x4() {
        int[][] expected = {{1,2,3,4}};
        assertTrue(Arrays.deepEquals(expected, Emne02OpgaverMultiArrays.opgave2_7_initializeWithSequentialNumbers(1,4)));
    }
    @Test
    void testInitializeWithSequentialNumbers_4x1() {
        int[][] expected = {{1},{2},{3},{4}};
        assertTrue(Arrays.deepEquals(expected, Emne02OpgaverMultiArrays.opgave2_7_initializeWithSequentialNumbers(4,1)));
    }
    @Test
    void testInitializeWithSequentialNumbers_0rows() {
        int[][] result = Emne02OpgaverMultiArrays.opgave2_7_initializeWithSequentialNumbers(0,3);
        assertNotNull(result);
        assertEquals(0, result.length); // Forventer et array med 0 rækker
    }
    @Test
    void testInitializeWithSequentialNumbers_0cols() {
        int[][] result = Emne02OpgaverMultiArrays.opgave2_7_initializeWithSequentialNumbers(3,0);
        assertNotNull(result);
        assertEquals(3, result.length); // Forventer 3 rækker
        if (result.length > 0) {
            assertEquals(0, result[0].length); // Hver række har 0 kolonner
        }
    }
    @Test
    void testInitializeWithSequentialNumbers_negativeRows() {
        int[][] result = Emne02OpgaverMultiArrays.opgave2_7_initializeWithSequentialNumbers(-2,3);
        // Forventer enten null eller et tomt array, afhængig af implementering for ugyldigt input
        if (result != null) { assertEquals(0, result.length); }
        // assertNull(result); // Alternativ forventning
    }

    // --- Tests for NY Opgave 2.8: opgave2_8_sumColumn ---
    int[][] matrixForSumCol = {{1,2,3},{4,5,6},{7,8,9}};
    @Test
    void testSumColumn_validIndex() {
        assertEquals(15, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(matrixForSumCol, 1)); // 2+5+8
        assertEquals(6, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(matrixForSumCol, 0));  // 1+4+7
        assertEquals(18, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(matrixForSumCol, 2)); // 3+6+9
    }
    @Test
    void testSumColumn_indexOutOfBounds() {
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(matrixForSumCol, -1));
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(matrixForSumCol, 3));
    }
    @Test
    void testSumColumn_emptyMatrix() {
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(new int[][]{}, 0));
    }
    @Test
    void testSumColumn_nullMatrix() {
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(null, 0));
    }
    @Test
    void testSumColumn_jaggedArrayValidColumn() {
        int[][] jagged = {{1,2,3},{4,5},{7,8,9,10}};
        assertEquals(15, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(jagged, 1)); // 2+5+8
    }
    @Test
    void testSumColumn_jaggedArrayInvalidColumnForSomeRows() {
        int[][] jagged = {{1,2,3},{4,5},{7,8,9,10}};
        assertEquals(12, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(jagged, 2)); // 3+9 (række 1 har ikke indeks 2)
    }
    @Test
    void testSumColumn_matrixWithNullRow() {
        int[][] matrixWithNullR = {{1,2,3},null,{7,8,9}};
        assertEquals(10, Emne02OpgaverMultiArrays.opgave2_8_sumColumn(matrixWithNullR, 1)); // 2+8
    }


    // --- Tests for NY Opgave 2.9: opgave2_9_findFirstOccurrence ---
    int[][] matrixForSearch = {{1,2,30},{40,5,2},{7,8,30}};
    @Test
    void testFindFirstOccurrence_valuePresent() {
        assertArrayEquals(new int[]{0,1}, Emne02OpgaverMultiArrays.opgave2_9_findFirstOccurrence(matrixForSearch, 2));
        assertArrayEquals(new int[]{1,1}, Emne02OpgaverMultiArrays.opgave2_9_findFirstOccurrence(matrixForSearch, 5));
    }
    @Test
    void testFindFirstOccurrence_multiplePresentReturnsFirst() {
        assertArrayEquals(new int[]{0,2}, Emne02OpgaverMultiArrays.opgave2_9_findFirstOccurrence(matrixForSearch, 30));
    }
    @Test
    void testFindFirstOccurrence_valueNotPresent() {
        // Forventer {-1,-1} eller null, afhængig af specifikation. Her testes mod {-1,-1}
        assertArrayEquals(new int[]{-1,-1}, Emne02OpgaverMultiArrays.opgave2_9_findFirstOccurrence(matrixForSearch, 99));
    }
    @Test
    void testFindFirstOccurrence_emptyMatrix() {
        assertArrayEquals(new int[]{-1,-1}, Emne02OpgaverMultiArrays.opgave2_9_findFirstOccurrence(new int[][]{}, 5));
    }
    @Test
    void testFindFirstOccurrence_nullMatrix() {
        assertArrayEquals(new int[]{-1,-1}, Emne02OpgaverMultiArrays.opgave2_9_findFirstOccurrence(null, 5));
    }
    @Test
    void testFindFirstOccurrence_matrixWithEmptyRow() {
        int[][] matrixWithEmptyR = {{1,2},{},{7,8}};
        assertArrayEquals(new int[]{2,1}, Emne02OpgaverMultiArrays.opgave2_9_findFirstOccurrence(matrixWithEmptyR, 8));
    }

    // --- Tests for NY Opgave 2.10: opgave2_10_countPositiveNumbers ---
    @Test
    void testCountPositiveNumbers_mixedValues() {
        int[][] matrix = {{1,-2,3},{0,5,-6},{-7,8,9}};
        assertEquals(5, Emne02OpgaverMultiArrays.opgave2_10_countPositiveNumbers(matrix));
    }
    @Test
    void testCountPositiveNumbers_allPositive() {
        int[][] matrix = {{1,2},{3,4}};
        assertEquals(4, Emne02OpgaverMultiArrays.opgave2_10_countPositiveNumbers(matrix));
    }
    @Test
    void testCountPositiveNumbers_noPositive() {
        int[][] matrix = {{0,-1},{-2,-3}};
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_10_countPositiveNumbers(matrix));
    }
    @Test
    void testCountPositiveNumbers_emptyMatrix() {
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_10_countPositiveNumbers(new int[][]{}));
    }
    @Test
    void testCountPositiveNumbers_nullMatrix() {
        assertEquals(0, Emne02OpgaverMultiArrays.opgave2_10_countPositiveNumbers(null));
    }
    @Test
    void testCountPositiveNumbers_matrixWithNullRow() {
        int[][] matrixWithNullR = {{1,-2},null,{3,4}};
        assertEquals(3, Emne02OpgaverMultiArrays.opgave2_10_countPositiveNumbers(matrixWithNullR)); // 1, 3, 4
    }
}