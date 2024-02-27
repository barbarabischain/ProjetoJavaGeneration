package lacos_condicionais;

import java.util.Scanner;

public class par_impar
{

	public static void main(String[] args)
	{
		int	n;
		
		Scanner leia = new Scanner(System.in);
		n = leia.nextInt();
		if(n % 2 == 0)	
			System.out.printf("O Número %d é par!\n", n);
		else
			System.out.printf("O Número %d é ímpar!\n", n);
		
		leia.close();
	}

}
