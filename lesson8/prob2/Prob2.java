package lesson8.prob2;

import java.util.function.Supplier;

public class Prob2 {
	public static void main(String[] args) {
		Supplier<Double> supplier = Math::random;
		System.out.println(supplier.get());
		
		Supplier<Double> supplier2 = () -> Math.random();
		System.out.println(supplier2.get());	
		
		Prob2 prob2 = new Prob2();
		Prob2.MySupplier supplier3 = prob2.new MySupplier();
		double rand = supplier3.get();
		System.out.println(rand);	
	}
	
	class MySupplier implements Supplier<Double> {
		@Override
		public Double get() {
			return Math.random();
		}		
	}
}
