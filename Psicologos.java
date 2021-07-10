package ConsultasPsicologia;

import java.util.Scanner;

public class Psicologos extends EscolhaTipodeAtendimento {
	
	EscolhaTipodeAtendimento tipoatendimento = new EscolhaTipodeAtendimento();
	Scanner leitor = new Scanner(System.in);
	
	private int marcarConsulta;
	
	
	private String[] nomespsicologos= {"Dra. Jaqueline Marques", "Dr. Jeff Silva", "Dra. Milena Rodrigues","Dr. Jeremias Lopes","Dra Fiona Encantada",
			"Dr Woody","Dr Jucicleido Alves","Dra Gertrudes","Dr Hans Chucrutes", "Dr Dô Thor"};
	int[] valorpsicologo = {1,2,3,2,1,3,2,4,4,4};
	                      //0 1 2 3 4 5 6 
	public void listaPsicologos(int opcaoValor,double valorEscolhido) {
		
		System.out.println("\nProfissionais da Psicologia que atendem "
				+ "neste preço são:  ");
	
	for(int i = 0; i < nomespsicologos.length; i++)
	{
		if (valorpsicologo[i] == opcaoValor) {
			System.out.printf(" \n %d - %s%n ", i+1, nomespsicologos[i]);
		}
		
		
		
	}
	marcarConsultaProfissional(valorEscolhido);
	
	
	}
	
	public void marcarConsultaProfissional(double valorEscolhido) {
		
		System.out.println("\nQual profissional da lista deseja marcar sua consulta?"
				+ " Escolha conforme a opção disponível na numeração ");
		marcarConsulta = leitor.nextInt();
		System.out.println("Você escolheu: " +
				nomespsicologos[marcarConsulta-1]
						+ " e o preço é de R$ "+valorEscolhido);
		
		
	}
	
	
	public String[] getNomespsicologos() {
		return nomespsicologos;
	}




	public void setNomespsicologos(String[] nomespsicologos) {
		this.nomespsicologos = nomespsicologos;
	}

	

}
