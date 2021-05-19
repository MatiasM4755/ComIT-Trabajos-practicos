package Ejercicio7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SolTrabajo {

	public static void main(String[] args) {
	
		/*
		 * Se recibe una solicitud de ingreso a un trabajo, en respuesta a un aviso
		 * publicado en una página web.
		 * 
		 * 
		 * En dicha solicitud se especifica: - edad en años del aspírante, - experiencia
		 * en el oficio, también expresada en años, - remuneración percibida
		 * 
		 * 
		 * La empresa usa los siguientes criterios de selección:
		 * 
		 * - la edad debe estar entre 18 y 35 años, inclusive en ambos extremos del
		 * intervalo, sino será rechazado.
		 * 
		 * - la experiencia menor a los 3 años debe estimar una remuneración debajo de
		 * los $50.000 mensuales, sino será rechazado.
		 * 
		 * - si la edad del solicitante es mayor a los 32 años, deberá tener como mínimo
		 * 6 años de experiencia;
		 * 
		 * -si la experiencia es menor a los 6 años y mayor a 3 años, se lo tomará en
		 * forma condicional.
		 * 
		 * -En cualquier otro caso se lo rechazará.
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

		System.out.print("Ingrese Nombre y razón social del solicitante: ");
		String razonsocial = scan.nextLine();
		System.out.print("Puesto a solicitar: ");
		String puesto = scan.nextLine();

		int edad, añosExp, remP;

		System.out.print("Años de experiencia en el puesto: ");
		añosExp = scan.nextInt();
		System.out.print("Edad del solicitante: ");
		edad = scan.nextInt();
		System.out.print("Remuneración pretendida del solicitante: ");
		remP = scan.nextInt();

		if (edad < 18 || edad > 35) {
			System.out.print("Sus " + edad + " años no corresponden con nuestra busqueda");
		} 
		
		else if (añosExp < 3 && remP > 50000) {
			System.out.println("La remuneracion pretendida para tres o menos años de exp.\ndebe ser menor a $50.000");
		}

		else if (edad > 32 && (añosExp < 6 && añosExp > 3)) {
			System.out.println("ACEPTADO de forma condicional");
			System.out.println("**************************************************");
			resultado(razonsocial, puesto, edad, añosExp, remP);
		}
			
		else {
			resultado(razonsocial, puesto, edad, añosExp, remP);
		}

	}

	private static void resultado(String razonsocial, String puesto, int edad, int añosExp, int remP) {
		System.out.println("");
		System.out.println("Cumple con todos los requisitos de búsqueda");
		System.out.println("*****************************************************");
		System.out.println("Nombre y razón social: " + razonsocial);
		System.out.println("Puesto: " + puesto);
		System.out.println("Experiencia en el puesto: " + añosExp + " años");
		System.out.println("Edad: " + edad + " años");
		System.out.println("Remuneración percibida: $" + remP);
	}

}
