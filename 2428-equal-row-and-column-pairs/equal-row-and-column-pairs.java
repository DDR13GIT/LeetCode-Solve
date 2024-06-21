class Solution {
    public int equalPairs(int[][] grid) {
    Map<String, Integer> rowPatternCounts = new HashMap<>();
    for (int[] row : grid) {
        rowPatternCounts.merge(Arrays.toString(row), 1, Integer::sum);
    }
    
    int equalPairsCount = 0;
    int gridSize = grid.length;
    
    for (int columnIndex = 0; columnIndex < gridSize; ++columnIndex) {
        int[] currentColumn = new int[gridSize];
        for (int rowIndex = 0; rowIndex < gridSize; ++rowIndex) {
            currentColumn[rowIndex] = grid[rowIndex][columnIndex];
        }
        equalPairsCount += rowPatternCounts.getOrDefault(Arrays.toString(currentColumn), 0);
    }
    
    return equalPairsCount;
}
}