package br.ce.wcaquino.appium;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.ce.wcaquino.appium.core.DSL;
import br.ce.wcaquino.appium.core.DriverFactory;
import io.appium.java_client.MobileBy;


public class FormularioTeste {
	
	private DSL dsl = new DSL();
	
	@Before
	public void inicializarAppium() throws MalformedURLException {
		// Selecionar Formulario
	    dsl.clicarPorTexto("Formulário");
	}
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}
	
	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
	    // escrever nome
		dsl.escrever(MobileBy.AccessibilityId("nome"), "Everton");
	    
		// checar nome escrito
	    assertEquals("Everton",dsl.obterTexto(MobileBy.AccessibilityId("nome")));	    
	}
	
	@Test
	public void deveInteragirComCombo() throws MalformedURLException {
		// clicar no combo
		dsl.selecionarCombo(MobileBy.AccessibilityId("Console"), "Nintendo Switch");

		// verificar a opcao selecionada
	    String text = dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	    Assert.assertEquals("Nintendo Switch",text);
	}
	
	@Test
	public void deveInteragirComSwitchCheckBox() throws MalformedURLException {
	    // Verificar status dos elementos
	    Assert.assertFalse(dsl.isCheckedMarcado(By.className("android.widget.CheckBox")));
	    Assert.assertTrue(dsl.isCheckedMarcado(MobileBy.AccessibilityId("switch")));
	    
	    // cicar no elementos
	    dsl.clicar(By.className("android.widget.CheckBox"));
	    dsl.clicar(MobileBy.AccessibilityId("switch"));

	    // verificar estados alterados
	    Assert.assertTrue(dsl.isCheckedMarcado(By.className("android.widget.CheckBox")));
	    Assert.assertFalse(dsl.isCheckedMarcado(MobileBy.AccessibilityId("switch")));
	}
	
	@Test
	public void deveRealizarCadastro() throws MalformedURLException {
	    // Preencehr campos
		dsl.escrever(By.className("android.widget.EditText"), "Everton");
	    dsl.clicar(By.className("android.widget.CheckBox"));
	    dsl.clicar(By.className("android.widget.Switch"));
	    dsl.selecionarCombo(By.className("android.widget.Spinner"), "Nintendo Switch");
	    
	    // salvar
	    dsl.clicarPorTexto("SALVAR");
	    
	    // Validar dados apos salvar
	    Assert.assertEquals("Nome: Everton", dsl.obterTexto(By.xpath("//android.widget.TextView[@text='Nome: Everton']")));
	    
	    Assert.assertEquals("Console: switch", dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]")));
	    
	    Assert.assertTrue(dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]")).endsWith("Off"));

	    Assert.assertTrue(dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]")).endsWith("Marcado"));
	}
}
