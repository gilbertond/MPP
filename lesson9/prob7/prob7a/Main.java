package edu.mum.lesson9.prob7.prob7a;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        Pattern p = Pattern.compile("[N-Z]");
        //your stream pipeline here
        list.stream()   .filter((e) -> e.getSalary() > 100000)
                        .filter((e) -> p.matcher(e.getLastName()).find())
                        .map((e) -> e.getFirstName() + " " + e.getLastName())
                        .sorted((e1, e2) -> (e1.compareTo(e2))).forEachOrdered(System.out::println);
    }
}
