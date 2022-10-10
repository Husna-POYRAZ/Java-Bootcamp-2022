public class Main {
    public static void main(String[] args) {
//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.calculate();
//		creditManager.save();
//
//		Customer customer = new Customer(); //örneğini oluşturmak,instance oluşturmak,instance creation
//		customer.id = 1;
//		customer.city = "Ankara";
//
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.delete();
//
//		Company company = new Company();
//		company.taxNumber="100000";
//		company.companyName= "Arçelik";
//		company.Id=100;
//
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//
//		Person person = new Person();
//		person.firstName = "Hüsna";
// 		person.lastName = "POYRAZ";
//		person.NationalIdentity= "12*****12";
//
//		Customer c1 = new Customer();
//		Customer c2 = new Person();
//		Customer c3 = new Company();


        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();
    }
}