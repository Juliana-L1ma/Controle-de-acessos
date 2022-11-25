package pacote2;

import pacote1.Dados;

public class TestePacote2 {

	public static void main(String[] args) {
		Dados dados = new Dados();
		
		dados.nomePublic = "Luiz";
		//dados.NomeProtected não tem acesso fora do pacote;
		//dados.NomePrivate não tem acesso fora da classe e fora do pacote;
	}

}
