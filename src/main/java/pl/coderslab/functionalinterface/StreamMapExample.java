package pl.coderslab.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ala", "mama", "Adam");

        Map<String, String> newMap = stringList.stream()
                .collect(Collectors.toMap(s -> s, s -> new StringBuilder(s).reverse().toString()));

        System.out.println(newMap);
    }
}
