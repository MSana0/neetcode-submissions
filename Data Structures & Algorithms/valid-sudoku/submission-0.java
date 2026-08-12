class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 9 sets for rows, 9 for columns, 9 for boxes
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];

                if (val == '.') continue;   // skip empty cells

                // Calculate which 3x3 box this cell belongs to
                int boxIndex = (r / 3) * 3 + (c / 3);

                // If the value already exists in row, column, or box → invalid
                if (rows[r].contains(val) ||
                    cols[c].contains(val) ||
                    boxes[boxIndex].contains(val)) {
                    return false;
                }

                // Otherwise add it
                rows[r].add(val);
                cols[c].add(val);
                boxes[boxIndex].add(val);
            }
        }

        return true;
    }
}