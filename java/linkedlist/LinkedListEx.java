public class LinkedListEx<T> {
    Node head;
    //constructing object Linked List
    public LinkedListEx() {
        head = null; //need the head to find out where the other elements are
    }

    public void add(Object value) { //in order to add an element
        Node newNode = new Node(value, null); //create new node, assume we don't know where the head is
        if (head == null) { //if there is no previous node
            head = newNode;
        } else { //if head is not null
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete() { //just deleting from the top
        head = head.next;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.println((T) n.value);
            n = n.next;
        }
    }
}
