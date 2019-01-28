import java.util.List;

/**
 * ¥Ú”°π§æﬂ
 * @author Administrator
 *
 */
public class PrintUtil {
	
	public static int[] ARRAY = {1, 8, 6, 5, 6, 5, 5};
	
	public static void printArray(int[] params) {
		for(int i = 0; i < params.length; i++) {
			System.out.println(params[i]);
		}
		
	}
	
	public static void printList(List params) {
		for(int i = 0; i < params.size(); i++) {
			System.out.println(params.get(i));
		}
		
	}
	
	
}
