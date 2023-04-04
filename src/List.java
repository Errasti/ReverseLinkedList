public class List {
    private Node head;
    private Node tail;

    class Node{
        private int value;
        private Node next;
        private Node previous;
    }

    public void revert(){
        Node node = head;
        Node temp = head;
        head = tail;
        tail = temp;

        while (node.next != null) {
            temp = node.next;
            node.next = node.previous;
            node.previous = temp;
            node = node.previous;
        }
    }
}