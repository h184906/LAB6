package no.hvl.dat100.varelager;

public class Varelager {
    protected Vare[] varelager; 
    protected int antall;

    public Varelager(int n) {
        varelager = new Vare[n];
        antall = 0;
    }
	
	public Vare[] getVarer() {
		
		return this.varelager;

	}
	
	public boolean leggTilVare(Vare v) {
		if (antall < varelager.length) {
			varelager[antall] = v;
			antall++;
			return true;
		} else {
			return false;
		}

	}
	
	public boolean leggTil(int varenr, String navn, double pris) {

		Vare nyvare = new Vare(varenr, navn, pris);
		return leggTilVare(nyvare);
	}
	
	public Vare finnVare(int varenr) {

		for (int i = 0; i < varelager.length; i++) {
			if (varelager[i].getVarenr() == varenr) {
				return varelager[i];
			}
		}
		return null;
	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				
		System.out.println(SEP);
		for (int i = 0; i < varelager.length; i++) {
			System.out.println((varelager[i].toString()));
		}
		System.out.println(SEP);

	}
	
}
