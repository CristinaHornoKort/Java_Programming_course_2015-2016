class Prog38 {
	public static void main(String args []) {
		
		int i; //used for loop
		String[] countries = new String[7]; //declare array countries
		String[] capitals = new String[7]; //declare array capitals
		
		//fill array countries with information
		countries[0] = "Malta";
		countries[1] = "England";
		countries[2] = "Italy";
		countries[3] = "Germany";
		countries[4] = "France";
		countries[5] = "Spain";
		countries[6] = "Greece";
		
		//ask user to enter data in array capitals
		for (i=0; i<7; i++){
			System.out.print ("What is the capital city of " + countries[i] + ":");
			capitals[i]=Keyboard.readString();
		}
		
		//display information
		for (i=0; i<7; i++){
			System.out.println (countries[i] + " capital city: " + capitals[i]);
		}

	}

}
