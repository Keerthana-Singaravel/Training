package Day13.Tests;

import Day13.Main.Array;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayTest {
    Array sorter;

    @Before
    public void setUp() throws Exception {
        sorter = new Array();
    }

    @Test
    public void testSortArray_unsortedArray() {
        String res = sorter.sortArray(new int[]{5, 3, 8, 1, 2});
        assertEquals("[1, 2, 3, 5, 8]", res);
    }

    @Test
    public void testSortArray_sortedArray() {
        String res = sorter.sortArray(new int[]{1, 2, 3, 4, 5});
        assertEquals("[1, 2, 3, 4, 5]", res);
    }

    @Test
    public void testSortArray_arrayWithDuplicates() {
        String res = sorter.sortArray(new int[]{5, 5, 3, 3, 1});
        assertEquals("[1, 3, 3, 5, 5]", res);
    }

    @Test
    public void testSortArray_emptyArray() {
        String res = sorter.sortArray(new int[]{});
        assertEquals("[]", res);
    }

    @Test
    public void testSortArray_nullArray() {
        String res = sorter.sortArray(null);
        assertEquals("Input array is null.", res);
    }
}

