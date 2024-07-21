package com.poo.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    public static void calculo() {
        boolean repete = true;
        int dividendo;
        int divisor;
        double resultado = 0;

        while (repete) {

            try {

                System.out.print("Digite um dividendo inteiro: ");
                Scanner sc = new Scanner(System.in);
                dividendo = sc.nextInt();

                System.out.print("Digite um divisor inteiro: ");
                divisor = sc.nextInt();
                resultado = dividendo / divisor;
                System.out.println(resultado);
                repete = false;

            } catch (InputMismatchException | ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente um novo valor.");
                System.out.println("Observação: Só é aceito números e o divisor não pode ser 0 (Zero).");
            }
        }
    }
}
