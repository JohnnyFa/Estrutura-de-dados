package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class filiinha2 {
	ArrayList<Integer> filinha = new ArrayList<Integer>();
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		new filiinha2().Menu();
	}

	public void Menu() {
		System.out.println("O que deseja fazer?:");
		System.out.println("1 - Incluir  elementos na fila :");
		System.out.println("2 - Consumir elemento do começo  da fila:");
		System.out.println("3 - Consumir elemento do  final da fila :");
		System.out.println("4 - Mostrar  elementos da fila :");
		System.out.println("9 - SAIR:");
		int op = s.nextInt();
		switch (op) {
		case 1:
			incluir();
			break;
		case 2:
			consumir();
			break;
		case 3:
			consumirFim();
			break;
		case 4:
			mostrar();
			break;
		case 9:
			System.exit(0);
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
	public void consumirFim() {
		if (filinha.isEmpty()) {
			System.out.println("FILA VAZIA!");
		} else {
			filinha.remove(filinha.size() - 1);
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
