package com.exceptions.exceptions;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 2");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Você escolheu a Opção 1.");

                        break;
                    case 2:
                        System.out.println("Você escolheu a Opção 2.");

                        break;
                    case 3:
                        System.out.println("Você escolheu a Opção 3.");

                        break;
                    case 4:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Digite um número entre 1 e 3.");
                        scanner.close();
                        return;
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                return;
            }
        }
    }
}