package simpleStateDesign;

public class Delivered implements PackageState
{
    //Singleton
    private static Delivered Deliveredinstance = new Delivered();

    private Delivered() {}

    public static Delivered getDeliveredinstance() {
        return Deliveredinstance;
    }

    //Business logic
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is delivered!!");
    }
}