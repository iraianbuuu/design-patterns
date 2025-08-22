package song;

import walker.SimpleOrderWalker;
import walker.Walker;

public class SimpleOrderSongs extends Songs {

    public SimpleOrderSongs() {
        super();
    }

    @Override
    public Walker createWalker() {
        return new SimpleOrderWalker(this.getSongs());
    }

}
