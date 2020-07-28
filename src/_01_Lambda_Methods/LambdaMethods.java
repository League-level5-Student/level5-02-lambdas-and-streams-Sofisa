package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) ->{
			String reverse = "";
			for(int i = s. length() - 1; i >= 0; i--) {
				reverse = reverse + s.charAt(i);
			}
			System.out.println(reverse);
		}, "repeat");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if (i /2 == 0) {
					s.toLowerCase();
				}else {
					s.toUpperCase();
				}
				System.out.println(s);
			}
		}, "repeat");
		
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.

//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
