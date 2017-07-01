class Prog18{
	public static void main(String args[]){
		//declare variables
		String name1, name2, name3;
		int quantity1, quantity2, quantity3;
		double price1, price2, price3, total1, total2, total3, total, totalVAT;
		
		//ask the shop owner to enter  the name, quantity and price (excluding VAT) of 3 items bought
		System.out.print ("Enter the name of the first item: ");
		name1 = Keyboard.readString();
		System.out.print ("Enter the quantity: ");
		quantity1 = Keyboard.readInt();
		System.out.print ("Enter the price: ");
		price1 = Keyboard.readInt();
		
		System.out.print ("Enter the name of the second item: ");
		name2 = Keyboard.readString();
		System.out.print ("Enter the quantity: ");
		quantity2 = Keyboard.readInt();
		System.out.print ("Enter the price: ");
		price2 = Keyboard.readInt();
		
		System.out.print ("Enter the name of the third item: ");
		name3 = Keyboard.readString();
		System.out.print ("Enter the quantity: ");
		quantity3 = Keyboard.readInt();
		System.out.print ("Enter the price: ");
		price3 = Keyboard.readInt();
		
		total1= quantity1*price1;
		total2= quantity2*price2;
		total3= quantity3*price3;
		total = total1+total2+total3;
		totalVAT = total + (total*18/100);
		
		//outputting a receipt
		System.out.println();
		System.out.println("**RECEIPT**");
		System.out.println("ITEM * QUANTITY = PRICE ");
		System.out.println(name1 +" * " + quantity1 + " = " + total1);
		System.out.println(name2 +" * " + quantity2 + " = " + total2);
		System.out.println(name3 +" * " + quantity3 + " = " + total3);
		System.out.println("TOTAL (%18 VAT) " + totalVAT);
	}
}