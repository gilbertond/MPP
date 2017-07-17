package lesson9.prob3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob3 {
	public static void main(String[]a) {
		Prob3 prob3 = new Prob3();
		List<String> words = new ArrayList<>(Arrays.asList("doog", "cunt", "cunted", "duck", "ufck"));
		System.out.println(prob3.countWords(words, 'c', 'd', 4));
	}

	public long countWords(List<String> words, char c, char d, int len) {
		long val = words.stream().filter((x) -> x.length() == len && x.contains("c") && !x.contains("d")).count();
		return val;
	}
}
