package cuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {

	private String nombre;
	private String CCC;
	private double saldo = 0;

	public CuentaBancaria(String nombre, String CCC) {
		this.nombre = nombre;
		this.CCC = CCC;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCCC() {
		return CCC;
	}

	public void setCCC(String CCC) {
		this.CCC = CCC;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresarSaldo() {
		Scanner leer = new Scanner (System.in);
		double dineroIngresado;
		System.out.println("Pon la cantidad de dinero ingresado");
		dineroIngresado = leer.nextInt();
		if(dineroIngresado<0) {
			System.out.println("No puedes poner un número negativo");
		}else {
			saldo = saldo + dineroIngresado;
		}
	}
	public void retirarDinero() {
		Scanner leer = new Scanner (System.in);
		double dineroRetirado;
		System.out.println("Pon la cantidad de dinero retirado");
		dineroRetirado = leer.nextInt();
		if(dineroRetirado<0) {
			System.out.println("No puedes poner un número negativo");
		}else {
			if(saldo<dineroRetirado) {
				System.out.println("No tienes suficiente saldo para retiralo");
			}else {
				saldo = saldo - dineroRetirado;
			}
		}
	}
}
