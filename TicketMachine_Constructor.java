//Ticket Machine with Constructor

import java.util.*; 

public class TicketMachine_Constructor {
	private int price = 100;
	private int balance;
	private int total;
	private String name = "";


	public TicketMachine (int i){
		price = i;
	}

	public TicketMachine (String name){
		//name = name;   //Way One
		this.name = name;   //Way Two

	}

	public TicketMachine (String name, int price){
		//this.name = name;  //Way One
		this(name);   //Way Two
		this.price = price;
	}

	public void showPrompt() {
		System.out.println("Welcome to buy " + name + " Line ticket.");
		System.out.println("The price is: "+price);
	}

	public void insertMoney (int bill){
		balance = balance+bill;
		printBalance();
	}

	public void printTicket(){
		if (balance >= price) {
			System.out.println("The ticket");
			if (balance>price) {
				System.out.println("change is " + (balance-price));
			}
			balance = balance-price;
		}
	}

	public void printBalance () {
		System.out.println ("Balance is: "+balance);
	}

	public boolean isEnough(){
		return balance>=price;
	}

	public static void main(String[] args) {
	 	TicketMachine tm = new TicketMachine("Blue", 80);
	 	tm.showPrompt();
	 	int bill;
	 	Scanner in = new Scanner(System.in);

	 	do{
	 		bill = in.nextInt();
	 		tm.insertMoney(bill);
	 		if( tm.isEnough()) {
	 			tm.printTicket();
	 			break;
	 		}
	 	} while(true);
		
	}
}