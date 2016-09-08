import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner amount = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int a = (int) amount.nextInt();
		if (a%2 == 0){
			System.out.println("The integer " + a + " is even.");
		}
		else {
			System.out.println("The integer " + a + " is odd.");
		}
	}

}
