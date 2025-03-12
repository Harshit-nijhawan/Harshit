public class countGridWays {
    public static int gridWays(int x,int y,int rows,int cols){
        if(x == rows-1 && y == cols-1){
            return 1;
        }
        else if(x == rows || y == cols){
            return 0;
        }
        int W1 = gridWays(x+1,y,rows,cols);
        int W2 = gridWays(x,y+1,rows,cols);
        return W1 + W2;
    }
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        System.out.println(gridWays(0,0,rows,cols));
    }
}
