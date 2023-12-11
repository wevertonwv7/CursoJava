package Aula17.Exercicios;

import java.util.Scanner;

public class Exerc02 {

    public static void main (String[] Args){

        Scanner scan = new Scanner(System.in);

        String nomeUsurio; 
        String senhaUsuario;

        while (true) {

            System.out.println("Digite seu usuário");

            nomeUsurio = scan.nextLine();

            System.out.println("Digite sua senha ");

            senhaUsuario = scan.nextLine();

            if(nomeUsurio.equals(senhaUsuario)){
                System.out.println("A senha não pode ser igual ao nome de usuário");

            }else if(senhaUsuario.equals("") | senhaUsuario.equals(null)){
                System.out.println("A senha não pode ser vazia");
                
            }else{
                System.out.println("Cadastro realizado");
                break;
            }

        }
    }
    
}
