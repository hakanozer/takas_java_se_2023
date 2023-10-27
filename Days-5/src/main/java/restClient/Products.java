package restClient;

import lombok.Data;

import java.util.List;

@Data
public class Products {
    private List<Product> products;
    private long total;
    private long skip;
    private long limit;
}