package useDB;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private int cid;
    private String name;
    private String email;
    private String password;

}
