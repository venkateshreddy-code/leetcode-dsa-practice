class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre = 1;
        int post = 1;
        int[] res = new int[n];
        
        // Initialize the first element
        res[0] = 1;
        
        // Build prefix product
        for (int i = 0; i < n - 1; i++) {
            pre *= nums[i];
            res[i + 1] = pre;
        }
        
        // Build suffix product and combine with prefix product
        for (int i = n - 1; i > 0; i--) {
            post *= nums[i];
            res[i - 1] *= post;
        }
        
        return res;
    }
}
