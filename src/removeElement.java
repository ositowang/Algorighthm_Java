public class removeElement {
    private removeElement() {
    }

    public static int solution(int[] nums, int val) {
        // java原地删个元素真麻烦
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static int solution2(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            // if equals to the val, swap in the last element
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // decrease the length by 1
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] testArray = { 0, 1, 0, 3, 12 };
        int result = solution2(testArray, 0);
        System.out.print(result);
    }
}