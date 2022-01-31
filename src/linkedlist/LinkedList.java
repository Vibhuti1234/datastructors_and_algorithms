package linkedlist;

public class LinkedList {
	private Node head;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public int length() {
		Node currNode = this.head;
		int length = 0;
		while (currNode != null) {
			length++;
			currNode = currNode.getNextNode();

		}
		return length;
	}

	public void deleteHeadNode() {
		if(this.head!=null && this.head.getNextNode()!=null) {
		this.head=this.head.getNextNode();
		
		}
		
	}
	@Override
	public String toString() {
		String result = "{";
		Node currentNode = this.head;
		while (currentNode != null) {
			result += currentNode.toString() + ",";
			currentNode = currentNode.getNextNode();

		}
		result += "}";
		return result;
	}

}
