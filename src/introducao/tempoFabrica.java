package introducao;

import java.util.Scanner;

public class tempoFabrica
{

	public static void main(String[] args)
	{
		int	n;
		int	segundo;
		int	minuto;
		int	hora;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tempo em segundos: ");
		n = leia.nextInt();
		
		hora = n / (60 * 60);
		minuto = n % (60 * 60);
		segundo = n % 60;

		
		System.out.printf("%d:%d:%d",hora, minuto, segundo);
		
		leia.close();
	}

}