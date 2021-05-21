package Ejercicio3;

import java.util.Scanner;

public class Impuesto {

	public static void main(String[] args) {
		
try (//		
		//		Se ingresa la cantidad de patentes de automotor que serán procesadas en un
		//		registro.
		//		
		//		Cada número de patente viene acompañada del valor del modelo del
		//		año correspondiente.
		//		
		//		Se desea calcular el impuesto que debe pagar cada 
		//		dueño de acuerdo a la siguiente tabla:
		//			
		//		.
		//		- si tiene nro de patente menor de 1000000, paga el 5% del valor del modelo.
		//			
		//		- si la patente está entre 1000000 y 2000000 se paga el 10% del valor del
		//		modelo.
		//			
		//		- en cualquier otro caso, abona el 15% del valor del auto.
		//			
		//			
		//		Imprimir el impuesto abonado por cada dueño, el monto total recaudado con
		//		dicho impuesto por el Registro del Automotor, y cual fue el porcentaje de autos
		//		cuya numeración fue superior a 1300000
		//	
		Scanner scan = new Scanner(System.in)) {
			double impuesto = 0;
			double patente = 0;
			double valorMod = 0;
			double cantidadPatentes = 0;
			double montoTotal = 0;
			double cont = 0;
			
			System.out.println("Ingresar cantidad de patentes a procesar: ");
			cantidadPatentes = scan.nextInt();
			for (int i = 0; i < cantidadPatentes; i++) {
				System.out.println("Ingresar patente: ");
				patente = scan.nextInt();
				System.out.println("Ingresar valor fiscal del vehiculo: ");
				valorMod = scan.nextDouble();
				
				if (patente < 1000000) {
					impuesto = ((valorMod * 5) / 100);
					
				}else if(patente >= 1000000 && patente <= 2000000){
						impuesto = ((valorMod * 10) / 100);
						}else {
							impuesto = ((valorMod * 15) / 100);
						}
				if(patente > 1300) {
					cont++;
				}
				
				montoTotal = montoTotal + impuesto;
			}
			
			System.out.println("El impuesto a pagar por el vehiculo con patente" + patente +" es de $"+ impuesto + "\n");
			System.out.println("El monto total recaudado por el impuesto es de $" + montoTotal + "\n");
			System.out.println("El porcentaje de autos con patentes mayores a 1300 fue de " + (int)((cont / cantidadPatentes ) * 100) + "%");
		}
		

	}

}
