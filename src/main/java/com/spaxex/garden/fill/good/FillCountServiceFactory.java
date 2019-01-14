package com.spaxex.garden.fill.good;

import com.spaxex.garden.fill.bad.CountRecorder;
import com.spaxex.garden.fill.good.service.FifthStageService;
import com.spaxex.garden.fill.good.service.FirstStageService;
import com.spaxex.garden.fill.good.service.ForthStageService;
import com.spaxex.garden.fill.good.service.SecondStageService;
import com.spaxex.garden.fill.good.service.SixthStageService;
import com.spaxex.garden.fill.good.service.ThirdStageService;

import java.util.HashMap;
import java.util.Map;

public class FillCountServiceFactory {
    private static Map<Integer, FillCountService> fillCountServiceMap = new HashMap();
    private static Map<Integer, FillCountService> fillCountServiceMap2 = new HashMap<>();

    static {
        fillCountServiceMap.put(1, new FirstStageService());
        fillCountServiceMap.put(2, new SecondStageService());
        fillCountServiceMap.put(3, new ThirdStageService());
        fillCountServiceMap.put(4, new ForthStageService());
        fillCountServiceMap.put(5, new FifthStageService());
        fillCountServiceMap.put(6, new SixthStageService());
    }

    static {
        fillCountServiceMap2.put(1, CountRecorder::setCountOfFirstStage);
        fillCountServiceMap2.put(2, CountRecorder::setCountOfSecondStage);
        fillCountServiceMap2.put(3, CountRecorder::setCountOfThirdStage);
        fillCountServiceMap2.put(4, CountRecorder::setCountOfForthStage);
        fillCountServiceMap2.put(5, CountRecorder::setCountOfFifthStage);
        fillCountServiceMap2.put(6, CountRecorder::setCountOfSixthStage);
    }

    public static FillCountService getFillCountStrategy(int statusCode) {
        return fillCountServiceMap.get(statusCode);
    }

    public static FillCountService getFillCountStrategyWithJava8(int statusCode) {
        return fillCountServiceMap2.get(statusCode);
    }
}
