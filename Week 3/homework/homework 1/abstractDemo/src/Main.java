public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();

        CustomerManager customerManager2 = new CustomerManager();
        customerManager2.databaseManager = new SqlServerDatabaseManager();
        customerManager2.getCustomers();
    }
}