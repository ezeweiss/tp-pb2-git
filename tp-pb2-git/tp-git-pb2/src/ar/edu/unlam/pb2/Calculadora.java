package ar.edu.unlam.pb2;

import java.util.Scanner;

public class Calculadora {
		
	 private static Scanner teclado;
	 static Integer resultado2=0;

	 public static Integer multiplicar(Integer a2, Integer b2) {
		 return resultado2 = a2 * b2;
	 }


	 public static Integer dividir(Integer a2, Integer b2) {
		 return resultado2 = a2 / b2;
	 }


public static void main(String[] args) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		 Integer a=0;
		 Integer b=0;
		 Integer opcion;
		 Integer resultado = 0;
		
		
		
		do{
		System.out.println("Ingrese su operaci�n \n 1 para multiplicar \n 2 para restar \n 3 para sumar \n 4 para dividir");
		opcion = teclado.nextInt();
		}while(opcion < 1 && opcion > 4);
			
			
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		
		switch(opcion) {
		
		case 1: 
			multiplicar(a,b);
			break;
			
		case 2: 
			resultado = a - b;
			break;
			
		case 3: 
			resultado = a + b;
			break;
			
		case 4: 
			dividir(a,b);
			break;
		
		}
		
		System.out.println("El resultado es " + resultado2.toString());
		}

}


