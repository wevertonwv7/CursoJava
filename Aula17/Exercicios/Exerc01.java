package Aula17.Exercicios;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int valor = 0;

        while (valor < 10) {

            System.out.println("Digite um valor entre 0 e 10:");

             valor = scan.nextInt();

             if (valor > 10){

                 System.out.println("Valor inválido");

             } else {
                
                System.out.println("Valor válido");
            }
        }
    }
}
