package Aula15.exercicios;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número");

        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número");

        int num2 = scan.nextInt();

        if(num1>num2){
            System.out.println(num1);
        } else if (num2>num1) {
            System.out.println(num2);
            
        } else {
            System.out.println("Os número são iguais");
        }
    }
}
