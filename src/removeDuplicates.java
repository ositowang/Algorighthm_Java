
public class removeDuplicates {
    private removeDuplicates() {
    }

    public static int removeDuplicatesSolution(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int k = 1; k < nums.length; k++) {
            // if nums[j] !=nums[i] we copy the value to i+1
            // therefore i to i+1 is non-repeated then we loop from i+1 again
            if (nums[k] != nums[i]) {
                i++;
                nums[i] = nums[k];
            }
        }
        return i;
    }

    public static int removeDuplicatesSolution1(int[] nums) {
        int i = 0;
        for (int n : nums) {
            // as it is a sorted array, the nexts element >= previous
            // if it no equals, it will be larger than previous,than increate i
            // to loop from the next element
            if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] testArray = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        assert removeDuplicatesSolution1(testArray) == 5;
        System.out.println("OK");
    }
}