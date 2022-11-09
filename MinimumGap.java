package Homework;

public class MinimumGap {
	public static void main(String[] args) {
		int[] inputArray = { 0, 3, 5, 3, 4, 6, 5, 3, 3 };
		
		int[] lastPositionPlus1Array = new int[maxValue(inputArray) + 1];
		int[] minGapArray = new int[maxValue(inputArray) + 1];

		for (int i = 0; i < minGapArray.length; i++) {
			minGapArray[i] = inputArray.length - 1;
		}

		for (int i = 0; i < inputArray.length; i++) {
			if (lastPositionPlus1Array[inputArray[i]] != 0) {
				minGapArray[inputArray[i]] = Math.min(minGapArray[inputArray[i]], i + 1 - lastPositionPlus1Array[inputArray[i]]);
			}
			lastPositionPlus1Array[inputArray[i]] = i + 1;
		}

		System.out.println(minValueExcept0(minGapArray));

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

	public static int minValueExcept0(int[] array) {
		int min = maxValue(array);

		for (int i : array) {
			if (i > 0 && min > i) {
				min = i;
			}
		}
		return min;

	}

}
