class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        //Find the total sum
        int total_sum = 0;
        for(int x : cardPoints){
            total_sum += x;
        }
        //number of cards we leave in the middle
        int window_size = n-k;
        //if all cards are taken
        if(window_size == 0){
            return total_sum;
        }
        //find sum of first window
        int window_sum = 0;
        for(int i=0;i<window_size;i++){
            window_sum += cardPoints[i];
        }
        int min_window_sum = window_sum;
        //sliding window => we use fixed size sliding window here
        for(int i = window_size;i<n;i++){
            window_sum+=cardPoints[i];
            window_sum -= cardPoints[i-window_size];
            min_window_sum = Math.min(min_window_sum,window_sum);
        }
        //Maximum points = total - minimum middle section
        return total_sum - min_window_sum;
        
    }
}