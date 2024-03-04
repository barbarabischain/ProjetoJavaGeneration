package vetores_matrizes;

import java.util.Scanner;

public class DiagonalMatriz {

	public static void main(String[] args)
	{
		int	i = 0;
		int	j = 0;
		
		float[][] matriz = new float[3][3];
		Scanner leia = new Scanner(System.in);
		//receber a matriz
		while (i < 3)
		{
			while(j < 3)
			{
				System.out.printf("Digite o valor da posiçao [%d][%d] ", i, j);
				matriz[i][j] = leia.nextFloat();
				j++;
			}
			j = 0;
			i++;
		}
		System.out.println("Elementos da Diagonal Principal:");
		System.out.printf("%.1f %.1f %.1f\n", matriz[0][0], matriz[1][1], matriz[2][2]);
		
		System.out.println("Elementos da Diagonal Secundária:");
		System.out.printf("%.1f %.1f %.1f\n", matriz[0][2], matriz[1][1], matriz[2][0]);
		
		System.out.println("Soma dos Elementos da Diagonal Principal:");
		System.out.printf("%.1f\n", (matriz[0][0] + matriz[1][1] + matriz[2][2]));
		
		System.out.println("Soma dos Elementos da Diagonal Secundária:");
		System.out.printf("%.1f\n", (matriz[0][2] + matriz[1][1] + matriz[2][0]));
		leia.close();
	}
}
