package sprint0;

public class testCase {
	public static int findMin(int arr[]) {
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[1] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static int computeSquare(int n) {
		return n*n;
	}
}
