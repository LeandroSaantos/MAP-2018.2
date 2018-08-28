package exercicoSingleton;

public class Carro {
	private static Carro carro();
	
	private Carro () {}
	
	String quote () {
		return Carro;
	}
	
	public static synchronized Carro getInstance () {
		if (singleInstance == null) {
			singleInstance = new Carro();	
		}
		return singleInstance;
	}
	
	public static void main(String []args) {
		Carro carro = Carro.getInstance();
		System.out.println(carro.quote());
	   }
	
}
