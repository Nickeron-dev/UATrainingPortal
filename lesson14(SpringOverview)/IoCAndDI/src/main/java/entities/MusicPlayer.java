package entities;

public class MusicPlayer {
    private final IMusic music;

    public MusicPlayer(IMusic music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
