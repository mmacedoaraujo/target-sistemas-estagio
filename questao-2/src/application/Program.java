package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um n�mero positivo que deseja checar: ");
		int count = Integer.valueOf(input.nextLine());
		Boolean answer = null;
		
		int n1 = 0, n2 = 1, n3 = 0;
		
		while(n3 < count) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			
		}
		if(n3 == count) {
			System.out.println("Seu n�mero pertence a sequ�ncia de fibonacci!");
		} else {
			System.out.println("Seu n�mero n�o pertence a sequ�ncia de fibonacci...");
		}
	}
}
