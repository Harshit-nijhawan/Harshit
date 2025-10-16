public class wordBreak {
    public static class Node{
        Node childern[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i = 0;i<26;i++){
                childern[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level = 0;level<word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.childern[idx] == null){
                curr.childern[idx] = new Node();
            }
            curr = curr.childern[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if(curr.childern[idx] == null){
                return false;
            }
            curr = curr.childern[idx];
        }
        curr.eow = true;
        return curr.eow;
    }

    public static boolean findWord(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i = 1;i<=key.length();i++){
            if(search(key.substring(0,i)) && findWord(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"i","like","sam","samsung","ice"};
        for(int i = 0;i<arr.length;i++){
            insert(arr[i]);
        }
        System.out.println(findWord("ilikesamsungice"));

    }
}
