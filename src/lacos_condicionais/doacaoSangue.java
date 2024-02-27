package lacos_condicionais;

import java.util.Scanner;

public class doacaoSangue
{
	public static void main(String[] args)
	{
		int		age;
		String	name;
		boolean first;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		age = leia.nextInt();
		leia.skip("\\R?");
		System.out.println("Digite o seu nome: ");
		name = leia.nextLine();
		System.out.println("Primeira doação de sangue: ");
		first = leia.nextBoolean();
		
		if(age >= 18 && age < 60)
			System.out.println(name + " está apto(a) a doar sangue!");
		else if(age >= 60 && age <= 69 && first == false)
			System.out.println(name + " está apto(a) a doar sangue!");
		else
			System.out.println(name + " não está apto(a) a doar sangue!");

		leia.close();
	}

}
