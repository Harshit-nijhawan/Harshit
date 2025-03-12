import java.util.*;
public class MultiDArrayList{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in Array1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number of elements in Array2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number of elements in Array3: ");
        int n3 = sc.nextInt();
        System.out.print("Enter elements of Array1: ");
        for(int i = 0;i<n1;i++){
            List1.add(sc.nextInt());
        }
        System.out.print("Enter elements of Array2: ");
        for(int i = 0;i<n2;i++){
            List2.add(sc.nextInt());
        }
        System.out.print("Enter elements of Array3: ");
        for(int i = 0;i<n3;i++){
            List3.add(sc.nextInt());
        }
        MainList.add(List1);
        MainList.add(List2);
        MainList.add(List3);
        System.out.println(MainList);
        for(int i = 0;i<MainList.size();i++){
            ArrayList<Integer> CurrentList = MainList.get(i);
            for(int j = 0;j<CurrentList.size();j++){
                System.out.print(CurrentList.get(j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}