package proyecto_ATM;

public abstract class Billete {

	private Double denominacion;

	
	public Billete(Double denominacion) {
		super();
		this.denominacion = denominacion;
	}

	public Double getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(Double denominacion) {
		this.denominacion = denominacion;
	}
	
	
}
