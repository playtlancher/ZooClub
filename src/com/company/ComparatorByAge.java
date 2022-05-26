package com.company;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<People> {
    @Override
    public int compare(People  b1, People b2) {
        return b1.getAge() > b2.getAge() ? 1 : -1;
    }
}
