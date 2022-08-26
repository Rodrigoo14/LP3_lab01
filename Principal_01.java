package Proyecto;

import java.util.Scanner;

public class Principal_01 {

	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		rp=0;
		Scanner sc = new Scanner(System.in);
		do {
			vida ++;
			System.out.println("Vida: "+ vida +"\t¿Cual es el numero secreto? ");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		} while(vida < 3 && !fl);
		if (fl == true) {
			System.out.println("Adivinaste!!!!! :)");
			if (vida == 1)
				System.out.println("Ganaste $100");
			if (vida == 2)
				System.out.println("Ganaste $50");
			if (vida == 3)
				System.out.println("Ganaste $20");
		}
		else
			System.out.println("Uppps, perdiste... :c ");
		}

}