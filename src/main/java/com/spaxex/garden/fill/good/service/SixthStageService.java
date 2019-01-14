package com.spaxex.garden.fill.good.service;

import com.spaxex.garden.fill.bad.CountRecorder;
import com.spaxex.garden.fill.good.FillCountService;

public class SixthStageService implements FillCountService {
    public void fillCount(CountRecorder countRecorder, int count) {
        countRecorder.setCountOfSixthStage(count);
    }
}
