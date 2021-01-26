package com.automationpractice.pruebas.models;

public class Login {

	String correo;
	String clave;
	String usuario;


	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Login(String correo, String clave, String usuario) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.usuario = usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
}
