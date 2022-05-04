package interfazAnimal;

public abstract class Mascota {
	public String nombre;
	public int amistad;
	public int pipi;
	public int caca;
	public int crias;
	
	public void acariciar() {
		this.amistad += 1;
	}
	public void limpiarExcrementos() {
		this.pipi = 0;
		this.caca = 0;
	}

}
