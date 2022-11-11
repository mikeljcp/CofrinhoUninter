package cofrinhoUninter;

import java.util.Objects;

/*A classe Moeda serve como classe mãe para os diferentes tipos de moedas disponíveis e a 
mesma não pode ser instanciada evitando assim o uso indevido*/
public abstract class Moeda {

	double valor; // Atributo referente ao valor que a moeda possui dentro do cofrinho e servira
					// para as classes filhas
	double taxa; // Atributo se refere ao valor da taxa para fins de conversão da moeda e servira
					// para as classes filhas

	void info() {

	}

	// Metodo utilizado para converter as diferentes moedas em Real, será utilizado
	// a sobrecarga dentro das classes filhas
	double converter() {
		double total = 0;
		return total;
	}

	/*
	 * Os metodos toString, hashCode e equals serão implementados para evitar
	 * qualquer tipo de equivoco do programa no momento de imprimir na tela qualquer
	 * informação solicitada, exemplo o valor atual da moeda
	 */
	@Override
	public String toString() {
		return "Moeda [valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(taxa, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(taxa) == Double.doubleToLongBits(other.taxa)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
