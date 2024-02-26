package introducao;

import java.util.Scanner;

public class operacoesMatematicas
{

	public static void main(String[] args)
	{
		float	a;
		float	b;
		float	divisao;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		a = leia.nextFloat();
		System.out.println("Digite o segundo numero: ");
		b = leia.nextFloat();
		
		divisao = a/b;
		System.out.println("Soma: " + (a+b));
		System.out.println("Diferenca: " + (a-b));
		System.out.println("Produto: " + (a*b));
		System.out.println("Divisao: " + (a/b));

		leia.close();
	}

}
