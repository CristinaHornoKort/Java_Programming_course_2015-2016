class Prog33{
	public static void main (String args[]){
		
		//declare variables
		int i; //counter
		int rainfall;
		int totalRainfall;
		int averageRainfall;
		
		totalRainfall = 0;
		//for loop to ask the user for the amount of rainfall on each individual day for 7 days
		for (i=1; i<=7; i++){
			System.out.print ("Enter the amount of rainfall on day " + i + ": ");
			rainfall = Keyboard.readInt();
			totalRainfall = totalRainfall + rainfall;
		}
		
		averageRainfall = totalRainfall/7;
		
		//outputting the total and average rainfall
		System.out.println ();
		System.out.println ("The total rainfall is: " + totalRainfall);
		System.out.println ("The average rainfall is: " + averageRainfall);
	}
}