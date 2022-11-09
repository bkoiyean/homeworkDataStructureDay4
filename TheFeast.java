package Homework;

public class TheFeast {
	public static void main(String[] args) {
		int inputN = 15;
		int inputC = 3;
		int inputM = 2;
		
		int result = inputN/inputC;
		int remainder = result;
		result = result + remainder/inputM;
		
		while (remainder>=inputM) {
			remainder = remainder % inputM + remainder/inputM;
			result = result + remainder/inputM;
		}
		
		System.out.println(result);
	
	}

}
