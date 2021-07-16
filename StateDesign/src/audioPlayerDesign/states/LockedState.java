package audioPlayerDesign.states;

import audioPlayerDesign.userInterface.Player;

import static audioPlayerDesign.constants.Constants.*;

public class LockedState extends State {

    LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return STOP_PLAYING;
        } else {
            return LOCKED_STATE;
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return READY;
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
