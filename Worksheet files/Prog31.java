class Prog31{
	public static void main (String args[]){
		
		//declare variable
		int temperature;
		
		//ask the user to enter today's temperature in degrees Celsius
		System.out.print ("Enter today's temperature in degrees Celsius: ");
		temperature = Keyboard.readInt();
		
		//If the temperature is 20 or greater, display the message 'WARM'.
		if (temperature >= 20){
			System.out.print ("WARM");
		}
		//Otherwise, display the message 'COLD'
		else {
			System.out.print ("COLD");
		}
	}
}