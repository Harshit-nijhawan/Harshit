import java.util.*;

public class MaxInArrayList {
    public static int Max(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int MaxElement = Max(arr);
        System.out.println("Maximum element is ArrayList : " + MaxElement);
        sc.close();;
    }
}
