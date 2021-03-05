/* Data una matrice effettuare la trasposta della stessa. */

package esercitazione1punto1;

public class Es4 {
	public static void main(String args[]){  
		
		int originale[][]={{2,4,8},{3,2,0},{5,3,1},{0,1,0}};        
		int trasposta[][]=new int[3][4];  
		    
		for(int i = 0; i < 3; i++){    
			for(int j = 0; j < 4; j++){    
				trasposta[i][j]=originale[j][i];  
			}    
		}    
		  
		System.out.println("Matrice Normale:");  
		
		for(int i = 0; i < 4; i++){    
			for(int j = 0; j < 3; j++){    
				System.out.print(originale[i][j]+" ");    
			}    
			System.out.println();  
		}    
		System.out.println("Matrice trasposta");  
		
		for(int i = 0; i < 3; i++){    
			for(int j = 0;j < 4; j++){    
				System.out.print(trasposta[i][j]+" ");    
			}    
			System.out.println();  
		}   
	}
}


