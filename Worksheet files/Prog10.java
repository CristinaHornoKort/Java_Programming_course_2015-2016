class Prog10 {
	public static void main (String args[]){
		//declare variables
		float rainJan, rainFeb, rainMar, total, average;
		
		//initializing variables
		rainJan = 94.5f;
		rainFeb = 65.9f;
		rainMar = 38.1f;
		
		//calculating total and average
		total = rainJan + rainFeb + rainMar;
		average = (rainJan + rainFeb + rainMar)/3;
		
		//outputting total and average rainfall
		System.out.println("The total rainfall in the first three months of the year is: " + total);
		System.out.println("The average rainfall in the first three months of the year is: " + average + "mm");
	}
}