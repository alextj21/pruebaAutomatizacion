package com.automationpractice.pruebas.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class ProcesoCompraPom extends PageObject{

	By btnMenu = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	By btnSubMenu = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a");
	By btnCategoria = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[2]/a");
	By selectproduct = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
	By btnCarrito = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	By procesoCompra = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	By btnProcesoCompra = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	By btnPago = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	By terminosYCondiciones = By.name("cgv");
	By btnOpcionPago = By.xpath("//*[@id=\"form\"]/p/button");
	By btnPagoTargeta = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
	By btnConfirmarOrden = By.xpath("//*[@id=\"cart_navigation\"]/button");
	
	
	public void SeleccionMenu() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnMenu).click();
		
	}
	public void SeleccionSubmenu() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnSubMenu).click();
		
	}
	public void SeleccionCategoria() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnCategoria).click();
		
	}
	public void seleccionarProducto() {
		Serenity.takeScreenshot();
		getDriver().findElement(selectproduct).click();
		
	}
	public void botonCarrito() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnCarrito).click();
		
	}
	public void procesoCompra() {
		Serenity.takeScreenshot();
		getDriver().findElement(procesoCompra).click();
		
	}
	public void procesoProducto() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnProcesoCompra).click();
		
	}
	public void procesoPago() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnPago).click();
		
	}
	public void terminosYcondiciones() {
		Serenity.takeScreenshot();
		getDriver().findElement(terminosYCondiciones).click();
		
	}
	public void tipoPago() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnOpcionPago).click();
		
	}
	public void pagoTargeta() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnPagoTargeta).click();
		
	}
	public void finalizarCompra() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnConfirmarOrden).click();
		
	}
	

}
