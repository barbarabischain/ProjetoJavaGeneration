package lacos_condicionais;

import java.util.Scanner;

public class colaborador
{
	public static void main(String[] args)
	{
		String	nome;
		String	cargo = "";
		int		id;
		float	sal;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		nome = leia.nextLine();
		System.out.println("Digite o código do cargo: ");
		id = leia.nextInt();
		System.out.println("Digite o salario: ");
		sal = leia.nextFloat();
		
		switch(id)
		{
		case 1:
			cargo = "Gerente";
			sal = sal + (sal / 0.1f);
			break;
		case 2:
			cargo = "Vendedor";
			sal = sal + (sal * 0.07f);
			break;
		case 3:
			cargo = "Supervisor";
			sal = sal + (sal * 0.09f);
			break;
		case 4:
			cargo = "Motorista";
			sal = sal + (sal * 0.06f);
			break;
		case 5:
			cargo = "Estoquista";
			sal = sal + (sal * 0.08f);
			break;
		case 6:
			cargo = "Tecnico de TI";
			sal = sal + (sal * (8 / 100));
			break;
		}
		System.out.println("Nome do colaborador: " + nome);
		System.out.printf("Cargo: %s\n", cargo);
		System.out.printf("Salário: R$ %.2f\n", sal);

		leia.close();
	}

}
