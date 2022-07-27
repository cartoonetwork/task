package com.task;
import java.util.List;
import java.util.ArrayList;
public class IntegerList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(20);
        numbers.add(4);
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 20) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}


