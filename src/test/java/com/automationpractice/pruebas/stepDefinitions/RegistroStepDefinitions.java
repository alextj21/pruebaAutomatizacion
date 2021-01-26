package com.automationpractice.pruebas.stepDefinitions;

import java.util.List;

import com.automationpractice.pruebas.models.Registro;
import com.automationpractice.pruebas.step.InicioSesionStepDefinitions;
import com.automationpractice.pruebas.step.RegistroUsuarioStepDefinitions;
import com.automationpractice.pruebas.step.ValidacionesStepDefinitions;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RegistroStepDefinitions {

	@Steps
	RegistroUsuarioStepDefinitions registro;
	InicioSesionStepDefinitions inicio;
	ValidacionesStepDefinitions validar;
	
	@Dado("^que ingreso a la tienda y selecciono crear cuenta$")
	public void que_ingreso_a_la_tienda_y_selecciono_crear_cuenta() {
		registro.abrirAplicacion();
		registro.clickInicio();
	}


	@Dado("^ingreso los datos solicitados en los formularios$")
	public void ingreso_los_datos_solicitados_en_los_formularios(List<Registro>datos) throws InterruptedException {
		registro.escribirCorreo(datos.get(0).getCorreo());
		registro.clickRegistrar();
	    registro.escribirUsuario( datos.get(0).getNombre(), datos.get(0).getApellido(), datos.get(0).getContraseña(), datos.get(0).getDia(),
	    		datos.get(0).getMes(), datos.get(0).getAño(), datos.get(0).getEmpresa(), datos.get(0).getDireccion(), datos.get(0).getDireccion2(),
	    		datos.get(0).getCiudad(), datos.get(0).getEstado(), datos.get(0).getCodigoPostal(), datos.get(0).getInformacion(), datos.get(0).getTelefono(), datos.get(0).getTelefonoMovil());
	    Thread.sleep(2000);
	}

	@Dado("^hago click en el boton registro$")
	public void hago_click_en_el_boton_registro() {
        registro.clickRegistro();
	}

	@Entonces("^valido que aparezca mi nombre en la sesion iniciada$")
	public void valido_que_aparezca_mi_nombre_en_la_sesion_iniciada(List<Registro>usuario) throws InterruptedException {
		Thread.sleep(2000);
	    registro.validarSesion(usuario.get(0).getUsuario());
	}
	
}
