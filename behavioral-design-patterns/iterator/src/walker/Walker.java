package walker;

import songs.Songs;

public class Walker {
    public boolean hasNext() {
        return true;
    }

    public Songs next() {
        return new Songs();
    }

    public boolean hasPrevious() {
        return true;
    }

    public Songs previous() {
        return new Songs();
    }
}
