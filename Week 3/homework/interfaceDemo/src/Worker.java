public class Worker implements IWorkable,IEatable, IPayable {
    @Override
    public void work() {
        System.out.println("Çalışabilir.");
    }

    @Override
    public void eat() {
        System.out.println("Yemek yiyebilir.");
    }

    @Override
    public void pay() {
        System.out.println("Ödeme alabilir.");
    }
}
