package lacoderepeticao;

import java.util.Scanner;

public class lacoderepeticaoo2 {

	public static void main(String[] args) {
		// Exerc�cios de repeti��o 02 (for)

		 Scanner leia = new Scanner(System.in);
	        int num, contPar = 0, contImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "� n�mero");
	            num = leia.nextInt();
	            
	            if(num % 2 == 0){
	                contPar++;
	            }

	            if(num % 2 == 1){
	                contImpar++;
	            }
	            
	        }
	        
	        System.out.println("Foram digitados " + contPar + " n�meros pares \n");
	        System.out.println("E " + contImpar + " n�meros �mpares");
	}

}
