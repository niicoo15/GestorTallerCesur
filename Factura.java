package GestorTallerCesur;

import java.util.ArrayList;

public class Factura {
	
	private int id;
	private Cita cita;
	private Cliente cliente;
	private ArrayList<Factura> listafacturas;
	
	private ArrayList<Item> listaElementos;
	
		public Factura(int id, ArrayList<Item> listaElementos) {
			this.id = id;
			this.listaElementos = listaElementos;
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
