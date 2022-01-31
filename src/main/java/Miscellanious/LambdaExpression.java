package Miscellanious;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {

    public static void main(String[] args) {

        int width = 10;
        Drawable d = () -> {
            System.out.println("Hello " + width);
        };
        d.draw();

        Addition n = (a, b) -> (a + b);

        System.out.println(n.add(100, 400));

        Addition m = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(m.add(100, 200));

        List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(
                (k) -> System.out.println(k)
        );


        List<Product> list2 = new ArrayList<Product>();

        //Adding Products
        list2.add(new Product(1, "HP Laptop", 25000f));
        list2.add(new Product(3, "Keyboard", 300f));
        list2.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list2, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list2) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

    }
}

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

interface Drawable {
    public void draw();
}

interface Addition {
    public int add(int a, int b);
}