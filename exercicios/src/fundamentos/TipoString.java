package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		/*
		 * String é um objeto imutável;
		 * Nunca modificamos o valor inicial, 
		 * o que podemos fazer é substituir o valor original.
		 */
		System.out.println("Olá pessoal".charAt(2));// pega o caracter do index passado
		String s = "Boa tarde"; 
		s = s.toUpperCase();
		s = "Bom dia";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Bom"));
		System.out.println(s.startsWith("bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.endsWith("dia!"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade" + idade + 
				"\nSalário: " + salario);
		
		String resumo = "Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade" + idade + 
				"\nSalário: " + salario;
		
		System.out.println(resumo);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
