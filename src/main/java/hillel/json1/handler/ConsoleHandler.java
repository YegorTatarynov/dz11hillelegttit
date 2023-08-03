package hillel.json1.handler;

import hillel.json1.model.Product;

import java.util.Scanner;

public class ConsoleHandler {

    Scanner scanner = new Scanner(System.in);
    public void productScan(){
        while (true){
            System.out.printf("Напишите print - чтобы напечатать вашу корзину с товарами," +
                    " add чтобы добавить новый продукт или exit...");
            String str = scanner.next();
            if (str.equals("print")) {
                System.out.printf("add");
            } else if (str.equals("add")){
                Product product = new Product();
                System.out.printf("Добавьте название товара");
                String nameProduct = scanner.nextLine();
                product.setName(nameProduct);
                System.out.printf("Добавьте цену товара");
                scanner.nextLine();
                product.setPrice();
            }
        }
    }
}
