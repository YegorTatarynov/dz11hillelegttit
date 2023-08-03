package hillel.json1.db;

import hillel.json1.model.Product;

import java.util.ArrayList;

/**
 * @author Serhii Klunniy
 */
public class ProductDB {
    private static ArrayList<Product> productArrayList = new ArrayList<>() {{
        add(new Product("bread", 10.5));
        add(new Product("milk", 15.5));
    }};

    public static ArrayList<Product> getProductArrayList() {
        //здесь отсортировать по дате
        return productArrayList;
    }

    public static void setProduct(Product product) {
        if (product != null)
            productArrayList.add(product);
    }
}
