package cofrinhoUninter;

import java.util.Objects;

public class Euro extends Moeda {

	int idDolar = 02; /* Atributo utilizado apenas para enumerar a Moeda caso futuramente seja
						 necessário*/
	double taxa = 5.02; // taxa atribuida a conversão de euro para real

	/* Metodos herdados da classe mãe Moeda e sua sobrecarga para implementação
	 unica*/

	@Override
	public String toString() {
		return "Euro = " + valor + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idDolar, taxa);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Euro other = (Euro) obj;
		return idDolar == other.idDolar && Double.doubleToLongBits(taxa) == Double.doubleToLongBits(other.taxa);
	}

	@Override
	double converter() {
		// TODO Auto-generated method stub
		double total = this.valor * this.taxa;
		return total;
	}

}
