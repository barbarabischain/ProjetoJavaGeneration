package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class collectionSetInteiros
{

	public static void main(String[] args)
	{
		int	num;
		
		Set<Integer> setNumeros = new TreeSet<>();
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Digite inteiro sem repetir: ");	
			num = leia.nextInt();
			setNumeros.add(num);
		}
		System.out.println("Listar dados do Set: ");
		for(int item : setNumeros)
			System.out.println(item);
		leia.close();
	}

}
