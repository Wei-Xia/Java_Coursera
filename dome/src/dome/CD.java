package dome;

public class CD extends Item{
	private int numOfTracks = 0;

	public CD (String t, int not){
		super(t);
		numOfTracks = not;
	}
	
	public void print(){
		super.print();
		System.out.println(numOfTracks);
	}

}