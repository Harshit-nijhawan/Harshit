public class DoublyLL {
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        
        public void addFirst(int data){
            Node newnode = new Node(data);
            size++;
            if(head == null){
                head = tail = newnode;
            }
            else{
                newnode.next = head;
                head.prev = newnode;
                head = newnode; 
            }
        }
        public int removeFirst(){
            int val = 0;
            if(head == null){
                System.out.print("Doubly Linked List is empty");
            }
            else if (size == 1){
                val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            else{
                val = head.data;
                head = head.next;
                head.prev = null;
                size--;
            }
            return val;
        }
        public void reverse(){
            Node curr = head;
            Node prev = null;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev;
            
        }
        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+"<->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // dll.removeFirst();
        // dll.print();
        dll.reverse();
        dll.print();

    }
}
