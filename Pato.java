package interfazAnimal;

import java.util.Random;

public class Pato extends Mascota implements Animal {
	
	Pato pato() {
		this.nombre = "Pati";
		this.pipi = 0;
		this.caca = 0;
		this.amistad = 0;
	}
	
	public void excretando() {
		this.pipi += 1;
		this.caca += 1;
		}
	}
	
	public void follando() {
		Random rand = new Random();
		float probabilidad = rand.nextFloat();
		if (probabilidad <= 0.60f) {
			crias += 1;
		}
		
	}
	
	public String toString() {
		return "Este pato se llama " + this.nombre + ", ha hecho " + this.pipi + " pipi(s), " + this.caca + " caca(s) y tiene " + this.crias + " cria(s).";
	}

}
