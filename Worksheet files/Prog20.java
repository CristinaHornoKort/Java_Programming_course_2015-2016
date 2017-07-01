class Prog20{
	public static void main(String args []){
		//declare variables
		double price1, price2, price3, total, disc;
		
		//ask the user to input the prices of 3 items bought
		System.out.print("Enter the price of the first item: ");
		price1=Keyboard.readDouble();
		
		System.out.print("Enter the price of the second item: ");
		price2=Keyboard.readDouble();
		
		System.out.print("Enter the price of the third item: ");
		price3=Keyboard.readDouble();
		
		//add the total of these three prices
		total=price1+price2+price3;
		disc=total*0.9;
		
		//if total is greater than 40 euros, a discount of 10% is given. Show the original price as well as the discounted price
		if(total>40)
			{
			System.out.println("Discount of 10%. Original price is: " + total + " euros. Discounted price is: " + disc + " euros.");
			}
		//otherwise, do not give any discount. Thus show the total price
		else System.out.println("No discount. Total price is: " + total);
		
	}
}