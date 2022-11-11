package Day4;

public class MinGap {
	public static void main(String[] args) {
		int[] inputArray = { 0, 1, 2, 9, 4, 6, 5, 9, 89 };
		
		int[] lastPositionPlus1Array = new int[maxValue(inputArray) + 1];
		int min = maxValue(inputArray);

		for (int i = 0; i < inputArray.length; i++) {
			if (lastPositionPlus1Array[inputArray[i]] != 0) {
				min = Math.min(min, i + 1 - lastPositionPlus1Array[inputArray[i]]);
			}
			lastPositionPlus1Array[inputArray[i]] = i + 1;
		}

		System.out.println(min);


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