package com.epam.collections.queue;

import java.util.*;


public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {


        Queue<Integer> dishes = new LinkedList<>();
        List<Integer> everyDishes = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        while (!dishes.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                Integer removedDish = dishes.remove();
                dishes.add(removedDish);
            }
            Integer removed = dishes.remove();
            everyDishes.add(removed);
        }

        return everyDishes;
    }
}
