package ec.edu.ups.modelo;

import java.io.Serializable;


public class Cliente implements Serializable{

	
	private String cedula;
	private String nombre;
	private String correo;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	

}
