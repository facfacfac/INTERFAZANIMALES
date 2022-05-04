package interfazAnimal;

public class Main {

	public static void main(String[] args) {
		System.out.println("Haciendo un gatete to guapo");
		Gato gatete = new Gato();
		System.out.println(gatete);
		
		System.out.println("Ahora va a excretar como un senior");
		gatete.excretando();
		System.out.println(gatete);
		
		System.out.println("Y ahora va a follar como un campeon");
		gatete.follando();
		System.out.println(gatete);
		

	}

}
