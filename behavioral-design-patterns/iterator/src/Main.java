import song.SimpleOrderSongs;
import song.Song;
import walker.Walker;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleOrderSongs songs = new SimpleOrderSongs();
        songs.addSongs(Arrays.asList(
                new Song("Blinding Lights", "The Weeknd"),
                new Song("Heartless", "The Weeknd"),
                new Song("In Your Eyes", "The Weeknd"),
                new Song("Save Your Tears", "The Weeknd")));

        Walker walker = songs.createWalker();

        while (walker.hasNext()) {
            System.out.println(walker.next().getTitle());
        }
    }
}
