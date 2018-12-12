import java.util.Arrays;

public class binarySearch {

    private BinarySearch() {}

    public static int find(Comparable[] arr, Comparable target) {
        int l = 0;
        int r = arr.length - 1;
        // 二分查找法,在有序数组arr中,查找target
        // 如果找到target,返回相应的索引index
        // 如果没有找到target,返回-1
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid].compareTo(target) == 0) {
                return mid;
            }
            if (arr[mid].compareTo(target) < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 100000;
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < 2 * N; i++) {
            int v = binarySearch.find(arr, i);
            if (i < N)
                assert v == i;
            else
                assert v == -1;
        }
        System.out.println("Amazing, you make it!");
        return;

    }
}