package ConsultasPsicologia;

import java.util.Scanner;

public class EscolhaValorConsulta extends ConsultaValor {
	
	ConsultaValor consultavalor = new ConsultaValor();
	
	
	
	int tecla = 0;
	
	public void escolhavalorConsulta(Scanner leitor) {
		
			
			System.out.println("\nQual faixa de preço você procura? ");
			tecla = leitor.nextInt();
			
			System.out.println("Você escolheu o valor " +
			consultavalor.getPrecoConsulta()[tecla-1]);
		
			
			
			
			}
	
	
	
	

}
