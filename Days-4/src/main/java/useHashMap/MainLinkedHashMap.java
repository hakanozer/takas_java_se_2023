package useHashMap;

import java.util.LinkedHashMap;

public class MainLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<EApp, Object> hm = new LinkedHashMap<>();
        hm.put(EApp.id, 110);
        hm.put(EApp.name, "Emrah Bil");
        hm.put(EApp.email, "emrah@mail.com");
        hm.put(EApp.age, 25);
        hm.put(EApp.status, true);
        hm.put(EApp.number, 55.6);

        System.out.println(hm);

    }
}
