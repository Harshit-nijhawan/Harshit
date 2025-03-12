import java.util.*;

public class SinglyLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public  int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("linkedList is empty");
            ;
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node pre = head;
        for (int i = 0; i < size - 2; i++) {
            pre = pre.next;
        }
        int val = pre.next.data;
        pre.next = null;
        tail = pre;
        size--;
        return val;
    }

    public int itrsearch(int key){
        Node temp = head;
        int i =0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void reverse(){
        Node curr = tail = head;
        Node prev = null;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void delNthNode(){
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        Scanner sc = new Scanner(System.in);
        int i =1;
        System.out.println("Enter which node from the End you want to Delete: ");
        int n = sc.nextInt();
        if(sz == n){
            head = head.next;
            sc.close();
            return;
        }
        int iToFind = sz - n;
        Node pre = head;
        while(i<iToFind){
            pre = pre.next;
            i++;
        }
        pre.next = pre.next.next;
        sc.close();
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPlindrome(){
    if(head==null || head.next==null){
        return true;
    }
    Node mid = findMid(head);
    Node curr = mid;
    Node prev = null;
    while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    while(right != null){
        if(left.data != right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        SinglyLinkedList ll = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        // int idx = sc.nextInt();
        // int data = sc.nextInt();
        ll.addFirst(1);
        ll.addLast(2);
        // ll.addFirst(0);
        ll.addLast(3);
        // ll.addLast(4);   
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        // ll.add(idx, data);
        ll.print();
        // System.out.println("Size of LinkedList is:" + ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println("Size of LinkedList is:" + ll.size);
        // ll.removeLast();
        // ll.print();
        System.out.println("Size of LinkedList is:" + ll.size);
        // ll.reverse();
        // ll.print();
        // ll.delNthNode();
        // ll.print();
        if(ll.isPlindrome()){
            System.out.println("The linkedlist is palindrome");
        }
        else{
            System.out.println("Linked list is not palindrome");
        }
        
        // int key = sc.nextInt();
        // System.out.println(ll.itrsearch(key));
        sc.close();
    }
}