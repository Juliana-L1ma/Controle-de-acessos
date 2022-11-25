package pacote1;

public class ExecutandoDados {

	public static void main(String[] args) {
		Dados dados = new Dados ();
		dados.nomeProtected = "Reunião do conselho";
		
		System.out.println("\n Professores do técnico "
				             + "\n atentem para o dia da " 
				             +  "\n " + dados.nomeProtected);

	}

}
