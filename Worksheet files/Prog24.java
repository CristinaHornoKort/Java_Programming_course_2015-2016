class Prog24{
	public static void main (String args []){
		
		//declare variables
		int num1, num2, userChoice, correctAns, userAnswer;
		
		//initilizing variables
		correctAns = 0;
		userAnswer = 0;
		
		//generate random numbers (between 1 and 10)
		num1 = (int)(Math.random()*(10));
		num2 = (int)(Math.random()*(10));
		
		//show menu
		System.out.println("Mathematical Quiz");
		System.out.println();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println();
		System.out.println("On wich operation would you like to be quizzed?");
		
		userChoice = Keyboard.readInt(); //read user's choice
		
		switch (userChoice){
			case 1:{
				correctAns = num1 + num2;
				System.out.println();
				System.out.print(num1+ " + " +num2+ " = ");
				userAnswer = Keyboard.readInt();
				break;
				}
			case 2:{
				correctAns = num1 - num2;
				System.out.println();
				System.out.print(num1+ " - " +num2+ " = ");
				userAnswer = Keyboard.readInt();
				break;
				}
			case 3:{
				correctAns = num1 * num2;
				System.out.println();
				System.out.print(num1+ " * " +num2+ " = ");
				userAnswer = Keyboard.readInt();
				break;
				}
			default: System.out.println ("Correct");
		}
		if (userAnswer==correctAns) System.out.println ("Correct");
		else System.out.println ("Incorrect");	
	}
}