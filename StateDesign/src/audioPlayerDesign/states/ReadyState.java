package audioPlayerDesign.states;

import audioPlayerDesign.userInterface.Player;

import static audioPlayerDesign.constants.Constants.LOCKED_STATE;

public class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return LOCKED_STATE;
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
    }

    @Override
    public String onNext() {
        return LOCKED_STATE;
    }

    @Override
    public String onPrevious() {
        return LOCKED_STATE;
    }
}
