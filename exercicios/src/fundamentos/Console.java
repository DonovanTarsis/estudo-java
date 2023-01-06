package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom");
		System.out.println(" dia!\n\n");
		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: R$%.2f%n", 1234.5978); // "%n === \n"
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = teclado.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		int idade = teclado.nextInt();
		teclado.nextLine();
		System.out.printf("\n\n%s %s tem %d\n", nome, sobrenome, idade);
		
		teclado.close();
		
		
	}
}
