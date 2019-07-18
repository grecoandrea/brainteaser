package javaExercises;

import java.util.Arrays;

public class ArrayOrder {

	public static void main(String[] args) {

		double [] input = {1.2, 3.0, 0.25, 6.78, 0.99};
		System.out.println("Array not ordered: "+Arrays.toString(input));
		int len = input.length;

		for (int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				if (input[i]<input[j]) {
					double temp;
					temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		System.out.println("Array ordered from min: "+Arrays.toString(input));

		for (int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				if (input[i]>input[j]) {
					double temp;
					temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		System.out.println("Array ordered from max: "+Arrays.toString(input));

	}

}
