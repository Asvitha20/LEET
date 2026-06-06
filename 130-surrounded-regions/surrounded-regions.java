class Solution {
    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[row][col];

        // Left and Right boundaries
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') {
                q.add(new Pair(i, 0));
                visited[i][0] = true;
                board[i][0] = '#';
            }

            if (board[i][col - 1] == 'O') {
                q.add(new Pair(i, col - 1));
                visited[i][col - 1] = true;
                board[i][col - 1] = '#';
            }
        }

        // Top and Bottom boundaries
        for (int i = 0; i < col; i++) {
            if (board[0][i] == 'O') {
                q.add(new Pair(0, i));
                visited[0][i] = true;
                board[0][i] = '#';
            }

            if (board[row - 1][i] == 'O') {
                q.add(new Pair(row - 1, i));
                visited[row - 1][i] = true;
                board[row - 1][i] = '#';
            }
        }

        int[] drow = { 0, 0, -1, 1 };
        int[] dcol = { -1, 1, 0, 0 };

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int nrow = curr.row;
            int ncol = curr.col;

            for (int i = 0; i < 4; i++) {
                int r = nrow + drow[i];
                int c = ncol + dcol[i];

                if (r >= 0 && c >= 0 && r < row && c < col && board[r][c] == 'O' && !visited[r][c]) {
                    q.add(new Pair(r, c));
                    visited[r][c] = true;
                    board[r][c] = '#';
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }

    }
}