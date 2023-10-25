package property;

import lombok.Data;

@Data
public class Product {

    private int pid;
    private String title;
    private String detail;
    private int price;
    private String[] images;
    private Category category;

}
