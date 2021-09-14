package iterations;

public class Iteration {

	public static void main(String[] args) {
//		forLoop();
//		flowRevisit();
		flowRevisit2();
		
	}
		
		
//		simple for loop
		public static void forLoop() {
		for (int i = 1; i < 10; i++) {
		
		System.out.println(i);
		}
		
	}
//		for loop for repeating letter
		public static void flowRevisit1() {
			
			for (int a = 100; a < 200; a++) {
				System.out.println("a");
			}
		}
		
//		for loop for alternating outputs
		public static void flowRevisit2() {
			
			for (int a = 100; a <= 200; a++) {
			
				if (a  % 2 == 0) {
				System.out.println("-");
				
				} else {
					System.out.println("*");
				}
		}
		
}
		
		
}
