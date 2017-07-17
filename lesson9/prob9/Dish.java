package edu.mum.lesson9.prob9;
import java.util.*;
import java.util.Optional;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
    
    public static void main(String[] args) {
        System.out.println("anyVegetarianMeal: " + anyVegetarianMeal());
        System.out.println("less1000CMeals: " + less1000CMeals());
        System.out.println("greater1000CMeals: " + greater1000CMeals());
        System.out.println("getMeatMeal: " + getMeatMeal().get());
        System.out.println("calculateTotalCalories: " + calculateTotalCalories());
        System.out.println("calculateTotalCaloriesMethodReference: " + calculateTotalCaloriesMethodReference());
    }
    
    //Any vegetarian meals
    static boolean anyVegetarianMeal(){
        return menu.stream().anyMatch((x) -> x.isVegetarian());
    }
    
    //meals with carories<1000
    static boolean less1000CMeals(){
        return menu.stream().anyMatch((x) -> x.getCalories() < 1000);
    }
    
    //meals with carories>1000
    static boolean greater1000CMeals(){
        return menu.stream().anyMatch((x) -> x.getCalories() > 1000);
    }
    
    //meals with meat
    static Optional<Dish> getMeatMeal(){
        Optional<Dish> optional = menu.stream().filter((x) -> x.getType().equals(Dish.Type.MEAT)).findFirst();
        return optional;
    }
    
    //get total calories
    static int calculateTotalCalories(){
        return menu.stream().mapToInt((x) -> x.getCalories()).sum();
    }
    
    //calculate total calories using method reference
    static int calculateTotalCaloriesMethodReference(){
        return menu.stream().mapToInt(Dish::getCalories).sum();
    }
}