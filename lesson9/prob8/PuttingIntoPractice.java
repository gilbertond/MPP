package edu.mum.lesson9.prob8;

import java.util.List;
import java.util.Arrays;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        transactions.stream()
                .filter((x) -> x.getYear()==2011)
                .sorted((e1, e2) -> e1.compareTo(e2))
                .forEach(System.out::println);
        
        // Query 2: What are all the unique cities where the traders work?
        transactions.stream()
                .map((x) -> x.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        
        // Query 3: Find all traders from Cambridge and sort them by name.
        transactions.stream()
                .filter((x) -> x.getTrader().getCity().equals("Cambridge"))
                .map((x) -> x.getTrader())
                .sorted((e1, e2) -> e1.getName()
                .compareTo(e2.getName()))
                .forEach(System.out::println);
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        String returned = transactions.stream()
                .filter((x) -> x.getTrader().getCity().equals("Cambridge"))
                .map((x) -> x.getTrader().getName())
                .distinct()
                .sorted((e1, e2) -> e1.compareTo(e2))
                .reduce((x, y) -> x + ", " + y).get();
        System.out.println(returned);
        
        // Query 5: Are there any trader based in Milan?
        Boolean check = transactions.stream()
                .filter((x) -> x.getTrader().getCity().equals("Milan"))
                .findAny().isPresent();
        System.out.println(check);
        
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter((x) -> x.getTrader()
                .getCity().equals("Milan"))
                .forEach((x) -> x.getTrader().setCity("Milan to Cambridge"));
        transactions.stream().forEach(System.out::println);
        
        // Query 7: What's the highest value in all the transactions?
        int maxValue = transactions.stream().mapToInt((x) -> x.getValue()).max().getAsInt();
        System.out.println(maxValue);
    }
}
