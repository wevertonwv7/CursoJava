package Aula17;

public class For {
    public static void main(String[] args) {
        for (int i=0;i < 5;i++){

            System.out.println(i);
        }

         for (int i=5;i > 0;i--){

            System.out.println(i);
        }

        for (int i=0, j=10; i < j; i++, j--){
            System.out.println("i = "+ i + " j = "+j );

        }

        int count  = 0;
        for (;count < 10;){
            System.out.println("valor de count:"+ count);
            count +=2;
        }
    }
}
