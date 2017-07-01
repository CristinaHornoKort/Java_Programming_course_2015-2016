class Numbers{
	public static void main (String args []){
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.print ("Input the first value: ");
		a = Keyboard.readInt();
		
		System.out.print ("Input the second value: ");
		b = Keyboard.readInt();
		
		System.out.print ("Input the third value: ");
		c = Keyboard.readInt();
		
		int total = a + b + c;
		
		int average = total/3;
		
		System.out.println();
		System.out.print ("The total is " + total + " and the average is " + average);
	}
}
// i. The variables used in the program are: a, b, c, total, average.

// ii. One of the initialization statements used in this program is: 
//     int a = 0;

// iii. One of the statements used to let the user input data from his/her keyboard is: 
//      a = Keyboard.readInt();

// iv. One assignment statement (where operators are used) is:
//     int total = a + b + c;

// v. The classes used in the program are: class Numbers and class Keyboard

// vi. The function of this program is to ask the user to input 3 numbers, 
//     and then to calculate the total and the average of these 3 numbers
