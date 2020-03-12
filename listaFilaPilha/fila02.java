package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class fila02 {
	ArrayList<String> fila01 = new ArrayList<String>();
	ArrayList<String> fila02 = new ArrayList<String>();
	ArrayList<String> fila03 = new ArrayList<String>();
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		new fila02().Menu();
	}

	public void Menu() {
		System.out.println("O que deseja fazer?");
		System.out.println("1 - Incluir  elementos na fila:");
		System.out.println("2 - Consumir elementos da fila:");
		System.out.println("3 - Mostrar  elementos da fila:");
		System.out.println("9 - Finalizar:");
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
		case 9:
			System.exit(0);
		default:
			System.out.println("OPERAÇÃO INVALIDA!");
			break;
		}
	}

	public void incluir() {
		System.out.println("Digite o elementos que deseja adicionar na fila:");
		String op = s.next();
		if (fila01.contains(op)) {
			System.out.println("Elemento ja existe.");
			System.out.println(" ");
			Menu();
		}
		if (fila02.contains(op)) {
			System.out.println("Processo ja existe");
			System.out.println(" ");
			Menu();
		}
		if (fila03.contains(op)) {
			System.out.println("Processo ja existe");
			System.out.println(" ");
			Menu();
		} else {
			System.out.println("Agora digite a prioridade do processo [0 - 2]:");
			int proc = s.nextInt();
			switch (proc) {
			case 0:
				fila01.add(op);
				System.out.println("Elemento foi adicionado a fila com prioridade 0.");
				break;
			case 1:
				fila02.add(op);
				System.out.println("Elemento foi adicionado a fila com prioridade 1.");
				break;
			case 2:
				fila03.add(op);
				System.out.println("Elemento foi adicionado a fila com prioridade 2:");
				break;
			default:
				System.out.println("Prioridade inexistente.");
				break;
			}
		}
		Menu();
	}

	public void consumir() {
		if (fila01.isEmpty()) {
			consumir2();
		} else {
			fila01.remove(0);
		}
		Menu();
	}

	public void consumir2() {
		if (fila02.isEmpty()) {
			consumir3();
		} else {
			fila02.remove(0);
		}
		Menu();
	}

	public void consumir3() {
		if (fila03.isEmpty()) {
			System.out.println("FILA VAZIA");
		} else {
			fila03.remove(0);
		}
		Menu();
	}

	public void mostrar() {
		if (fila01.isEmpty() && fila02.isEmpty() && fila03.isEmpty()) {
			System.out.println("FILA VAZIA CARAIO");
		} else {
			System.out.println(fila01);
			System.out.println(fila02);
			System.out.println(fila03);
		}
		Menu();
	}

}
