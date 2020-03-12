package thread;

import java.util.Scanner;

public class Threadzin {

	public static void main(String[] args) {
		System.out.println("O programa mostra a velocidade em que as armas disparam um magazine;\n"
				+ "As 3 armas serão 'disparadas' ao mesmo tempo;\n"
				+ "as escolhidas foram M4, um rifle automatico;\n"
				+ "Desert Eagle, uma pistola de alto calibre;\n"
				+ "Shotgun Striker, uma shotgun semi-automatica.\n"
				+ "m16 possui 30 projeteis em um magazine.\n"
				+ "Desert Eagle possui 15 projeteis em um magazine.\n"
				+ "Striker(Shotgun) possui 12 projeteis em um magazine.");
		System.out.println("Aperte qualquer tecla para continuar:");
		Scanner tecla = new Scanner(System.in);
		tecla.nextLine();
		
		M4 obj1 = new M4();
		DesertEagle obj2 = new DesertEagle();
		Shotgun obj3 = new Shotgun();
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
