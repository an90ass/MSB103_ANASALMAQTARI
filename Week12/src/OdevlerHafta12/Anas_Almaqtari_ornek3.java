package OdevlerHafta12;
import java.util.Scanner;
public class Anas_Almaqtari_ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Eleman sayisi giriniz : ");
		int elemenSayisi = sc.nextInt();
		    int[] dizi  = new int[elemenSayisi];
		    for(int index = 0; index<dizi.length; index++) {
		    	System.out.println("Dizinin" + index + " indexl' elemanini giriniz ");
		    	dizi [index] = sc.nextInt();
		    	
		    }
		double ortalama = ortalama(dizi);
		System.out.println(ortalama);
			} 

		public static double ortalama(int[] dizi) {
			double avg= 0.0;
			int total = 0;
			for (int index=0;index < dizi.length; index++) {
				total += dizi[index];
			}
			
			avg = (double)total/dizi.length;
					return avg ;
			
			}
			
		}
