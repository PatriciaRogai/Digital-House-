package PortoSeguroExercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
rendimento di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o 
 estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de 
 R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P
 (peso de tomates) e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na
 vari�vel M o valor da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis
 com o conte�do ZERO.*/
		
		float peso;
		
		float multa = 4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Insira o total do peso dos tomates: ");
		peso = leia.nextFloat();
		
				
		if(peso<=50)
		{
			System.out.println("\n N�o paga a multa");
					
		float excesso = peso-50;
	}
		else
		{
			System.out.println("\n Voc� excedeu o peso e dever� pagar a multa");
			
			System.out.println("\n Sua multa � de: " + multa*excesso);
			
			
			
			
		}
			
		
		
		
		
	}

}
