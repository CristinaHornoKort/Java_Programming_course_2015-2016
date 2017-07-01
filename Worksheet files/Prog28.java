class Prog28{
	public static void main (String args[]){
		int i, num, total;
		
		total = 0; //initilize variable total
		
		for (i=1; i<=5; i++){
			System.out.print ("Enter number " + i + ": ");
			num = Keyboard.readInt();
			total = total + num;
		}
		System.out.println ("Total is " + total);
	}
}
/* The function of this program is to add 5 numbers introduced 
 by the user */