package GestorTallerCesur;
import java.util.Scanner;
public class Main {
	public int leerNumero(int numero) {
		Scanner sc = new Scanner(System.in);
		
		return 5;
	}
	
	
	public static void main(String[] args) {
		Taller taller = new Taller();
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona una opcion:");
		//System.out.println("Create, Read, Update, Delete");
		System.out.println("1. Citas: ");
		System.out.println("2. Empleados: ");
		System.out.println("3. Clientes: ");
		System.out.println("4. Vehiculos: ");
		System.out.println("5. Facturas: ");
		System.out.println("6. Guardar y salir: ");
		int opcion = sc.nextInt();
	
		switch(opcion) {
		
			case 1 -> {
				//System.out.println("Listar citas de hoy");
				System.out.println("1. Ver futuras citas");
				System.out.println("2. Agendar cita: ");
				System.out.println("3. Cancelar cita: ");
				System.out.println("4. Modificar cita: ");		
				int opcion2 = sc.nextInt();
				
				switch(opcion2) {
					case 1 -> {
						
					}

					case 2 -> {
						System.out.println("Introduce la fecha (00/00/000)");
						String fecha = sc.nextLine();
						System.out.println("Introduce la hora:");
						String hora = sc.nextLine();
						System.out.println("DNI del cliente: ");
						String dniCliente = sc.nextLine();
						Cliente cliente = taller.buscarCliente(dniCliente); // Necesitamos el método buscarCliente, no existe
						System.out.println("Matrícula del coche");
						String matricula = sc.nextLine();
						Coche coche = taller.buscarCoche(matricula); // Necesitamos el método buscarCoche
						System.out.println("DNI del empleado que atenderá al cliente");
						String dniEmpleado = sc.nextLine();
						Empleado empleado = taller.buscarEmpleadoDni(dniEmpleado);
						taller.addCita(fecha, hora, cliente, coche, empleado);
					}
				}
			}
			
			case 2 -> {
				System.out.println("1. Modificar empleado");
				System.out.println("2. Contratar empleado: ");
				System.out.println("3. Ver horario de un empleado");				
				int opcion2 = sc.nextInt();
				
				switch(opcion2) {}
			}
			case 3 -> {
				//System.out.println("");
				System.out.println("1. Buscar: "); //Opcion de modificar despues.
				System.out.println("2. Añadir cliente: ");
				int opcion2 = sc.nextInt();
				
				switch(opcion2) {}
			}
			case 4 -> {
				//System.out.println("");
				System.out.println("1. Buscar: "); 
				System.out.println("2. Añadir Vehiculo: ");
				int opcion2 = sc.nextInt();
				
				switch(opcion2) {}
			}
			case 5 -> {
				//System.out.println("");
				System.out.println("1. Buscar por Cliente :");
				System.out.println("2. Buscar por ID factura: ");
				System.out.println("3. Buscar por matricula: ");
				System.out.println("4. Buscar por empleado:  ");
				System.out.println("5. Buscar por partes:  ");
				int opcion2 = sc.nextInt();
				
				switch(opcion2) {}
			}
			
			
		}

	}
}


	