class Prog22{
	public static void main (String args []){
		//declare variables
		int month;
		int numDays;
		
		//initializing variable
		numDays=0;
		//ask the user to enter the current month number
		System.out.print ("Enter the current month number: ");
		month = Keyboard.readInt();
		
		//SWITCH STATEMENT
		switch (month){
			case 1: {
				month = 1;
				numDays = 31; 	
				break; 
				}
			case 2: {
				month = 2;
				numDays = 28; 	
				break; 
				}
			case 3: {
				month = 3;
				numDays = 31; 	
				break; 
				}
			case 4: {
				month = 4;
				numDays = 30; 	
				break; 
				}
			case 5: {
				month = 5;
				numDays = 31; 	
				break; 
				}
			case 6: {
				month = 6;
				numDays = 30; 	
				break; 
				}
			case 7: {
				month = 7;
				numDays = 31; 	
				break; 
				}
			case 8: {
				month = 8;
				numDays = 31; 	
				break; 
				}
			case 9: {
				month = 9;
				numDays = 30; 	
				break; 
				}
			case 10: {
				month = 10;
				numDays = 31; 	
				break; 
				}
			case 11: {
				month = 11;
				numDays = 30; 	
				break; 
				}
			case 12: {
				month = 12;
				numDays = 31; 	
				break; 
				}
			default: System.out.println("Invalid month");
		}
		//outputting the number of days in that month
		System.out.println("The number of days in that month is " + numDays);
	}
}