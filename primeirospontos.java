package primeirospontos;

import java.util.Scanner;

public class primeirospontos {
    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        
        int soma=0;
        int num;
        System.out.print("Qual o n�mero a introduzir?");
        num = l.nextInt();
        for (int I=1 ; I<=num ; I++){
          soma +=I;
       
        }
        System.out.println("O total � "+soma);
    }
    
}