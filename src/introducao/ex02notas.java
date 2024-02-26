package introducao;

import java.util.Scanner;

public class ex02notas
{

	public static void main(String[] args)
	{
		float nota;
		nota = 0f;
		
		for(int i = 0; i < 4; i++)
		{
			Scanner leia = new Scanner(System.in);
			
			System.out.println("digite a nota: ");
			nota = nota + leia.nextFloat();
		}
		System.out.println("Média = " + nota/4);
	}
}
