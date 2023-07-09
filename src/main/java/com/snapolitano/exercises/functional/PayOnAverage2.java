package com.snapolitano.exercises.functional;

import java.util.Map;
import java.util.stream.Collectors;

public class PayOnAverage2 {
    public static Map<String, Double> payOnAverage(Map<String, Double> fees){
        return fees.entrySet().stream().collect(Collectors.groupingBy(entry -> entry.getKey().substring(0, 3),
                Collectors.averagingDouble(Map.Entry::getValue)));
    }
}
