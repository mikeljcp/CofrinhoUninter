package cofrinhoUninter;

import java.util.ArrayList;
import java.util.Objects;

/* A classe Cofrinho terá um arraylist encarregado de armazenar os diferentes tipos de moedas que serão trabalhadas neste projeto
 * e além disso é responsável por implementar os metos que serão utilizados no programa principal, desta forma também possui a lógica quanto
 * operações que serão realizadas nas moedas dentro do arraylist*/

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

	Moeda moeda;

	public ArrayList<Moeda> getListaMoedas() {
		return listaMoedas;
	}

	public void setListaMoedas(ArrayList<Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}

	@Override
	public String toString() {
		return "Cofrinho [listaMoedas=" + listaMoedas + ", moeda=" + moeda + "]";
	}

	void adicionar(Moeda c) {
		listaMoedas.add(c);
	}

	void remover(Moeda c) {
		listaMoedas.remove(c);
	}

	void listagemMoedas(Moeda c) {
		System.out.println(getListaMoedas());
	}

	double totalConvertido(Moeda c) {
		double total = 0;
		total = c.converter();
		return total;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listaMoedas, moeda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cofrinho other = (Cofrinho) obj;
		return Objects.equals(listaMoedas, other.listaMoedas) && Objects.equals(moeda, other.moeda);
	}

}
