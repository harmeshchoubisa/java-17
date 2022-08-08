package com.learn.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {

    record Rabbit (int id, String name) { }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3, "Rabbit1"));
        rabbits.add(new Rabbit(1, "Rabbit2"));
        Comparator<Rabbit> byNameAndThenById = Comparator.comparing(Rabbit::name).thenComparingInt(Rabbit::id);
        rabbits.sort(byNameAndThenById);
    }

}
