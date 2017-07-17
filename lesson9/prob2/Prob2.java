package lesson9.prob2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prob2 {
	public static void main(String[] a) {
		int[] arr = new int[]{1,3,5,13,2,67};
		Prob2 prob2 = new Prob2();
		
		System.out.println("Max: " + prob2.getStream(arr).max().getAsInt() + " Min: "+ prob2.getStream(arr).min().getAsInt());
	}
	
	public IntStream getStream(int[] arr) {
		return Arrays.stream(arr);
	}
}
