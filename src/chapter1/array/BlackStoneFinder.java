package chapter1.array;

public class BlackStoneFinder {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for (int i=0; i<board.length; i++) {
            for (int k=0; k< board[i].length; k++) {
                if (board[i][k]) {
                    System.out.println("검은돌(●) 위치: (" + i + "," + k + ")");
                }
            }
        }
    }
}
