class Solution {
   public int[] minOperations(String boxes) {
    int[] res = new int[boxes.length()]; 

    // Iterate through each box
    for (int i = 0; i < boxes.length(); i++) {
        int minOperation = 0; // Initialize the minimum number of operations for the current box

        // Iterate through all other boxes
        for (int j = 0; j < boxes.length(); j++) {
            if (boxes.charAt(j) == '1') { // Check if the current box contains a ball

                // Calculate the number of operations needed to move the ball to the current box
                minOperation += Math.abs(j - i);
            }
        }

        res[i] = minOperation; // Store the minimum number of operations for the current box
    }

    return res; 
 }
}