package com.automationpractice.pruebas.step;

import com.automationpractice.pruebas.pages.LoginPom;

import net.thucydides.core.annotations.Step;

public class InicioSesionStepDefinitions {

LoginPom inicioSesion = new LoginPom();
	@Step
	public void abrirAplicacion() {
		inicioSesion.open();
		
	}
	@Step
	public void clickInicio() {
		inicioSesion.clickInicio();
	}

	@Step
	public void escribirCorreo(String correo) {
		inicioSesion.escribirCorreo(correo);
	}
	@Step
	public void escribirContraseña(String clave) {
		inicioSesion.escribirClave(clave);
	}
	@Step
	public void clickLogin() {
		inicioSesion.clickLogin();
	}
	@Step
	public void validarSesion(String usuario) {
		inicioSesion.validarSesionIniciada(usuario);
	}
}
