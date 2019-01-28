/**
 * 冒泡排序
 * @author Administrator
 *
 *冒泡排序的基本思想是：每次比较两个相邻的元素，如果他们的顺序错误就把他们交换过来
 *每次循环只能将一个数字归为，即n个数进行排序只需要进行n-1次。
 *冒泡排序的核心是双重嵌套循环，时间复杂度为O(N^2).
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		PrintUtil.printArray(new BubbleSort().sort(PrintUtil.ARRAY));
	}

	
	private int[] sort(int[] params) {
		//循环n-1次
		for(int i = 1; i < params.length; i++) {
			//两两进行比较，循环n-1次
			for(int j = 0; j < params.length - 1; j ++) {
				//前面的小于后面进行交换则为升序排列，反之降序
				if (params[j] < params[j + 1]) {
					int temp = params[j];
					params[j] = params[j + 1];
					params[j + 1] = temp;
				}
			}
		}
		
		return params;
	}
}
