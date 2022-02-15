package CursoJava;

import java.util.Scanner;

public class Exercícios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*String nome;
		int idade = 30;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite seu nome: ");
		nome = leia.nextLine();
		*/
		
		
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite seu número");
		numero = leia.nextInt();
					
		
		if(numero>=100) {
		System.out.println("\n O número escolhido é:"+numero);
		}
		else {
			System.out.println("0");	
		}
		
		
		
		
	}

}
