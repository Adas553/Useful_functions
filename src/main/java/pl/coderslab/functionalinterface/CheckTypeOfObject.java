package pl.coderslab.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CheckTypeOfObject {
    public static void main(String[] args) {
        List<Object> listOfObjects = Arrays.asList("dane1", 2, "dane3", 5);

        printTypeOfObject(listOfObjects, new Predicate<Object>() {
            @Override
            public boolean test (Object element) {
                return element instanceof String;
            }
        });

        printTypeOfObject(listOfObjects, obj -> obj instanceof Integer);


        /////////////////////////////////// skrócona wersja
        listOfObjects.stream()
                .filter(obj -> obj instanceof String)
                .forEach(System.out::println);
        ////////////////////////////////////
    }

    public static <T> void printTypeOfObject(List<T> list, Predicate<T> predicate) {
        for (T element : list) {
            if (predicate.test(element)) {
                System.out.println(element);
            }
        }
    }
}
