package javaExample;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		
		String name = k.nextLine();
		String isim = "Ali";
		
		for(int i=0;i<=10;i++) {
			System.out.println("Klavyeden girilen isim: "+ isim);
			System.out.println("Klavyeden girilen isim: "+ name);
			
		}
		String ters ="";
			for(int j=isim.length()-1;j>=0;j--) {
				ters =ters+isim.charAt(j);
				
		}
			System.out.println(ters);
	}

}
