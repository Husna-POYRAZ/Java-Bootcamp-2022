public class MySqlCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("MySql veri tabanına eklendi.");
    }
}
