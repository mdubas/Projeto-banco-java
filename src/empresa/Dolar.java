package empresa;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println(toString());
	}

	@Override
	public double converter() {
		return valor * 5;
	}

	@Override
	public String toString() {
		return "Dolar = " + valor;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}
