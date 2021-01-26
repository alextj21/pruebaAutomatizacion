package com.automationpractice.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/automationpractice/pruebas/feature/Login.feature",
tags="@Login",
glue="com.automationpractice.pruebas.stepDefinitions")
public class LoginRunner {

}
