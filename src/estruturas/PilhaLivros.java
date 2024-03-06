package estruturas;

import java.util.Scanner;
import java.util.Stack;

public class PilhaLivros
{

	public static void main(String[] args)
	{
		int		num;
		String	nome;
		
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		
		do
		{
            System.out.println("\n---Menu---");
            System.out.println("*****************************************");
            System.out.println("1 - Adicionar um livro na pilha");
            System.out.println("2 - Listar todos os livros da pilha");
            System.out.println("3 - Retirar um livro da pilha");
            System.out.println("0 - Sair do programa");
            System.out.println("*****************************************");
            System.out.print("\nDigite uma opção: ");
            num = leia.nextInt();
            leia.nextLine();
            
			switch (num)
            {
            	case 1:
            		System.out.println("Digite o nome do Livro");
            		nome = leia.nextLine();
            		pilhaLivros.push(nome);
            		System.out.println("\nLivro Adicionado!");
            		break;      		
            	case 2:
            		System.out.println("\nLivro na fila:");
            		for(String item : pilhaLivros)
            			System.out.println(item);
            			break;
            	case 3:
            		if(!pilhaLivros.isEmpty())
                		System.out.println( "Livro " + pilhaLivros.pop() + " removido!");
            		else
            			System.out.println("\nA pilha está vazia!");
            		break;
            	case 0:
            		System.out.println("\nPrograma Finalizado");
            		break;
            }
		} while (num != 0);

		leia.close();
	}

}
