public class prefix_problem {
    public static class Node{
        Node childern[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node(){
            for(int i = 0;i<childern.length;i++){
                childern[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.childern[idx] == null){
                curr.childern[idx] = new Node();
            }
            else{
                curr.childern[idx].freq++;
            }
            curr = curr.childern[idx];
        }
        curr.eow = true;
    }
    
    public static void findPrefix(Node root,String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }

        for(int i = 0;i<root.childern.length;i++){
            if(root.childern[i] != null){
                findPrefix(root.childern[i], ans+(char)(i + 'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra","dog","duck","dove"};
        for(int i = 0;i<arr.length;i++){
            insert(arr[i]);
        }
        root.freq = -1;  
        findPrefix(root, "");
    }
}
