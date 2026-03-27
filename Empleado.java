package GestorTallerCesur;

public class Empleado {
	private String dni; // Añado DNI. Trabajar con DNI como identificador único para buscar empleados es buena idea. Hay DNI en clientes así que sigamos con DNI como identificador (A modo de clave primaria jejeje)
	private String nombre;
	private String puesto;
	private double sueldo;
	private String turno;
	private boolean estaDisponible;
	
	public Empleado(String dni, String nombre, String puesto, double sueldo, String turno) {
		this.dni = dni;
		this.nombre = nombre;
		this.puesto = puesto;
		setSueldo(sueldo);
		this.turno = turno;
		this.estaDisponible = true;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPuesto() {
		return puesto;
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
	
	public String getTurno() {
		return turno;
	}
	
	public boolean isEstaDisponible() {
		return estaDisponible;
	}
	public void cambiarEstado() {
		this.estaDisponible = !this.estaDisponible;
	}
	
	@Override
	public String toString() {
		return "DNI: " + this.dni + "Nombre: " + this.nombre + " Puesto: " + this.puesto;
	}

	
}
