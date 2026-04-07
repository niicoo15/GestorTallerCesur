package GestorTallerCesur;

public class Servicio extends Item {

	private String servicio;
	private Empleado empleado;
	private int tiempoArreglo;
	
	public Servicio(String nombre, double precioBase, String servicio, Empleado empleado, int tiempoArreglo) {
		super(nombre, precioBase);
		this.servicio = servicio;
		this.empleado = empleado;
		this.tiempoArreglo = tiempoArreglo;
	}
	@Override
	public double calcularPrecioFinal() {
		double total = getPrecioBase() * this.tiempoArreglo;
		return total;
	}
	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getTiempoArreglo() {
		return tiempoArreglo;
	}

	public void setTiempoArreglo(int tiempoArreglo) {
		this.tiempoArreglo = tiempoArreglo;
	}
	
}
