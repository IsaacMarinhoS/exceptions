package com.exceptions.exceptions;

import java.util.Scanner;

class DivisorZeroException extends Exception {
    public DivisorZeroException(String message) {
        super(message);
    }
}

class OpcaoInvalidaException extends Exception {
    public OpcaoInvalidaException(String message) {
        super(message);
    }
}

class IndexInvalidoException extends Exception {
    public IndexInvalidoException(String message) {
        super(message);
    }
}

public class ex4 {

    
    
    public class ProgramaCompleto {
    
        public static double dividir(double numerador, double denominador) throws DivisorZeroException {
            if (denominador == 0) {
                throw new DivisorZeroException("O divisor não pode ser zero.");
            }
            return numerador / denominador;
        }
    
        public static void listarNomes() {
            Scanner scanner = new Scanner(System.in);
            String[] nomes = {"Lucas", "Enzo", "Eloisa"};
            
            System.out.println("Escolha um nome:");
            for (int i = 0; i < nomes.length; i++) {
                System.out.println((i + 1) + " - " + nomes[i]);
            }
            System.out.print("Digite o índice do nome desejado: ");
            
            if (scanner.hasNextInt()) {
                int index = scanner.nextInt() - 1;
                try {
                    if (index < 0 || index >= nomes.length) {
                        throw new IndexInvalidoException("Índice inválido. Escolha um índice entre 1 e " + nomes.length + ".");
                    }
                    System.out.println("Você escolheu: " + nomes[index]);
                } catch (IndexInvalidoException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.next();
            }
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao = 0;
            
            while (true) {
                System.out.println("Menu Principal:");
                System.out.println("1 - Realizar Divisão");
                System.out.println("2 - Listar Nomes");
                System.out.println("3 - Sair");
                System.out.print("Escolha uma opção: ");
                
                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    try {
                        if (opcao < 1 || opcao > 3) {
                            throw new OpcaoInvalidaException("Opção inválida. Escolha um número entre 1 e 3.");
                        }
                        
                        switch (opcao) {
                            case 1:
                                System.out.print("Digite o numerador: ");
                                double numerador = scanner.nextDouble();
                                
                                System.out.print("Digite o denominador: ");
                                double denominador = scanner.nextDouble();
                                
                                try {
                                    double resultado = dividir(numerador, denominador);
                                    System.out.println("Resultado: " + resultado);
                                } catch (DivisorZeroException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 2:
                                listarNomes();
                                break;
                            case 3:
                                System.out.println("Saindo...");
                                scanner.close();
                                return;
                        }
                    } catch (OpcaoInvalidaException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();
                }
            }
        }
    }

}
