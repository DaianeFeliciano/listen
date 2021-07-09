package ConsultasPsicologia;


public class Psicologos extends EscolhaTipodeAtendimento {
	
	EscolhaTipodeAtendimento tipoatendimento = new EscolhaTipodeAtendimento();
	
	
	
	private String[] nomespsicologos= {"Dra. Jaqueline Marques", "Dr. Jeff Silva", "Dra. Milena Rodrigues"};

	
	public void listaPsicologos() {
		
		System.out.println("\nProfissionais da Psicologia que atendem "
				+ "na plataforma são:  ");
	
	for(int i = 0; i < nomespsicologos.length; i++)
	{
		
		
		System.out.printf(" \n %d %s%n ", i+1, nomespsicologos[i]);
		
		
	}
	
	
	}
	
	public String[] getNomespsicologos() {
		return nomespsicologos;
	}




	public void setNomespsicologos(String[] nomespsicologos) {
		this.nomespsicologos = nomespsicologos;
	}


}
