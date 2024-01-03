package Aula18;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 

          /* 
          System.out.println("Entre com um númnero inicial");
        int num = scan.nextInt(); 

        System.out.println("Entre com um número limite");
        int max = scan.nextInt();

        for(int i = num; i<= max; i++){

            if(i % 7 == 0){
                System.out.println("O Valor de I é "+ i);
                break;
            }
        }*/


        System.out.println("Entre com um númnero inicial");
        int num = scan.nextInt(); 

        System.out.println("Entre com um número limite");
        int max = scan.nextInt();

        for(int i = num; i<= max; i++){

            if(i % 7 == 0){
                continue;
            }
            System.out.println("O Valor de i é "+ i);
        }
        
    }
    
}
