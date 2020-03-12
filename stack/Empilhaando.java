package Inpostout;

import java.util.Scanner;

public class Empilhaando {
	public String empilhando(String exp) {
		int i;
		Stack s = new Stack();
		char temp;
		String output = "";

		for (i = 0; i < exp.length(); i++) {
			temp = exp.charAt(i);
			if (Character.isLetterOrDigit(temp))
				output += temp;

			else if (temp == '(')
				s.push(temp);
			else if (temp == ')') {
				while (!s.isEmpty() && s.stackTop() != '(') {
					output += s.pop();
				}
				if (s.isEmpty())
					return "expression is not valid";
				else
					s.pop();
			} else {
				while (!s.isEmpty() && (getPrioridade(temp) <= getPrioridade(s.stackTop()))) {
					output += s.pop();
				}
				s.push(temp);
			}
		}
		while (!s.isEmpty())
			output += s.pop();
		return output;
	}

	public int getPrioridade(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	public int calculadora(String output) {
		Stack s = new Stack();
		int x = 0, y = 0;
		char temp[] = output.toCharArray();
		for (char c : temp) {
			if (c >= '0' && c <= '9') {
				s.push((int) (c - '0'));
			} else {
				y = s.pop();
				x = s.pop();
				switch (c) {
				case '+':
					s.push(x + y);
					break;
				case '-':
					s.push(x - y);
					break;
				case '*':
					s.push(x * y);
					break;
				case '/':
					s.push(x / y);
					break;
				case '^':
					s.push(x * x);
				}
			}
		}
		return s.pop();

	}

	public static void main(String[] args) {
		try {
			String exp;
			System.out.printf("Digite a expressao[numeros de 0 a 9]:");
			Scanner ss = new Scanner(System.in);
			exp = ss.next();
			Empilhaando i = new Empilhaando();
			String output = i.empilhando(exp);
			int j = i.calculadora(output);
			System.out.println("Desempilhado:" + output);
			System.out.println("Resposta da expressao:" + j);
		} catch (Exception e) {
			System.out.println("Expressao invalida!");
		}
	}
}