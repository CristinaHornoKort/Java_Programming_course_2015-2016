class Prog29{
	public static void main (String args[]){
		int i; //counter
		int numberStudents;
		double mathsMark;
		double totalMathsMark;
		double averageMathsMark;
		
		//Ask the teacher how many students s/he has in his/her class
		 System.out.print ("Enter the number of students in your class: ");
		 numberStudents = Keyboard.readInt();
		 
		 totalMathsMark = 0;
		 
		 //Loop to ask the teacher to enter the Maths mark for each student
		 for (i=1; i<=numberStudents; i++){
		 	System.out.print ("Enter the Maths mark of student " + i + ": ");
		 	mathsMark = Keyboard.readDouble();
		 	totalMathsMark = totalMathsMark + mathsMark;
		 }
		 
		 //calculate the average Maths mark of the class
		 averageMathsMark = totalMathsMark/numberStudents;
		 System.out.print("The average Maths mark of the class is: " + averageMathsMark);
	}
}