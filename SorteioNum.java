package l2_atv_sorteio;

import java.util.Random;
import java.util.Scanner;

public class SorteioNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int entrada = -1;
		int tentativas = 0;
	
		Random Sort = new Random();
		int num = Sort.nextInt(51 - 1);
//		System.out.println("Número Gerado: " + num);
		
		
		while (entrada != num ) {
			System.out.println("Adivinhe o numero sorteado de 0 à 50 ...");		
			entrada = scan.nextInt();
			
			if (entrada > num || entrada < num) {
				int result = Math.abs(entrada-num);
				
				System.out.println("Errou por "+result+" numeros");
				tentativas ++;
			}else {
				System.out.println("*****Parabéns vc acertou em "+tentativas+" Tentativas!!!*** \nPara apostar seu salário e acabar com sua vida Clique AQUI!");
			}
		}scan.close();
	}

}
