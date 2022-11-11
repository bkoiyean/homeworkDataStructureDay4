package Day4;

public class MinGap {
	public static void main(String[] args) {
		int[] inputArray = { 0, 5, 0, 3, 4, 6, 5, 9, 5 };
		
		int[] lastPositionPlus1Array = new int[maxValue(inputArray) + 1];
		int[] minGapArray = new int[maxValue(inputArray) + 1];
		int min = maxValue(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			if (lastPositionPlus1Array[inputArray[i]] != 0) {
				minGapArray[inputArray[i]] = minExcept0(minGapArray[inputArray[i]], i + 1 - lastPositionPlus1Array[inputArray[i]]);
				min = minExcept0(minGapArray[inputArray[i]],min);
			}
			lastPositionPlus1Array[inputArray[i]] = i + 1;
		}

		System.out.println(min);


	}

	public static int minExcept0(int a, int b) {
		if (a == 0) {
			return b;
		}
		return Math.min(a, b);

	}
	
	public static int maxValue(int[] array) {
		int max = array[0];

		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		return max;

	}

}