package tarea3;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		int num, um, c, d, u;
		Scanner scan = new Scanner (System.in);
		System.out.print("Introduzca un número entre 0 y 9999: ");
		num=scan.nextInt();
		 u = num % 10;
		 num = num / 10;
		 d = num % 10;
		 num = num / 10;
		 c = num % 10;
		 num = num / 10;
		 um=num;
		 num = 1000*u + 100*d + 10*c + um;
		 System.out.println (num);

	}

}
