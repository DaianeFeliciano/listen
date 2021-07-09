package ConsultasPsicologia;

import java.util.Scanner;

public class ExecutaPrograma {

	public static void main(String[] args) {
		
		try (Scanner leitor = new Scanner(System.in)) {
			 
		 	Psicologos psicologos = new Psicologos();
		 	TipodeAtendimento tipoatendimento = new TipodeAtendimento();
		 	EscolhaTipodeAtendimento escolhatipoatendimento = new EscolhaTipodeAtendimento();
		 	ConsultaValor escolhavalor = new ConsultaValor();
		 	EscolhaValorConsulta escolhavalorconsulta = new EscolhaValorConsulta();
		 	Paciente paciente1  = new Paciente(); 
		    int tecla = 0;
           System.out.println("=======================================================================");
           System.out.println("                     *-* Bem vindos(as) ao xxxxx *-*                   ");
           System.out.println("=======================================================================");
           String menu = "\n<><><> Venha cuidar da sua saúde! <><><>\n\n1 Atendimento Online - Psicologia\n2 Sair\nItem:";

           do {
               System.out.println(menu);
               tecla = leitor.nextInt();
               switch (tecla) {

                   case 1:
                	paciente1.contato(leitor);
                	tipoatendimento.listaTiposAtedimentos();
                   	escolhatipoatendimento.escolhaTipoAtendimentoPaciente(leitor);
                   	psicologos.listaPsicologos();
                   	escolhavalor.listaPreco();
                   	escolhavalorconsulta.escolhavalorConsulta(leitor);
                   	
                   
                   	
                   	//if(tecla == 0) {
                   		
                   	///	break;
                   		
                   ///	} else {
                   		
                   		
                   		
                   //	}
                   	
                       break;


                   case 2:
                       System.exit(0);
                       break;

               }

           } while (tecla != 20);
       }
		

	}

}
