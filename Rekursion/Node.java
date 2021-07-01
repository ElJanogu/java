
public class Node {
	private int value;
	private Node next = null;
	
	public Node(int v, Node n) {
		this.value = v;
		this.next = n;
	}
	
	public String toString() {
		String str = "";
		str += " -> " + String.valueOf(this.value);
		if (this.next != null) str += this.next.toString();
		return str;
	}
	
	public void add(int val) {
		if (this.next == null) {
			this.next = new Node(val, null);
		} else {
			this.next.add(val);
		}
	}
	
}
