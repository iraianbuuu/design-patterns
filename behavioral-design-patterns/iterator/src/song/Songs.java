package song;

import java.util.ArrayList;
import java.util.List;
import walker.Walker;

public abstract class Songs {
    private List<Song> songs;

    public Songs() {
        this.songs = new ArrayList<>();
    }

    public void addSongs(List<Song> songs) {
        this.songs.addAll(songs);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public abstract Walker createWalker();

}