package Proyecto;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		rp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero?");
		vida = sc.nextInt();
		System.out.println("numero ingresado: "+vida);
		for(int i=1; i<=vida; i++)
			rp +=i;
		System.out.println("La suma es: "+rp);

		System.out.println("MULTIPLICACIÓN: "+vida);
		for(int i=1; i<=12; i++)
		{		
			System.out.println(i+" * "+vida+" = "+ i*vida);
		}
	}

}
