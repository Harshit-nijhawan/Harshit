import java.util.*;

public class activitySelection {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};   // already sorted given in the question 
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        int lastEnd = end[0];
        ans.add(0);
    for(int i = 1;i<start.length;i++){
        if(start[i]>=lastEnd){
            ans.add(i);
            maxAct++;
            lastEnd = end[i];
        }
    }
    System.out.println("Maximum Activity: "+ maxAct);
    for(int i = 0;i<ans.size();i++){
        System.out.print("A" + ans.get(i)+" ");
    }
    System.out.println();
}
}
