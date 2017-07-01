class DirTools{
	
	int i;
	String searchName;
	String searchTown;
	int answer;
	//Arrays
	String[]names=new String[100];//array to hold 100 names
	int[]telNum=new int[100];//array to hold 100 telephone numbers
	String[]towns=new String[100];//array to hold 100 towns
	
	//Methods
	
	//fill first 10 slots of the array
	public void fillDirectoryManual(){
		names[0]="Peter"; telNum[0]=21324354; towns[0]="Berlin";
		names[1]="Paul"; telNum[1]=21324355; towns[1]="Valleta";
		names[2]="Hanna"; telNum[2]=21324356; towns[2]="Rome";
		names[3]="Will"; telNum[3]=21324357; towns[3]="Victoria";
		names[4]="Alex"; telNum[4]=21324358; towns[4]="Madrid";
		names[5]="Mary"; telNum[5]=21324359; towns[5]="Paris";
		names[6]="Cris"; telNum[6]=21324360; towns[6]="London";
		names[7]="Andrew"; telNum[7]=21324361; towns[7]="Santiago";
		names[8]="Sarah"; telNum[8]=21324362; towns[8]="Lisboa";
		names[9]="Hugo"; telNum[9]=21324363; towns[9]="Tunisia";
		
		i=10;
		//i=10... this shows which slot needs to be filled in next
	}
	
	//user may continue adding on to the array
	public void fillDirectoryUser(){
		char answer;
		do {
			System.out.print ("Enter name: ");
			names[i]=Keyboard.readString();
			System.out.print ("Enter telephone number: ");
			telNum[i]=Keyboard.readInt();
			System.out.print ("Enter town: ");
			names[i]=Keyboard.readString();
			i++;
			
			System.out.print ("Would you like to enter more telephone numbers? Y/N Select your answer...");
			answer=Keyboard.readChar();
		}
		while(answer=='Y' || answer=='y');
		
	}
	
	//output all directory
	public void outputDirectory(){
		//i monitors how many names and  telephone numbers we have in our arrays
		//j is used as a counter for the FOR LOOP
		for (int j=0; j<i; j++){
			//output statement
			System.out.println("Name: " + names[j] + " - Telephone: " + telNum[j] + " - Town: " + towns[j]);
		}
	}
	
	//search directory by name
	int searchByName(){
		int ans=0;
		System.out.print ("Enter name: ");
		searchName=Keyboard.readString();
		for (int j=0; j<i; j++){
			if (names[j].equals(searchName)) ans=telNum[j];
		}
		return ans;	
	}
	
	//search directory by town
	int searchByTown(){
		int ans=0;
		System.out.print ("Enter town: ");
		searchTown=Keyboard.readString();
		for (int j=0; j<i; j++){
			if (towns[j].equals(searchTown)) ans=telNum[j];
		}
		return ans;	
	}
}