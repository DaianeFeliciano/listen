package ConsultasPsicologia;

import java.util.Scanner;

public class EscolhaTipodeAtendimento extends TipodeAtendimento {
	
	TipodeAtendimento tiposatendimentos = new TipodeAtendimento();
	
	int tecla = 0;
	
public void escolhaTipoAtendimentoPaciente(Scanner leitor) {
	
		
		System.out.println("\nQual plataforma deseja realizar sua consulta? ");
		tecla = leitor.nextInt();
		
		System.out.println("Você escolheu a plataforma " + 
		tiposatendimentos.getTipoAtendimento()[tecla-1]);
	
		
		
		
		}

}
