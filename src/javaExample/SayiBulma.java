package javaExample;

public class SayiBulma {
	public static void main(String[] args) {
		
		int sayilar[] = {1,2,4,6,8,9};
		int aranacak = 6;
		boolean varMi = true;
		
		for (int sayi: sayilar) { 
			
			if(sayi==aranacak) {
				varMi=true;
				break;		
			}
			}
		if(varMi) {
			System.out.println("Sayı Mevcuttur");	
		}
		else {
			System.out.println("Sayı mevcut değildir");
		}
		}
}
