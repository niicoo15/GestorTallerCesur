package GestorTallerCesur;

public class Cita {
	private String fecha;
	private String hora;
	private Cliente cliente; // cliente, coche, factura y empleado no necesitan getter ni setter en principio
	private Coche coche;
	private Factura factura;
	private Empleado empleado;


	public Cita (String fecha, String hora, Cliente cliente, Coche coche, Factura factura, Empleado empleado) {
		this.fecha = fecha;
		this.hora = hora;
		this.cliente = cliente;
		this.coche = coche;
		this.factura = factura;
		this.empleado = empleado;
	}
	//adicione este getter para porder buscar en la factura
	public Coche getCoche() { 
		return coche;
	}
    public String getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
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
