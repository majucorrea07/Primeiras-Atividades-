package segundoSemestre;
import java.util.Scanner;
public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner ler = new Scanner(System.in);
	int soma, semana1, semana2, semana3, semana4;
	
	System.out.println("Informe o número de vendas da primeira semana");
	semana1 = ler.nextInt();
	
	System.out.println("Informe o número de vendas da segunda semana");
	semana2 = ler.nextInt();
	
	System.out.println("Informe o número de vendas da terceira semana");
	semana3 = ler.nextInt();
	
	System.out.println("Informe o número de vendas da quarta semana");
	semana4 = ler.nextInt();
	
	soma = semana1 + semana2 + semana3 + semana4;
	System.out.println("Seu numero de vendas ao total é: " + soma);
	 
	
	switch (soma) {
	case 1:
	System.out.println("Você não possui bonus!");
	break;
	
	case 2:
    System.out.println("Você não possui bonus!");
	break;
	
	case 3:
	System.out.println("Você não possui bonus!");
		break;
		
	case 4:
    System.out.println("Você não possui bonus!");		
		break;
		
	case 5:
	System.out.println("Você não possui bonus!");
		break;
	
	case 6:
	System.out.println("Você não possui bonus!");
		break;
		
	case 7:
    System.out.println("Você não possui bonus!");
		break;
		
	case 8:
	System.out.println("Você não possui bonus!");
			break;
			
	case 9:
	    System.out.println("Você não possui bonus!");
			break;
	
	case 10: 
	System.out.println("Seu bonus é equivalente a R$100,00");
	break;
	
	case 11: 
		System.out.println("Seu bonus é equivalente a R$100,00");
		break;
	
	case 12: 
		System.out.println("Seu bonus é equivalente a R$100,00");
		break;
	
	case 13: 
		System.out.println("Seu bonus é equivalente a R$100,00");
		break;
	
	case 14: 
		System.out.println("Seu bonus é equivalente a R$100,00");
		break;
	
	case 15: 
		System.out.println("Seu bonus é equivalente a R$100,00");
		break;
	
	case 16: 
		System.out.println("Seu bonus é equivalente a R$300,00");
		break;
	
	case 17: 
		System.out.println("Seu bonus é equivalente a R$300,00");
		break;
	
	case 18: 
		System.out.println("Seu bonus é equivalente a R$300,00");
		break;
	
	case 19: 
		System.out.println("Seu bonus é equivalente a R$300,00");
		break;
		
	case 20: 
		System.out.println("Seu bonus é equivalente a R$300,00");
		break;
	  
	default:
		System.out.println("Seu bonus é equivalente a R$500,00");
	}
  }
}
