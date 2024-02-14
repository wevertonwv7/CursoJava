package Aula20;

public class MatrizTriddimencional {

    public static void main(String[] args) {
    
    int[][][] MatrizTriddimencional = new int[3][3][3];

    for(int i=0; i< MatrizTriddimencional.length; i++){
        for(int j=0; j<MatrizTriddimencional[i].length;j++){
            for(int k=0; k<MatrizTriddimencional[i][j].length; k++){
                MatrizTriddimencional[i][j][k] = i + j + k;
            }
        }
    }

    int somaTotal=0;
    int somaImpares =0;
    int somaPares =0;

    for(int i=0; i< MatrizTriddimencional.length; i++){
        for(int j=0; j<MatrizTriddimencional[i].length;j++){
            for(int k=0; k<MatrizTriddimencional[i][j].length; k++){
                somaTotal += MatrizTriddimencional[i][j][k];

                if(MatrizTriddimencional[i][j][k] % 2 == 0){
                    somaPares += MatrizTriddimencional[i][j][k];
                } else{
                    somaImpares += MatrizTriddimencional[i][j][k];
                }
            }
        }
    }

    System.out.println("Valor da soma total " + somaTotal );
    System.out.println("Valor da soma dos pares " + somaPares );
    System.out.println("Valor da soma dos impares " + somaImpares );

}

}