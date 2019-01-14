package com.spaxex.garden.fill.good.service;

import com.spaxex.garden.fill.bad.CountRecorder;
import com.spaxex.garden.fill.good.FillCountService;

public class ThirdStageService implements FillCountService {
    public void fillCount(CountRecorder countRecorder, int count) {
        countRecorder.setCountOfThirdStage(count);
    }
}
