public class Cell {
    private int livingNeighbours;
    private boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }

    void update() {
        if (alive) {
            if (livingNeighbours < 2 || livingNeighbours > 3) {
                alive = false;
            }
        }
        else {
            if (livingNeighbours == 3) {
                alive = true;
            }
        }
    }

    public int getLivingNeighbours() {
        return livingNeighbours;
    }

    public void setLivingNeighbours(int livingNeighbours) {
        this.livingNeighbours = livingNeighbours;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
