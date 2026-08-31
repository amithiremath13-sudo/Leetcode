class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int MOD = 1_000_000_007;

        Stack<Integer> stack = new Stack<>();  //stack contains indices not values

        //previous smaller part
        for(int i=0; i<n ;i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i] ){
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        //clear the stack
        stack.clear();
        //next smaller element
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] >arr[i]){
                stack.pop();
            }
            //next smaller index
            right[i] = stack.isEmpty() ? n : stack.peek();
            //store current index
            stack.push(i);
        }
        long answer = 0;
        for(int i=0;i<n;i++){
            long leftchoices = i - left[i];
            long rightchoices = right[i] - i;
            long contribution = (long) arr[i] * leftchoices * rightchoices;
            answer = (answer + contribution) % MOD;
        }
        return (int) answer;
        
        
    }
}