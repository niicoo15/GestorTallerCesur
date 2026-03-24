package GestorTallerCesur;

public class Cita {
	private String fecha;
	private String hora;
	private Cliente cliente; // cliente, coche, factura y empleado no necesitan getter ni setter en principio
	private Coche coche;
	private Factura factura; // No se, de momento, para qué necesitamos factura en citas
	private Empleado empleado;

	public Cita (String fecha, String hora, Cliente cliente, Coche coche, Factura factura, Empleado empleado) {
		setFecha(fecha);
		setHora(hora);
		this.cliente = cliente;
		this.coche = coche;
		this.factura = factura;
		this.empleado = empleado;
	}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

	@Override

	public String toString() {
		return "Fecha " + fecha + " " + "\n" +
			"Hora " + hora + " " + "\n" +
			cliente + "\n" +
			coche + "\n" +
			factura + "\n" +
			empleado;
	}

   
}
