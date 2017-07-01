class Prog15{
	public static void main(String args[]){
		//declare variables
		double euros, dollars;
		
		//ask the user to enter the amount
		System.out.print ("Enter amount to convert: ");
		dollars = Keyboard.readDouble();
		
		//converting amount from euros to dollars
		euros = dollars * 0.740466494;
		
		//outputting conversion
		System.out.println (dollars + " American Dollars corresponds to " + euros + " euros");
		
	}
}