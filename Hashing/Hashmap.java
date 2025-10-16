import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(105,"sam");
        hmap.put(73,"Patrick");
        hmap.put(99,"tom");
        hmap.put(110,"john");
        hmap.put(853,"pranjal");
        // hmap.remove(105);
        // hmap.replace(853, "pranjal","pranjal Sharma");
        // System.out.println(hmap.keySet());
        System.out.println(hmap);
        TreeMap<Integer,String> tmap = new TreeMap<>(hmap);
        System.out.println(tmap);
        
    }
}
