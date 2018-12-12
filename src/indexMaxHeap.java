
import java.uitl.*;
import java.lang.*;

public class indexMaxHeap<Item extends Comparable> {
    protected Item[] data;      // 最大索引堆中的数据
    protected int[] indexes;    // 最大索引堆中的索引
    protected int count;
    protected int capacity;
    
    public indexMaxHeap(int capacity){
      data = (Item[]) new Comparable[capacity+1];
      indexes = new int[capacity+1];
      count = 0;
      
    }
}