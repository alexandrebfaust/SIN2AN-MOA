import java.util.Scanner;

public class vetores_pseudo_criptografia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número maior que 10: ");
		int x = entrada.nextInt();

		System.out.print("Tamanho selecionado: " + x + "\n");
		String vetor[] = new String[x];

		int n = x/2;
		System.out.print("A metade é: "+n+"\n");

		for (int i=0; i<x; i+=2) {
			System.out.print("Informe a Palavra " + i + ": ");
			vetor[i] = entrada.next();
		}

		for (int i=1; i<x; i+=2) {
			System.out.print("Informe a Palavra aleatoria " + i + ": ");
			vetor[i] = entrada.next();
		}

		System.out.print("A frase criptografada é : ");
		for (int i=0; i<x; i++) {
			System.out.print(vetor[i]+" ");
		}
		
		System.out.print("\nA frase descriptografada é : ");
		for (int i=0; i<x; i+=2) {
			System.out.print(vetor[i]+" ");
		}

	}

}
