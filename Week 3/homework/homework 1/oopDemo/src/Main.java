public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.giveCredit();
    }
}