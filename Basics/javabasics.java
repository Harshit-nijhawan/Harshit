package Basics;
import java.util.*;
public class javabasics {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area =3.14f * radius * radius;
        System.out.println(area);
        sc.close();
    }
}
