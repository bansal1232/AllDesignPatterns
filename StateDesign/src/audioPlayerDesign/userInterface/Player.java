package audioPlayerDesign.userInterface;

import audioPlayerDesign.states.ReadyState;
import audioPlayerDesign.states.State;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private boolean playing = false;
    private final List<String> playList = new ArrayList<>();
    private int currentTrack = 0;


    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);

        for (int i = 1; i <= 10; ++i)
            playList.add("Track " + i);
    }

    public State getState() {
        return state;
    }

    private void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return "Playing " + playList.get(currentTrack);
    }


    public String nextTrack(){
        currentTrack++;
        if (currentTrack > playList.size() - 1) {
            currentTrack = 0;
        }
        return "Playing " + playList.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playList.size() - 1;
        }
        return "Playing " + playList.get(currentTrack);
    }

    public void setCurrentTrackAfterStop(){
        this.currentTrack = 0;
    }

    public void changeState(State state) {
        this.state = state;
    }


}
