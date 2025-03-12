import java.util.*;
public class RotateArrayBy90 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][]= new int [row][col];
        if(row==col){
            for(int i =0;i<row;i++){
                for(int j = 0;j<col;j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        else{
            System.out.print("Cannot rotate if row and columns are not equal");
        }
        int newMatrix[][]= new int[row][col];
        for(int i =0;i<col;i++){
            for(int j = 0;j<row;j++){
                newMatrix[i][j] = matrix[j][i];
            }
        }
        for(int i = 0;i<row;i++){
            int start = 0;
            int end = row - 1;
            while(start<end){
                int temp = newMatrix[i][start];
                newMatrix[i][start]=newMatrix[i][end];
                newMatrix[i][end] = temp;
                start++;
                end--;
            }
        }
        for(int i =0;i<col;i++){
            for(int j = 0;j<row;j++){
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
