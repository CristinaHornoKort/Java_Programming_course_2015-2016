class Prog36{
	public static void main (String args []){
		//declare variables
		int num;
		double answer;
		
		System.out.print ("Please enter a number: ");//ask user to input a number
		num = Keyboard.readInt();//user input a number in variable num
		
		//answer = square root of num
		answer = Math.sqrt(num);
		
		//show answer
		System.out.print ("The square root of " + num + " is " + answer);
	}
}