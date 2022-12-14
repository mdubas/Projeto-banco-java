package empresa;

import java.util.ArrayList;

public class Cofre {

	double total;

	private ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

	double valortotal;

	public void adicionar(Moeda m) {
		listaMoeda.add(m);
	}

	public void remover(Moeda m) {
		listaMoeda.remove(m);
	}

	public void listar() {
		for (Moeda m : listaMoeda) {
			System.out.println(m);
		}
	}

	public void totalConvertido() {
		total = 0;

		System.out.println("Total convertido em reais:");
		for (Moeda m : listaMoeda) {
			double converte = m.converter();
			total += converte;
		}
		System.out.println(total);

	}
}		
	
			





