package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Digite o primeiro número: ");
		a = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		b = scan.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a, b);
		double multiplicacao = multiplicacao(a,b);
		double divsao = divisao(a,b);
		
		System.out.println("A soma dos número é: " + soma);
		System.out.println("A subtracao dos número é: " + subtracao);
		System.out.println("A multiplicação dos número é: " + multiplicacao);
		System.out.println("A divisão dos número é: " + divsao);		
		
		
	}
	public static double soma(double a, double b) {
		return a + b;
	}
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}

}
