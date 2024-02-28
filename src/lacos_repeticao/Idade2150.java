package lacos_repeticao;

import java.util.Scanner;

public class Idade2150 {

	public static void main(String[] args)
	{
		int	idade = 0;
		int	count21 = 0;
		int	count50 = 0;
		
		while (idade >= 0)
		{
			Scanner	leia = new Scanner(System.in);
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if (idade < 21 && idade >= 0)
				count21++;
			if (idade > 50)
				count50++;
		}
		System.out.println("Total de pessoas menores de 21 anos: " + count21);
		System.out.println("Total de pessoas maiores de 50 anos: " + count50);
	}

}
