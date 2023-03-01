package br.com.dio;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        double soma = soma(a,b);
        double multiplicacao = multiplicacao(a,b);
        double divisao = divisao(a,b);
        double subtracao = subtracao(a,b);

        System.out.println("Resultado da soma =  " + soma);
        System.out.println("Resultado da subtracao = " + subtracao);
        System.out.println("Resultado da divisao = " + divisao);
        System.out.println("Resultado da multiplicacao = " + multiplicacao);

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