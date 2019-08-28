import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Tamanho: ");
		int x = entrada.nextInt();
		int vetor[] = new int[x];
		System.out.print("Tamanho selecionado: " + x + "\n");
		

		for (int i=0; i<x; i++) {
			System.out.print("Digite o Vetor " + i + ": ");
			vetor[i] = entrada.nextInt();
		}

		for (int i=0; i<x; i++) {
			System.out.print("Vetor " + i + ": " + vetor[i] + "\n");
		}

	}

}
