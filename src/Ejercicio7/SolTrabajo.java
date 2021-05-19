package Ejercicio7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SolTrabajo {

	public static void main(String[] args) {
	
		/*
		 * Se recibe una solicitud de ingreso a un trabajo, en respuesta a un aviso
		 * publicado en una p�gina web.
		 * 
		 * 
		 * En dicha solicitud se especifica: - edad en a�os del asp�rante, - experiencia
		 * en el oficio, tambi�n expresada en a�os, - remuneraci�n percibida
		 * 
		 * 
		 * La empresa usa los siguientes criterios de selecci�n:
		 * 
		 * - la edad debe estar entre 18 y 35 a�os, inclusive en ambos extremos del
		 * intervalo, sino ser� rechazado.
		 * 
		 * - la experiencia menor a los 3 a�os debe estimar una remuneraci�n debajo de
		 * los $50.000 mensuales, sino ser� rechazado.
		 * 
		 * - si la edad del solicitante es mayor a los 32 a�os, deber� tener como m�nimo
		 * 6 a�os de experiencia;
		 * 
		 * -si la experiencia es menor a los 6 a�os y mayor a 3 a�os, se lo tomar� en
		 * forma condicional.
		 * 
		 * -En cualquier otro caso se lo rechazar�.
		 * 
		 * 
		 * Realizar un programa que permita decidir a partir de los datos del aspirante
		 * si fue seleccionado definitivamente, en forma condicional, o rechazado.
		 * Imprimir un mensaje que indique lo ocurrido.
		 */

		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" dd-MM-yyyy");
		sdf.format(fecha);
		String printFecha = sdf.format(fecha);

		Scanner scan = new Scanner(System.in);

		System.out.println("Fecha de solicitud: " + fecha);
		System.out.println("*************************************************");

		System.out.print("Ingrese Nombre y raz�n social del solicitante: ");
		String razonsocial = scan.nextLine();
		System.out.print("Puesto a solicitar: ");
		String puesto = scan.nextLine();

		int edad, a�osExp, remP;

		System.out.print("A�os de experiencia en el puesto: ");
		a�osExp = scan.nextInt();
		System.out.print("Edad del solicitante: ");
		edad = scan.nextInt();
		System.out.print("Remuneraci�n pretendida del solicitante: ");
		remP = scan.nextInt();

		if (edad < 18 || edad > 35) {
			System.out.print("Sus " + edad + " a�os no corresponden con nuestra busqueda");
		} 
		
		else if (a�osExp < 3 && remP > 50000) {
			System.out.println("La remuneracion pretendida para tres o menos a�os de exp.\ndebe ser menor a $50.000");
		}

		else if (edad > 32 && (a�osExp < 6 && a�osExp > 3)) {
			System.out.println("ACEPTADO de forma condicional");
			System.out.println("**************************************************");
			resultado(razonsocial, puesto, edad, a�osExp, remP);
		}
			
		else {
			resultado(razonsocial, puesto, edad, a�osExp, remP);
		}

	}

	private static void resultado(String razonsocial, String puesto, int edad, int a�osExp, int remP) {
		System.out.println("");
		System.out.println("Cumple con todos los requisitos de b�squeda");
		System.out.println("*****************************************************");
		System.out.println("Nombre y raz�n social: " + razonsocial);
		System.out.println("Puesto: " + puesto);
		System.out.println("Experiencia en el puesto: " + a�osExp + " a�os");
		System.out.println("Edad: " + edad + " a�os");
		System.out.println("Remuneraci�n percibida: $" + remP);
	}

}
