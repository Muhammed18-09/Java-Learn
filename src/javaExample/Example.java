package javaExample;

public class Example {

	public static void main(String[] args) {
	int sayı1 = 645;
	int sayı2 = 24;
	int sayı3 = 25;
	int enb = sayı1;
	
	if(enb>sayı2 && enb>sayı3) {
		enb = enb;
	}
	else if(enb>sayı2 && enb<sayı3) {
		enb = sayı3;
	}
	else if(enb< sayı2 && sayı2>sayı3) {
		enb = sayı2;
	}
	else if(enb< sayı2 && sayı2<sayı3) {
		enb = sayı3;
	}
	System.out.println("en büyük sayı: "+ enb);
	
	
	
	
	}

}
