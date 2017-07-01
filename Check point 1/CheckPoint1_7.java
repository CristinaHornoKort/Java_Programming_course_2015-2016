
public class CheckPoint1_7 {

	public static void main(String args []) {
			//declare variables
			int mark;
			int totalMarks;
			
			//initialize variable
			totalMarks = 0;
			
			//DO-WHILE loop
			do {
				System.out.print("Please enter a mark: ");
				mark = Keyboard.readInt();
				totalMarks = totalMarks + mark;
			}
			
			while (mark != -1);
			System.out.print ("The sum of the marks entered is: " + totalMarks);

	}

}
