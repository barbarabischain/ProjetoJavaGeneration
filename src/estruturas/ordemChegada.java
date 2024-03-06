package estruturas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ordemChegada
{

	public static void main(String[] args)
	{
		int	num;
		String nome;

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		do
		{
            System.out.println("\n---Menu---");
            System.out.println("1 - Adicionar um novo Cliente na fila");
            System.out.println("2 - Listar todos os Clientes na fila");
            System.out.println("3 - Chamar (retirar) uma pessoa da fila");
            System.out.println("0 - Sair do programa");
            System.out.print("\nDigite uma opção: ");
            num = leia.nextInt();
            leia.nextLine();
            
			switch (num)
            {
            	case 1:
            		System.out.println("Digite o nome do Cliente");
            		nome = leia.nextLine();
            		fila.add(nome);
            		System.out.println("\nCliente Adicionado!");
            		break;      		
            	case 2:
            		System.out.println("\nClientes na fila:");
            		for(String item : fila)
            			System.out.println(item);
            			break;
            	case 3:
            		if(!fila.isEmpty())
                		System.out.println( "Cliente " + fila.poll() + " chamado(a)!");
            		else
            			System.out.println("\nA Fila está vazia!");
            		break;
            	case 0:
            		System.out.println("\nPrograma Finalizado");
            		break;
            }
		} while (num != 0);

		leia.close();
	}

}
