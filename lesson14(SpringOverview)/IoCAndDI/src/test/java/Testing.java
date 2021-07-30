import entities.ClassicalMusic;
import entities.IMusic;
import entities.JazzMusic;
import entities.MusicPlayer;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author koshk
 */
public class Testing {
    private IMusic music;

    @Test
    public void classicalGetSongTest() {
        music = new ClassicalMusic();
        Assert.assertEquals("Ave Maria", music.getSong());
    }

    @Test
    public void jazzGetSongTest() {
        music = new JazzMusic();
        Assert.assertEquals("Four", music.getSong());
    }

    @Test
    public void playMusicTest() {
        music = new ClassicalMusic();
        MusicPlayer musicPlayer = new MusicPlayer(music);

        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArr);
        System.setOut(printStream);
        musicPlayer.playMusic();

        Assert.assertEquals("Playing: Ave Maria" + System.lineSeparator(), byteArr.toString());
    }
}
