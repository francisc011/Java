package avaliaçao_final;

import java.util.Scanner;

public class avaliaçao_final {

	public static void main(String[] args) {
		
		Scanner Ler = new Scanner(System.in);
		double num1,num2,total;
		String Nome;
		
		System.out.println("digite o seu nome");
		Nome = Ler.next();		
		System.out.println("digite o valor dominio cognitivo");
		num1 = Ler.nextInt();
		System.out.println("digite o numero de atitudes");
		num2 = Ler.nextInt();
		
		total = (num1 * 0.6) + (num2 * 0.4);
		if (total<10)
			System.out.print(Nome + " tem " +total + " valores, reprovou");
		else
			System.out.print(Nome + " tem " +total + " valores, passou");
	}

}
