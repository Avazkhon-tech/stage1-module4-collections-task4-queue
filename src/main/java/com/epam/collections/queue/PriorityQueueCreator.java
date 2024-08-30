package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> newList = new PriorityQueue<>(Comparator.reverseOrder());
        newList.addAll(firstList);
        newList.addAll(secondList);
        return newList;

    }
}
