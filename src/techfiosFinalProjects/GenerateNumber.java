package techfiosFinalProjects;

import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;

public class GenerateNumber {
	static int[] genList = new int[500];

	public static void gen() {
		Random rand = new Random();
		for (int i = 0; i < 500; i++) {
			int genNum = rand.nextInt(500);
// System.out.println(genNum);
			genList[i] = genNum;
		}
// Arrays.sort(genList);
	}

	public static void main(String[] args) {
		gen();

		for (int n : genList) {
			System.out.println(n);
		}

		Scanner scr = new Scanner(System.in);
		System.out.println("please enter the smallest number");
		int n = scr.nextInt();
		System.out.println("The " + n + "th smallest number is " + genList[n - 1]);

	}
}