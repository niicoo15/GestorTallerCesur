package GestorTallerCesur;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	
	public int leerNumero(int numero) {
		Scanner sc = new Scanner(System.in);
		
		return 5;
	}
	
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
				System.out.println("Ver futuras citas");
				System.out.println("Agendar cita: ");
				System.out.println("Cancelar cita: ");
				System.out.println("Modificar cita: ");		
				
				
			}
			
			case 2 -> {
				System.out.println("Modificar empleado");
				System.out.println("Contratar empleado: ");
				System.out.println("Ver horario de un empleado");				
				
			}
			case 3 -> {
				//System.out.println("");
				System.out.println("Buscar: "); //Opcion de modificar despues.
				System.out.println("Añadir cliente: ");
				
			}
			case 4 -> {
				//System.out.println("");
				System.out.println("Buscar: "); 
				System.out.println("Añadir Vehiculo: ");
				
			}
			case 5 -> {
				//System.out.println("");
				System.out.println("Buscar por Cliente :");
				System.out.println("Buscar por ID factura: ");
				System.out.println("Buscar por matricula: ");
				System.out.println("Buscar por empleado:  ");
				System.out.println("Buscar por partes:  ");
			}
			
			
		}

	}
}


	