public class IntersectionOfTwoLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node pointOfIntersection(Node head1,Node head2){
            while(head1 != null){
                Node temp = head2;
                while(temp != null){
                    if(temp == head1){
                        return head1;
                    }
                    temp = temp.next;
                }
                head1 = head1.next;
            }
            return null;
        }
        public static void main(String[] args) {
            IntersectionOfTwoLL ll = new IntersectionOfTwoLL();
            Node head1 = new Node(1);
            Node head2 = new Node(4);
            Node newNode = new Node(2);
            head1.next = newNode;
            newNode = new Node(3);
            head1.next.next = newNode;
            newNode = new Node(5);
            head2.next = newNode;
            newNode = new Node(6);
            head1.next.next.next = newNode;
            head2.next.next = newNode;
            newNode = new Node(7);
            head2.next.next.next = newNode;
            head2.next.next.next.next = null;
            Node intersectionPoint = ll.pointOfIntersection(head1,head2);

        if( intersectionPoint == null){
            System.out.println("No intersecting point");
        }
        else{
            System.out.println("Intersection point: "+ intersectionPoint.data);
        }
    }
}
