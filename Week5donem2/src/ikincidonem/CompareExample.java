package ikincidonem;

public class CompareExample {

	public static void main(String[] args) {

		Integer x = 10;
		Integer y = 42 ;
		Integer z = 10;
		System.out.println(x.compareTo(y));
		System.out.println(x.compareTo(z));
		System.out.println(y.compareTo(x));
		
		/* cikis :
		   -1
            0
            1
*/
		 
	}

}
