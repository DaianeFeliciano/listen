package ConsultasPsicologia;

import java.util.Scanner;

public class ConsultaHorarios extends HorariosDisponivel {

	 private int consultaHorario = 0;
	 private String consultaEscolhida;
	 
	 HorariosDisponivel horariosdisponivel = new HorariosDisponivel();
	 TipodeAtendimento tiposatendimentos = new TipodeAtendimento();
	 EscolhaTipodeAtendimento escolhaatendimento = new EscolhaTipodeAtendimento();
	 Psicologos escolhapsicologo = new Psicologos();
	 
	
public void escolhaConsultaHorario(Scanner leitor) {
	
		
		System.out.println("\nQual data e horário deseja marcar sua consulta? ");
		consultaHorario = leitor.nextInt();
		consultaEscolhida = horariosdisponivel.gethorarios()[consultaHorario - 1];



	}


public String getConsultaEscolhida() {
	return consultaEscolhida;
}


public void setConsultaEscolhida(String consultaEscolhida) {
	this.consultaEscolhida = consultaEscolhida;
}



} 




