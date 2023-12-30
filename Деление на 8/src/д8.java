import java.util.Scanner;
public class д8 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.println("Провери, дали числото/а се дели/ят на 8 и разбери колко е резултата, ако се дели ");
		System.out.println("Въведи числото а: ");
		long a= input.nextLong();
		if (a%8==0) {
			System.out.println("Числото " + a + " се дели на 8 и е: ");
		System.out.println(a/8);}
		else {
			System.out.println("Числото "+ a+ " не се дели  на 8!");}
			
		
		input.close();
		

	}

}