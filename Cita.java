package GestorTallerCesur;

public class Cita {
	private String fecha;
	private String hora;
	private Cliente cliente;
	private Coche coche;
	private Factura factura;
<<<<<<< HEAD
	private Empleado empleado; 
	
		public Cita(String fecha, String hora, Cliente cliente, Coche coche, Factura factura, Empleado empleado) {
			super();
			this.fecha = fecha;
			this.hora = hora;
			this.cliente = cliente;
			this.coche = coche;
			this.factura = factura;
			this.empleado = empleado;
		}

		public String getFecha() {
			return fecha;
		}

		public String getHora() {
			return hora;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public Coche getCoche() {
			return coche;
		}

		public void setCoche(Coche coche) {
			this.coche = coche;
		}

		public Factura getFactura() {
			return factura;
		}

		public void setFactura(Factura factura) {
			this.factura = factura;
		}

		public Empleado getEmpleado() {
			return empleado;
		}

		public void setEmpleado(Empleado empleado) {
			this.empleado = empleado;
		}

		@Override
		public String toString() {
			return "Cita [fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", coche=" + coche
					+ ", factura=" + factura + ", empleado=" + empleado + "]";
		}
	
	
=======
	private Empleado empleado;

	public Cita (String fecha, String hora, Cliente cliente, Coche coche, Factura factura, Empleado empleado) {
		setFecha(fecha);
		setHora(hora);
		setCliente(cliente);
		setCoche(coche);
		setFactura(factura);
		setEmpleado(empleado);
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
>>>>>>> 5332fde6f40dde1ae17458a6b4701d9e11116e87
}
