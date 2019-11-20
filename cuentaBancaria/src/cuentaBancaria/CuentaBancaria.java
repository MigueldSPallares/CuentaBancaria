package cuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {

	private String nombre;
	private String ccc;
	private double saldo = 0;
	
	//Aquí se crea la clase CuentaBancaria
	public CuentaBancaria(String nombre, String CCC) {
		this.nombre = nombre;
		this.ccc = CCC;
	}
	//Este método muestra el nombre del titular del objeto
	public String getNombre() {
		return nombre;
	}
	//Este método muestra el CCC del objeto
	public String getCCC() {
		return ccc;
	}
	//Este método muestra el saldo del objeto
	public double getSaldo() {
		return this.saldo;
	}
	//Este método permite realizar un ingreso
	public void ingresarSaldo(double dineroIngresado) {

	
		if(dineroIngresado<0) {
			System.out.println("No puedes poner un número negativo");
		}else {
			saldo += dineroIngresado;
		}
	}
	//Este método permite retirar efectivo del saldo
	public void retirarDinero(double dineroRetirado) {
		if(dineroRetirado<0) {
			System.out.println("No puedes poner un número negativo");
		}else {
			if(saldo<dineroRetirado) {
				System.out.println("No tienes suficiente saldo para retiralo");
			}else {
				saldo -= dineroRetirado;
			}
		}
	}
	//Este método permite saber si el CCC es válido o no
	public boolean comprobarCCC() {
		int[] vCantidadDigitos = new int[4];
		int[] digitoControlCifra = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
		int digito1, digito2; 
		int suma1 = 0;
		int suma2 = 0;
		int j = 0;
		for(int i = 0; i<ccc.length(); i++) {
			if(ccc.substring(i, i+1).equalsIgnoreCase("-")) {
				j++;
			}else {
				vCantidadDigitos[j]++;
			}
		}
		if((vCantidadDigitos[0] == 4) && (vCantidadDigitos[1] == 4) && (vCantidadDigitos[2] == 2) && (vCantidadDigitos[3] == 10)) {
			suma1 = (Integer.valueOf(ccc.substring(0, 1))) * 4; 
			suma1 += (Integer.valueOf(ccc.substring(1, 2))) * 8;
			suma1 += (Integer.valueOf(ccc.substring(2, 3))) * 5;
			suma1 += (Integer.valueOf(ccc.substring(3, 4))) * 10;
			suma1 += (Integer.valueOf(ccc.substring(5, 6))) * 9; 
			suma1 += (Integer.valueOf(ccc.substring(6, 7))) * 7;
			suma1 += (Integer.valueOf(ccc.substring(7, 8))) * 3; 
			suma1 += (Integer.valueOf(ccc.substring(8, 9))) * 6;
			
			if((11 - (suma1%11)) == 10) {
				digito1 = 1;
			}else {
				if((11-(suma1%11)) == 11) {
					digito1 = 0;
				}else {
					digito1 = 11-(suma1%11);
				}
			}
			suma2 = (Integer.valueOf(ccc.substring(13, 14))) * 1;
			suma2 += (Integer.valueOf(ccc.substring(14, 15))) * 2;
			suma2 += (Integer.valueOf(ccc.substring(15, 16))) * 4;
			suma2 += (Integer.valueOf(ccc.substring(16, 17))) * 8;
			suma2 += (Integer.valueOf(ccc.substring(17, 18))) * 5;
			suma2 += (Integer.valueOf(ccc.substring(18, 19))) * 10;
			suma2 += (Integer.valueOf(ccc.substring(19, 20))) * 9;
			suma2 += (Integer.valueOf(ccc.substring(20, 21))) * 7;
			suma2 += (Integer.valueOf(ccc.substring(21, 22))) * 3;
			suma2 += (Integer.valueOf(ccc.substring(22, 23))) * 6;
			
			if((11 - (suma2%11)) == 10) {
				digito2 = 1;
			}else {
				if((11-(suma2%11)) == 11) {
					digito2 = 0;
				}else {
					digito2 = 11-(suma2%11);
				}
			}
			if(Integer.valueOf(ccc.substring(10, 11)) == digito1 && (Integer.valueOf(ccc.substring(11, 12)) == digito2)) {
				System.out.println("El código es válido");
				return true;
			}else {
				System.out.println("El código no es válido");
				return false;
			}
		}else {
			System.out.println("El código no es válido");
			return false;
		}
	}
}
