package com.exceptions.exceptions;

import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o dividendo: ");
        double dividendo = scanner.nextDouble();
    
        System.out.println("Digite o divisor: ");
        double divisor = scanner.nextDouble();
    
        try {
            double resultado = dividir(dividendo, divisor);
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possivel dividir por 0.");
        }
    }
    
    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return dividendo / divisor;
    }
}

