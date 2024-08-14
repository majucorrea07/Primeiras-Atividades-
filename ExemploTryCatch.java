package segundoSemestre;
import java.util.Scanner;
public class ExemploTryCatch {

	public static void main(String[] args) {
		int a, b, c;
		Scanner ler = new Scanner(System.in);
        a = 10;
        System.out.println("Digite um número: ");
	    b = ler.nextInt();
	    try {
	    c = a/ b; 
	    System.out.println("Valor de C: " + c);
	    }catch(ArithmeticException erro) {
	    System.out.println("Não existe divisão por zero");
        }
	}
}