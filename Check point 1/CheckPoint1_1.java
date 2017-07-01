//Develop a program using a for loop to generate 5 random numbers between 1 and 43 for the Super Five lottery.

import static java.lang.Math.random;

public class CheckPoint1_1 {

	public static void main(String args[]) {
		//declare variables
				int randomNumber;
				int i; //counter
				
				System.out.print("The five random numbers are: ");
				
				//FOR loop
				for (i=1; i<=5; i++){
					randomNumber = (int)(random() *43 + 1);
					System.out.print(randomNumber + " ");
				} 
	}
}
