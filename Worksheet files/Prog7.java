//creating a class list with exam marks

class Prog7{
	public static void main(String args[]){
		
		//declare variables
		String student1Name; //will hold name of student1
		String student2Name; //will hold name of student2
		String student3Name; //will hold name of student3
		byte student1Mark; //will hold exam mark of student1
		byte student2Mark; //will hold exam mark of student2
		byte student3Mark; //will hold exam mark of student3
		
		//initializing variables
		student1Name = "Peter";
		student2Name = "Tony";
		student3Name = "Mary";
		student1Mark = 60;
		student2Mark = 55;
		student3Mark = 86;
		
		//outputting class list with marks
		System.out.println (" \" Final\\Annual Report \" ");
		System.out.println ("Name \t Mark");
		System.out.println (student1Name + " \t " + student1Mark);
		System.out.println (student2Name + " \t " + student2Mark);
		System.out.println (student3Name + " \t " + student3Mark);
	}
}