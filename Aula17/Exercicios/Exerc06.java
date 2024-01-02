package Aula17.Exercicios;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int numMaior;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        numMaior = num1;

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        if (num2 > numMaior)
            numMaior = num2;

        System.out.println("Digite o terceiro número: ");
        num3 = scan.nextInt();
        if (num3 > numMaior)
            numMaior = num3;

        System.out.println("Digite o quarto número: ");
        num4 = scan.nextInt();
        if (num4 > numMaior)
            numMaior = num4;

        System.out.println("Digite o quinto número: ");
        num5 = scan.nextInt();
        if (num5 > numMaior)
            numMaior = num5;

        System.out.println("O Maior número digitado foi: "+ numMaior);


    }
}
