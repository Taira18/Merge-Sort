
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi) / 2;
			mergeSort(list, lo, mid);
			mergeSort(list, mid + 1, hi);
			merge(list, lo, mid, hi);
		}
		
	}
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		int[] temp = new int[list.length];
		for (int h = 0; h < temp.length; h++) {
			System.arraycopy(list, h, temp, h, 1);
		}
		int g = lo;
		int k = lo;
		int f = mid + 1;
		
	
		while (g<= mid && f <= hi) {
			if (temp[g] <= temp[f]) {
				list[k] = temp[g];
				g++;
				
			} else {
				list[k] = temp[f];
				f++;
				
	}
			
			k++;
		}
		while (g <= mid) {
			list[k] = temp[g];
			k++;
			g++;
		}
	}
		
}
	