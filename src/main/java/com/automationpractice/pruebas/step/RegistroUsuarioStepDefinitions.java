package com.automationpractice.pruebas.step;

import com.automationpractice.pruebas.pages.RegistroPom;

import net.thucydides.core.annotations.Step;

public class RegistroUsuarioStepDefinitions {
	
	RegistroPom registro = new RegistroPom();
	
	@Step
	public void abrirAplicacion() {
		registro.open();
	}
	@Step
	public void clickInicio() {
		registro.clickInicio();
	}
	@Step
	public void escribirCorreo(String correo) {
		registro.escribirCorreo(correo);
	}
	@Step
	public void clickRegistrar() {
		registro.clickBtnRegistro();
	}

	@Step
	public void escribirUsuario( String nombre, String apellido, String contraseña, String dia, String mes,
			String año, String empresa, String direccion, String direccion2, String ciudad, String estado,
			String codigoPostal, String informacion, String telefono, String telefonoMovil) {
		registro.escribirNombre(nombre);
		registro.escribirApellido(apellido);
		registro.escribirContraseña(contraseña);
		registro.escribirDia(dia);
		registro.escribirMes(mes);
		registro.escribirAño(año);
		registro.escribirEmpresa(empresa);
		registro.escribirDireccion(direccion);
		registro.escribirDireccion2(direccion2);
		registro.escribirCiudad(ciudad);
		registro.escribirEstado(estado);
		registro.escribirPostal(codigoPostal);		
		registro.escribirInformacion(informacion);
		registro.escribirTelefono(telefono);
		registro.escribirMovil(telefonoMovil);
	}
	
	@Step
	public void clickRegistro() {
		registro.clickRegistro();
	}
	@Step
	public void validarSesion(String usuario) {
		registro.validarSesionIniciada(usuario);
	}
}
