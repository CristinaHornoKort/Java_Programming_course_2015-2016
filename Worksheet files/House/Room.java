class Room {
	//attributes
	double width;
	double height;
	double length;
	
	/*//constructor
	Room (double w, double h, double l){
		width=w;
		height=h;
		length=l;
	}*/
	
	//constructor
	Room (double width, double height, double length){
		this.width=width; //this.width refers to the class attribute
		this.height=height;
		this.length=length;
	}
	
	// method dispVolume (tool) to calculate and return volume
	double dispVolume(){
		double volume=width*height*length; //work out volume
		return volume; // give volume
	}
	
	double dispFloorArea(){
		double farea=width*length;
		return farea;	
	}	
}