package proyecto_ATM;

public class Usuario {
	
	
	private String nombre;
	private String apellido;
	private String DNI;
	private Cuenta cuenta;
	private Integer NIP;
	
	
	public Usuario() {
		super();
	}
	public Usuario(String nombre, String apellido, String dni, Integer nip, Cuenta cuenta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = dni;
		this.cuenta = cuenta;
		this.NIP = nip;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public Integer getNIP() {
		return NIP;
	}
	public void setNIP(Integer nIP) {
		NIP = nIP;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + "]";
	}
	
	

}
