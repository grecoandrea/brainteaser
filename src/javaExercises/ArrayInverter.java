package javaExercises;

import java.util.Arrays;

public class ArrayInverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [] original = {1,2,3,4,5,6,7,8,9};
		int length = original.length;
		
		System.out.println("Original array: "+Arrays.toString(original));
		
		for (int i=0;i<(length)/2; i++) {
			double temp=original[i];
			original[i]=original[length-1-i];
			original[length-1-i]=temp;
			
		}
		System.out.println("Inverted array: "+Arrays.toString(original));
		
		
	}

}
