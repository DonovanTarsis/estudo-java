package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//Scanner teclado = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		
		//short
		Short s = 1000;
		
		//int
		Integer i = 100000;
		//System.out.print("Digite um Integer: ");
		//Integer i = Integer.parseInt(teclado.nextLine());
		
		//long
		Long l = 100_000_000_000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//float 
		Float f = 123.1f;
		System.out.println(f);
		
		//double
		Double d = 1534.051561;
		
		System.out.println(d);
		
		//bollean
		Boolean bo = true;
		//Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//char
		Character c = '#';
		
		System.out.println(c.toString() + c.hashCode());
		//teclado.close();
	}
}
