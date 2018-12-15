public class removeDuplicates2 {
    private removeDuplicates2() {
    }

    public static int removeDuplicatesSolution(int[] nums) {
        int i = 0;
        for (int n : nums) {
            //i-2 re
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}