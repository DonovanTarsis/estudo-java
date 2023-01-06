package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";	
		
		/*
		 * A ordem dos métodos influencia diretamente o resultado final.
		 */
		s = s.toUpperCase(); // Não altera o original. Precisa atribuir novamente se quiser salvar.
	
		s = s.replace("X", "Senhora"); // Não altera o original. Precisa atribuir novamente se quiser salvar.
		
		s = s.concat("!!!"); // Não altera o original. Precisa atribuir novamente se quiser salvar.
		
		System.out.println(s);
		
		// Também é acessível em um valor literal.
		String x = "Doni".toUpperCase();
		System.out.println(x);
		
		//Vários métodos seguidos (A ordem dos métodos influencia diretamente o resultado final.)
		String y = "Bom dia X"
				.replace("X", "Doni")
				.toLowerCase()
				.concat("!!!");
		
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		
	}
}
