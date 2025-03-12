import java.util.*;
public class ThreeDArray {
    public static void main(String[] args) {
        int array[][][] = new int [3][3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                for(int k = 0;k<array[i][j].length;k++){
                    array[i][j][k] = sc.nextInt();
                }
            }
        }
        int maxVal = array[0][0][0];
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 
                for (int k = 0; k < array[i][j].length; k++) { 
                    if(maxVal<array[i][j][k]){
                        maxVal = array[i][j][k];
                    }
                }
            }
        }
        System.out.println(maxVal);
        sc.close();
    }
}
