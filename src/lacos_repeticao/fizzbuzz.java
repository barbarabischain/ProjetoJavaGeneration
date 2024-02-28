package lacos_repeticao;

import java.util.Scanner;

public class fizzbuzz
{

	public static void main(String[] args) 
	{
		int	n;
		int	m;
		int i;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro número do intervalo: ");
		n = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		m = leia.nextInt();
		if(n > m)
			System.out.println("Intervalo inválido!");
		else
		{	
			for(i = n; i <= m; i++)
			{
				if(i % 3 == 0 && i % 5 == 0)
					System.out.println(i + " é múltiplo de 3 e 5");
			}
		}
		leia.close();
	}

}
