package com.automationpractice.pruebas.step;

import com.automationpractice.pruebas.pages.ProcesoCompraPom;

import net.thucydides.core.annotations.Step;

public class CompraStepDefinitions {

	ProcesoCompraPom compra= new ProcesoCompraPom();
	
	@Step
	public void clickMenu() {
		compra.SeleccionMenu();
	}
	@Step
	public void clickSubMenu() {
		compra.SeleccionSubmenu();
	}
	@Step
	public void clickCategoria() {
		compra.SeleccionCategoria();
	}
	@Step
	public void clickProducto() {
		compra.seleccionarProducto();
	}
	@Step
	public void clickBtncarrito() {
		compra.botonCarrito();
	}
	@Step
	public void clickProcesoCompra() {
		compra.procesoCompra();
	}
	@Step
	public void clickProceso() {
		compra.procesoProducto();
	}
	@Step
	public void clickProcesoPago() {
		compra.procesoPago();
	}
	@Step
	public void clickProcesoTipoPago() {
		compra.procesoPago();
	}
	@Step
	public void clickTerminos() {
		compra.terminosYcondiciones();
	}
	@Step
	public void clickTipoPago() {
		compra.tipoPago();
	}
	@Step
	public void clickPagoTargeta() {
		compra.pagoTargeta();
	}
	
	@Step
	public void clickFinalizarCompra() {
		compra.finalizarCompra();
	}
}
