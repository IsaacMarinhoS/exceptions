package com.exceptions.exceptions;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        String[] nomes = {"Lucas", "Enzo", "Eloisa"};

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Listar Nomes");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Escolha um nome:");
                        for (int i = 0; i < nomes.length; i++) {
                            System.out.println((i + 1) + " - " + nomes[i]);
                        }
                        System.out.print("Digite o nome desejado: ");
                        
                        if (scanner.hasNextInt()) {
                            int index = scanner.nextInt() - 1; 
                            if (index >= 0 && index < nomes.length) {
                                System.out.println("Você escolheu: " + nomes[index]);
                            } else {
                                System.out.println(" Tente novamente.");
                            }
                        } else {
                            System.out.println("Entrada inválida. Digite um número.");
                            scanner.next();
                        }
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
                        System.out.println("Opção inválida. Digite um número entre 1 e 4.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        }
    }
}

