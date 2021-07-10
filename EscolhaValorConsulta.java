package ConsultasPsicologia;

import java.util.Scanner;

public class EscolhaValorConsulta extends ConsultaValor {
	
	ConsultaValor consultavalor = new ConsultaValor();
	Psicologos psicologos = new Psicologos();	
	
	
	int opcaoValor = 0;
	
	public void escolhavalorConsulta(Scanner leitor) {
		
			
			System.out.println("\nQual faixa de preço você procura? ");
			opcaoValor = leitor.nextInt();
			
			System.out.println("Você escolheu o valor " +
			consultavalor.getPrecoConsulta()[opcaoValor-1]);
			
			double valorEscolhido = consultavalor.getPrecoConsulta()[opcaoValor-1];
			psicologos.listaPsicologos(opcaoValor,valorEscolhido);
		
				
			
			}
	
}
