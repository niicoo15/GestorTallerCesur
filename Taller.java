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

	// Buscar coche
	public Coche buscarCoche(String matricula) {
		for (Coche coche : listaCoches) {
			if (coche.getMatricula().equals(matricula)) {
				System.out.println("Coche encontrado");
				return coche;
			}
		}
		System.out.println("No se ha encontrado ningún coche con la matrícula " + matricula);
		return null;
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

	//Eliminar / despedir empleados
	public void eliminarEmpleado (String dni) { // poner empleado en "no disponible"
		Empleado empleado = buscarEmpleadoDni(dni);
		if (empleado == null) {
			return;
		}
		empleado.cambiarEstado();
		System.out.println("Empleado eliminado");
	}

	//buscar empleado
	public Empleado buscarEmpleadoDni(String dniEmpleado) {
		if (listaEmpleados.isEmpty()) {
			System.out.println("No hay empleados contratados actualmente");
		}
		for (int i = 0; i < listaEmpleados.size(); i++) {
			if (listaEmpleados.get(i).getDni().equals(dniEmpleado)) {
				Empleado empleado = listaEmpleados.get(i);
				return empleado;
			}
		}
		System.out.println("No se ha encontrado el empleado");
		return null;
	}

	//añadir facturas
	public void addFactura(int id, ArrayList<Item> listaElementos) {
		Factura factura = new Factura(id, listaElementos);
		listaFacturas.add(factura);
	}
	
	//añadir citas
	public void addCita(String fecha, String hora, Cliente cliente, Coche coche, Empleado empleado) {
		Cita cita = new Cita(fecha, hora, cliente, coche, empleado);
		listaCitas.add(cita);
		System.out.println("Cita añadida cporrectamente");
	}

	// Cancelar cita
	public void cancelarCita(Cliente cliente) { // Si os parece usaremos cliente para encontrar la cita
		for (int i = 0; i < listaCitas.size(); i++) {
			if (listaCitas.get(i).getCliente().equals(cliente)) {
				listaCitas.remove(i);
				System.out.println("Cita cancelada correctamente");
				return;
			}
		}
		System.out.println("No existe una cita para ese cliente");
	}

	// Modificar cita
	public void modificarCita(Cliente cliente, String fecha, String hora) { // Usaré de nuevo al cliente para encontrar la cita (nos falta un método de buscar cliente)
		for (int i = 0; i < listaCitas.size(); i++) {
			if (listaCitas.get(i).getCliente().equals(cliente)) { // Me guardo el coche, la factura y el empleado
				Coche coche = listaCitas.get(i).getCoche();
				Factura factura = listaCitas.get(i).getFactura();
				Empleado empleado = listaCitas.get(i).getEmpleado();
				listaCitas.remove(i); //Elimino la cita
				Cita cita = new Cita(fecha, hora, cliente, coche, empleado); // creo una cita nueva con los datos guardados y con la nueva fecha y hora
				listaCitas.add(cita); // añado la nueva cita a la lista
				
				return;
			}
		}
		System.out.println("No existe una cita para ese cliente");
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

	// Buscar cliente
	public Cliente buscarCliente(String dniCliente) {
		for (Cliente cliente : listaClientes) {
			if (cliente.getDni().equals(dniCliente)) {
				System.out.println("Cliente encontrado");
				return cliente;
			}
		}
		System.out.println("No se ha encontrado ningún cliente con DNI " + dniCliente);
		return null; 
		/*
		IMPORTANTE: 'return null' devuelve un NULL (el campo vacío).
		Cuando usemos métodos de buscar (cliente, coche, empleado...) hay que asegurarse de que no es nulo.
		Si no lo encuentra nos devuelve NULL y el programa sigue, se detendrá dando error cuando usemos el cliente = null que nos ha devuelto (No estoy seguro, pero creo que será así)
		Solucion: cuando queramos obtener el cliente (o coche o lo que sea) que hemos buscado con el DNI hay que hacer algún if(cliente != null) para que el método no continue si no hay cliente
		*/
	}

	// ver horario de un empleado
	public String verTurno(String dni){
		for (Empleado e : listaEmpleados){
			if (e.getDni().equals(dni)){
				return e.getTurno();
			}
		}
		return "No hay empleados con ese dni";
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
