package introducao;

import java.util.Scanner;

public class areaCirculo
{

	public static void main(String[] args)
	{
		float	raio;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		raio = leia.nextFloat();
		
		System.out.println("Area: " + (3.14159 * raio*raio));
		leia.close();
	}

}
