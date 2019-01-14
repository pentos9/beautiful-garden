package com.spaxex.garden.fill.good;

import com.spaxex.garden.fill.bad.CountRecorder;

@FunctionalInterface
public interface FillCountService {
    void fillCount(CountRecorder countRecorder, int count);
}
