package restClient;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.jsoup.Jsoup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestApi {

    public List<Product> allProducts() {
        List<Product> list = new ArrayList<>();
        try {
            String url = "https://dummyjson.com/products";
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().body().text();

            Gson gson = new Gson();
            Products props = gson.fromJson(stData, Products.class);
            list = props.getProducts();
            /*
            JsonObject obj = gson.fromJson(stData, JsonObject.class);
            int total = obj.get("total").getAsInt();
            JsonArray arr = obj.get("products").getAsJsonArray();
            for (JsonElement item : arr){
                JsonObject ob = item.getAsJsonObject();
                String title = ob.get("title").getAsString();
                System.out.println(title);
            }
            System.out.println(total);
             */
        }catch (Exception ex) { }
        return list;
    }


    public JWTUser login(String username, String password) {
        String url = "https://dummyjson.com/auth/login";
        Map<String, String> hm = new HashMap<>();
        hm.put("username", username);
        hm.put("password", password);

        try {
            String stData = Jsoup
                    .connect(url)
                    .data(hm)
                    .timeout(15000)
                    .ignoreContentType(true)
                    .post()
                    .body()
                    .text();
            Gson gson = new Gson();
            JWTUser jwtUser = gson.fromJson(stData, JWTUser.class);
            return jwtUser;
        }catch (Exception ex) {
            //System.err.println("Login Fail : " + ex);
        }
        return null;
    }

}
