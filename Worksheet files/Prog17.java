class Prog17{
	public static void main(String args []){
		//declare variables
		double radius, area, circumference;
		
		//ask the user to enter the radius of a circle
		System.out.print ("Enter the radius of a circle: ");
		radius = Keyboard.readDouble();
		
		//calculating circle's area and circumference
		area = 3.142*(radius*radius);
		circumference = 2*3.142*radius;
		
		//outputting circle's area and circumference
		System.out.println ("The area of the circle is " + area + " and the circunference is " + circumference);
	}
}