package br.sceweb.view;

import br.sceweb.model.Controle;

public class FormManterEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controle controle = new Controle();
		String msg="";
		msg=controle.cadastrarEmpresa("89424232000180", "empresa x", "empresa x", "av. brasil", "121212");
		System.out.println(msg); 
		System.out.println(controle.excluirEmpresa("89424232000180"));

	}

}
