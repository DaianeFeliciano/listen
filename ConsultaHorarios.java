package ConsultasPsicologia;

import java.util.Scanner;

public class ConsultaHorarios {

ColsultaHorario horarios = new ColsultaHorario();
	
	static int tecla = 0;
	
public void escolhaConsultaHorario(Scanner leitor) {
	
		
		System.out.println("\nQual Horario deseja escolher? ");
		tecla = leitor.nextInt();

	}

}