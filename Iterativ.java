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
			for (int i = 2; i <= n; i++) { //Fakultät beginnend bei 2 bis einschließlich n
				nFakultaet = nFakultaet * i; // nFakultät: 1 * 2 * ... * n			
			}
			
			int kFakultaet = 1; // Basiswert 1 gegeben...
			for (int i = 2; i <= k; i++) { //Fakultät beginnend bei 2 bis einschließlich n
				kFakultaet = kFakultaet * i; // kFakultät: 1 * 2 * ... * n			
			}
			
			int nMINUSkFakultaet = 1; // Basiswert 1 gegeben...
			for (int i = 2; i <= (n - k); i++) { //Fakultät beginnend bei 2 bis einschließlich n
				nMINUSkFakultaet = nMINUSkFakultaet * i; // nMINUSkFakultät: 1 * 2 * ... * n			
			}
			
			return (nFakultaet / (kFakultaet * nMINUSkFakultaet)); // Binomialkoeffizienten berechnen: n! / (k! * (n - k)!)
		}
	}

}






