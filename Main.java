package GestorTallerCesur;
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Taller taller = new Taller();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do { 
			
			System.out.println("Selecciona una opcion:");
			//System.out.println("Create, Read, Update, Delete");
			System.out.println("1. Citas: ");
			System.out.println("2. Empleados: ");
			System.out.println("3. Clientes: ");
			System.out.println("4. Vehiculos: ");
			System.out.println("5. Facturas: ");
			System.out.println("6. Guardar y salir: ");
			opcion = sc.nextInt();
			sc.nextLine(); // IMPORTANTE: limpiar el bufer después de hacer algún sc.nextInt()
		
			switch(opcion) {
			
				case 1 -> {
					//System.out.println("Listar citas de hoy");
					System.out.println("1. Ver futuras citas");
					System.out.println("2. Agendar cita: ");
					System.out.println("3. Cancelar cita: ");
					System.out.println("4. Modificar cita: ");		
					int opcion2 = sc.nextInt();
					sc.nextLine();
					
					switch(opcion2) {
						case 1 -> {
							taller.verCitas();
						}
	
						case 2 -> {
							System.out.println("Introduce la fecha (00/00/000)");
							String fecha = sc.nextLine();
							System.out.println("Introduce la hora:");
							String hora = sc.nextLine();
							System.out.println("DNI del cliente: ");
							String dniCliente = sc.nextLine();
							Cliente cliente = taller.buscarCliente(dniCliente);
							if (cliente == null) break;
							System.out.println("Matrícula del coche");
							String matricula = sc.nextLine();
							Coche coche = taller.buscarCoche(matricula);
							if (coche == null) break;
							System.out.println("DNI del empleado que atenderá al cliente");
							String dniEmpleado = sc.nextLine();
							Empleado empleado = taller.buscarEmpleadoDni(dniEmpleado);
							if (empleado == null) break;
							taller.addCita(fecha, hora, cliente, coche, empleado);
						}
	
						case 3 -> {
							System.out.println("DNI del cliente: ");
							String dniCliente = sc.nextLine();
							Cliente cliente = taller.buscarCliente(dniCliente);
							if (cliente != null) {
								taller.cancelarCita(cliente);
							}
						}

						case 4 -> {
							System.err.println("DNI del cliente: ");
							String dniCliente = sc.nextLine();
							Cliente cliente = taller.buscarCliente(dniCliente);
							if (cliente == null) break;
							System.out.println("Nueva fecha de la cita: ");
							String fecha = sc.nextLine();
							System.out.println("Nueva hora de la cita:");
							String hora = sc.nextLine();
							taller.modificarCita(cliente, fecha, hora);
						}
					}
				}
				
				case 2 -> {
					System.out.println("1. Contratar empleado: ");
					System.out.println("2. Modificar empleado");
					System.out.println("3. Ver horario de un empleado");				
					int opcion2 = sc.nextInt();
					sc.nextLine();
					
					switch(opcion2) {
						case 1 -> {
							System.out.println("Introduce el DNI:");
							String dni = sc.nextLine();
							System.out.println("Introduce el nombre");
							String nombre = sc.nextLine();
							System.out.println("Introduce el puesto");
							String puesto = sc.nextLine();
							System.out.println("Introduce el sueldo");
							Double sueldo = sc.nextDouble();
							sc.nextLine();
							System.out.println("Introduce el turno");
							String turno = sc.nextLine();
							try {
								taller.addEmpleado(dni, nombre, puesto, sueldo, turno);
							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
						}

						case 2 -> {
							System.out.println("Introduce el DNI del empleado:");
							String dniEmpleado = sc.nextLine();
							Empleado empleado = taller.buscarEmpleadoDni(dniEmpleado);
							if (empleado == null) break;
							int accion = 0;
							do { 
								System.out.println("¿Qué deseas modificar?");
								System.out.println("1. Sueldo");
								System.out.println("2. Puesto");
								System.out.println("3. turno");
								System.out.println("4. Terminar y salir");
								accion = sc.nextInt();
								sc.nextLine();

								switch(accion) {
									case 1 -> { // No es definitiva esta forma de hacerlo
										System.out.println("Introduce el sueldo:");
										Double sueldo = sc.nextDouble();
										sc.nextLine();
										empleado.setSueldo(sueldo);
									}

									case 2 -> { 
										System.out.println("Introduce el puesto:");
										String puesto = sc.nextLine();
										sc.nextLine();
										empleado.setPuesto(puesto);
									}

									case 3 -> { 
										System.out.println("Introduce el turno:");
										String turno = sc.nextLine();
										sc.nextLine();
										empleado.setTurno(turno);
									}
								}
							} while (accion != 4);
						}

						case 3 -> {
							System.out.println("Introduce el dni del empleado del que quieras ver el turno");
							String dni = sc.next();
							System.out.println(taller.verTurno(dni));
						}
					}
				}
				case 3 -> {
					//System.out.println("");
					System.out.println("1. Buscar: "); //Opcion de modificar despues.
					System.out.println("2. Añadir cliente: ");
					int opcion2 = sc.nextInt();
					sc.nextLine();
					
					switch(opcion2) {

						case 1 -> {
							System.out.println("Introduce el dni del cliente: ");
							String dni = sc.nextLine();
							sc.nextLine();
							Cliente cliente = taller.buscarCliente(dni);
							int decision = 0;
							do {
								System.out.println("¿Quieres modificar algo del cliente? ");
								System.out.println("1. Si");
								System.out.println("2. No");
								decision = sc.nextInt();

								switch(decision){

									case 1 -> {
										System.out.println("¿Qué deseas modificar?");
										System.out.println("1. Nombre");
										System.out.println("2. Apellido");
										System.out.println("3. Dni");
										int cambio = sc.nextInt();

										switch(cambio) {

											case 1 -> {
												System.out.println("Escribe el nuevo nombre: ");
												String nombre = sc.next();
												cliente.setNombre(nombre);
											}

											case 2 -> {
												System.out.println("Escribe el nuevo apeliido: ");
												String apellido = sc.next();
												cliente.setApellido(apellido);
											}

											case 3 -> {
												System.out.println("Escribe el nuevo dni: ");
												String dniCambio = sc.next();
												cliente.setDni(dniCambio);
											}
										}
									}
								
								}
							} while(decision != 2);	
						}

						case 2 -> {
							System.out.println("Introduce el nombre del cliente: ");
							String nombre = sc.next();
							System.out.println("Introduce el apellido del cliente: ");
							String apellido = sc.next();
							System.out.println("Introduce el dni del cliente: ");
							String dni = sc.next();
							taller.addCliente(nombre, apellido, dni);
						}
					}
				}
				case 4 -> {
					//System.out.println("");
					System.out.println("1. Buscar: "); 
					System.out.println("2. Añadir Vehiculo: ");
					int opcion2 = sc.nextInt();
					sc.nextLine();
					
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
					sc.nextLine();
					
					switch(opcion2) {}
				}
				
				
			}
		} while (opcion != 6);

	}
}


	