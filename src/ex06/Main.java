package ex06;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Laptop", 1500),
                new Product("Mouse", 20),
                new Product("Keyboard", 50),
                new Product("Monitor", 300)
        };
        // 1. Sắp xếp theo giá tăng dần - dùng Anonymous Class
        Arrays.sort(products, new Comparator<Product>() {
            // Dùng Anonymous Class khi:
            // - cần thêm biến nội bộ hoặc logic phức tạp
            // - muốn tạo class tạm có hành vi riêng
            // Lambda chỉ phù hợp khi code ngắn gọn

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Danh sách sắp xếp theo giá tăng dần:");
        for (Product p : products) {
            System.out.println(p);
        }

        // 2️. Sắp xếp theo tên A-Z - dùng Lambda Expression
        Arrays.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("\nDanh sách sắp xếp theo tên A-Z:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
