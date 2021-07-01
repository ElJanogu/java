
public class main {
	public static void main(String[] args) {
		int a = fact(2);
		int b = fact(6);
		
		System.out.println(a);
		System.out.println(b);
		
		Node myNode = new Node(1, null);
		myNode.add(2);
		myNode.add(4);
		myNode.add(8);
		
		System.out.println(myNode.toString());

	}
	
	public static int fact(int n) {
		if (n < 0) return -1;
		if (n == 0) return 1;
		return n * fact(n - 1);
	}
	
}
