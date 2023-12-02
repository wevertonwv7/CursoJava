import java.util.Scanner;

public class IfElse{

public static void main (String[] Args){
    Scanner scan = new Scanner(System.in);
    
    // System.out.println("Entre com a sua idade");

    // int idade = scan.nextInt();

    // if(idade >= 18){
    //     System.out.println("Você é maior de idade");
    // } else { 
    //     System.out.println("Não é maior de idade");
    // }
    
    System.out.println("Entre com o valor do produto");

    Double valorProduto = scan.nextDouble();

    if (valorProduto<=10){
   
        System.out.println("Muito barato, pode comprar");
   
    } else 
        if (valorProduto > 10 && valorProduto < 15 ) {

        System.out.println("Você pode pedir um desconto");

    } else 
        if ( valorProduto >= 15 && valorProduto < 17){
        
            System.out.println("Pode pesquisar mais");
    } else {

        System.out.println("Muito caro");

    }

   }
  
}