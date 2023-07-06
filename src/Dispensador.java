package proyecto_ATM;

import java.util.ArrayList;
import java.util.List;

public class Dispensador {

	private Double saldo;
	private List<Billete> billetes = new ArrayList<>();

	public Dispensador() {
		super();
		this.billetes = this.cargarBilletes(500, new PesoArgentino(20.0));
		this.saldo = this.calcularSaldo(billetes);
	}
	
	
	public List<Billete> cargarBilletes(int cantidad, Billete billete) {
		for (int i=0; i <= cantidad; i++) {
			this.billetes.add(billete);
		}
		return billetes;
	}
	
	public boolean expedir(Double monto) {
		if(monto <= this.getSaldo()) {
			if(monto % 20 == 0) {
				//expedir
				return true; 
		} else {
			System.out.println("El monto debe ser múltipo de 20 \n");
			return false;
		}
		}else {	
			System.out.println("El cajero no cuenta con suficiente saldo \n Puede probar con otro monto");
			return false;
		}
	}
	
	
	public Double calcularSaldo(List<Billete> b) {
		double s = 0.0; 
		for (Billete billete : b) {
			   s += billete.getDenominacion();
			        }
		return s;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public List<Billete> getBilletes() {
		return billetes;
	}


	public void setBilletes(List<Billete> billetes) {
		this.billetes = billetes;
	}
	
	
}
