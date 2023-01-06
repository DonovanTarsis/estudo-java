package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		/*
		 * Tudo em java é objeto, menos os tipos primitivos.
		 * 
		 * Todo tipo primitivo tem um Wrapper.
		 * Os Wrappers são a versão objeto dos 
		 * tipos primitivos.
		 */
		String s = new String("Texto");
		s.toUpperCase();
	}
}
