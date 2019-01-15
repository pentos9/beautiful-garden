package com.spaxex.garden.fill.good.service;

import com.spaxex.garden.fill.bad.CountRecorder;
import com.spaxex.garden.fill.good.FillCountService;

public class FirstStageService implements FillCountService {
    public void fillCount(CountRecorder countRecorder, int count) {
        countRecorder.setCountOfFirstStage(count);
    }
}
