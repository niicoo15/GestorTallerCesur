package GestorTallerCesur;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
public class Factura {
	
	private int id;
	private Cita cita;
	private Cliente cliente;
	private LocalDate fecha;
	private ArrayList<Factura> listafacturas;
	
	private ArrayList<Item> listaElementos;
	
		public Factura(int id, Cliente cliente, Cita cita, ArrayList<Item> listaElementos) {
			this.id = id;
			this.cliente = cliente;
			this.listaElementos = listaElementos;
			this.cita = cita;
			this.fecha = LocalDate.now();
		}

		public Cita getCita() { 
			return cita;
		}
		
		//calcula el precio de los items sim importar si es servicio, repuesto o item
		public double calcularTotalFactura() {
			double total = 0;

			for(Item r : listaElementos) {
				total += r.calcularPrecioFinal();
			}
			return total;
		}

		public String mesTraducido () {
			LocalDate fecha = LocalDate.now();
			String mesNombre = fecha.getMonth().toString().toUpperCase();
			switch (mesNombre) {
				case "JANUARY": mesNombre = "ENERO"; break;
				case "FEBRUARY": mesNombre = "FEBRERO"; break;
				case "MARCH": mesNombre = "MARZO"; break;
				case "APRIL": mesNombre = "ABRIL"; break;
				case "MAY": mesNombre = "MAYO"; break;
				case "JUNE": mesNombre = "JUNIO"; break;
				case "JULY": mesNombre = "JULIO"; break;
				case "AUGUST": mesNombre = "AGOSTO"; break;
				case "SEPTEMBER": mesNombre = "SEPTIEMBRE";break;
				case "OCTOBER": mesNombre = "OCTUBRE"; break;
				case "NOVEMBER": mesNombre = "NOVIEMBRE"; break;
				case "DECEMBER": mesNombre = "DICIEMBRE"; break;	
				default: mesNombre = "Desconocido"; break;
			}
			return mesNombre;
		}

		public void crearDirectorioFacturas (){ //separe la traduccion de la creacion del directorio por si se necesitan en otras clases
			File directorio = new File ("Facturas mes " + mesTraducido());

			if(!directorio.exists()) {
			if(directorio.mkdir()) {
				System.out.println("Se creo directorio facturas del mes: " + mesTraducido() );
			 }
			}
		}
		
		public void generarFactura() {
			double totalAcumulado = 0;
			String nombreMes = mesTraducido();
			String ruta = "Facturas mes " + nombreMes + "/factura " + this.id + ".csv";
			try(FileWriter f = new FileWriter (ruta)) {
				f.write("---factura taller---"+ "\n");
				f.write("ID de la factura: "+ this.id+ "\n");
				f.write("Cliente: " + this.cliente.getNombre() + "\n");
				f.write("Fecha: " + this.fecha + "\n");
			for (Item r : listaElementos) {
				double precioItem = r.calcularPrecioFinal();
				f.write(r.getNombre() + ";" + precioItem + " €\n");
				totalAcumulado += precioItem;
			}
				f.write("total a pagar: " + totalAcumulado + " €\n");
		}catch (IOException e) {
			System.err.println("Error al guardar la factura" + e.getMessage());
		}
		}
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public ArrayList<Item> getListaElementos() {
			return listaElementos;
		}

		public void setListaElementos(ArrayList<Item> listaElementos) {
			this.listaElementos = listaElementos;
		}

		@Override
		public String toString() {
			return "Factura [id=" + id + ", listaElementos=" + listaElementos + "]";
		}

	
}
