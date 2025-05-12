package com.kodilla.testing.collection;

import java.util.List;
import java.util.ListIterator;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> list = numbers;
        list.removeIf(integer -> integer % 2 != 0);
        return list;
    }
}
