package walker;

import java.util.List;

import song.Song;

public class SimpleOrderWalker implements Walker {
    private List<Song> songs;
    private int currentIndex;

    public SimpleOrderWalker(List<Song> songs) {
        this.songs = songs;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < songs.size();
    }

    @Override
    public Song next() {
        if (!hasNext())
            return null;
        return songs.get(currentIndex++);
    }

    @Override
    public boolean hasPrevious() {
        return currentIndex > 0;
    }

    @Override
    public Song previous() {
        if (!hasPrevious())
            return null;
        return songs.get(currentIndex - 1);
    }

}
