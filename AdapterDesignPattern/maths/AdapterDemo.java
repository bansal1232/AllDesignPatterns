package AdapterDesignPattern.maths;

import AdapterDesignPattern.maths.adapters.SquarePegAdapter;
import AdapterDesignPattern.maths.round.RoundHole;
import AdapterDesignPattern.maths.round.RoundPeg;
import AdapterDesignPattern.maths.square.SquarePeg;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if(hole.fits(roundPeg)) {
            System.out.println("Round peg fits");
        }

        SquarePeg smallSquarePeg = new SquarePeg(20);
        SquarePeg bigSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        if (hole.fits(smallSquarePegAdapter)) {
            System.out.println("Small square peg fits");
        }

    }
}
