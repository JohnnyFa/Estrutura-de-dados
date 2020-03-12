package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class pilha01 {
	Stack<String> pilhazinha = new Stack<String>();
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		new pilha01().Menu();
	}
	//ESTA ATIVIDADE � DA PILHA COM 10 ESPA�OS, PARA TER UMA PILHA ILIMITADA � S� REMOVER O IF, ESTAR� MARCADO.

	public void Menu() {
		System.out.println("Bem-vindo ao Menu. Escolha a op��o desejada:");
		System.out.println("1 - Incluir elementos na pilha:");
		System.out.println("2 - Remover elementos da pilha:");
		System.out.println("3 - Mostrar elementos da pilha:");
		System.out.println("9 - Sair:");
		int op = s.nextInt();
		switch (op) {
		case 1:
			acrescentar();
			break;
		case 2:
			consumir();
			break;
		case 3:
			mostrar();
			break;
		case 9:
			System.exit(0);
			break;
		default:
			System.out.println("Opera��o invalida, digite uma opera��o valida.");
			Menu();
			break;
		}
	}

	public void acrescentar() {
		//PARA TER PILHA ILIMITADA � S� REMOVER ESTE IF, A� TER� O EXERCICIO 2 QUE PEDE UMA PILHA ILIMITADA.
		if (pilhazinha.size() > 9) {
			System.out.println("PILHA CHEIA");
		} else {

			System.out.println("Digite o elemento que deseja adicionar:");
			String op1 = s.next();
			if (pilhazinha.contains(op1)) {
				System.out.println("Esse processo j� consta na pilha!!");
			} else {
				pilhazinha.push(op1);
				System.out.println("Elemento adicionado na pilha!!!");
				acrescentar();
			}
		}
		Menu();
	}

	public void consumir() {
		if (!pilhazinha.isEmpty()) {
			pilhazinha.pop();
		} else {
			System.out.println("PILHA VAZIA, NADA PARA CONSUMIR.");
		}
		Menu();
	}

	public void mostrar() {
		if (pilhazinha.isEmpty()) {
			System.out.println("PILHA VAZIA!!!");
		} else {
			System.out.println(pilhazinha);
		}
		Menu();
	}
}
