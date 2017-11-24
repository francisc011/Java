
package primeiros.pontos;

import java.util.Scanner;

public class PrimeirosPontos {
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        
        int soma=0;
        int num;
        System.out.print("Qual o número a introduzir?");
        num = l.nextInt();
        for (int I=1 ; I<=num ; I++){
          soma +=I;
       
        }
        System.out.println("O total é "+soma);
    }
    
}
