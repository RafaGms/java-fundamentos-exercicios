package br.com.rafael.fundamentos.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de área!");
        
        System.out.println("Qual é o tamanho do lado do quadrado?");

        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("O valor da área é: " + area);

        scanner.close();
    }

}
