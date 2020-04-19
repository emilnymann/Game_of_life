import java.util.ArrayList;

public class Game {
    private final int SIZE = 20;
    private Cell[][] cells;

    private int countLivingNeighbours(int x, int y) {
        int result = 0;

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (cells[i][j].isAlive()) {
                    result++;
                }
            }
        }

        return result;
    }
}
