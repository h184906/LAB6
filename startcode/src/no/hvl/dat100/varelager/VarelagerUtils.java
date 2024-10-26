package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		Vare billigst = varer[0];
		for (int i = 1; i < varer.length; i++) {
			if (billigst.getPris() > varer[i].getPris()) {
				billigst = varer[i];
			}
		}
		return billigst;

	}
	
	public static double totalPris(Vare[] varer) {		
		
		double total = 0;
		for (int i = 0; i < varer.length; i++) {
			total += varer[i].getPris();
		}
		return total;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
				
		int[] varenrArray = new int[varer.length];
		for (int i = 0; i < varer.length; i++) {
			varenrArray[i] = varer[i].getVarenr(); 
		}
		return varenrArray;

	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
		
		double[] nytabell = new double[varer.length-1];

		for (int i = 1; i < varer.length; i++) {
			nytabell[i-1] = (varer[i].getPris() - varer[i-1].getPris());
		}
		return nytabell;
	}
}
