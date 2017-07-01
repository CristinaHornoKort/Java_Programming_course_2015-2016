class Prog30{
	public static void main (String args[]){
		//declare variable
		int userChoice;
		
		do {
			//show menu
			System.out.println();
			System.out.println("Mathematical Quiz");
			System.out.println();
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Exit");
			System.out.println();
			
			System.out.print ("On wich operation would you like to be quizzed?");
			userChoice = Keyboard.readInt(); //read user's choice
			while (userChoice > 4 || userChoice <1){
				System.out.print ("Invalid choice. On wich operation would like to be quizzed?");
				userChoice = Keyboard.readInt(); //read user's choice
			}
		} while (userChoice != 4);
	}
}

// The function of the while loop is to verify the user choice is a number between 1 and 4,
//if the user choice is not a number between 1 and 4, the program ask again.

// The function of the added piece of code (do/while loop) is to stay inside the loop until the value
// of userChoice is equal to 4, then exit out of the loop.
