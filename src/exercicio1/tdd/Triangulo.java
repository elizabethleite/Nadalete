package exercicio1.tdd;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva o comprimento do primeiro lado: ");
		Integer lado1 = scanner.nextInt();
		
		System.out.println("Escreva o comprimento do segundo lado: ");
		Integer lado2 = scanner.nextInt();
		
		System.out.println("Escreva o comprimento do terceiro lado: ");
		Integer lado3 = scanner.nextInt();
		
		String tipoTriangulo = classificarTriangulo(lado1,lado2,lado3);
		
		System.out.println("O triângulo é " + tipoTriangulo);
		
		scanner.close();
	}
	
	public static String classificarTriangulo(Integer lado1,Integer lado2,Integer lado3) {
		if(lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ||
				lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2 ||
		        lado1 <= Math.abs(lado2 - lado3) || lado2 <= Math.abs(lado1 - lado3) || lado3 <= Math.abs(lado1 - lado2)){
			return "não é um triângulo";
		}
		if(lado1 == lado2 && lado2 == lado3) {
			return "equilátero";
		}
		if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "isósceles";
		}
		return "escaleno";
	}
}
 