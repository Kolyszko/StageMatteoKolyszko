/* dato un array di interi, popolato casualmente, ordinarlo in ordine crescente e stampare a video il risultato
di tale ordinamento. */

package esercitazione1punto1;

public class Es1 {
	public static void main(String[] args) {

		int[] arr = new int[10];
	    for (int i = 0; i < arr.length; i++) {
	    	arr[i] = (int) (Math.random() * 100);
	    	System.out.print(arr[i]+ " ");
	    }
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
        	 for(int j=1; j < (n-i); j++){  
        		 if(arr[j-1] > arr[j]){
        			 temp = arr[j-1];
        			 arr[j-1] = arr[j];
        			 arr[j] = temp;
        		 }  
        	 }  
         }  
	    System.out.println("");
	    for (int i = 0; i < arr.length; i++) {
	    	System.out.print(arr[i] +" ");
	    }
	}
}
