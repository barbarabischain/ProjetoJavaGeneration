package introducao;

import java.util.Scanner;

public class diferencaProduto
{

	public static void main(String[] args)
	{
		float	n1;
		float	n2;
		float	n3;
		float	n4;
		float	diferenca;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.println("digite o segundo numero: ");
		n2 = leia.nextFloat();
			
		System.out.println("digite o terceiro numero: ");
		n3 = leia.nextFloat();
		
		System.out.println("digite o quarto numero: ");
		n4 = leia.nextFloat();

		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença = " + diferenca);
		
		leia.close();
	}

}