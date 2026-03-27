package GestorTallerCesur;

public class Pieza extends Item {
	
	private String nombrePieza;
	private String marca;
	
	
	public Pieza(String nombre, double precioBase, String nombrePieza, String marca ) {
		super(nombre, precioBase);
		this.nombrePieza = nombrePieza;
		this.marca = marca;
	}


	public String getNombrePieza() {
		return nombrePieza;
	}


	public void setNombrePieza(String nombrePieza) {
		this.nombrePieza = nombrePieza;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
