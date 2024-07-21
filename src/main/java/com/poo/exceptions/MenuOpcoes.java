package com.poo.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOpcoes {

    public static void menu() {
        boolean repete = true;
        int[] menu1 = new int[3];
        menu1[0] = 1;
        menu1[1] = 2;
        menu1[2] = 3;
        int opcaoSubtraida;

        while (repete) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("============");
                System.out.println("    Menu     ");
                System.out.println("=============");
                System.out.println(menu1[0] + " - Criar login.");
                System.out.println(menu1[1] + " - Criar senha.");
                System.out.println(menu1[2] + " - Sair.");
                System.out.println("\nDigite uma opção");
                int opcao = sc.nextInt();
                opcaoSubtraida = opcao - 1;
                switch (menu1[opcaoSubtraida]) {
                    case 1:
                        System.out.println("Login criado!");
                        repete = false;
                        break;
                    case 2:
                        System.out.println("Senha criada!");
                        repete = false;
                        break;
                    case 3:
                        System.out.println("Saindo!");
                        repete = false;
                        break;
                    default:
                        continue;
                }
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente digitando de 1 a 3.");
            }

        }
    }

    public static void menu2() {
        boolean repete = true;
        int[] alunos = { 1, 2, 3 };
        int[] menu = { 1, 2, 3 };

        while (repete) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("============");
                System.out.println("    Menu     ");
                System.out.println("=============");
                System.out.println(menu[0] + " - Exibir alunos.");
                System.out.println(menu[1] + " - Criar senha.");
                System.out.println(menu[2] + " - Sair.");
                System.out.println("\nDigite uma opção");

                int opcao = sc.nextInt();
                opcao--;

                switch (menu[opcao]) {
                    case 1:

                        System.out.println(alunos[0] + " - Lucas");
                        System.out.println(alunos[1] + " - Enzo");
                        System.out.println(alunos[2] + " - Eloisa");
                        System.out.println("\nDigite o número para selecionar o aluno: ");
                        int escolherAluno = sc.nextInt();
                        escolherAluno--;
                        
                        if (alunos[escolherAluno] == 1) {

                            System.out.println(alunos[0] + " - Lucas selecionado(a).");
                            repete = false;
                            break;
                            
                        } else if (alunos[escolherAluno] == 2) {

                            System.out.println(alunos[1] + "- Enzo selecionado(a).");
                            repete = false;
                            break;

                        } else if (alunos[escolherAluno] == 3) {

                            System.out.println(alunos[2] + " - Eloisa selecionado(a).");
                            repete = false;
                            break;

                        } else {
                            
                            continue;
                        }
                    case 2:
                        System.out.println("Senha criada!");
                        repete = false;
                        break;
                    case 3:
                        System.out.println("Saindo!");
                        repete = false;
                        break;
                    default:
                        continue;
                }
            }

            catch (ArrayIndexOutOfBoundsException | InputMismatchException  e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente digitando de 1 a 3.");
                //sc.next();
            }
            
        }
    }
}
