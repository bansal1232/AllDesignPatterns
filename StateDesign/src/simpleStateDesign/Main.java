package simpleStateDesign;
/**
 * Reference:
 * @link https://howtodoinjava.com/design-patterns/behavioral/state-design-pattern/
 */
public class Main {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext(null, "Test");
        context.update();
        context.update();
        context.update();
        context.update();
        context.update();
        context.update();
        context.update();

    }
}
