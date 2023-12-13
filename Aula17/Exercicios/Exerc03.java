package Aula17.Exercicios;

import java.util.Scanner;

public class Exerc03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String genero;
        String estadoCivil;


        do{

        System.out.println("Digite seu nome");
        nome = scan.nextLine();
        
        if(nome.length() < 3){
            System.out.println("ERRO! O nome deve conter pelomenos 3 caracteres.");
        }
            }while(nome.length() < 3);
        
        do{
        System.out.println("Digite sua idade");
        idade =  scan.nextInt();
        if(idade > 150){
            System.out.println("ERRO! idade não pode ser maior que 150");
        } else if (idade < 0){
            System.out.println("ERRO! idade não pode ser menor que 0");
        }
            }while (idade > 150 || idade < 0 );

        do{
        System.out.println("Digite seu salário");
        salario = scan.nextDouble();
        if(salario < 0){
            System.out.println("ERRO! Salário não pode ser menor que zero");
        }
            }while (salario < 0);

        do{
        System.out.println("Informe seu genero (F ou M)");

        genero = scan.nextLine();

        if(!genero.equalsIgnoreCase("M") || !genero.equalsIgnoreCase("F")){
            System.out.println("ERRO! genero inválido. Preencha com M ou F");
        }
            }while (!genero.equalsIgnoreCase("M") || !genero.equalsIgnoreCase("F"));
        
        do{    
        System.out.println("Informe seu estado civil (S, C, V ou D)");
        estadoCivil = scan.nextLine();

        if(!estadoCivil.equalsIgnoreCase("S") || !estadoCivil.equalsIgnoreCase("C") ||
        !estadoCivil.equalsIgnoreCase("V") || !estadoCivil.equalsIgnoreCase("D")){
            System.out.println("Estado civil inválido.");
        }
            }while (!estadoCivil.equalsIgnoreCase("S") || !estadoCivil.equalsIgnoreCase("C") ||
        !estadoCivil.equalsIgnoreCase("V") || !estadoCivil.equalsIgnoreCase("D"));






    }
}
