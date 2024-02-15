package Aula20.Exercicios;

import java.util.Random;

public class Exerc01 {
    public static void main(String[] args) {

        
        int[][] M = new int[4][4];

        for(int i=0; i< M.length; i++){
            for(int j=0; j<M[i].length; j++){
                Random randon = new Random();
                M[i][j] = randon.nextInt(10);
            }
        }

        int maiorNumero = 0;
        int linha = 0;
        int coluna = 0;

        for(int i=0; i< M.length; i++){
            for(int j=0; j<M[i].length; j++){

                if(M[i][j] > maiorNumero){
                    maiorNumero = M[i][j];
                    linha = i;
                    coluna = j;
                }
            }

        }

        System.out.println("O maior número é o "+ maiorNumero + " E ela está na linha " + linha + " coluna "+ coluna);
    }
}
