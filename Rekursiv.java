package binomialkoeffizient;

public class Rekursiv {
	
	public static void main(String[] args) {
		System.out.println(binomialkoeffizient(5, 3));

	}
	
	private static int binomialkoeffizient(int n, int k)
	  {
	    if (k > n)
	      return 0;
	    else
	      if ((k == n) || (k == 0))
	        return 1;
	      else
	        return binomialkoeffizient(n - 1, k - 1) +
	        		binomialkoeffizient(n - 1, k);
	  }


}
