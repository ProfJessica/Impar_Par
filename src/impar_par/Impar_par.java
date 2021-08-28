package impar_par;


public class Impar_par {
    
    
    static void parOuImpar(int y) {
        if(y % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }
//Implemente em Java, um código que leia um número inteiro e retorne
//se este o valor lido é par ou ímpar. Para definir um valor como par ou
//ímpar utilizaremos a comparação do resto da divisão por 2, em que:
  
    
    //10/2 = 5 --> 0
    //10/3 = 3.333 -> 1
    //! == NÃO
    // != NÃO É IGUAL A
    
    // &&
    // ||
    // == IGUAL
    // != NÃO IGUAL
    // % RESTO DE UMA DIVISÃO
    
    public static void main(String[] args) {
        
        int n = 10;
        int n2 = 9;
        //Par = (numero % 2 == 0). Ímpar = (numero % 2 != 0).
        // condição n%2
        
        // se ( n % 2 == 0) { Imprimir: O número é par}
        // if ( n % 2 == 0) { Imprimir: O número é par}
        // else { Imprimir: O número é impar}
        
        parOuImpar(n2);
        
    }
    
}
