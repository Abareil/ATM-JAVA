package proyecto_ATM;

public class Cuenta {
	
	private Integer numeroCta;

	private Double saldo;
	private Double limiteExtraccion;
	private Usuario usuario;
	
	
	public Cuenta() {
		super();
	}

	
	public Cuenta(Integer numeroCta, Double saldo, Double limiteExtraccion) {
		super();
		this.numeroCta = numeroCta;
		this.saldo = saldo;
		this.limiteExtraccion = limiteExtraccion;
	}



	public boolean debitar(Double monto) {
		if (monto <= this.getLimiteExtraccion()) {
			if (monto <= this.getSaldo()) {
				this.setSaldo(this.getSaldo() - monto);
				return true;
			} else {
				System.out.println ("Saldo insuficiente"); 
				return false;
			}		
		} else {
			System.out.println("El monto supera el límite de extracción"); 
			return false;
		}
	}
	
	public void acreditar(Double monto) {
		this.setSaldo(this.getSaldo() + monto);
	}

	public Double getLimiteExtraccion() {
		return limiteExtraccion;
	}


	public void setLimiteExtraccion(Double limiteExtraccion) {
		this.limiteExtraccion = limiteExtraccion;
	}


	public Integer getNumeroCta() {
		return numeroCta;
	}

	public void setNumeroCta(Integer numeroCta) {
		this.numeroCta = numeroCta;
	}


	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	@Override
	public String toString() {
		return "Cuenta [numeroCta=" + numeroCta + ", saldo=" + saldo + ", limiteExtraccion="
				+ limiteExtraccion  + "]";
	}







	
	
	
}
