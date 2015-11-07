package br.sceweb.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;

public class Convenio {

	private DateTime dataInicio;
	private DateTime dataTermino;
	private String cnpj;
	Logger logger = Logger.getLogger(Convenio.class);

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setDataInicio(String data) throws IllegalArgumentException {
		// logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>data Inicio = " + data);
		if (this.validaData(data)) {
			dataInicio = new DateTime(Integer.parseInt(data.substring(6, 10)),
					Integer.parseInt(data.substring(3, 5)),
					Integer.parseInt(data.substring(0, 2)), 0, 0);
		} else {
			throw new IllegalArgumentException("Data inválida");
		}
	}

	public String getDataInicio() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String data = df.format(new Date(this.dataInicio.getMillis()));

		return data;
	}

	public boolean validaData(String data) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);

		try {
			dateFormat.parse(data);
			return true;
		} catch (ParseException e) {
			return false;
		}

	}
}
