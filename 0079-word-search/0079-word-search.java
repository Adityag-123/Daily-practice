class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean search(char[][] b, String word, int i, int j, int k) {

        if (k == word.length())
            return true;

        if (i < 0 || j < 0 || i >= b.length || j >= b[0].length)
            return false;

        if (b[i][j] != word.charAt(k))
            return false;

        char ch = b[i][j];
        b[i][j] = '#';  

        boolean ans =
            search(b, word, i + 1, j, k + 1) ||
            search(b, word, i - 1, j, k + 1) ||
            search(b, word, i, j + 1, k + 1) ||
            search(b, word, i, j - 1, k + 1);

        b[i][j] = ch;  

        return ans;
    }
}