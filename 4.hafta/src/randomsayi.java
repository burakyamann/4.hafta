import java.util.Random;
import java.util.Scanner;

public class randomsayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("sayi gir");
		Scanner giris = new Scanner (System.in);
		int sayi;
		int adet = giris.nextInt();
		 Random rnd = new Random();
		 
		 int sayilar[] = new int[adet];
		 
		 for(int i  = 0 ; i< adet; i++) {
			 sayi = rnd.nextInt(100);
			 sayilar[i] = sayi;

		 }
         for (int i = 0; i < sayilar.length; i++) {
			int hucre = sayilar[i];
			System.out.println(hucre);
		}
         for (int i = 0; i < sayilar.length; i++) {
	  
        	 
       
		}
		
	}

}
