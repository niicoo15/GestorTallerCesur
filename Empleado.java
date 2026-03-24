package GestorTallerCesur;

public class Empleado {
	private String nombre;
	private String puesto;
	private double sueldo;
	private String turno; //Falta el constructor (arreglar) 
	private boolean estaDisponible;
	
	public Empleado(String nombre, String puesto, double sueldo) {
		setNombre(nombre);
		setPuesto(puesto);
		setSueldo(sueldo);
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
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		if (sueldo <= 0) {
			throw new IllegalArgumentException ("ERROR: El sueldo del empleado no puede ser 0 euros o menos"); // Se lanza el error para comprobar entradas. Luego se mostrara con try-catch en la interfaz (clase Main).
		}
		this.sueldo = sueldo;
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
