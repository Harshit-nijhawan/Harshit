public class StringPalindrome {
    public static boolean isPalindrome(String name) {
        // for(int i = 0;i<n/2;i++){
        // if(name.charAt(i)!=name.charAt(n-1-i)){
        // return false;
        // }
        // }
        // return true;
        int i = 0;
        int j = name.length() - 1;
        while (i < j) {
            if (name.charAt(i) != name.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]) {
        String name = "nitin";
        // int n = name.length();
        System.out.print(isPalindrome(name));
    }
}