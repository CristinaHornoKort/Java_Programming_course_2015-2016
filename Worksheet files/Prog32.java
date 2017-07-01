class Prog32{
	public static void main (String args[]){
		
		//declare variable
		int mark;
		
		//ask the user to enter his/her mark in the Computing o-level
		System.out.print ("Enter your mark in the Computing o-level: ");
		mark = Keyboard.readInt();
		
		switch (mark){
			case 1: System.out.print ("Paper A: Excellent! \nNow you know everything! \nYou deserve a holiday!"); break;
			case 2: System.out.print ("Paper A: Very well done! \nThis shows you studied well!"); break;
			case 3: System.out.print ("Paper A: Good Job!"); break;
			case 4: System.out.print ("Paper A: Not bad! \nPaper B: Well done!"); break;
			case 5: System.out.print ("Paper A: Study Harder! \nPaper B: Good Job!"); break;
			case 6: System.out.print ("Paper B: Not Bad!"); break;
			case 7: System.out.print ("Paper B: Study Harder!"); break;
			default: System.out.print ("Fail"); 
		}
	}
}