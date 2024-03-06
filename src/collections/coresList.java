package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class coresList
{
	public static void main(String[] args)
	{
		int	i;
		String cor;
		
		Scanner leia = new Scanner(System.in);
		// Cria a Collection Arraylist do tipo String
		ArrayList<String> lista = new ArrayList<String>();
		// Cria um objeto da Classe Wrapper String 
		i = 0;
		while(i < 5)
		{
			System.out.printf("cor %d: \n", (i + 1));
			cor = leia.nextLine();
			lista.add(cor); // adiciona na lista
			i++;
		}
		System.out.println("Listar todas as Cores:");
		for (String item : lista)
			System.out.println(item);
		System.out.println("-----------------------------");
		System.out.println("Ordenar as cores:");
		
		Collections.sort(lista); //ordena
		for (String item : lista)
			System.out.println(item);
		leia.close();
	}

}
