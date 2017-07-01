class Prog27{
	public static void main (String args[]){
		int i;
		
		for (i=1; i<=5; i++){
			System.out.println (i + " * ");
		}
	}
}
/* The difference between this program and Prog25 is that this 
program write the number of the counter before * (1, 2, 3, 4 or 5),
and after every * it skip a line.
Prog25 only writes * 5 times, without including the number of the counter 
and without skipping a line.
*/