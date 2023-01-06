package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		
		// byte -> -128 a 127
		byte anosDeEmpresa = 23;
		
		// short -> -32_768 a 32_767
		short numeroDeVoos = 542;
		
		// int -> -2_147_483_648 a 2_147_483_647
		int id = 56_789;
		
		/*
		 *	long -> -9_223_372_036_854_775_808 a 9_223_372_036_854_775_807
		 *  Para instanciar um long literal(colocado direto no código) maior 
		 *  que um int utilizar o 'L' maiúsculo ou minúsculo no final do número.
		 */
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		
		/*
		 *	float -> -1.40239846 x 10^-45 a 3.40282347 x 10^38
		 *  Para instanciar um float literal(colocado direto no código)
		 *  utilizar o 'F' maiúsculo ou minúsculo no final do número.
		 */
		float salario = 11_445.44f;
		
		// double -> 4.9406564584124654 x 10^-324 a 1.7976931348623157 x 10^308
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		
		boolean estaDeFerias = false; //true
		
		// Tipo caractere
		char status = 'A'; // Também é possível intanciar de acordo com a tabela unicode EX: 'A' -> '\u0041'
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": Ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);		
	}
}
