package javaExample;

import java.util.Scanner;

public class Asal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k= new Scanner(System.in);
		int asal = k.nextInt();
		
		for(int i=2;i<asal;i++) {
			if(asal%i==0) {
				System.out.println("Asal Sayı Değildir");
				
			}
			else {
				System.out.println("Asal Sayıdır");
			}
			}
		}

	}

