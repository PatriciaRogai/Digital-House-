package PortoSeguro;

import java.util.Scanner;
import java.util.*;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade=26,x,y;
		float altura;
		double nota1,nota2,nota3,media;
			
		
		Scanner leia = new Scanner(System.in);// estou criando a entrada de dados
		
		System.out.println("Olá Mundooo!");// estou criando a saída de dados.
		
		System.out.println("\n\n\t\t Entre com o seu nome: ");
		nome = leia.nextLine();//estou pegando a entrada do meu usuario
		System.out.println("\n\t\t Entre com a sua altura");
		altura = leia.nextFloat();
		
		System.out.println("/nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("/nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("/nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
				
		if(media>=7 && media <=10)
		{
			System.out.println("\n Aluno Aprovado!!!");
		}
		else if(media>=5 && media <7)
		{
			System.out.println("\n Aluno de Exame!!!");
		}
		else if(media>=0 && media <5)
		{
			System.out.println("\n Aluno Reprovado!!!");
		}
		else
		{
			System.out.println("\n média invalida!!!");
		}
		
		System.out.println("\nMeu nome é: " +nome+" eu tenho: " + idade+
				" anos(s) e a minha altura é: "+altura);
		//System.out.printf("\nMeu nome é: %s
		
		System.out.printf("\n Média aritmética: %2.2f", media);
		
		nota1 = Math.sqrt(nota2);// raiz quadrada
		nota2 = Math.pow(nota3, 3);//potencia
		
		System.out.println("\nEntre com o valor de X: ");
		x = leia.nextInt();
		System.out.println("\nEntre com o valor de Y: ");
		y = leia.nextInt();
			
		x = x % y; //calcula o resto da divisão de dois números inteiros
		
	}

}
