package javaExample;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double array[] = {1.2,1.3,4.3,7.65};
		double say=0;
		double enb=array[0];
		for(double d : array) {
			say+=d;		
		}
		for (double d : array) {	

			if(enb>d) {
				enb=enb;
				
			}
			else {
			enb=d;
		}
		
	}
		System.out.println("Dizideki En Büyük sayı: "+enb);
	}
}
