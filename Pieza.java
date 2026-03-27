package GestorTallerCesur;

public class Pieza extends Item {
	
	private String nombrePieza;
	private String marca;
	private double beneficio;
	
	
	public Pieza(String nombre, double precioBase, double beneficio, String nombrePieza, String marca) {
		super(nombre, precioBase);
		this.nombrePieza = nombrePieza;
		this.marca = marca;
		this.beneficio = beneficio;
	}

	@Override
	public double precioFinalPieza() {
		double total = getPrecioBase() * beneficio;
		return total;
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
