package ConsultasPsicologia;

import java.util.Scanner;

public class ConfirPagam extends PagamentoConsulta{
	
	 int  escolhaopcao = 0;
	
public void corfirmeOpcao(Scanner leitor) {
	
		
		System.out.println("\nDigite a op��o para o pagamento: ");
		escolhaopcao = leitor.nextInt();

	}

}
