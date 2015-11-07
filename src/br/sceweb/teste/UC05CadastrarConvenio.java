package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.model.Convenio;

public class UC05CadastrarConvenio {

	private static Convenio convenio;
	private static String dataInicio;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		convenio = new Convenio();

	}

	@Test
	public void CT01UC05FBCadastraConvenioComDataValida() {
		dataInicio = "29/10/2015";
		assertTrue(convenio.validaData(dataInicio));
	}

	@Test
	public void CT02UC05CadastraConvenioComDataInvalida() {
		dataInicio = "35/10/2015";
		assertFalse(convenio.validaData(dataInicio));
	}

	@Test
	public void CT03UC05CadastraConvenioComDataValida() {
		dataInicio = "29/10/2015";
		convenio.setDataInicio(dataInicio);
		assertTrue(dataInicio.equals(convenio.getDataInicio()));
	}

	@Test(expected = IllegalArgumentException.class)
	public void CT04UC05CadastrarConvenio_com_data_invalida() {
		convenio.setDataInicio("242/10/2015");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
