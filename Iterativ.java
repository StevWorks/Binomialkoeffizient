package binomialkoeffizient;

public class Iterativ {

	public static void main(String[] args) {
		System.out.println(binomialkoeffizient(5, 3));
	}
	
	private static int binomialkoeffizient(int n, int k) {
		if (k > n) {
			return 0;
		} else {
			int nFakultaet = 1; // Basiswert 1 gegeben...
			for (int i = 2; i <= n; i++) { //Fakult�t beginnend bei 2 bis einschlie�lich n
				nFakultaet = nFakultaet * i; // nFakult�t: 1 * 2 * ... * n			
			}
			
			int kFakultaet = 1; // Basiswert 1 gegeben...
			for (int i = 2; i <= k; i++) { //Fakult�t beginnend bei 2 bis einschlie�lich n
				kFakultaet = kFakultaet * i; // kFakult�t: 1 * 2 * ... * n			
			}
			
			int nMINUSkFakultaet = 1; // Basiswert 1 gegeben...
			for (int i = 2; i <= (n - k); i++) { //Fakult�t beginnend bei 2 bis einschlie�lich n
				nMINUSkFakultaet = nMINUSkFakultaet * i; // nMINUSkFakult�t: 1 * 2 * ... * n			
			}
			
			return (nFakultaet / (kFakultaet * nMINUSkFakultaet)); // Binomialkoeffizienten berechnen: n! / (k! * (n - k)!)
		}
	}

}






