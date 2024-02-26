package introducao;

import java.util.Scanner;

public class decomporNotas
{

	public static void main(String[] args)
	{
		int	n;
		int divisao;
		int resto;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		n = leia.nextInt();
		
		resto = n % 100;
		divisao = n / 100;
		System.out.printf("%d notas de cem reais\n", divisao);
		
		divisao = resto / 50;
		resto = resto % 50;		
		System.out.printf("%d notas de cinquenta reais\n", divisao);
		
		divisao = resto / 20;
		resto = resto % 20;
		System.out.printf("%d notas de vinte reais\n", divisao);
		
		divisao = resto / 10;
		resto = resto % 10;
		System.out.printf("%d notas de dez reais\n", divisao);
	
		divisao = resto / 5;
		resto = resto % 5;
		System.out.printf("%d notas de cinco reais\n", divisao);
		
		divisao = resto / 2;
		resto = resto % 2;
		System.out.printf("%d notas de dois reais\n", divisao);
		
		divisao = resto / 1;
		resto = resto % 1;
		System.out.printf("%d notas de um real\n", divisao);
		
		leia.close();
	}

}
