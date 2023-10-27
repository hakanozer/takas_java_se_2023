package restClient;

import java.util.List;

public class MainRest {
    public static void main(String[] args) {

        RestApi restApi = new RestApi();
        List<Product> ls = restApi.allProducts();
        System.out.println( ls.get(0).getTitle() );

       JWTUser jwtUser = restApi.login("kminchelle","0lelplR");
       if (jwtUser != null) {
           System.out.println(jwtUser.getFirstName() + " " + jwtUser.getLastName());
       }else {
           System.out.println("Username or Password Fail!");
       }

    }
}
