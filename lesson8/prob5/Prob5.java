package lesson8.prob5;

import java.util.Arrays;
import java.util.List;

public class Prob5 {
	public static void main(String a[]) {
		//Problem 1
		System.out.println("Problem 1-------------");
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		fruits.forEach(System.out::println);
				
		// Problem 2
		System.out.println("\nProblem 2------------");
		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		Arrays.sort(names);		
		(Arrays.asList(names)).forEach(System.out::println);
	}
}
