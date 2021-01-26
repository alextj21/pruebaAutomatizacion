package com.automationpractice.pruebas.pages;


import java.util.List;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/index.php")
public class RegistroPom extends PageObject{

	By btnInicio = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	By txtCorreo = By.name("email_create");
	By btnRegistrarse = By.name("SubmitCreate");
	By txtNombre = By.name("customer_firstname");
	By txtApellido = By.name("customer_lastname");
	By txtContraseña = By.name("passwd");
	@FindBy(xpath="//*[@id=\"days\"]/option")
	List<WebElement> txtDia;
	@FindBy(xpath="//*[@id=\"months\"]/option")
	List<WebElement> txtMes;
	@FindBy(xpath="//*[@id=\"years\"]/option")
	List<WebElement> txtAño;
	By txtEmpresa = By.name("company");
	By txtDireccion = By.name("address1");
	By txtDireccion2 = By.name("address2");
	By txtCiudad = By.name("city");
	@FindBy(xpath="//*[@id=\"id_state\"]/option")
	List<WebElement> txtEstado;
	By txtPostal = By.name("postcode");
	By txtInformacion = By.name("other");
	By txtTelefono = By.name("phone");
	By txtMovil = By.name("phone_mobile");
	By valSesion = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");
	By scroll = By.xpath("//*[@id=\"newsletter_block_left\"]/h4");
	By btnRegistro = By.id("submitAccount");
	
	public void clickInicio() {
		getDriver().findElement(btnInicio).click();
		
	}
	public void escribirCorreo(String correo) {
		getDriver().findElement(txtCorreo).sendKeys(correo);
		
	}
	public void clickBtnRegistro() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnRegistrarse).click();
		
	}
	public void escribirNombre(String nombre) {
		getDriver().findElement(txtNombre).sendKeys(nombre);
		
	}
	public void escribirApellido(String apellido) {
		getDriver().findElement(txtApellido).sendKeys(apellido);
		
	}
	public void escribirContraseña(String contraseña) {
		getDriver().findElement(txtContraseña).sendKeys(contraseña);
		
	}
	public void escribirDia(String dia) {
		
		for (int i = 0; i< txtDia.size(); i++) {
			if (txtDia.get(i).getText().contains(dia)) {
				txtDia.get(i).click();
				break;
			}
		}
		//Select sel=new Select(element);
	    //sel.selectByValue(dia);
		//txtDia.selectByVisibleText(dia);
				
	}
	public void escribirMes(String mes) {
		for (int i = 0; i< txtMes.size(); i++) {
			if (txtMes.get(i).getText().contains(mes)) {
				txtMes.get(i).click();
				break;
			}
		}
		
	}
	public void escribirAño(String año) {
		for (int i = 0; i< txtAño.size(); i++) {
			if (txtAño.get(i).getText().contains(año)) {
				txtAño.get(i).click();
				Serenity.takeScreenshot();
				break;
			}
		}
		
	}
	public void escribirEmpresa(String empresa) {
		getDriver().findElement(txtEmpresa).sendKeys(empresa);
		
	}
	public void escribirDireccion(String direccion) {
		getDriver().findElement(txtDireccion).sendKeys(direccion);
		
	}
	public void escribirDireccion2(String direccion2) {
		getDriver().findElement(txtDireccion2).sendKeys(direccion2);
		
	}
	public void escribirCiudad(String ciudad) {
		getDriver().findElement(txtCiudad).sendKeys(ciudad);
		
	}
	public void escribirEstado(String estado) {
		for (int i = 0; i< txtEstado.size(); i++) {
			if (txtEstado.get(i).getText().contains(estado)) {
				txtEstado.get(i).click();
				break;
			}
		}
		
	}
	public void escribirPostal(String postal) {
		getDriver().findElement(txtPostal).sendKeys(postal);
		
	}
	public void escribirInformacion(String informacion) {
		getDriver().findElement(txtInformacion).sendKeys(informacion);
		
	}
	public void escribirTelefono(String telefono) {
		getDriver().findElement(txtTelefono).sendKeys(telefono);
		
	}
	public void escribirMovil(String movil) {
		getDriver().findElement(txtMovil).sendKeys(movil);
		
	}
	public void clickRegistro() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnRegistro).click();
		
	}
	public void validarSesionIniciada (String usuario) {
		valSesion.toString().contains(usuario);
	}
}
