class Prog19{
	public static void main(String args []){
		//declare variable
		int age;
		
		//ask the user to input his/her age
		System.out.print("Enter your age: ");
		age=Keyboard.readInt();
		
		// If the user is 18 years old or older, display a message “You can drive”
		if(age>=18)
			{
			System.out.println("You can drive");
			}
		//Otherwise, display the message “You cannot drive”
		else System.out.println("You cannot drive");
		
		
	}
}