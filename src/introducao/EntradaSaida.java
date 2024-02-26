package introducao;

import java.util.Scanner;

public class EntradaSaida
{

	public static void main(String[] args)
	{	
		String name;
		
		//Entrada de dados
		Scanner leia = new Scanner(System.in);
		name = leia.next();
		
		System.out.println("Bom dia, " + name);
	}
}
