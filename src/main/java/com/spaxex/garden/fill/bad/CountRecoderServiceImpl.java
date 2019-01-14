package com.spaxex.garden.fill.bad;

import java.util.List;

public class CountRecoderServiceImpl {
    public CountRecorder getCountRecoder(List<CountEntry> countEntries) {
        CountRecorder countRecorder = new CountRecorder();
        for (CountEntry countEntry : countEntries) {
            if (1 == countEntry.getCode()) {
                countRecorder.setCountOfFirstStage(countEntry.getCount());
            } else if (2 == countEntry.getCode()) {
                countRecorder.setCountOfSecondStage(countEntry.getCount());
            } else if (3 == countEntry.getCode()) {
                countRecorder.setCountOfThirdStage(countEntry.getCount());
            } else if (4 == countEntry.getCode()) {
                countRecorder.setCountOfForthStage(countEntry.getCount());
            } else if (5 == countEntry.getCode()) {
                countRecorder.setCountOfFifthStage(countEntry.getCount());
            } else if (6 == countEntry.getCode()) {
                countRecorder.setCountOfSixthStage(countEntry.getCount());
            }
        }
        return countRecorder;
    }
}
