package GestorTallerCesur;
import java.util.List;

public class Empleado {
	private String dni; // Añado DNI. Trabajar con DNI como identificador único para buscar empleados es buena idea. Hay DNI en clientes así que sigamos con DNI como identificador (A modo de clave primaria jejeje)
	private String nombre;
	private String puesto;
	private double sueldo;
	private String turno;
	private boolean estaDisponible;
	private List<String> puestos = List.of("Mecánico", "Dirección", "Oficina"); // Los puestos que tenemos. Usaremos la lista de solo lectura para asegurarnos que asignamos puestos válidos a los empleados
	
	public Empleado(String dni, String nombre, String puesto, double sueldo, String turno) {
		setDni(dni);
		setNombre(nombre);
		setPuesto(puesto);
		setSueldo(sueldo);
		setTurno(turno);
		this.estaDisponible = true;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) { // Me faltan otras comprobaciones de entrada
		if (dni.length() != 9) {
			throw new IllegalArgumentException("ERROR: El DNI tiene que contener 9 carácteres");
		}

		this.dni = dni;
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
		if (!puestos.contains(puesto)) {
			throw new IllegalArgumentException("El puesto '" + puesto + "' no es un puesto válido");
		}
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
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
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
