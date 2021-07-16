package audioPlayerDesign;

import audioPlayerDesign.userInterface.Player;
import audioPlayerDesign.userInterface.UI;

/**
 * Reference:
 * @link https://refactoring.guru/design-patterns/state/java/example#example-0
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
