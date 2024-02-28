package lacos_repeticao;

import java.util.Scanner;

public class SomaNumeros
{

	public static void main(String[] args)
	{
		int	n;
		int	soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if(n > 0)
				soma = soma + n;
		} while (n != 0);

		System.out.println("Soma dos positivos: " + soma);
		leia.close();
	}

}

