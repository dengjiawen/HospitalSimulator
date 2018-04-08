package tile;

import java.io.Serializable;

class Tile implements Serializable {

    private byte tile_type;
    private byte room_type;

    private int x;
    private int y;

    private boolean buildable;
    private boolean destructable;

    public Tile (int x, int y, byte tile_type, byte room_type, boolean buildable, boolean destructable) {
        this.x = x;
        this.y = y;

        this.tile_type = tile_type;
        this.room_type = room_type;

        this.buildable = buildable;
        this.destructable = destructable;
    }

}
