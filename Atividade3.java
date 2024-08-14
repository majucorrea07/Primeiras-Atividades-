package segundoSemestre;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int num;
		
		for (int i=1; i<=5; i++) {
		System.out.println("Informe o numero: ");
		num = ler.nextInt();
		
		if (num >1){
			System.out.println("O numero é positivo");
		}	
		else if (num == 0){
	    System.out.println("O numero é zero");
	    }
		if (num <0){
		    System.out.println("O numero não é positivo");

	}
	}
	}
}