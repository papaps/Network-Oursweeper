package Game;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private boolean alive;

    public Player(String name){
        this.name = name;
        this.alive = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
