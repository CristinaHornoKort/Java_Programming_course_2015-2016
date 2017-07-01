
public class CheckPoint1_6 {

	public static void main(String args []) {
		int mark;
		
		//DO-WHILE loop
		do {
			System.out.print("Please enter a mark: ");
			mark = Keyboard.readInt();
		}
		
		while (mark != -1);
		System.out.print ("End");
	}

}


