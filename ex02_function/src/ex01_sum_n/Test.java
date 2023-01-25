package ex01_sum_n;

public class Test {
	long sum(int[] a) {
		long result = 0;
		for(int val : a) { // a의 개수만큼
			result += val;
		}
		return result;
	}
}