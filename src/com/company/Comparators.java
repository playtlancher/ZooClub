package com.company;
import java.util.Comparator;
public class Comparators {
    public static Comparator<People> getComparatorByName() {
        return new Comparator<People>() {
            @Override
            public int compare(People b1, People b2) {
                return b2.getName().compareTo(b1.getName());
            }
        };
    }
}

