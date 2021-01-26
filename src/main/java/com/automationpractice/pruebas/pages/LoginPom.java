package com.automationpractice.pruebas.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class LoginPom extends PageObject {

	By btnInicio = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	By txtCorreo = By.id("email");
	By txtClave = By.id("passwd");
	By btnLogin = By.name("SubmitLogin");
	By valSesion = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
	
	public void clickInicio() {
		getDriver().findElement(btnInicio).click();
		
	}
	public void escribirCorreo(String correo) {
		getDriver().findElement(txtCorreo).sendKeys(correo);
		
	}
	
	public void escribirClave(String clave) {
		getDriver().findElement(txtClave).sendKeys(clave);
		
		
	}
	public void clickLogin() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnLogin).click();
		
	}
	public void validarSesionIniciada (String usuario) {
		Serenity.takeScreenshot();
		valSesion.toString().contains(usuario);
	}
	
}
