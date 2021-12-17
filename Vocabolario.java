package Vocabolario;

public class Vocabolario extends Libro{
	private int numDefinizioni;
	
	public int getNumDefinizioni() {
		return numDefinizioni;
	}

	public void setNumDefinizioni(int numDefinizioni) {
		this.numDefinizioni = numDefinizioni;
	}

	public Vocabolario(int numPagine, int numDefinizioni) {
		super(numPagine);
		this.numDefinizioni = numDefinizioni;
	}

	@Override
	public int getNumPagine() {
		// TODO Auto-generated method stub
		return super.getNumPagine();
	}

	@Override
	public void msgNumPagine() {
		// TODO Auto-generated method stub
		super.msgNumPagine();
		System.out.println("\nIl numero di pagine è "+getNumPagine()+
				", il num di definizioni è "+ getNumDefinizioni()+
				".\nIl numero medio di definizioni per pagine del vocabolario è "
				+ getNumDefinizioni()/getNumPagine()+".\n");
	}	
}