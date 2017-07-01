
public class CheckPoint1_4 {
	public static void main (String args []){
		
		//declare variables
				int mark;
				int totalFailures;
				int totalPasses;
				int i; //counter
				
				//initializing variable
				totalPasses=0;
				totalFailures=0;
				
				//FOR loop
				for (i=1; i<=10; i++){
					System.out.print ("Please enter a mark: ");
					mark = Keyboard.readInt();
					if (mark>=50){
						totalPasses=totalPasses+1;
					}
					totalFailures = 10 - totalPasses;
				}
				//output the number of failures and the number of passes
				System.out.print ("The number of failures is: " + totalFailures + " and the number of passes is: " + totalPasses);

	}
}
