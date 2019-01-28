import com.sun.javafx.sg.prism.web.NGWebView;

/**
 * 简单桶排序
 * @author Administrator
 *
 */
public class SimpleBucketSort {
	
	public static void main(String[] args) {
		SimpleBucketSort bucketSort = new SimpleBucketSort();
		int[] params = {1, 8, 6, 5, 6, 5, 5};
		bucketSort.print(bucketSort.sort(params, 9));;
		
	}
	
	private int[] sort(int[] params, int length) {
		//初始化数组，lenght 应该比params中最大的值大1
		int[] buckets= new int[length];
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = 0;
		}
		//循环遍历params数组，如果params的值为buckets的下标则buckets下标对应的值加一，表示存在几个。
		for(int i = 0; i < params.length; i++) {
			buckets[params[i]] += 1;
		}
		return buckets;
	}

	private void print(int[] params) {
		for(int i = 0; i < params.length; i++) {
			for(int j = 1; j <= params[i]; j ++) {
				System.out.println(i);
			}
		}
	}
}
