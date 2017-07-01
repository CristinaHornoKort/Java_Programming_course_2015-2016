class CheckPoint1_3{
	public static void main (String args []){
		int password=91919;
		int userGuess=0;
		int i; //counter
		
		//FOR LOOP
		for (i=1; i<=3; i++){
			System.out.print ("Enter the correct password: ");
			userGuess=Keyboard.readInt();
			if (userGuess==password){
				System.out.println ("Acces Granted");
			}
			else{
				System.out.println ("Acces Denied");
			}
		} 
	}
}