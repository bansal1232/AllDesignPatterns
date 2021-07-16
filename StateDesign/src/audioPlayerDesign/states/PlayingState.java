package audioPlayerDesign.states;

import audioPlayerDesign.userInterface.Player;

import static audioPlayerDesign.constants.Constants.*;

public class PlayingState extends State {

    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return STOP_PLAYING;
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return PAUSED;
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
