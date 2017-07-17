package lesson8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Prob3 {
	public static void main(String[] args) {
		Prob3 prob3 = new Prob3();
		Prob3.innerBiFunction inner = prob3.new innerBiFunction();

		List<Double> list = inner.apply(2.0, 3.0);
		
		System.out.println(list);
		
	}
	
	class innerBiFunction implements BiFunction<Double, Double, List<Double>> {
		public List<Double> apply(Double x, Double y) {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			
			return list;
		}
	}
}
