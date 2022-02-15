package PortoSeguroExercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o 
 estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de 
 R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P
 (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
 variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
 com o conteúdo ZERO.*/
		
		float peso;
		
		float multa = 4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Insira o total do peso dos tomates: ");
		peso = leia.nextFloat();
		
				
		if(peso<=50)
		{
			System.out.println("\n Não paga a multa");
					
		float excesso = peso-50;
	}
		else
		{
			System.out.println("\n Você excedeu o peso e deverá pagar a multa");
			
			System.out.println("\n Sua multa é de: " + multa*excesso);
			
			
			
			
		}
			
		
		
		
		
	}

}
