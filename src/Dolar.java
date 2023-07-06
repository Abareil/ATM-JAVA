package proyecto_ATM;

public class Dolar extends Billete {


	
	private Double valoVenta;
	private Double valorCompra;
	
	public Dolar(Double denominacion) {
		super(denominacion);
		// TODO Auto-generated constructor stub
	}

	public Dolar(Double denominacion, Double valoVenta, Double valorCompra) {
		super(denominacion);
		this.valoVenta = valoVenta;
		this.valorCompra = valorCompra;
	}

	public Double getValoVenta() {
		return valoVenta;
	}

	public void setValoVenta(Double valoVenta) {
		this.valoVenta = valoVenta;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	@Override
	public String toString() {
		return "Dolar [valoVenta=" + valoVenta + ", valorCompra=" + valorCompra + "]";
	}
	
	
	
}
