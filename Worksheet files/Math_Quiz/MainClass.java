class MainClass{
	public static void main (String [] args){
		//declare variables
		int choice;
		int num1;
		int num2;
		int userAnswer;
		int correctAnswer;
		
		//create object mq = instance of class MathQuiz
		MathQuiz mq = new MathQuiz();
		
		//show menu
		mq.showMenu();
		
		//ask the user for his choice
		System.out.print ("Enter your choice: ");
		choice=Keyboard.readInt();
		
		//generate the random numbers
		num1 = mq.generateRandNums();
		num2 = mq.generateRandNums();
		
		//show question
		switch (choice){
			case 1: System.out.print (num1 + "+" + num2 + "="); break;
			case 2: System.out.print (num1 + "-" + num2 + "="); break;
			case 3: System.out.print (num1 + "x" + num2 + "="); break;
		}
		//read user answer
		userAnswer=Keyboard.readInt();
		
		//work out the correct answer
		correctAnswer=mq.workCorrectAns(choice, num1, num2);//parameter passing (choice, num1, num2)
		
		//
		if (userAnswer==correctAnswer){
			System.out.println ("The answer is correct");
		}
		else{
			System.out.println ("The answer is incorrect");
		}
	}
}