package helpersTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import helpers.ArrayHelpers;

/**
 * Test Class for Array helpers
 * 
 * @author Aymene Bourafai
 *
 */
public class ArrayHelpersTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("------- Begin testing -------");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("------- End testing -------");
	}

	/**
	 * JUnit Test function to test ArrayHelpers.arrayChunk function
	 */
	@Test
	public void testArrayChunk() {
		// array inputs
		int[] inputArrayMultiple = { 2, 3, 5, 7, 11, 13, 99 }; // 7 digits
		int[] inputArrayEmpty = {};
		int[] inputArrayUnique = { -5 };

		// expected array outputs
		int[][] outputArrayMultiple1 = { { 2 }, { 3 }, { 5 }, { 7 }, { 11 }, { 13 }, { 99 } };
		int[][] outputArrayMultiple2 = { { 2, 3 }, { 5, 7 }, { 11, 13 }, { 99 } };
		int[][] outputArrayMultiple3 = { { 2, 3, 5, 7, 11, 13 }, { 99 } };
		int[][] outputArrayMultiple7 = { { 2, 3, 5, 7, 11, 13, 99 } };
		int[][] outputArrayMultiple8 = { { 2, 3, 5, 7, 11, 13, 99 } };

		int[][] outputArrayUnique = { { -5 } };

		// tests on array with multiple values
		assertNull(ArrayHelpers.arrayChunk(inputArrayMultiple, -4, true)); // negative
		assertNull(ArrayHelpers.arrayChunk(inputArrayMultiple, 0, true)); // no size

		assertArrayEquals(outputArrayMultiple1, ArrayHelpers.arrayChunk(inputArrayMultiple, 1, true)); // every digit
																										// alone
		assertArrayEquals(outputArrayMultiple2, ArrayHelpers.arrayChunk(inputArrayMultiple, 2, true)); // by pair
		assertArrayEquals(outputArrayMultiple3, ArrayHelpers.arrayChunk(inputArrayMultiple, 6, true)); // smaller size
		assertArrayEquals(outputArrayMultiple7, ArrayHelpers.arrayChunk(inputArrayMultiple, 7, true)); // same size
		assertArrayEquals(outputArrayMultiple8, ArrayHelpers.arrayChunk(inputArrayMultiple, 8, true)); // bigger size

		// tests on empty array
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, -3, true));
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, 0, true));
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, 1, true));
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, 2, true));

		// tests on array with one value
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, -3, true));
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, 0, true));

		assertArrayEquals(outputArrayUnique, ArrayHelpers.arrayChunk(inputArrayUnique, 1, true)); // every digit alone
		assertArrayEquals(outputArrayUnique, ArrayHelpers.arrayChunk(inputArrayUnique, 2, true)); // bigger size

	}

}
