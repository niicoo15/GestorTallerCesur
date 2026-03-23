package GestorTallerCesur;

public class Coche {
	private Cliente cliente;
	private String matricula;
	private String modelo;
	private String descripcionFallo;
	
	public Coche(String matricula, String modelo, String descripcionFallo) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.descripcionFallo = descripcionFallo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescripcionFallo() {
		return descripcionFallo;
	}

	public void setDescripcionFallo(String descripcionFallo) {
		this.descripcionFallo = descripcionFallo;
	}
	
	@Override
	public String toString() {
		return "Modelo: " + this.modelo + "Matricula: " + this.matricula + "Fallo: " + this.descripcionFallo;
	}
	
	
	
}
