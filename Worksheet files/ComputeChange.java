class ComputeChange{
	public static void main (String args[]){
		
		System.out.print ("Enter the amount in double of change: ");
		double amount = Keyboard.readDouble();
		
		int noOfEuros, noOf50c, noOf20c, noOf10c, noOf5c, noOf2c, noOf1c;
		
		int remainingAmount = (int)(amount * 100);
		noOfEuros = remainingAmount / 100; 
		remainingAmount = remainingAmount % 100;
		noOf50c = remainingAmount / 50; 
		remainingAmount = remainingAmount % 50;
		noOf20c = remainingAmount / 20; 
		remainingAmount = remainingAmount % 20;
		noOf10c = remainingAmount / 10; 
		remainingAmount = remainingAmount % 10;
		noOf5c = remainingAmount / 5; 
		remainingAmount = remainingAmount % 5;
		noOf2c = remainingAmount / 2; 
		remainingAmount = remainingAmount % 2;
		noOf1c = remainingAmount; 
		
		System.out.print ("Your amount " + amount + " consist of: \n" +
			noOfEuros + " Euros\n" + noOf50c + " 50 cents\n" +
			noOf20c + " 20 cents\n" + noOf10c + " 10 cents\n" +
			noOf5c + " 5 cents\n" + noOf2c + " 2 cents\n" +
			noOf1c + " 1 cents\n"); 
	}
}
/* i. Escape character:  \n
   ii. Assigment statement: noOfEuros = remainingAmount / 100;
  iii. Input statement: System.out.print ("Enter the amount in double of change: ");
   iv. Output statement: System.out.print ("Your amount " + amount + " consist of: \n" +
			noOfEuros + " Euros\n" + noOf50c + " 50 cents\n" +
			noOf20c + " 20 cents\n" + noOf10c + " 10 cents\n" +
			noOf5c + " 5 cents\n" + noOf2c + " 2 cents\n" +
			noOf1c + " 1 cents\n") 
   v. The purpose of the % operator as used in the program is: to calculate the remainder of a division, it is call modulus. 		
*/