package lesson9.prob4;

import java.util.stream.Stream;

public class Prob4 {
	public static void main(String[]a) {
		Prob4.printSquares(4);
	}
	
	public static void printSquares(int num) {
		Stream<Integer> stream = Stream.iterate(1, (x) -> x + 1).map((x) -> (int)Math.pow(x, 2)).limit(num);

		stream.forEach(System.out::println);
	}
}
