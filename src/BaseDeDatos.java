package proyecto_ATM;

import java.util.List;
import java.util.ArrayList;


public final class BaseDeDatos {

	private final List<Cuenta> cuentas;

	public BaseDeDatos() {
		super();
		this.cuentas = this.cargarBaseDatos();
	}
	
	public List<Cuenta> cargarBaseDatos(){
		List<Cuenta> cuentasCreadas;
		cuentasCreadas = new ArrayList<>();
		
		Cuenta c1 = new Cuenta(11111,1000.0,100.0);
		Cuenta c2 = new Cuenta(22222,2000.0,200.0);
		Cuenta c3 = new Cuenta(33333,3000.0,300.0);
		Cuenta c4 = new Cuenta(44444,4000.0,400.0);
		Cuenta c5 = new Cuenta(55555,5000.0,500.0);
		Usuario usu1 = new Usuario("usu", "uno", "11111111", 11111, c1);
		Usuario usu2 = new Usuario("usu", "dos", "22222222", 22222, c2 );
		Usuario usu3 = new Usuario("usu", "tres", "33333333", 33333, c3 );
		Usuario usu4 = new Usuario("usu", "cuatro", "44444444", 44444, c4 );
		Usuario usu5 = new Usuario("usu", "cinco", "55555555",55555, c5 );
		c1.setUsuario(usu1);
		c2.setUsuario(usu2);
		c3.setUsuario(usu3);
		c4.setUsuario(usu4);
		c5.setUsuario(usu5);
		
		cuentasCreadas.add(c1);
		cuentasCreadas.add(c2);
		cuentasCreadas.add(c3);
		cuentasCreadas.add(c4);
		cuentasCreadas.add(c5);
		return cuentasCreadas;
	}

	@Override
	public String toString() {
		return "BaseDeDatos [cuentas=" + cuentas + "]";
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}
	
	
	
}
