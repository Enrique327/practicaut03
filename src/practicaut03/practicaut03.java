package practicaut03;

import java.util.Scanner;

public class practicaut03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor introduzca el numero de grados centigrados a convertir en farenheit: ");
		double centigrados = sc.nextDouble();
		
		double farenheit = centigrados * (9/5) +32;
		
		System.out.print("El valor en grados farenheit es de: " + farenheit);
		

	}

}
