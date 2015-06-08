import java.util.*; 

public class TicketMachine {

	private int price = 100;
	private int balance;
	private int total;

	public void showPrompt() {
		System.out.println("Welcome to buy tickets" );
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
	 	TicketMachine tm = new TicketMachine();
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