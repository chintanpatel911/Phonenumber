
public class Phone {
	public static void main (String[] args) {

		PhoneNumber mynumber = new PhoneNumber("800-GOFEDEX");
		System.out.println("the number is: " + mynumber);
			
		PhoneNumber mynumber2 = new PhoneNumber("800-46FEDEX");
		System.out.println("the number is: " + mynumber2);
			
		PhoneNumber mynumber3 = new PhoneNumber("800-&*(^&%@");
		System.out.println("the number is: " + mynumber3);
			
		mynumber = new PhoneNumber(800, 1234567, 123);
		System.out.println("the number is: " + mynumber);

		mynumber2 = new PhoneNumber(7654321);
		System.out.println("the number is: " + mynumber2);
		if (mynumber.equals(mynumber2))
		    System.out.println("mynumber and mynumber2 are the same");
		else
		    System.out.println("mynumber and mynumber2 are different");

		mynumber = new PhoneNumber();
		System.out.println("the number is: " + mynumber);
		
	    }

}
