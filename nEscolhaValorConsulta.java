package ConsultasPsicologia;

import java.util.Scanner;

public class EscolhaValorConsulta extends ConsultaValor {
	
	ConsultaValor consultavalor = new ConsultaValor();
	
	
	
	int tecla = 0;
	
	public void escolhavalorConsulta(Scanner leitor) {
		
			
			System.out.println("\nQual faixa de pre�o voc� procura? ");
			tecla = leitor.nextInt();
			
			System.out.println("Voc� escolheu o valor " +
			consultavalor.getPrecoConsulta()[tecla-1]);
		
			
			
			
			}
	
	
	
	

}
