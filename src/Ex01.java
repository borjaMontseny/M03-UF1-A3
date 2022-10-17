import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escriu un programa que demani 2 números i digui si els dos són parells, o un
		 * o els dos són senars.
		 */

		System.out.print("Introdueix valor A: ");
		Scanner sc = new Scanner(System.in);
		int valorA = sc.nextInt();

		System.out.print("Introdueix el valor B: ");
		int valorB = sc.nextInt();
		sc.close();

		if ((valorA % 2 == 0) && (valorB % 2 == 0)) {
			System.out.println("Els dos són parells");

		} else if ((valorA % 2 != 0) && (valorB % 2 != 0)) {
			System.out.println("Els dos són senars");

		} else if ((valorA % 2 != 0) || (valorB % 2 != 0)) {
			System.out.println("Un dels dos és senar");

		} else {
			System.out.println("Cap dels dos són parells o senars a la vegada");
		}

	}

}
