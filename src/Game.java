import java.util.ArrayList;

public class Game {
    private final int SIZE = 20;
    private Cell[][] cells;

    public Game() {
        cells = new Cell[SIZE][SIZE];

        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                boolean alive = false;
                if ((int)Math.round(Math.random()) != 0) {
                    alive = true;
                }
                cells[x][y] = new Cell(alive);
            }
        }
    }

    void update(){
        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                if (x != 0 && x != SIZE - 1 && y != 0 && y != SIZE - 1) {
                    cells[x][y].setLivingNeighbours(countLivingNeighbours(x, y));
                }

                cells[x][y].update();
            }
        }
    }

    private int countLivingNeighbours(int x, int y) {
        int result = 0;

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (cells[i][j].isAlive()) {
                    result++;
                }
            }
        }

        if (cells[x][y].isAlive()) {
            result--;
        }

        return result;
    }
}
