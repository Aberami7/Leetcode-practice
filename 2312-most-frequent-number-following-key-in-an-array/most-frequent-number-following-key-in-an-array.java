class Solution {
    public int mostFrequent(int[] nums, int key) {

        int ans = 0;
        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == key) {

                int count = 0;
                int target = nums[i + 1];

                for (int j = 0; j < nums.length - 1; j++) {

                    if (nums[j] == key && nums[j + 1] == target) {
                        count++;
                    }
                }

                if (count > max) {
                    max = count;
                    ans = target;
                }
            }
        }

        return ans;
    }
}