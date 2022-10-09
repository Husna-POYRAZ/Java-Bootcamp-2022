public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger()};
        for (BaseLogger logger: loggers) {
            logger.log("Log message");
        }

        System.out.println("*****************");

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

        CustomerManager customerManager2 = new CustomerManager(new FileLogger());
        customerManager2.add();
    }
}