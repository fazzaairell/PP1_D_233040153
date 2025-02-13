package pertemuan2;

public class Node {
	private int nilai;
	private Node next;
	
	//insntalasi node 
	public Node (int nilai) {
		this.nilai = nilai;
	}
// setter and getter

	public int getNilai() {
		return nilai;
	}

	public void setNilai(int nilai) {
		this.nilai = nilai;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
