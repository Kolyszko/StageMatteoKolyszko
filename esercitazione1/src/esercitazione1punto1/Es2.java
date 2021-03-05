/* Scrivere un metodo che verifichi se una data stringa inserita in input è palindroma, tale metodo dovrà
restituire un booleano. */

package esercitazione1punto1;

import java.util.Scanner;

public class Es2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("inserisci parola da controllare ");
		String parola = in.next();
		if(palindroma(parola)) {
			System.out.println("La parola e' palindroma");
		} else {
			System.out.println("La parola non e' palindroma");
		}
		
	}
	
	 public static boolean palindroma(String parola) {
		 int i = 0;
		 int j = parola.length() - 1;
		 while (i < j) {
	            if (parola.charAt(i) != parola.charAt(j))
	                return false;
	            i++;
	            j--;
	        }
	        return true;
	}

}
