class TelDirectory{
	public static void main (String args []){
		int choice;//declare variables
		
		/*create myDir object
		 *object myDir is an instance of class DirTools
		 */
		 DirTools myDir = new DirTools();
		 
		 //use method fillDirectoryManual
		 myDir.fillDirectoryManual();
		 
		 //show menu
		 System.out.println ("Directory\n\n1. Add to Directory\n2. Output the whole list\n3. Search by name\n4. Search by town\n0. Exit\n");
		 
		 //ask user to input choice
		 System.out.print ("Enter your choice here...");
		 choice=Keyboard.readInt();
		 
		 while (choice<0 || choice>4){
		 	System.out.print("\nNot valid. Please enter a valid choice between 0 and 4...");
		 	choice=Keyboard.readInt();
		 }
		 
		 switch (choice){
		 	
		 	case 0: System.exit(0);
		 	case 1:{
		 		
		 		//use method fillDirectoryUser
		 		myDir.fillDirectoryUser();
		 		break;
		 	}
		 	
		 	case 2:{
		 		
		 		//use method outputDirectory
		 		myDir.outputDirectory();
		 		break;
		 	}
		 	
		 	case 3:{
		 		
		 		//use method searchByName
		 		System.out.print(myDir.searchByName());
		 		break;
		 	}
		 	
		 	case 4:{
		 		
		 		//use method searchByTown
		 		System.out.print(myDir.searchByTown());
		 		break;
		 	}
		 	
		 }
		 
	}
}