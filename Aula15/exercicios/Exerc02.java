package Aula15.exercicios;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("digite um valor");

        int valor = scan.nextInt();

        if(valor > 0 ){
            System.out.println(" Valor positivo");
        } else if( valor < 0){
            System.out.println("Valor negativo");
        } else {
            System.out.println(" valor igual a 0");
        }
        
    }
}
