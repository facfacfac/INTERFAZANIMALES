package interfazAnimal;
import java.util.Random;

public class Gato extends Mascota implements Animal {
	
	Gato gato() {
		this.nombre = "Rufus";
		this.pipi = 0;
		this.caca = 0;
		this.amistad = 0;
	}
	
	public void excretando() {
		this.pipi += 1;
		if (this.pipi%2 == 0) {
			this.caca += 1;
		}
	}
	
	public void follando() {
		Random rand = new Random();
		float probabilidad = rand.nextFloat();
		if (probabilidad <= 0.90f) {
			crias += 1;
		}
		
	}
	
	public String toString() {
		return "Este gato se llama " + this.nombre + ", ha hecho " + this.pipi + " pipi(s), " + this.caca + " caca(s) y tiene " + this.crias + " cria(s).";
	}

}
