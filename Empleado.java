package GestorTallerCesur;

public class Empleado {
	private String nombre;
	private String puesto;
	private double sueldo;
	private String turno; //Falta el contructor (arreglar) 
	private boolean estaDisponible;
	
	public Empleado(String nombre, String puesto, double sueldo) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.sueldo = sueldo;
		this.estaDisponible = true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	public void cambiarEstado() {
		this.estaDisponible = !this.estaDisponible;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + " Puesto: " + this.puesto;
	}
	
	
}
