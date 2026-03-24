package GestorTallerCesur;
import java.util.ArrayList;

public class Taller {
	
	ArrayList<Coche> listaCoches = new ArrayList<>();
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	ArrayList<Factura> listaFacturas = new ArrayList<>();
	ArrayList<Cita> listaCitas = new ArrayList<>();
	ArrayList<Cliente> listaClientes = new ArrayList<>();

		//añadir coches
	public void addCoche(String matricula, String modelo, String descripcionFallo) {
		for (Coche c : listaCoches) {
			if (matricula.equals(c.getMatricula())) {
				throw new IllegalArgumentException("Esta matricula ya esta añadida, añade otra");				
			}
		}
		Coche coche = new Coche(matricula,modelo,descripcionFallo);			
		listaCoches.add(coche);		
	}
		//añadir empleados
	public void addEmpleado(String nombre, String puesto, double sueldo) {
		Empleado empleado = new Empleado(nombre, puesto, sueldo);
		listaEmpleados.add(empleado);
	}
		//añadir facturas
	public void addFactura(int id, ArrayList<Item> listaElementos) {
		Factura factura = new Factura(id, listaElementos);
		listaFacturas.add(factura);
	}
		//añadir citas
	public void addCita(String fecha, String hora, Cliente cliente, Coche coche, Factura factura, Empleado empleado) {
		Cita cita = new Cita(fecha, hora, cliente, coche, factura, empleado);
		listaCitas.add(cita);
	}
		//añadir clientes
	public void addCliente(String nombre, String apellido, String dni) {
		for (Cliente c : listaClientes) {
			if (dni.equals(c.getDni())) {
				throw new IllegalArgumentException("Este cliente ya esta añadida, añade otra");	
			}
		}
		Cliente cliente = new Cliente(nombre, apellido, dni);
		listaClientes.add(cliente);
	}
	
	
}
