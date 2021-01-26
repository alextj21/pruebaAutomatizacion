package com.automationpractice.pruebas.stepDefinitions;

import java.util.List;

import com.automationpractice.pruebas.models.Validacion;
import com.automationpractice.pruebas.pages.ValidacionesPom;
import com.automationpractice.pruebas.step.CompraStepDefinitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ProcesoCompraStepDefinitions {

	@Steps
	CompraStepDefinitions compra;
	ValidacionesPom validacion;
	@Cuando("^realizo la compra del producto$")
	public void realizo_la_compra_del_producto() throws InterruptedException  {
	    compra.clickMenu();
	    compra.clickSubMenu();
	    compra.clickCategoria();
	    compra.clickProducto();
	    compra.clickBtncarrito();
	    compra.clickProcesoCompra();
	    compra.clickProceso();
	    compra.clickProcesoTipoPago();
	    compra.clickTerminos();
	    compra.clickTipoPago();
	    compra.clickPagoTargeta();
	    compra.clickFinalizarCompra();
	    
	}


	@Entonces("^valido que aparezca la aprobacion de la compra$")
	public void valido_que_aparezca_la_aprobacion_de_la_compra(List<Validacion> dato) {
	   
		validacion.validarCompra(dato.get(0).getValidar());
	}
	
}
