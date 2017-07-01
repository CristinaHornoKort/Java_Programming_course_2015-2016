class Prog39{
	public static void main (String args[]){
		
	String[] names = {"Peter","Frank","Louis","Mark","Jason","Tonio"};
	int[] marks = {85,67,82,74,64,90};
	double averageMark;
	
	//output Jason's mark
	System.out.println (names [4] + "'s mark is: " + marks [3]);
	//output Peter's mark
	System.out.println (names [0] + "'s mark is: " + marks [0]);
	//output Frank's mark
	System.out.println (names [1] + "'s mark is: " + marks [1]);
	
	
	//calculating average mark
	averageMark = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5])/6;
	
	//outputting average marks
	System.out.println ("The average of the 6 marks in the array is: " + averageMark);
	}
}
