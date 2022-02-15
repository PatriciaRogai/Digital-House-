package PortoSeguro;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float [] media = new float [5];
		String [] nomeAluno = new String[5];
		float n1,n2,n3,somaMedia=0,mediaGeral;
		int x,aprovados=0; //variável chamada de looping
		
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++)
		{
			System.out.println("\nNotas do aluno "+(x+1));
			System.out.println("\nEntre com a primeira nota");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10)
			{
				System.out.println("\nIntervalo de notas errado...\n Entre com a primeira nota");
				n1 = leia.nextFloat();
				
			}
			
			
			System.out.println("\nEntre com a segunda nota");
			n2 = leia.nextFloat();
			
			while(n2<0 || n2>10)
			{
				System.out.println("\nIntervalo de notas errado...\n Entre com a segunda nota");
				n2 = leia.nextFloat();
				
			}
			
						
			System.out.println("\nEntre com a terceira nota");
			n3 = leia.nextFloat();
			
			media [x] = (n1+n2+n3) / 3;
			
			if(media[x]>=7 && media[x]<=10)
			{
				System.out.println("\n Aluno aprovado!!");
				aprovados++; //aprovados = aprovados + 1
			}
			else if(media[x]>=5 && media[x]<7)
			{
				System.out.println("\n Aluno de exame!!");
			}
			else
			{
				System.out.println("\n Aluno reprovado!!");
			}
			
			
			System.out.println("\nSua Média: "+media[x]);
			
			somaMedia += media[x]; //somaMedia = somaMedia + media[x];
			
			}
		
		mediaGeral = somaMedia / x;
		
		System.out.println("\n Média geral:"+mediaGeral);
		System.out.println("\n Tivemos:"+aprovados+" aluno(s) aprovado(s)...");
		
		
		
		
	}

}
