package segundoSemestre;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num=0;
		
		for (int i=1; i<=5; i++) {
	    System.out.println("Informe os numero:");
	    num = ler.nextInt();
		
	    if (num % 2 == 0) {
		System.out.println("Esse numero é par");
	    }
		else 
		System.out.println("Esse numero não é par");
	}
	}
}
