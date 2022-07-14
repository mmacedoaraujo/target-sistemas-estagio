package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String phrase = input.nextLine();
		String reverse = "";
		char caracteres;
		
		for (int i = 0; i<phrase.length(); i++) {
			
			caracteres = phrase.charAt(i);
			reverse = caracteres + reverse;
		}
		
		System.out.println(reverse);
	}
}
