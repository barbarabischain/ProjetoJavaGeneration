package introducao;

import java.util.Scanner;

public class ex01salario
{

	public static void main(String[] args)
	{
		float	salario;
		float	abono;
		float	novoSalario;
		
		// entrada salario
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salario: ");
		salario = leia.nextFloat();
		
		// entrada abono
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		//saida
		novoSalario = salario + abono;
		System.out.println("Novo salario " + novoSalario);
		
		leia.close();
	}
}
