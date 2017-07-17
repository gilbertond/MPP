/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.lesson9.prob7.prob7b;
import java.util.stream.Stream;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author gilberto
 */
public class LambdaLibrary {
    public static final TriFunction<List<Employee>, String, Integer, List<String>> EMPLOYEES = 
            (List<Employee> list, String pattern, Integer salary) -> list.stream()
                    .filter((e) -> e.getSalary() > salary)
                    .filter((e) -> Pattern.compile(pattern).matcher(e.getLastName()).find())
                    .map((e) -> e.getFirstName() + " " + e.getLastName())
                    .sorted((e1, e2) -> (e1.compareTo(e2))).collect(Collectors.toList());
}
