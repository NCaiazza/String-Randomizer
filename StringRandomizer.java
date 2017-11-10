package stringRandomizer;

import java.util.Random;
import java.util.Scanner;

// Author: Nicholas Caiazza
public class StringRandomizer {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		System.out.print("Enter the string to be randomized:");
		String initial = kbd.nextLine();
		System.out.print("\nEnter a key (as an integer):");
		int key = kbd.nextInt();
		
		String encoded = randomize(initial, key);
		
		System.out.println("\n" + encoded);
		
		kbd.close();
	}
	
	public static String randomize(String s, int key) {
		char[] array = s.toCharArray();
		char[] output = array;
		
		for (int i = 0; i < array.length; i++) {
			Random rng = new Random(key + i);
			output[i] = array[rng.nextInt(array.length)];
		}
		
		String outputString = "";
		
		for (int i = 0; i < output.length; i++) {
			outputString += output[i];
		}
		
		return outputString;
	}

}
