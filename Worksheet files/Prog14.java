class Prog14{
	public static void main(String args[]){
		//declare variables
		int length, volume;
		
		//ask the user to enter the length
		System.out.print ("Enter the length of one side of the box: ");
		length = Keyboard.readInt();
		
		//calculating volume
		volume = length*length*length;
		
		//outputting volume
		System.out.println ("The volume of the box is " + volume);
		
	}
}