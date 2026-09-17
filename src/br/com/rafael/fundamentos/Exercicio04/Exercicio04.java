package br.com.rafael.fundamentos.Exercicio04;

import java.util.Scanner;

public class Exercicio04 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name1 = "";
        String name2 = "";

        int age1 = 0;
        int age2 = 0;
        int difference = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do usuario " + (i + 1) + "°");

            if (i == 0) {
                name1 = scanner.next();
                System.out.println("Digite a idade do usuario " + (i + 1) + ":");
                age1 = scanner.nextInt();
            } else {
                name2 = scanner.next();
                System.out.println("Digite a idade do usuario " + (i + 1) + ":");
                age2 = scanner.nextInt();
            }
        }

        if (age1 <= age2) {
            difference = age2 - age1;
            System.out.println("A diferença de idade é de " + difference + " anos:");
            System.out.println("Sendo que o user " + name2 + " é mais velho");
        } else {
            difference = age1 - age2;
            System.out.println("A diferença de idade é de " + difference + " anos:");
            System.out.println("Sendo que o user" + name1 + " é mais velho");
        }


        scanner.close();
    }
}
