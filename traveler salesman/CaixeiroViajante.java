package Inpostout;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CaixeiroViajante {
// JOHNNY FAGUNDES DE PAULA - U260593//
	public static void main(String[] args) {
		new CaixeiroViajante().readFile();
		char cities[] = { '1', '2', '3', '4', '5' };
		CaixeiroViajante.possibilidades(cities);
		System.out.println("_________________________________________________");
		System.out.println("O menor caminho e: 0" + menorCaminho + "0");
		System.out.println("O menor caminho e: 0" + menorCaminho2 + "0");
		System.out.println("O custo e: " + menorCusto);
		System.out.println("_________________________________________________");
	}

	private static int cont = 0;
	private static char[] p;
	static int[][] matriz = new int[6][6];
	int count = 0;
	int l = 0;
	int c = 0;
	int wi = 0;
	static int menorCusto = 9999;
	static int menorCaminho;
	static int menorCaminho2;

	public void readFile() {
		Scanner ler = new Scanner(System.in);

		System.out.printf("Informe o nome de arquivo a ser lido:\n");
		String nome = ler.nextLine();

		System.out.printf("\n Caminhos :\n");
		try {
			FileReader r = new FileReader(nome);
			BufferedReader separar = new BufferedReader(r);
			String readPath = separar.readLine();

			while (readPath != null) {
				String[] aux = readPath.split(";");
				int i = 0;
				i = i + 2;
				int j = 0;
				for (j = 0; j < 1; j++) {
					switch (wi) {
					case 6:
						l = l + 1;
						wi = 0;
						c = 0;
						break;
					default:
						break;
					}
					matriz[l][c] = (Integer.parseInt(aux[i]));
				}
				wi++;
				c++;
				readPath = separar.readLine();
			}
			r.close();
		} catch (IOException e) {
			System.err.printf("Arquivo invalido! : %s.\n", e.getMessage());
			System.exit(0);
		}
	}

	public static void possibilidades(char[] vet) {

		p = new char[vet.length];
		permuta(vet, 0);
	}

	private static void permuta(char[] vet, int n) {

		if (n == vet.length) {
			cont++;
			printAndGetPath();

		} else {

			for (int i = 0; i < vet.length; i++) {

				boolean result = false;

				for (int j = 0; j < n; j++) {

					if (p[j] == vet[i])
						result = true;
				}

				if (!result) {

					p[n] = vet[i];
					permuta(vet, n + 1);
				}

			}
		}

	}

	private static void printAndGetPath() {
		System.out.println();
		System.out.print("(" + cont + ") : ");
		int pos = 0;
		int pos2 = 0;
		int soma = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
			String str = String.valueOf(p);
			pos2 = Integer.parseInt(str);
			String str1 = Character.toString(p[i]);
			pos = Integer.parseInt(str1);
			soma = soma + matriz[l][pos];
			j = k;
			k = l;
			l = pos;
		}

		switch (pos) {
		case 1:
			soma = soma + 14;
			break;
		case 2:
			soma = soma + 05;
			break;
		case 3:
			soma = soma + 05;
			break;
		case 4:
			soma = soma + 14;
			break;
		case 5:
			soma = soma + 12;
			break;

		default:
			System.out.println("ERRO!");
			break;
		}
		if (menorCusto > soma) {
			menorCusto = soma;
			menorCaminho = pos2;
		}
		if (menorCusto == soma) {
			menorCaminho2 = pos2;
		}
		System.out.println(soma);
	}

}
