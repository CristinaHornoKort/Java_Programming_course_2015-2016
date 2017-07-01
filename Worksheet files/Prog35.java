class Prog35{
	public static void main (String args []){
		//declare variables
		int num;
		int powerOf;
		double answer;
		
		System.out.print ("Enter a number: ");//ask user to input a number
		num=Keyboard.readInt();// user inputs a number in variable num
		
		System.out.print ("Enter a power: ");//ask user to input a power
		powerOf=Keyboard.readInt();// user inputs a power in variable powerOf
		
		//calculate answer
		answer=Math.pow(num, powerOf);//answer = num to the power of inputed powerOf
		
		System.out.print (num + " to the power of " + powerOf + " is " + answer);//show answer
		
		
	}
}