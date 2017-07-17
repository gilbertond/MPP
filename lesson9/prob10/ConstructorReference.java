package edu.mum.lesson9.prob10;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.function.BiFunction;

class Human {

    String name;
    int age;
    String gender;

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

public class ConstructorReference {

    public static void main(String args[]) {
        Human[] list = {new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male")};
        Human[] list2 = {new Human("Gilbert", 32, "Male"), new Human("Nancy", 37, "Female")};

        // Query 1  : Print only male canditates
        Stream.of(list).filter((x) -> x.gender.equals("Male")).forEach(System.out::println);

        // Query 2  : add some more objects to the list, and print the count of female candidates whose age is greater than 30         
        long count = Stream.concat(Stream.of(list), Stream.of(list2))
                .filter((x) -> x.age > 30)
                .filter((x) -> x.gender.equals("Female"))
                .count();
        System.out.println(count);

        // Query 3 : Practice for method reference Classname::new - Cretae an objecy by choosing suitable Interface to the specified 
        // constructors(Totally 3 constuctors) and print the object status
        TriFunction<String, Integer, String, Human> function = Human::new;

        Human human1 = function.apply("Ndenzi", 22, "Male");
        Human human2 = function.apply("Samantha", 28, "Female");
        Human human3 = function.apply("Martha", 24, "Female");

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        // Query 4 : convert your Human array into ArrayList of Human by creating a static method, decide your arguments and return type   
        List<Human> col1 = arrayToCollection(list);
        System.out.println(col1);
    }

    // Implement the body for Query 4
    public static List<Human> arrayToCollection(Human[] arr) {
        return Arrays.asList(arr);
    }
}
