//countdown for&while loop
//differences between for loop and while loop

class ForWhile {
	
	public static void main(String[] args) {
	
		int count;
		count = 10;
		while (count >0) {
			System.out.println(count);
			count --;
		}
		System.out.println("while loop final count is "+count);

		int number;
		for (number=10; number>0; number--){

			System.out.println(number);
		}
	
	}
}