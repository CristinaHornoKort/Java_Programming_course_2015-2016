class Prog11 {
	public static void main(String args[]){
		//declare variables
		int num1, num2, temp;
		
		//initializing variables
		num1 = 15;
		num2 = 5;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		//outputting the contents of the variables
		System.out.println ("The value of num1 is: " + num1);
		System.out.println ("The value of num2 is: " + num2);
	}
}