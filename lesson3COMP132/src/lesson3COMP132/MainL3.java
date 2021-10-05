package lesson3COMP132;

import java.util.Scanner;

public class MainL3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
		char[] consonants = { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X',
				'Z' };
		char tempChar;
		int numOfV = 0, numOfC = 0, idxW = 0, userNum;
		boolean notV = false, doW = true;

		System.out.println("Enter word #1 :");
		String word1 = scn.nextLine();
		System.out.println("Enter word #2:");
		String word2 = scn.nextLine();

		// IF, ELSE IF
		if (word1.length() > word2.length()) {
			System.out.println("The first word is longer than second");
		} else if (word1.length() < word2.length()) {
			System.out.println("The second word is longer than first");
		} else {
			System.out.println("Length of both words is equal");
		}

		// FOR
		for (int i = 0; i < word1.length(); i++) {
			tempChar = word1.toUpperCase().charAt(i);

			notV = true;
			for (char aChar : vowels) {
				if (tempChar == aChar) {
					numOfV++;
					notV = false;
					break;
				}
			}
			if (notV) {
				numOfC++;
			}
		}
		System.out.println("Whe word " + word1 + " has " + numOfV + " vowels and " + numOfC + " consonants");

		// While
		numOfC = 0;
		while (doW) {
			tempChar = word1.toUpperCase().charAt(idxW);

			for (char aChar : consonants) {
				if (tempChar == aChar) {
					numOfC++;
					notV = true;
				}
			}

			if (notV == false) {
				doW = false;
			}

			idxW++;
		}

		// Switch & Do...While

		do {
			System.out.print("Enter number between 0 and 100: ");
			userNum = scn.nextInt();
			System.out.println();
			switch (userNum) {
			case 1: {
				System.out.println("Case 1 choosed, Cow goes Muuuu!");
			}
			case 23: {
				System.out.println("Case 2 choosed, Cat goes Muau!");
			}
			case 91: {
				System.out.println("Case 3 choosed, Dog goes Wuw!");
			}
			case 54: {
				System.out.println("Case 4 choosed, Sheep goes Beee!");
			}
			case 46: {
				System.out.println("Case 5 choosed, 2+2*2 = 6");
			}
			case 13: {
				System.out.println("Case 6 choosed, " + word1);
			}
			case 36: {
				System.out.println("Case 7 choosed, " + word2);
			}
			case 72: {
				System.out.println("Case 8 choosed, Consonats: " + consonants.toString());
			}
			case 69: {
				System.out.println("Case 9 choosed, Vowels: " + vowels.toString());
			}
			case 35: {
				System.out.println("Case 10 choosed, " + (numOfC + numOfV));
			}
			default: {
				System.out.println("Default entered, if you want try again enter 0");
				userNum = scn.nextInt();
			}
			}
		} while (userNum == 0);

	}

	public static int smallest(int a, int b, int c) {
		/*
		 * if (a < b) { if (a < c) { return a; } } else if(b < c) { return b; } return
		 * c;
		 */

		if (a < b)
			b = a;
		if (c < b)
			b = c;
		return b;
	}
}