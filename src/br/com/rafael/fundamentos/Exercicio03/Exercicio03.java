package br.com.rafael.fundamentos.Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de área de um retângulo!");

        System.out.println("Qual é o tamanho da base?");

        double base = scanner.nextDouble();

        System.out.println("Qual é o tamanho da alturade?");

        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("O valor da área é: " + area);

        scanner.close();
    }
}
