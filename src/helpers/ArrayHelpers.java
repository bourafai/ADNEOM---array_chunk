package helpers;

import java.util.Arrays;

/**
 * Helpers Class for array to facilitate your work
 * 
 * @author Aymene Bourafai
 *
 */
public class ArrayHelpers {

	/**
	 * Chunks an array into arrays with size elements. The last chunk may contain
	 * less than size elements.
	 * 
	 * @param input       The array to work on
	 * @param size        The size of each chunk
	 * @param isDebugMode display log messages for debugging
	 * @return Returns a multidimensional array of chunks | null
	 */
	public static int[][] arrayChunk(int[] input, int size, boolean isDebugMode) {
		if (isDebugMode) {
			System.out.println("\n------------------------------------------------------\n");
			System.out.println("chunk size : " + size);
		}
		// checking null values
		if (size < 1 || input.length < 1) {
			if (isDebugMode) {
				System.out.println("input : " + Arrays.toString(input));
				System.out.println("output : null");
			}
			return null;
		}
		// shortcut the algorithm and return directly the results
		if (size >= input.length) {
			int[][] output = new int[1][];
			output[0] = input;

			if (isDebugMode) {
				System.out.println("input : " + Arrays.toString(input));
				System.out.println("output : " + Arrays.deepToString(output));
			}

			return output;
		}

		// check if there is a chunk with less elements than others
		int rest = input.length % size;

		if (isDebugMode) {
			System.out.println("rest : " + rest);
		}

		// calculate the number of chunks
		// (depending on the rest value whether it is 0 or 1)
		int chunks = (input.length / size) + (rest > 0 ? 1 : 0);

		if (isDebugMode) {
			System.out.println("chunks : " + chunks);
		}

		// create and array with the length of our chunks
		int[][] output = new int[chunks][];

		// iterate through chunks and populate the array
		// skip the last chunk if rest > 0 because the table has less elements
		for (int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++) {
			if (isDebugMode) {
				System.out.println("i*size : " + i * size + " --- i * size + size : " + (i * size + size));
				System.out.println(Arrays.toString(Arrays.copyOfRange(input, i * size, i * size + size)));
			}
			// this copies 'chunk' times 'chunkSize' elements into a new array
			output[i] = Arrays.copyOfRange(input, i * size, i * size + size);
		}
		// copying the remaining elements into the last chunk
		if (rest > 0) {
			output[chunks - 1] = Arrays.copyOfRange(input, (chunks - 1) * size, (chunks - 1) * size + rest);
		}

		if (isDebugMode) {
			System.out.println("input : " + Arrays.toString(input));
			System.out.println("output : " + Arrays.deepToString(output));
		}

		return output;
	}

	/**
	 * Chunks an array into arrays with size elements. The last chunk may contain
	 * less than size elements.
	 * 
	 * @param input The array to work on
	 * @param size  The size of each chunk
	 * @return Returns a multidimensional array of chunks | null
	 */
	public static int[][] arrayChunk(int[] input, int size) {
		return arrayChunk(input, size, false);
	}
}
