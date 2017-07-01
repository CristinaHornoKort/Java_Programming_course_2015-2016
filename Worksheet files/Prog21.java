class Prog21{
	public static void main (String args []){
		//declare variable
		byte monthNumber;
		
		//ask the user to enter the current month number
		System.out.print("Enter the current month number: ");
		monthNumber=Keyboard.readByte();
		
		//Check that a valid month number was entered  
		if(monthNumber>0 && monthNumber<13)
			{
			System.out.println("Valid Month"); //if yes, display the message “Valid Month”
			}
		else System.out.println("Invalid Month"); //otherwise display the message “Invalid Month”
		
	}
}