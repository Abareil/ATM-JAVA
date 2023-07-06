package proyecto_ATM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
	


	Scanner sc = new Scanner(System.in);
	private RanuraDeposito ranuraDep = new RanuraDeposito();
	private Dispensador dispensador = new Dispensador();
	
	
	public void extraer(Double monto, Cuenta cuenta){
			if(this.dispensador.expedir(monto)) {
				if(cuenta.debitar(monto)) {
				System.out.println("Operación realizada con éxito. Su saldo es de $" + cuenta.getSaldo());
				}
			}
			this.mostrarMenuPrincipal(cuenta);
	}
	
	public void depositar(Double monto, Cuenta cuenta) {
		if(this.ranuraDep.recibirDeposito()) {
			cuenta.acreditar(monto);
			System.out.println("Operación realizada con éxito. Su saldo actual es de $" + cuenta.getSaldo() + "\n");
		}
			this.mostrarMenuPrincipal(cuenta);
		}

		
	public void saludar() {
		System.out.println("Bienvenido. Ingrese un número de cuenta de cinco dígitos \n");
	      Integer nroCuenta = sc.nextInt();
	      this.solicitarNIP(nroCuenta);
	}
	
	public void solicitarNIP(int nroCta) {
		System.out.println("Ingrese su número de identificación personal \n");
        Integer nip = sc.nextInt();
        this.validarCuenta(nroCta, nip);
		
	}
	
	public void validarCuenta(Integer nroCta, Integer NIP) {
		BaseDeDatos bd = new BaseDeDatos();
	     Cuenta cuenta = new Cuenta();
		 for (Cuenta cta : bd.getCuentas()) {
			 if (cta.getNumeroCta().equals(nroCta)  && cta.getUsuario().getNIP().equals(NIP)) {
				 cuenta = cta;
			 }
		 }
		 if(cuenta != null) {
			 mostrarMenuPrincipal(cuenta);
		 } else {
			 System.out.println("El número de cuenta o número de identificación son inválidos");
		 }
	}
	
	public void mostrarMenuPrincipal(Cuenta cuenta) {
		System.out.println("Seleccione una opción: \n 1-Solicitar saldo \n 2-Retirar dinero \n 3-Depositar \n 4-Salir \n");
		int opcion = sc.nextInt();
		this.redirigir(opcion, cuenta);
	}
	public void salir() {
		System.out.println("Sesión finalizada");
		this.saludar();
	}
	
	public void redirigir(int opcion, Cuenta cuenta) {
		switch (opcion) {
		case 1: {
			System.out.println("Saldo: " + cuenta.getSaldo() + "\n");
			this.mostrarMenuPrincipal(cuenta);
		}
			break;
		
		case 2:{
			System.out.println("Seleccione un monto a retirar \n");
			Double monto = sc.nextDouble();
			this.extraer(monto, cuenta);}
			break;
		case 3:{
			System.out.println("Ingrese un monto a depositar \n");
			double monto = sc.nextDouble();
			this.depositar(monto, cuenta);}
			break;
		case 4:{
			this.salir();}
			break;
		default:
			System.out.println("Opción no válida, seleccione nuevamente una opción: \n");
			this.mostrarMenuPrincipal(cuenta);
		}
	}



	public RanuraDeposito getRanuraDep() {
		return ranuraDep;
	}

	public void setRanuraDep(RanuraDeposito ranuraDep) {
		this.ranuraDep = ranuraDep;
	}

	public Dispensador getDispensador() {
		return dispensador;
	}

	public void setDispensador(Dispensador dispensador) {
		this.dispensador = dispensador;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}



	
	
}
