package GestorTallerCesur;

public class Cita {
	private String fecha;
	private String hora;
	private Cliente cliente;
	private Coche coche;
	private Factura factura;
	private Empleado empleado;


	public Cita (String fecha, String hora, Cliente cliente, Coche coche, Empleado empleado) {
		this.fecha = fecha;
		this.hora = hora;
		this.cliente = cliente;
		this.coche = coche;
		//this.factura = factura;
		this.empleado = empleado;
	}

    public String getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
    }
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Coche getCoche() {
		return coche;
	}

	public Factura getFactura() {
		return factura;
	}

	public Empleado getEmpleado() {
		return empleado;
	}
	@Override

	public String toString() {
		return "Fecha " + fecha + " " + "\n" +
			"Hora " + hora + " " + "\n" +
			cliente + "\n" +
			coche + "\n" +
			empleado;
	}


}
