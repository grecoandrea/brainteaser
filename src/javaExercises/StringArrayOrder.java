package javaExercises;

import java.util.Arrays;

public class StringArrayOrder {

	public static void main(String[] args) {

		String [] input = {"Andreina Clara", "Luigi H.", "Vasco Rossi", "Bertoni Alfredo Pasquali", "Ron"};
		System.out.println("String Array not ordered: "+Arrays.toString(input));

		for (int i=0; i<input.length; i++) {
			for (int j=0; j<input.length; j++) {
				if (input[i].length()<input[j].length()) {
					String temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		System.out.println("String Array ordered from min: "+Arrays.toString(input));	

		for (int i=0; i<input.length; i++) {
			for (int j=0; j<input.length; j++) {
				if (input[i].length()>input[j].length()) {
					String temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		System.out.println("String Array ordered from max: "+Arrays.toString(input));
	}

}
