package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> list = new ArrayList<>(numbers);
        list.removeIf(integer -> integer % 2 != 0);
        return list;
    }
}
