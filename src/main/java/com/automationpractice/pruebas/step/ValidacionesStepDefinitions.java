package com.automationpractice.pruebas.step;

import com.automationpractice.pruebas.pages.ValidacionesPom;
import net.thucydides.core.annotations.Step;

public class ValidacionesStepDefinitions {

	ValidacionesPom val = new ValidacionesPom();
	
	@Step
	public void validarFinCompra (String validacion) {
		val.validarCompra(validacion);
	}
	
	
	
	
}
