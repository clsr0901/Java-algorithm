import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 快速排序
 * @author Administrator
 *快速排序的基本思想是：找到一个基数(一般为数组得一个值)，根据这个基数将数组分为大于基数的数组和小于基数的数组。再将大于数组和小于数组再重复这个过程，直到最后的数组长度小于等于1再结束返回。
 *最后根据大于数组， 基数， 小于数组合并就是一个有序的数组了。
 *快速排序的核心是递归
 *时间复杂度O(N^2).
 */
public class QuickSort {

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		List<Integer> params = Arrays.asList(9, 8, 6, 5, 6, 5, 5);
		PrintUtil.printList(quickSort.sort(params));
	}
	
	
	private List<Integer> sort(List<Integer> params) {
		//如果数组长度小于等于1直接返回
		if (params.size() <= 1) {
			return params;
		}
		//大于基数的集合
		List<Integer> greaterList = new ArrayList<>();
		//小于基数的集合
		List<Integer> lessList = new ArrayList<>();
		//分类， 大于基数装入大于集合， 小于基数装入小于集合
		for(int i = 1; i < params.size(); i++) {
			if (params.get(i) >= params.get(0)) {
				greaterList.add(params.get(i));
			}else {
				lessList.add(params.get(i));
			}
		}
		//递归大于基数集合
		greaterList = sort(greaterList);
		//递归小于基数集合
		lessList = sort(lessList);
		//创建返回集合
		List<Integer> result = new ArrayList<>();
		//装入数据，先装小于集合则为升序，反之则为降序
		result.addAll(lessList);
		result.add(params.get(0));
		result.addAll(greaterList);
		return result;
		
	}
}
