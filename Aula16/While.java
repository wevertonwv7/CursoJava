package Aula16;

public class While {
    
    public static void main(String[] args) {
        int count = 1;
        int max = 10;

        System.out.println("Contando até "+max);

        while (count <= max) {
            System.out.println(count);
            count++;
            
        }

        do {
            count++;
            System.out.println(count);
        }while(count<10);
    }
}
