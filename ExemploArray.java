package segundoSemestre;
import java.util.ArrayList;
import java.util.Arrays;
public class ExemploArray {

	public static void main(String[] args) {
		String[] disciplinas = {"matemática", "filosofia", "historia", "fisica"};	
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas)); 
		novaLista.add("geografia");
		novaLista.add("lingua inglesa");

		for (String i: novaLista)
		{
	System.out.println("Disciplina: " + i);
}
}
}