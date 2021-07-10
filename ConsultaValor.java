package ConsultasPsicologia;

public class ConsultaValor {
	
	
double precoConsulta [] = {30.20, 40.30, 50.00,60};

	
	public double[] getPrecoConsulta() {
	return precoConsulta;
}




public void setPrecoConsulta(double[] precoConsulta) {
	this.precoConsulta = precoConsulta;
}




	public void listaPreco() {
		
		System.out.println("\n Os preços ofertados pelos nossos profissionais são: ");
		for(int i = 0; i < precoConsulta.length; i++) {
			
			
			System.out.printf(" \n  %d - R$ %s%n ", i+1, precoConsulta[i]);
			
			
			
		}
		
}
	
}
