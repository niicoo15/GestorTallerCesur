package GestorTallerCesur;

import java.time.LocalDate;
import java.util.ArrayList;
public class Factura {
	
	private int id;
	private Cita cita;
	private Cliente cliente;
	private LocalDate fecha;
	private ArrayList<Factura> listafacturas;
	
	private ArrayList<Item> listaElementos;
	
		public Factura(int id, ArrayList<Item> listaElementos) {
			this.id = id;
			this.listaElementos = listaElementos;
			this.fecha = LocalDate.now();
		}
		//calcula el precio de los items sim importar si es servicio, repuesto o item
		public double calcularTotalFactura() {
			double total = 0;

			for(Item r : listaElementos) {
				total += r.calcularPrecioFinal();
			}
			return total;
		}
		//genera una factura temporal en la terminal, mientras creo la persistencia para que la guarde en un archivo
		public void generarFctura() {
			double totalAcumulado = 0;
			System.out.println("---factura taller---");
			System.out.println("ID de la factura: "+ this.id);
			for (Item r : listaElementos) {
				double precioItem = r.calcularPrecioFinal();
				System.out.println("- " + r.getNombre() + " precio: " + precioItem + " €");
				totalAcumulado += precioItem;
			}
			System.out.println("total a pagar: " + totalAcumulado + " €");
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
