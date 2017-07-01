class Prog40 {
	public static void main (String args []){
		//declare arrays
		int[] nums = new int[5];
		int[] doubles = new int[5];
		
		//ask the user to enter 5 integer numbers and store then in array nums
		for (int i=0; i<5; i++){
			System.out.print ("Enter a number: ");
			nums[i] = Keyboard.readInt();
			doubles [i]=nums[i]*2; //for each element in array nums, calculate its double and place in the corresponding element in array doubles
		}
		
		//outputting the content of arrays nums and doubles
		for (int i=0; i<5; i++){
			System.out.print ("The double of " + nums[i] + " is " + doubles[i] + "\n");
		}
	}
}
