package example;

public class PitestExample {
	
	public static void main(String []args) {
		
		System.out.println(mathExample(1, 2));
	}

	public static int mathExample(int x, int y) {
		long result = y;
		
		result += x;
		result -= y;
		result -= x;
		
		return (int) result;
	}
}
