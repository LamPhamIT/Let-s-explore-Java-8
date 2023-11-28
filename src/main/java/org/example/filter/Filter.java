package org.example.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static <T> List<T> filter(List<T> list, Predicate<T> filterCondition) {
        List<T> listResult = new ArrayList<>();
        for (T t : list) {
            if(filterCondition.test(t)) {
                listResult.add(t);
            }
        }
        return listResult;
    }
}
