import java.util.Scanner;

public class bubble_sor {

	public static void main(String[] args) {
		
		int x = 0; //Tamanho do vetor
		int y = 0; //Variavel flutuante do vetor

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

		System.out.print("Vetor desordenado: ");
		Vetor v = new Vetor();
		v.imprimir(vetor);
		System.out.print("\n\n\n");

		for(j=1;j<=n;j++){
			// 0 1 2 3 4 -> 
			for(i=0;i<n-1;i++){
				y = vetor[j];
				if(vetor[i]>)

			}

		}

		for(i=0; i<x; i++){
			for (j=0; j<(x-1); j++) {
				if(vetor[j] > vetor[j+1]){
					y = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = y;
				}
			}

		}

		System.out.print("Vetor ordenado: ");
		Vetor v = new Vetor();
		v.imprimir(vetor);

	}

}
