package vetores_matrizes;

import java.util.Scanner;

public class EncontrarNumero
{

	public static void main(String[] args)
	{
		int	n;
		int	i = 0;
		int	vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		while(i <= 9)
		{
			if (vetor[i] == n)
			{
				System.out.printf("O número %d está na posição %d\n", n, i);
				return;
			}
			i++;
		}
		System.out.printf("O número %d não foi encontrado", n);
		leia.close();
	}

}
