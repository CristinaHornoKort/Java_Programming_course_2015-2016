class Prog34{
	public static void main (String args []){
		//declare and initialize variable
		int [] numbers = new int [5];
		//counter
		int i;
		
		//generate 5 random number between 1 and 45	
		for (i=0; i<=4; i++){
			numbers [i] = (int)(Math.random()*(45))+1;
		}
		//outputting 5 random numbers
		System.out.print ("The 5 random numbers are: " + numbers [0] + ", " + numbers [1] + ", " + numbers [2] + ", " + numbers [3] + ", " + numbers [4]);
	}
}