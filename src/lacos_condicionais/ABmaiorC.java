package lacos_condicionais;

import java.util.Scanner;

public class ABmaiorC
{

	public static void main(String[] args)
	{
		int	a;
		int	b;
		int	c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero A: ");
		a = leia.nextInt();

		System.out.println("Digite um numero B: ");
		b = leia.nextInt();
		
		System.out.println("Digite um numero C: ");
		c = leia.nextInt();
		
		if((a + b) > c)
		{
			System.out.printf("%d + %d = %d > %d\n", a, b, (a + b), c);
			System.out.println("A Soma de A + B é Maior do que C");

		}
		else if((a + b) < c)
		{
			System.out.printf("%d + %d = %d < %d\n", a, b, (a + b), c);
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else
		{
			System.out.printf("%d + %d = %d = %d\n", a, b, (a + b), c);			
			System.out.println("A Soma de A + B é Igual a C");
		}
		leia.close();
	}

}

