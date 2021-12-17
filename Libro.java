package Vocabolario;

public class Libro {
	private int numPagine;

	public Libro(int numPagine) {
		this.numPagine = numPagine;
	}
	
	public Libro() {
		this.numPagine=0;
	}

	public int getNumPagine() {
		return numPagine;
	}
	
	public void msgNumPagine() {
		System.out.println("Numero pagine "
				+ "del libro: "+numPagine);
	}
}
