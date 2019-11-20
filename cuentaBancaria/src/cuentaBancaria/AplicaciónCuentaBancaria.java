package cuentaBancaria;

import java.util.Scanner;

public class AplicaciónCuentaBancaria {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombre = "";
		String CCC = "";
		String entidad, oficina, numeroCuenta, digitosControl;
		System.out.println("Pon el nombre del titular");
		nombre = leer.nextLine();
		int opcion = 0;
		CuentaBancaria cb1;
		do {
			System.out.println("Pon la entidad del codigo de cuenta");
			entidad = leer.nextLine();
			System.out.println("Pon la oficina del codigo de cuenta");
			oficina = leer.nextLine();
			System.out.println("Pon los dígitos de control del codigo de cuenta");
			digitosControl = leer.nextLine();
			System.out.println("Pon el numero de cuenta del codigo de cuenta");
			numeroCuenta = leer.nextLine();
			CCC = entidad + "-" + oficina + "-" + digitosControl + "-" + numeroCuenta;
			cb1 = new CuentaBancaria(nombre, CCC);
		} while (cb1.comprobarCCC() == false);

		do {
			opcion = Menú.pintaMenu();
			
			switch (opcion) {
			case 1:
				System.out.println(cb1.getCCC());
				break;
			case 2:
				System.out.println(cb1.getNombre());
				break;
			case 3:
				System.out.println(entidad);
				break;
			case 4:
				System.out.println(oficina);
				break;
			case 5:
				System.out.println(numeroCuenta);
				break;
			case 6:
				System.out.println(digitosControl);
				break;
			case 7:
				System.out.println("Pon el dinero que quieres ingresar");
				double dineroIngresado = leer.nextDouble();
				cb1.ingresarSaldo(dineroIngresado);
				break;
			case 8:
				System.out.println("Pon la cantidad de dinero retirado");
				double dineroRetirado = leer.nextDouble();
				cb1.retirarDinero(dineroRetirado);
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
		} while (opcion != 10);
	}
}
