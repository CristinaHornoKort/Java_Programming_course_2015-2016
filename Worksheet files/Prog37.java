class Prog37{
	public static void main (String args []){
		
		/*
		int [] tempDay = new int [7];
		
		tempDay[0]=15;//Monday
		tempDay[1]=11;//Tuesday
		tempDay[2]=14;//Wednesday
		tempDay[3]=16;//Thursday
		tempDay[4]=12;//Friday
		tempDay[5]=17;//Saturday
		tempDay[6]=16;//Sunday
		*/
		
		//declaring and initializing the array at one go
		int[] tempDay = {15,11,14,16,12,17,16}; 
		
		//Output temperature of the week
		System.out.println ("Monday: " + tempDay[0] + "\nTuesday: " + tempDay[1] + "\nWednesday: " + tempDay[2] + "\nThursday: " + tempDay[3] + "\nFriday: " + tempDay[4] + "\nSaturday: " + tempDay[5] + "\nSunday: " + tempDay[6]);
	}
}