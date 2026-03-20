package Taller;
import java.util.ArrayList;

public class Taller {
	
	ArrayList<Coche> listaCoches = new ArrayList<>();
	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	ArrayList<Factura> listaFacturas = new ArrayList<>();
	ArrayList<Cita> listaCitas = new ArrayList<>();
	ArrayList<Cliente> listaClientes = new ArrayList<>();

	
	public void addCoche(String matricula, String modelo, String descripcionFallo) {
		for (Coche c : listaCoches) {
			if (matricula.equals(c.getMatricula())) {
				throw new IllegalArgumentException("Esta matricula ya esta añadida, añade otra");
				
			}
		}
		Coche coche = new Coche(matricula,modelo,descripcionFallo);
			
		listaCoches.add(coche);
		

	}
	
}
