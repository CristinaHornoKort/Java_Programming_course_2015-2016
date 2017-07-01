class CheckPoint1_2{
	public static void main (String args []){
		// declaration and initialization variables
		int password = 91919; 
		int userGuess = 0;
		
		//WHILE LOOP
		while (userGuess != password){ 
			System.out.print ("Enter the correct password: "); 
			userGuess = Keyboard.readInt();
		}
		System.out.println ("Acces Granted");
	}
}