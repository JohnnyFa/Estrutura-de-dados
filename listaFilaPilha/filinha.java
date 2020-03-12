package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class filinha {
	ArrayList<Integer> filinha = new ArrayList<Integer>();
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		new filinha().Menu();
	}

	public void Menu() {
		System.out.println("O que deseja fazer?:");
		System.out.println("1 - Incluir  elementos na fila :");
		System.out.println("2 - Consumir elementos da fila :");
		System.out.println("3 - Mostrar  elementos da fila :");
		int op = s.nextInt();
		switch (op) {
		case 1:
			incluir();
			break;
		case 2:
			consumir();
			break;
		case 3:
			mostrar();
			break;
		default:
			System.out.println("Operação invalida, digite uma operação valida.");
			Menu();
			break;
		}
	}

	public void incluir() {
		if (filinha.size() > 9) {
			System.out.println("FILA CHEIA!!");
		} else {
			System.out.println("Digite o elemento que deseja adicionar a fila:");
			System.out.println("Para voltar digite 0:");
			int op1 = s.nextInt();
			if (op1 == 0) {
				Menu();
			}
			if (filinha.contains(op1)) {
				System.out.println("Esse Elemento ja existe na fila.");
			} else {
				filinha.add(op1);
				System.out.println("Elemento adicionado à fila.");
				incluir();
			}
		}
		Menu();
	}

	public void consumir() {
		if (filinha.isEmpty()) {
			System.out.println("FILA VAZIA!");
		} else {
			filinha.remove(0);
			System.out.println("processo consumido.");
		}
		Menu();
	}

	public void mostrar() {
		if (filinha.isEmpty()) {
			System.out.println("FILA VAZIA");
		} else {
			System.out.println("Fila:");
			System.out.println(filinha);
		}
		Menu();
	}

}
