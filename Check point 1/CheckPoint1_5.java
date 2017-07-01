public class CheckPoint1_5 {
	public static void main(String args []) {
		int mark;
		
		System.out.print("Please enter a mark: ");
		mark = Keyboard.readInt();
		
		//WHILE loop
		while (mark != -1){
					System.out.print("Please enter a mark: ");
					mark = Keyboard.readInt();
		}
		System.out.print ("End");
	}

}
