package useDB;

import java.util.List;

public class MainDB {
    public static void main(String[] args) {

        CustomerService service = new CustomerService();
        int deleteStatus =  service.customerDelete(2);
        System.out.println("deleteStatus: " + deleteStatus);
        //int addStatus = service.customerAdd("Zehra", "zehra@mail.com", "12345");
        //System.out.println(addStatus);
        List<Customer> ls = service.allCustomer();
        for (Customer item : ls) {
            System.out.println(item);
        }
    }
}
