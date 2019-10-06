package helpersTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
		assertNull(ArrayHelpers.arrayChunk(inputArrayMultiple, -4)); // negative
		assertNull(ArrayHelpers.arrayChunk(inputArrayMultiple, 0)); // no size

		assertArrayEquals(outputArrayMultiple1, ArrayHelpers.arrayChunk(inputArrayMultiple, 1)); // every digit alone
		assertArrayEquals(outputArrayMultiple2, ArrayHelpers.arrayChunk(inputArrayMultiple, 2)); // by pair
		assertArrayEquals(outputArrayMultiple3, ArrayHelpers.arrayChunk(inputArrayMultiple, 6)); // smaller size
		assertArrayEquals(outputArrayMultiple7, ArrayHelpers.arrayChunk(inputArrayMultiple, 7)); // same size
		assertArrayEquals(outputArrayMultiple8, ArrayHelpers.arrayChunk(inputArrayMultiple, 8)); // bigger size

		// tests on empty array
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, -3));
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, 0));
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, 1));
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, 2));

		// tests on array with one value
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, -3));
		assertNull(ArrayHelpers.arrayChunk(inputArrayEmpty, 0));

		assertArrayEquals(outputArrayUnique, ArrayHelpers.arrayChunk(inputArrayUnique, 1)); // every digit alone
		assertArrayEquals(outputArrayUnique, ArrayHelpers.arrayChunk(inputArrayUnique, 2)); // bigger size

	}

}
