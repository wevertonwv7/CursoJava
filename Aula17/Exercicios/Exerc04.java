package Aula17.Exercicios;

public class Exerc04 {
    public static void main(String[] args) {
        
        double paisA = 80.000;
        double paisB = 200.000;
        int ano = 2023;
        
        for(;paisA < paisB;ano++){

            paisA += paisA * 0.03;
            paisB += paisB *0.015;

            String paisAFormatado = String.format("%.3f", paisA);
            String paisBFormatado = String.format("%.3f", paisB);

            System.out.println("Em "+ ano+" o pais A tinha "+ paisAFormatado +" habitantes e o pais B tinha "+paisBFormatado+ " habitantes");
        }

        String paisAFormatado = String.format("%.3f", paisA);
        String paisBFormatado = String.format("%.3f", paisB);
        
        System.out.println("Em "+ ano+" o pais A tinha "+ paisAFormatado+" habitantes e o pais B tinha "+paisBFormatado+ " habitantes");
        }

    }