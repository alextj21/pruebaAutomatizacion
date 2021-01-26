package com.automationpractice.pruebas.stepDefinitions;



import java.util.List;

import com.automationpractice.pruebas.models.Login;
import com.automationpractice.pruebas.step.InicioSesionStepDefinitions;
import com.automationpractice.pruebas.step.ValidacionesStepDefinitions;


import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

	@Steps
	InicioSesionStepDefinitions inicio;
	ValidacionesStepDefinitions validar;
	
	
	@Dado("^que ingreso a la tienda  y selecciono iniciar sesion$")
	public void que_ingreso_a_la_tienda_y_selecciono_iniciar_sesion() {
		inicio.abrirAplicacion();
		inicio.clickInicio();
	
	}


	@Dado("^realizo el login con los datos requeridos$")
	public void realizo_el_login_con_los_datos_requeridos(List<Login>listaUsuario) {
	 
     inicio.escribirCorreo(listaUsuario.get(0).getCorreo());
     inicio.escribirContraseña(listaUsuario.get(0).getClave());
	}

	@Cuando("^doy click en iniciar sesion$")
	public void doy_click_en_iniciar_sesion() throws InterruptedException {
     inicio.clickLogin();
     Thread.sleep(2000);
	}

	@Entonces("^valido que aparezca mi nombre de usuario$")
	public void valido_que_aparezca_mi_nombre_de_usuario(List<Login>validacion) {
		
    inicio.validarSesion(validacion.get(0).getUsuario());
	
}
}
