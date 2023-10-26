package useSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {

        ArrayList<String> ls = new ArrayList<>();
        ls.add("Ali Bilmem");
        ls.add("Ali Bilmem");
        ls.add("Ali Bilmem");
        ls.add("Ahmet");
        ls.add("Zehra");
        ls.add("Zehra");
        ls.add("Serkan");
        ls.add("Batuhan");

        System.out.println(ls);

        Set<String> set = new HashSet<>();
        set.add("Ali Bilmem");
        set.add("Ali Bilmem");
        set.add("Ali Bilmem");
        set.add("Ahmet");
        set.add("Zehra");
        set.add("Zehra");
        set.add("Serkan");
        set.add("Batuhan");
        System.out.println(set);

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Ali Bilmem");
        linkedSet.add("Ali Bilmem");
        linkedSet.add("Ali Bilmem");
        linkedSet.add("Ahmet");
        linkedSet.add("Zehra");
        linkedSet.add("Zehra");
        linkedSet.add("Serkan");
        linkedSet.add("Batuhan");
        System.out.println(linkedSet);

    }
}
