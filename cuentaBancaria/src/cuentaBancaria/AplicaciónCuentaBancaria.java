package cuentaBancaria;

import java.util.Scanner;

public class AplicaciónCuentaBancaria {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombre = "";
		String CCC = "";
		System.out.println("Pon el nombre del titular");
		nombre = leer.nextLine();
		int opcion = 0;
		Menú menu = new Menú();
		CuentaBancaria cb1 = new CuentaBancaria(nombre, CCC);
		do {
			opcion = menu.pintaMenu();
			switch (opcion) {
			case 1:
				System.out.println(cb1.getCCC());
				break;
			case 2:
				System.out.println(cb1.getNombre());
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				cb1.ingresarSaldo();
				break;
			case 8:
				cb1.retirarDinero();
				break;
			case 9:
				System.out.println(cb1.getSaldo());
				break;
			case 10:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		}while(opcion != 10);
	}

}
