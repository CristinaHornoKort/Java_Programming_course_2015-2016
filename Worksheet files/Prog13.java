class Prog13{
	public static void main(String args[]){
		//declare variables
		int num;
		
		//ask the user to input his/her age
		System.out.print ("Enter your age: ");
		num = Keyboard.readInt();
		
		//calculating what will be his/her age in 5 years
		num+=5;
		
		//outputting answer
		System.out.println("In 5 years' you will be " + num + " years old.");
	}
}