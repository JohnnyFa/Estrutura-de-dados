package exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class lista {
	ArrayList<Integer> listinha = new ArrayList<Integer>();
	Scanner s = new Scanner(System.in);
	int op;
	//PARA TER O EXERCICIO DOIS É SÓ MUDAR O TAMANHO DA ARRAY NO IF QUE ESTARA MARCADO PARA 15

	public static void main(String[] args) {
		try{
			new lista().Menu();
		} catch (Exception e) {
			System.out.println("Ocoreu um problema na hora da execução desta operação.");
		}
	}

	public void Menu() {
		System.out.println("Bem-vindo ao Menu. Escolha a opção desejada:");
		System.out.println("1 - Incluir elementos na lista:");
		System.out.println("2 - Remover elementos da lista:");
		System.out.println("3 - Mostrar elementos da lista:");
		op = s.nextInt();
		switch (op) {
		case 1:
			Incluir();
			break;
		case 2:
			Remover();
			break;
		case 3:
			Mostrar();
			break;
		default:
			System.out.println("Operação invalida, digite uma operação valida.");
			Menu();
			break;
		}
	}

	public void Incluir() {
		//MUDANDO ESTE SIZE PARA 15 VC TERA UMA ARRAYLIST DE 15 ESPAÇOS
		if (listinha.size() >= 10) {
			System.out.println("A lista está cheia!!!");
		} else {
			System.out.println("Digite o valor que deseja incluir na lista:");
			System.out.println("Se deja voltar aperte 00:");
			op = s.nextInt();
			if (op == 00) {
				Menu();
			}
			if (listinha.contains(op)) {
				System.out.println("Esse valor já existe...");
				Incluir();
			} else {
				listinha.add(op);
				System.out.println("Valor acrescentado na lista:");
				Incluir();
			}
		}
		Menu();

}

	public void Remover() {
		if (listinha.isEmpty()) {
			System.out.println("LISTA VAZIA");
		} else {
			System.out.println("Digite o elemento que deseja remover:");
			int op1 = s.nextInt();
			if (listinha.contains(op1)) {
				listinha.remove(op1);
				System.out.println("Elemento removido");
				System.out.println(" ");
				Menu();
			} else {
				System.out.println("Elemento inexistente, coloque um elemento que está na lista:");
				Remover();
			}
		}
		Menu();
	}
	public void Mostrar() {
		if (listinha.isEmpty()) {
			System.out.println("LISTA VAZIA");
		} else {
			System.out.println("Aqui está a lista");
			Collections.sort(listinha);
			System.out.println(listinha);
		}
		Menu();
	}
}
