package pacote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Doçura_ou_travessura {

	public static void main(String[] args) throws IOException {
		
		System.out.print("Dia das Bruxas");
		System.out.print("Doçura ou travessura?"");
		String docura = "";
		InputStreamReader LerS = new InputStreamReader (System.in);
		BufferedReader GuardaS = new BufferedReader (LerS);
		docura = GuardaS.readLine();
		
		String travessura = "";
		InputStreamReader LerS1 = new InputStreamReader (System.in);
		BufferedReader GuardaS1 = new BufferedReader (LerS1);
		travessura = GuardaS1.readLine();
		
		
	}

}
