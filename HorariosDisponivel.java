package ConsultasPsicologia;

public class HorariosDisponivel {

	private String[] consultaHorario = {"14:00",
			"14:30", "15:00"};  
	
	
	public String[] gethorarios() {
		return consultaHorario;
	}


	public void sethorarios(String[] consultahorarios) {
		this.consultaHorario = consultaHorario;
	}


	public void Horarios() {
		
	System.out.println("\nOs horarios disponiveis são: ");
		
		for(int i = 0; i < consultaHorario.length; i++)
		{
			
			
			System.out.printf(" \n %d %s%n ", i+1, consultaHorario[i]);
}
}
}