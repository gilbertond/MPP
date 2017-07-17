package lesson8.prob4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	static enum SortAttribute {PRICE, TITLE};
	
	public static void main(String[] a) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Laptop", 830.0, 1223));
		products.add(new Product("Desktop", 430.0, 124));
		products.add(new Product("Desktop", 333.0, 121));
		products.add(new Product("Music Theatre", 530.0, 123));
		
		Main main = new Main();
		//Using comparator sorting-----------------
		main.sortComparator(products, SortAttribute.PRICE);
		System.out.println("Sorted by price: \n"+ products);
		
		main.sortComparator(products, SortAttribute.TITLE);
		System.out.println("Sorted by title: \n"+ products);
		
		//Using lambda sorting------------------
		main.sortLambda(products, SortAttribute.PRICE);
		System.out.println("Sorted by price: \n"+ products);
		
		main.sortLambda(products, SortAttribute.TITLE);
		System.out.println("Sorted by title: \n"+ products);
	}

	public void sortLambda(List<Product> products, SortAttribute sorter) {
		Collections.sort(products, (e1, e2) -> {
			if (sorter == SortAttribute.PRICE) {
				return Double.valueOf(e2.getPrice()).compareTo((Double)e1.price);
			} else {
				if(e2.getTitle().equals(e1.getTitle())) {
					return Integer.valueOf(e2.getModel()).compareTo((Integer)e1.getModel());
				}
				return e2.getTitle().compareTo(e1.getTitle());
			}
		});
	}
	
	public void sortComparator(List<Product> products, final SortAttribute sorter) {
		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product e1, Product e2) {
				if(sorter == SortAttribute.PRICE) {
					return Double.valueOf(e1.getPrice()).compareTo((Double)e2.price);
				} else {
					if(e1.getTitle().equals(e2.getTitle())) {
						return Integer.valueOf(e1.getModel()).compareTo((Integer)e2.getModel());
					}
					return e1.getTitle().compareTo(e2.getTitle());
				}
			}
		}
		Collections.sort(products, new ProductComparator());
	}
}
