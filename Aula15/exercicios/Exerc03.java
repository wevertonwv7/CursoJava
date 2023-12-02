package Aula15.exercicios;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o genêro (M ou F):");

        String letra = scan.nextLine();

        if (letra.equals("M")) {
            System.out.println("M - Masculino");
            
        } else if(letra.equals("F")){
            System.out.println("F - Feminino");
        } else {
            System.out.println(" letra inválida");
        }
    }
}
