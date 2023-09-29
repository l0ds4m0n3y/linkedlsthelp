/**
 * In-class practice with Single-Linked List Node<E>
 * At the end of class submit this file to the Submission System
 * assignment In-class Single-Linked List
 */
public class SLLPractice {

	public static void main(String[] args) {

		//(1)  finish creating the SLL
		//  head -> [Barb |-]-> [Marty |-]-> [Liz |-]-> [Janet |null]
		Node<String> head = new Node<>("Janet");
		head = new Node<>("Liz", head);
        head = new Node<>("Marty", head);
        head = new Node<>("Barb", head);


		//(2) Add Ronnie to the front of the list
        head = new Node<>("Ronnie", head);


		//(3) Add Christy to the end of the list
        Node<String> ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }

        ptr.next = new Node<String>("Christy", null);

		//(4) Remove the element at "index" 2

        ptr = head.next; //
        ptr.next = ptr.next.next;


		//(5) Remove the last element in the list
        ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }

        ptr.next = null;


		//this code will print the SLL
		Node<String> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}//while
		System.out.println();

	}//main


	/** A Node is the building block for the SingleLinkedList */
    private static class Node<E> {

        /** The data value. */
        private E data;
        /** The link */
        private Node<E> next = null;

        /**
         * Construct a node with the given data value and link
         * @param data - The data value
         * @param next - The link
         */
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        /**
         * Construct a node with the given data value
         * @param data - The data value
         */
        public Node(E data) {
            this(data, null);
        }
    }//Node<E>

}//SLLPractice