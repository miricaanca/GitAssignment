
public class Farmacie implements IGestiune{
	private String nume;
	private int nrProduse;
	
	public Farmacie(String nume, int nrProduse) {
		super();
		this.nume = nume;
		this.nrProduse = nrProduse;
	}

	@Override
	public void descrieProduse() {
		System.out.println("Produsul  " + nume 
				+ ", se regaseste in stoc in numar de " + nrProduse);
	}


	
	
}
