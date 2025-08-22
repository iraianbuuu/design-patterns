package walker;

import song.Song;

public interface Walker {
    public boolean hasNext();

    public Song next();

    public boolean hasPrevious();

    public Song previous();
}
