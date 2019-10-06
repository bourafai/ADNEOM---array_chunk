package helpers;

import java.util.Arrays;

public class ArrayHelpers extends Helper {
	/**
	 * Chunks an array into arrays with size elements. The last chunk may contain
	 * less than size elements.
	 * 
	 * @param input The array to work on
	 * @param size  The size of each chunk
	 * @return Returns a multidimensional array of chunks | null
	 */
	public static int[][] arrayChunk(int[] input, int size) {

		System.out.println("size : " + size);

		// checking null values
		if (size < 1 || input.length < 1) {
			System.out.println("input : " + Arrays.toString(input));
			System.out.println("output : null");
			return null;
		}
		
		//shortcut the algorithm
		if( size >= input.length) {
			int[][] output = new int[1][];
			output[0] = input;
			System.out.println("input : " + Arrays.toString(input));
			System.out.println("output : " + Arrays.deepToString(output));
			return output;
		}
		
		int[][] output = new int[1][]; //
		return output;

	}
}
