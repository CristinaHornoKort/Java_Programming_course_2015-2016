class Prog23{
	public static void main (String args []){
	
		//declare variables
		int userChoice;
		double usDollars, euro;
		
		//show menu
		System.out.println("Calculator");
		System.out.println();
		System.out.println("1. U.S. Dollars --> Euros");	
		System.out.println("2. Euros --> U.S. Dollars");	
		System.out.println();
		System.out.print("Wich conversion would you like?");
		userChoice = Keyboard.readInt(); //read user's choice
		
		//SWITCH STATEMENT
		switch (userChoice){
			case 1:{
				System.out.println();
				System.out.println("Enter an amount in U.S. Dollars: ");
				usDollars = Keyboard.readFloat();
				euro = usDollars * 0.74;
				System.out.println(usDollars + " U.S. Dollars correspond to " + euro + " Euros");
				break;
				}
			case 2: {
				System.out.println();
				System.out.println("Enter an amount in Euros: ");
				euro = Keyboard.readFloat();
				usDollars = euro / 0.74;
				System.out.println(euro + " Euro correspond to " + usDollars + " U.S. Dollars");
				break;
				}
			default: System.out.println("Invalid choice");
		}
	}
}