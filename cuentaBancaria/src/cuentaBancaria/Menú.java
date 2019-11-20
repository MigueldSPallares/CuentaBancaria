package cuentaBancaria;

import java.util.Scanner;

public class Menú {

	public static int pintaMenu() {
		int opc = 0;
		Scanner leer = new Scanner(System.in);
		do {
			System.out.println("1. Ver el número de cuenta completo");
			System.out.println("2. Ver el titular de la cuenta");
			System.out.println("3. Ver el código de la entidad");
			System.out.println("4. Ver el código de la oficina");
			System.out.println("5. Ver el número de la cuenta");
			System.out.println("6. Ver los dígitos de control de la cuenta");
			System.out.println("7. Realizar un ingreso");
			System.out.println("8. Retirar efectivo");
			System.out.println("9. Consultar saldo");
			System.out.println("10. Salir de la aplicación");
			opc = leer.nextInt();
		}while(opc<1 || opc>10);
		return opc;
	}
}
