public class KaprekarNo {
    public static boolean iskaprekar(int n){
        if(n==1){
            return true;
        }
        int square = n * n;
        String strSquare = String.valueOf(square);
        for(int i = 1;i<strSquare.length();i++){
            int leftPart = Integer.parseInt(strSquare.substring(0, i));
            int rightPart = Integer.parseInt(strSquare.substring(i));
            if(rightPart!=0 && leftPart + rightPart == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(iskaprekar(9));
    }
}
