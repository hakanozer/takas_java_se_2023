package property;

public class MainProperty {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setPid(100);
        p1.setTitle("TV");
        p1.setDetail("TV Detail");
        p1.setPrice(10000);
        String[] images = {"tv1.jpg", "tv2.jpg" };
        p1.setImages(images);
        Category c = new Category();
        c.setCid(1);
        c.setName("Elektronik");
        p1.setCategory(c);

        Product p2 = new Product();
        p2.setPid(200);
        p2.setTitle("Phone");
        p2.setDetail("Phone Detail");
        p2.setPrice(30000);
        String[] images2 = {"phone1.jpg", "phone2.jpg", "phone3.jpg" };
        p2.setImages(images2);
        p2.setCategory(c);

        Product[] products = {p1, p2};

        for (Product item : products ) {
            //System.out.println(item.getTitle() + " " + item.getPrice());
            System.out.println(item);
        }

    }
}
