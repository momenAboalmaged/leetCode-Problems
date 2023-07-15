class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    int rows = triangle.size();
    int[][] dp = new int[rows][rows];

    // Initialize the bottom row of dp array with the values from the triangle array
    for (int i = 0; i < rows; i++) {
        dp[rows - 1][i] = triangle.get(rows - 1).get(i);
    }

    // Calculate the minimum path sum from bottom to top
    for (int i = rows - 2; i >= 0; i--) {
        List<Integer> currentRow = triangle.get(i);
        for (int j = 0; j < currentRow.size(); j++) {
            int num = currentRow.get(j);
            dp[i][j] = num + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
        }
    }

    return dp[0][0];
}

    }
