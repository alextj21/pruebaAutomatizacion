package com.automationpractice.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/automationpractice/pruebas/feature/CompraProductoRegistro.feature",
tags="@compraProductoRegistro",
glue="com.automationpractice.pruebas.stepDefinitions")
public class CompraRegistroRunner {

}
