import entities.ClassicalMusic;
import entities.IMusic;
import entities.JazzMusic;
import entities.MusicPlayer;

/**
 * @author koshk
 */
public class Main {
    public static void main(String[] args) {
        IMusic music = new ClassicalMusic();
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        music = new JazzMusic();
        musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();
    }
}
