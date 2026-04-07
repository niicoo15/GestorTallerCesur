package GestorTallerCesur;
import java.util.ArrayList;

public class Taller {
	
	ArrayList<Coche> listaCoches = new ArrayList<>();
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	ArrayList<Factura> listaFacturas = new ArrayList<>();
	ArrayList<Cita> listaCitas = new ArrayList<>();
	ArrayList<Cliente> listaClientes = new ArrayList<>();

		//añadir coches
	public void addCoche(Cliente cliente, String matricula, String modelo, String descripcionFallo) {
		for (Coche c : listaCoches) {
			if (matricula.equals(c.getMatricula())) {
				throw new IllegalArgumentException("Esta matricula ya esta añadida, añade otra");				
			}
		}
		Coche coche = new Coche(cliente,matricula,modelo,descripcionFallo);			
		listaCoches.add(coche);		
	}
	//añadir empleados
	public void addEmpleado(String dni, String nombre, String puesto, double sueldo, String turno) {
		/*
			Este try-catch prueba a añadir un empleado. En caso de un dato incorrecto, desde la clase Empleado se lanza el error
		*/
		try {
			Empleado empleado = new Empleado(dni, nombre, puesto, sueldo, turno);
			listaEmpleados.add(empleado);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	//buscar empleado
	public Empleado buscarEmpleadoDni(String dni) {
		if (listaEmpleados.isEmpty()) {
			System.out.println("No hay empleados contratados actualmente");
		}
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getDni().equals(dni)) {
				return listaEmpleados.get(i);
			}
		}
		System.out.println("No se ha encontrado el empleado");
		return null;
	}

	public void buscarFacturas (String criterio, int tipo){
		boolean encontrado = false;
		for(Factura f : listaFacturas) {
			switch(tipo) {
				case 1 : //por cliente
				if(f.getCliente().getNombre.equalsIgnoreCase(criterio)) {
				System.out.println(f);
				encontrado = true;
				}
				case 2 : //por id
				if(String.valueOf(f.getId()).equalsIgnoreCase(criterio)){
					System.out.println(f);
					encontrado = true;
				}
				case 3 : //por matricula
				if(f.getCita().getCoche().getMatricula().equalsIgnoreCase(criterio)) {
					System.out.println(f);
					encontrado = true;
				}
				case 4 : //por empleado
				for (Item it : f.getListaElementos()) {
					if (it instanceof Servicio s) {
						if(s.getEmpleado().getNombre().equalsIgnoreCase(criterio)){
							System.out.println(f);
							encontrado = true;
						}
					}
				}
				case 5 : //por repuesto
				for (Item it : f.getListaElementos()) {
					if (it instanceof Pieza p)
						if(p.getNombrePieza().equalsIgnoreCase(criterio)){
							System.out.println(f);
							encontrado = true;
						}
				}
			}
		}
		if(!encontrado); System.out.println("No se encontro ninguna factura ");
	}

	//añadir facturas
	public void addFactura(int id, Cliente cliente, Cita cita, ArrayList<Item> listaElementos) {
		Factura factura = new Factura(id, cliente, cita, listaElementos);
		factura.crearDirectorioFacturas(); //metodo de crear un directorio que esta en facturas
		factura.generarFactura(); //motodo de generar una factura y guardarla en el directiro que esdta en factura 
		listaFacturas.add(factura);
	}
		//añadir citas
	public void addCita(String fecha, String hora, Cliente cliente, Coche coche, Factura factura, Empleado empleado) {
		/*
			Este try-catch prueba a crear la nueva cita. En caso de un dato incorrecto, desde la clase Cita se lanza el error
		*/
		try {
			Cita cita = new Cita(fecha, hora, cliente, coche, factura, empleado);
			listaCitas.add(cita);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
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
	
	public void verCoches(){
		for (Coche c : listaCoches){
			System.out.println(c);
		}
	}

	public void verEmpleados(){
		for (Empleado e : listaEmpleados){
			System.out.println(e);
		}
	}

	public void verFacturas(){
		for (Factura f : listaFacturas){
			System.out.println(f);
		}
	}

	public void verCitas(){
		for (Cita c : listaCitas){
			System.out.println(c);
		}
	}

	public void verClientes(){
		for (Cliente c : listaClientes){
			System.out.println(c);
		}
	}

	
}
