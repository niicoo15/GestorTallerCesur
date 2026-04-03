package GestorTallerCesur;
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
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
				String opcion2 = sc.nextLine();
				
				switch(opcion2) {}
			}
			
			case 2 -> {
				System.out.println("1. Modificar empleado");
				System.out.println("2. Contratar empleado: ");
				System.out.println("3. Ver horario de un empleado");				
				String opcion3 = sc.nextLine();
				
				switch(opcion3) {}
			}
			case 3 -> {
				//System.out.println("");
				System.out.println("1. Buscar: "); //Opcion de modificar despues.
				System.out.println("2. Añadir cliente: ");
				String opcion4 = sc.nextLine();
				
				switch(opcion4) {}
			}
			case 4 -> {
				//System.out.println("");
				System.out.println("1. Buscar: "); 
				System.out.println("2. Añadir Vehiculo: ");
				String opcion5 = sc.nextLine();
				
				switch(opcion5) {}
			}
			case 5 -> {
				//System.out.println("");
				System.out.println("1. Buscar por Cliente :");
				System.out.println("2. Buscar por ID factura: ");
				System.out.println("3. Buscar por matricula: ");
				System.out.println("4. Buscar por empleado:  ");
				System.out.println("5. Buscar por partes:  ");
				String opcion6 = sc.nextLine();
				
				switch(opcion6) {}
			}
			
			
		}

	}
}


	