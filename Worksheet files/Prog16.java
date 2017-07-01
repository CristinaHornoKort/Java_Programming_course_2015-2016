class Prog16{
	public static void main(String args []){
		//declare variables
		int temp1, temp2, temp3, temp4, temp5, temp6, temp7, average;
		
		//ask the user to enter the temperature gathered on every day of the week
		System.out.print ("Enter the temperature gathered on Monday: ");
		temp1 = Keyboard.readInt();
		
		System.out.print ("Enter the temperature gathered on Tuesday: ");
		temp2 = Keyboard.readInt();
		
		System.out.print ("Enter the temperature gathered on Wednesday: ");
		temp3 = Keyboard.readInt();
		
		System.out.print ("Enter the temperature gathered on Thursday: ");
		temp4 = Keyboard.readInt();
		
		System.out.print ("Enter the temperature gathered on Friday: ");
		temp5 = Keyboard.readInt();
		
		System.out.print ("Enter the temperature gathered on Saturday: ");
		temp6 = Keyboard.readInt();
		
		System.out.print ("Enter the temperature gathered on Sunday: ");
		temp7 = Keyboard.readInt();
		
		average = (temp1+temp2+temp3+temp4+temp5+temp6+temp7)/7;
		
		//outputting the average temperature
		System.out.println ("The average temperature of the coming week is " + average + "ºC");
	}
}