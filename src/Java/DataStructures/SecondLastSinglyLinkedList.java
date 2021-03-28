package DataStructures;

/**Give an algorithm for finding the second-to-last node in a singly linked list in
 which the last node is indicated by a null next reference.
 In our example, the last element is 0, we need to retrieve 1*/
class SecondLastSinglyLinkedList {
    // first element of the linked list
    Node head;

    // Node class to create Node object that consists of pointer and value
    class Node {
        Node next;
        int data;

        public Node(int num) {
            data = num;
            next = null;
        }
    }
    // printing the second last number of linked list
    void secondToLastNumber(){
        Node first = head;
        if(first == null){
            System.out.println("No Elements in the Linked List");
        }
        else if(first.next == null){
            System.out.println("Only one element in the Linked List");
        }
        else{
            while(first.next.next != null){
                first = first.next;
            }
            System.out.println("Second last element is: " + first.data);
        }
    }
    // adding elements to the front of the linked list
    public void add(int newData){
        Node node = new Node(newData);
        node.next = head;
        head = node;
    }

    public static void main(String[] args) {
        SecondLastSinglyLinkedList linkedList = new SecondLastSinglyLinkedList();
        for(int i = 0; i < 10; i++){
            linkedList.add(i);
        }
        linkedList.secondToLastNumber(); // prints out second last element
    }
}

