package IISC;

import java.util.ArrayList;
import java.util.Scanner;

public class VowelsAndConsonantFrequency {

	public static void main(String[] args) {
		ArrayList<Character> noob = new ArrayList<Character>();
		noob.add('a');
		noob.add('e');
		noob.add('i');
		noob.add('o');
		noob.add('u');
		int vowels = 0, consonant = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String a = scan.nextLine();
		
		a = a.replaceAll("\\s", "");
		
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (noob.contains(a.charAt(i))) {
				vowels++;
			}else {
				consonant++;
			}
		}
		System.out.printf("In th above sentence \n%s\nthere are %d vowels and %d consonants",a,vowels,consonant);
	}
}
