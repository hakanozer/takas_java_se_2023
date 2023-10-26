package useHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MainHashMap {
    public static void main(String[] args) {

        HashMap<String, Object> hm = new HashMap<>();

        // add item
        hm.put("id", 100);
        hm.put("name", "Erkan Bilsin");
        hm.put("name", "Serkan Bilsin");
        hm.put("email", "ali@mail.com");
        hm.put("status", true);
        hm.put("age", 35);
        hm.put("number", 45.6);

        // get item
        System.out.println( hm.get("name") );

        // remove item
        Object objRemove = hm.remove("agex");
        if (objRemove != null) {
            System.out.println("Delete Success");
        }else {
            System.out.println("Not Found!");
        }

        Set<String> sets = hm.keySet();
        for (String key : sets) {
            System.out.println(key + " - " + hm.get(key));
        }

        System.out.println("============================");
        // Java 8 Map Loop
        hm.forEach( (k, v) -> {
            System.out.println(k + " - " + v);
        });

        // hm.clear();
        System.out.println(hm.size());
        hm.replace("age", 30);

        boolean statusKey = hm.containsKey("name");
        System.out.println("statusKey: " + statusKey);

        Collection<Object> arr = hm.values();
        for (Object val : arr) {
            System.out.println(val);
        }

        System.out.println("============================");
        System.out.println(hm);

        // Enum with HashMap
        HashMap<EApp, Object> hmEnum = new HashMap<>();

        hmEnum.put(EApp.id, 110);
        hmEnum.put(EApp.name, "Emrah Bil");
        hmEnum.put(EApp.email, "emrah@mail.com");
        hmEnum.put(EApp.age, 25);
        hmEnum.put(EApp.status, true);
        hmEnum.put(EApp.number, 55.6);

        System.out.println(EApp.name);
        System.out.println(hmEnum);

    }
}
