/* Scrivere un metodo che mostri i primi 50 numeri della serie di fibonacci (i primi due numeri di fibonacci
sono 0 e 1 i successivi si calcolano come somma dei 2 precedenti).*/

package esercitazione1punto1;

public class Es3 {
	public static void main(String args[]) {    
	 int num1 = 0;
	 int num2 = 1;
	 int num3;
	 int conta = 50;    
	 System.out.print(num1+ " " +num2);  
	    
	 for(int i = 2; i < conta; i++)   
	 {    
	  num3 = num1 + num2;    
	  System.out.print(" " +num3);    
	  num1 = num2;    
	  num2 = num3;    
	 }    
	  
	}
}
