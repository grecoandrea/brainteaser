package javaExercises;

public class StringInverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String toInvert = "123456789";
		int stringLength = toInvert.length();
		char[] stringToChar = toInvert.toCharArray();
		int arrayCharLength = stringToChar.length;
		
		System.out.println("Original: "+toInvert);
		System.out.println("String length: "+stringLength);
		
		for(int i=0;i<(stringLength)/2;i++, arrayCharLength--) {
			char temp=stringToChar[i];
			stringToChar[i]=stringToChar[arrayCharLength-1];
			stringToChar[arrayCharLength-1]=temp;
			
		}
		
		System.out.println("Inverted: "+String.valueOf(stringToChar));
	}
}
