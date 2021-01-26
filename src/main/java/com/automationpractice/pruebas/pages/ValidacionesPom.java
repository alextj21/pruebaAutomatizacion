package com.automationpractice.pruebas.pages;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ValidacionesPom extends PageObject {
		
	@FindBy(xpath="//*[@class=\"cheque-indent\"]/strong")
	WebElement valCompra;
	
	public void validarCompra (String  validacion) {
		valCompra.getText().contains(validacion);
		
	}
	
}
