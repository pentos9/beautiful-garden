package com.spaxex.garden.fill.good;

import com.spaxex.garden.fill.bad.CountEntry;
import com.spaxex.garden.fill.bad.CountRecorder;

import java.util.Arrays;
import java.util.List;

public class Bootstrap {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<CountEntry> countEntries = Arrays.asList(new CountEntry(1, 10), new CountEntry(2, 21), new CountEntry(3, 32));
        CountRecorder countRecorder = getCountRecorder(countEntries);
        System.out.println(countRecorder);

        CountRecorder countRecorder2 = getCountRecorder2(countEntries);
        System.out.println(countRecorder2);
    }

    public static CountRecorder getCountRecorder(List<CountEntry> countEntries) {
        CountRecorder countRecorder = new CountRecorder();

        countEntries.stream().forEach(countEntry -> {
            FillCountServiceFactory.getFillCountStrategy(countEntry.getCode()).fillCount(countRecorder, countEntry.getCount());
        });

        return countRecorder;
    }

    public static CountRecorder getCountRecorder2(List<CountEntry> countEntries) {
        CountRecorder countRecorder = new CountRecorder();

        countEntries.stream().forEach(countEntry -> {
            FillCountServiceFactory.getFillCountStrategyWithJava8(countEntry.getCode()).fillCount(countRecorder, countEntry.getCount());
        });

        return countRecorder;
    }
}
