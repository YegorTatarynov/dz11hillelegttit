package hillel.json1;

import hillel.json1.db.ProductDB;
import hillel.json1.model.Product;

import java.util.Scanner;

/**
 * @author Serhii Klunniy
 */
public class Main {


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("выберите add, print, exit");
            while (true) {
                String str = scanner.nextLine();
                if (str != null) {
                    switch (str) {
                        case "add":
                            add(scanner);
                        case "print":
                            print();
                        case "exit": {
                            return;
                        }
                    }
                }
            }
        }
    }
     private void add(Scanner scanner){
         System.out.println("Введите название товара");
         String nameProduct = scanner.nextLine();

         System.out.println("Введите цену товара");
         String priceProduct = scanner.nextLine();

         Product product = new Product(nameProduct, Double.parseDouble(priceProduct));

         ProductDB.setProduct(product);
     }

     private static void print(){

     }
}
