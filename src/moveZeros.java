import java.util.ArrayList;
import java.util.Arrays;

public class moveZeros {

  private moveZeros() {
  }

  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  public static void solution(int[] nums) {
    ArrayList<Integer> noZeroElements = new ArrayList<Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        noZeroElements.add(nums[i]);
      }
    }
    for (int i = 0; i < noZeroElements.size(); i++) {
      nums[i] = noZeroElements.get(i);
    }
    for (int i = noZeroElements.size(); i < nums.length; i++) {
      nums[i] = 0;
    }
  }

  public static void solution2(int[] nums) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[k] = nums[i];
        k++;
      }
    }
    for (int i = k; i < nums.length; i++) {
      nums[i] = 0;
    }

  }

  public static void solution3(int[] nums) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
        k++;
      }
    }
  }

  public static void main(String[] args) {
    int[] testArray = { 0, 1, 0, 3, 12 };
    solution3(testArray);
    System.out.println(Arrays.toString(testArray));
  }
}