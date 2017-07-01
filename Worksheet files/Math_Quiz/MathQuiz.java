class MathQuiz{
	//method to show the menu
	//void = the method will not return a value
	public void showMenu(){ 
		System.out.println ("Mathematical Quiz");
		System.out.println ("1. Addition");
		System.out.println ("2. Substraction");
		System.out.println ("3. Multiplication");
	}	
	
	//method to create a random number and return it
	int generateRandNums(){
		int num = (int)(Math.random()*10)+1;
		return num;
	}
	
	int workCorrectAns(int ch, int n1, int n2){
		int correctAns=0;
		switch (ch){
			case 1: correctAns=n1+n2; break;
			case 2: correctAns=n1-n2; break;
			case 3: correctAns=n1*n2; break;
		}
		return correctAns;
	}	  
}