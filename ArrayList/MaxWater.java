import java.util.*;

public class MaxWater {
    public static int MaxWaterStore(ArrayList<Integer> height) {
        // Brute Force Method having Time Complexity O(n^2)

        // int WaterStore = 0;
        // for(int i = 0;i<height.size();i++){
        // for(int j = i+1;j<height.size();j++){
        // int high = Math.min(height.get(i),height.get(j));
        // int width = j-i;
        // int currentwater = high * width;
        // WaterStore = Math.max(WaterStore,currentwater);
        // }
        // }
        // return WaterStore;

        // Optimized Method having Time complexity O(n)---(2 Pointer Approach)

        //                             OR

        int WaterStore = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int high = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currentwater = high * width;
            WaterStore = Math.max(WaterStore, currentwater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return WaterStore;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.print("Maximum water can store is: " + MaxWaterStore(height));
    }
}
