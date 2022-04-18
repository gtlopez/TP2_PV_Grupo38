package ar.edu.unju.fi.Punto16;

public class CalculoMatematico {
	public int n;
	
	public CalculoMatematico() {
	}

	public CalculoMatematico(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	//
	public double calcularSumatoria() {
		double sumatoria = 0;
		for(int i = 1;i <= n;i++) {
			sumatoria = sumatoria + Math.pow(n * (n + 1)/2,2);
		}
		return sumatoria;
	}
	
	//
		public double calcularProductoria() {
		double productoria= 1;
		for(int i = 1;i <= n;i++) {
			productoria = productoria* i * (i + 4);
		}
		return productoria;
	}
	
}
