package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		//Tipo inferido pelo programador. (double)
		double a = 4.5;
		System.out.println(a);
		
		//Java vai inferir o tipo pelo valor colocado. (double)
		var b =4.5;
		System.out.println(b);

		//Java vai inferir o tipo pelo valor colocado. (String)
		var c ="4.5";
		c = "Outro texto";
		System.out.println(c);
		
		/*
		 * É alterar o tipo de uma var depois de criada, 
		 * mas não é possível alterar o tipo. 
		 * (Exceto inferir um int em um double onde a 
		 * conversão é automática)
		 * 
		 * 
		 * EX:
		 * 
		 * var d = 4.5; //inicializei e foi inferido o tipo double
		 * d = "texto"; //Não é possível pois não podemos alterar o valor 
		 *				//de uma variável double para um valor String.
		 *
		 *--*--*--*--*--*--*--*--*--*--*--*
		 *
		 * var e = 4.5; //inicializei e foi inferido o tipo double
		 * e = 1; // java converte 1 -> 1.0
		 * 
		 *--*--*--*--*--*--*--*--*--*--*--*
		 *
		 * var e = 4; //inicializei e foi inferido o tipo int
		 * e = 1.0; //Não é possível pois não podemos alterar o valor 
		 *			//de uma variável int para um valor double.
		 * 
		 * 
		 */
	}
}
