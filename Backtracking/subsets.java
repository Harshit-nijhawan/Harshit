public class subsets {
    public static void FindSubsets(String str,int i,String ans){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        FindSubsets(str,i+1,ans+str.charAt(i));
        FindSubsets(str,i+1,ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        FindSubsets(str,0,"");
    }
}
