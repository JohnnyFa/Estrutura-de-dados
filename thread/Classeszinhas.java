package thread;

import java.text.DecimalFormat;

public class Classeszinhas{
}

class M4 extends Thread{
	//a modificar
	double sum = 0;

	DecimalFormat numberFormat = new DecimalFormat("#.000");
//	System.out.println(numberFormat.format(sum));
	//
	public void run() {
		for (int i = 1; i < 31; i++) {
			System.out.println("M4 - projeteis disparados: "+ i);
			try {
				Thread.sleep(0225);
				sum = sum + 0.225;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("M4 DESCARREGADO!!");
		System.out.println("M4 levou: " + numberFormat.format(sum)+ " segundos para descarregar o magazine!");
	}
}

class DesertEagle extends Thread{
	//a modificar
	double sum = 0;
	
	DecimalFormat numberFormat = new DecimalFormat("#.000");
	//
	public void run(){
		for (int i = 1; i < 16; i++) {
			System.out.println("Desert Eagle - projeteis disparados: "+ i);
			try {
				Thread.sleep(1000);
				sum = sum + 1.000;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("DESERT EAGLE DESCARREGADO!!");
		System.out.println("Desert Eagle levou: " + numberFormat.format(sum)+ " segundos para descarregar o magazine!");
	}
}

class Shotgun extends Thread{
	//a modificar
	double sum = 0;
	
	DecimalFormat numberFormat = new DecimalFormat("#.000");
	//
	public void run(){
		for (int i = 1; i < 13; i++) {
			System.out.println("Striker - projeteis disparados: "+ i);
			try {
				Thread.sleep(1200);
				sum = sum + 1.200;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("SHOTGUN STRIKER DESCARREGADO!!");
		System.out.println("Shotgun levou: " + numberFormat.format(sum)+ " segundos para descarregar o magazine!");
	}
}

