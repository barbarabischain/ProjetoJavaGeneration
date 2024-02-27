package lacos_condicionais;

import java.util.Scanner;

public class compraItem
{
	public static void main(String[] args)
	{
		int	id;
		int quant;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o código do produto: ");
		id = leia.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		quant = leia.nextInt();
		
		switch(id)
		{
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("Valor total: R$ %d,00\n", (quant * 10));
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.printf("Valor total: R$ %d,00\n", (quant * 15));
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.printf("Valor total: R$ %d,00\n", (quant * 18));
			break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.printf("Valor total: R$ %d,00\n", (quant * 12));
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.printf("Valor total: R$ %d,00\n", (quant * 8));
			break;
		case 6:
			System.out.println("Produto: Suco de Laranja");
			System.out.printf("Valor total: R$ %d,00\n", (quant * 13));
			break;
		}
		leia.close();
	}

}
