//class which will hold the main method
class House{
	public static void main (String args[]){
		//declare an object bedroom1 
		//as an instance of class Room
		Room bedroom1 = new Room(4, 3, 5);
		
		/*//NO NEED to assign values to bedroom's instance variables, because we have allready create a CONSTRUCTOR at Room.java
		bedroom1.width=4;
		bedroom1.height=3;
		bedroom1.length=5;*/
		
		// use method dispVolume
		System.out.println ("Volume for bedroom 1: " + bedroom1.dispVolume());
		// use method dispFloorArea
		System.out.println ("Floor area of bedroom1 " + bedroom1.dispFloorArea());
		
		//   ******* End of object 1: bedroom1
		
		//   ******* Start object 2: kitchen
		// create an instance
		// object kitchen
		Room kitchen = new Room(3, 3, 4);
		
		/*//NO NEED to assign values, because we have allready create a CONSTRUCTOR at Room.java
		kitchen.width=3;
		kitchen.height=3;
		kitchen.length=4;*/
		
		//use method
		System.out.println ("Volume for kitchen: " + kitchen.dispVolume());
		System.out.println ("Floor area of kitchen " + kitchen.dispFloorArea());
		//   ******* End of object 2: kitchen
		
		//   ******* Start object 3: bathroom
		// create an instance
		// object bathroom
		
		Room bathroom = new Room (6, 4, 4);
		/*//NO NEED to assign values to bathroom object, because we have allready create a CONSTRUCTOR at Room.java
		bathroom.width=6;
		bathroom.height=4;
		bathroom.length=4;*/
		
		//calculate the volume of bathroom
		System.out.println ("Volume of bathroom: " + bathroom.dispVolume());
		
		//find floor area
		System.out.println ("Floor area of bathroom: " + bathroom.dispFloorArea());
	}	
}