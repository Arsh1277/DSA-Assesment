import java.util.Arrays;

class Solution3 {
    public static void main(String[] args) {

        int[] nums = {3, 8, 4, 1, 2};
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;

            for (int j = 1; j < n; j++) {
                int index = (i + j) % n;

                if (nums[index] > nums[i]) {
                    ans[i] = nums[index];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}