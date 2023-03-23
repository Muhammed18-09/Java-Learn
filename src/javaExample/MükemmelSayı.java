package javaExample;

import java.util.Scanner;

public class MükemmelSayı {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int sayı = k.nextInt();
		int top = 0;
		for(int i=1;i<sayı;i++) {
			if(sayı%i==0) {
				top+=i;
						
			}
			
			
		}
		if(top==sayı) {
			System.out.println("Mükemmel Sayıdır: "+ sayı);
		}
		else {
			System.out.println("Mükemmel Sayı Değildir");
		}
}
}
