package introducao;

import java.util.Scanner;

public class salarioLiquido
{

	public static void main(String[] args)
	{
		float	salarioBruto;
		float	adicionalNoturno;
		float	horasExtras;
		float	descontos;
		float	salarioLiquido;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite o salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("digite o adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
			
		System.out.println("digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("digite os descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("salario liquido = " + salarioLiquido);
		
		leia.close();

	}

}