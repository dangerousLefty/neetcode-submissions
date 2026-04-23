class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, List<Character>> rowMap = new HashMap<>();
        HashMap<Integer, List<Character>> colMap = new HashMap<>();
        HashMap<String, List<Character>> subBoxMap = new HashMap<>();

        for (int i = 0; i < board.length; i++){
            if (!rowMap.containsKey(i)){
                        rowMap.put(i, new ArrayList<Character>());
                }
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] == '.'){
                    continue;
                }
                String subBoxKey = String.valueOf(i / 3) + "," + String.valueOf(j / 3);
                if (!colMap.containsKey(j)){
                        colMap.put(j, new ArrayList<Character>());
                }

                if (!subBoxMap.containsKey(subBoxKey)){
                    subBoxMap.put(subBoxKey, new ArrayList<Character>());
                }

                if (rowMap.get(i).contains(board[i][j])){
                    return false;
                }

                if (colMap.get(j).contains(board[i][j])){
                    return false;
                }

                if (subBoxMap.get(subBoxKey).contains(board[i][j])){
                    return false;
                }

                rowMap.get(i).add(board[i][j]);
                colMap.get(j).add(board[i][j]);
                subBoxMap.get(subBoxKey).add(board[i][j]);
            }
        }

        return true;
    }
}
