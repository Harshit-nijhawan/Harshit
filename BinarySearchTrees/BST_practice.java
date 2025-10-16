public class BST_practice {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void addDuplicate(Node root){
        if(root == null){
            return;
        }
        addDuplicate(root.left);
        addDuplicate(root.right);
        Node duplicate = new Node(root.data);
        duplicate.left = root.left; 
        root.left = duplicate;
    }
    static int count = 0;
    static int result = -1;
    static void KthSmallest(Node root,int key){
        
        if(root == null){
            return;
        }
        KthSmallest(root.left,key);
        count++;
        if(count == key){
            result = root.data;
            return;
        }
        KthSmallest(root.right,key);
    }
    static int sum = 0;
    static void replaceWithGreaterSum(Node root){
        if(root == null){
            return;
        }
        replaceWithGreaterSum(root.right);

        sum += root.data;
        root.data = sum;

        replaceWithGreaterSum(root.left);
    }
    static int findtotalSum(Node root){
        if(root == null){
            return 0;
        }
        return root.data + findtotalSum(root.left) + findtotalSum(root.right);
    }
    static void replaceWithSum(Node root,int totalSum){
        if(root==null){
            return;
        }
        root.data = totalSum;
        replaceWithSum(root.left,totalSum);
        replaceWithSum(root.right,totalSum);
    }
    public static void main(String[] args) {
        int val[] = {50,30,20,40,70,60,80};
        Node root = null;
        for(int i = 0;i<val.length;i++){
            root = insert(root,val[i]);
        }
        inorder(root);
        // addDuplicate(root);
        // System.out.println();
        // inorder(root);

        // KthSmallest(root,4);
        // System.out.println();
        // if(result !=-1){
        //     System.out.println("Kth smallest element is "+result);
        // }
        // else{
        //     System.out.println("Tree has fewer than K nodes");
        // }

        // replaceWithGreaterSum(root);
        // System.out.println();
        // inorder(root);

        int totalSum = findtotalSum(root);
        replaceWithSum(root, totalSum);
        System.out.println();
        inorder(root);
    }
}
