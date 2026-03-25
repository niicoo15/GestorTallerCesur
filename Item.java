package GestorTallerCesur;

import java.util.ArrayList;

public class Item {
	private String nombre;
	private double precioBase;
	private ArrayList<Item> listaElementos;
	
	public Item (String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public ArrayList<Item> getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(ArrayList<Item> listaElementos) {
		this.listaElementos = listaElementos;
	}
	
}
