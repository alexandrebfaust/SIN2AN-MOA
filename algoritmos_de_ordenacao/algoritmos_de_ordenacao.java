package aula2;

import java.util.Scanner;

public class algoritmos_de_ordenacao {

	public static void main(String[] args) {
		
		int x = 0; //Tamanho do vetor
		int y = 0; //Variavel do vetor

		Scanner entrada = new Scanner(System.in);
		do {
			System.out.print("Informe um número maior que 4: ");
			x = entrada.nextInt();
		} while(x<4);

		System.out.print("Tamanho selecionado: " + x + "\n");
		int vetor[] = new int[x];

		for (int i=0; i<x; i++) {
			System.out.print("Informe o número " + i + ": ");
			vetor[i] = entrada.nextInt();
		}

		Vetor v = new Vetor();
		v.imprimir(vetor);




	}

}
