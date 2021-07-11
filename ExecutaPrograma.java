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
		 	HorariosDisponivel horariodisponivel = new HorariosDisponivel();
		 	ConsultaHorarios consultarhorario = new ConsultaHorarios();
		 	EnviarConfirmacaoEmail enviaremail = new EnviarConfirmacaoEmail();
		 	
		    int tecla = 0;
           System.out.println("=======================================================================");
           System.out.println("                     *-* Bem vindos(as) ao xxxxx *-*                   ");
           System.out.println("=======================================================================");
           String menu = "\n\n<><><> Venha cuidar da sua saúde! <><><>\n\n1 Atendimento Online - Psicologia\n2 Sair\nItem:";

           do {
               System.out.println(menu);
               tecla = leitor.nextInt();
               switch (tecla) {

                   case 1:
                	paciente1.contato(leitor);
                	tipoatendimento.listaTiposAtedimentos();
                   	escolhatipoatendimento.escolhaTipoAtendimentoPaciente(leitor);
                   	escolhavalor.listaPreco();
                   	escolhavalorconsulta.escolhavalorConsulta(leitor);
                   	horariodisponivel.Horarios();
                   	consultarhorario.escolhaConsultaHorario(leitor);
                   	enviaremail.informacoesdaConsulta();
                   	enviaremail.nomePaciente();
                	System.out.printf("%s", paciente1.getNome());
                   	enviaremail.informacoesdaConsultaTipoAtendimento();
                	System.out.print(escolhatipoatendimento.getPlataformaEscolhida());
                	enviaremail.informacoesHorario();
                   	System.out.println(consultarhorario.getConsultaEscolhida());
                   	enviaremail.informacoesdaConsultaPsicologo();
                   	enviaremail.informacoesdoValor();
                   	System.out.printf( "%.2f%n", escolhavalorconsulta.getValorEscolhido());
                   	enviaremail.informacoesEmail();
                   	System.out.printf("%s", paciente1.getEmail(), "\n\n");
                   	//System.out.printf("%s");
                   	//psicologos.confirmadoPsico();
    
                       break;


                   case 2:
                	   System.out.println("Obrigada, volte sempre!");
                       System.exit(0);
                       break;

               }

           } while (tecla != 20);
       }
		

	}

	

}
