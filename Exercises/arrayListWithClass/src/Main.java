import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "Hüsna", "POYRAZ"));
        customers.add(new Customer(2, "Nur", "POYRAZ"));
        customers.add(new Customer(3, "Ayşe", "POYRAZ"));

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }

        System.out.println("*****");
/*
        // remove() method kullanımı
        // Hatalı kullanım
        customers.remove(new Customer(1, "Hüsna", "POYRAZ")); // yeni customer oluşturup siler
        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }

        // Doğru kullanım
        Customer husna = new Customer(1, "Hüsna", "POYRAZ");
        customers.add(husna);
        customers.remove(husna); // alınan objenin referansına göre obje silinir.
*/


    }
}