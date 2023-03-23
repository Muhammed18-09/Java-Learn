package javaExample;

import java.util.Scanner;

public class ArkadasSayilar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k= new Scanner(System.in);
		
		int sayi1 = k.nextInt();
		int sayi2 = k.nextInt();
		int top1 = 0;
		int top2 = 0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				top1+=i;
			}
		}
		for(int j=1;j<sayi2;j++) {
			if(sayi2%j==0) {
				top2+=j;
			}
		}
		if(sayi1==top2 && sayi2==top1) {
			System.out.println("Girdiğiniz sayılar Arkadaş Sayılardır");
		}
		else {
			System.out.println("Girilen sayılar Arkadaş Sayılar değildir");
		}
		

	}

}
