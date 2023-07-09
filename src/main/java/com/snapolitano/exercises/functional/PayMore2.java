package com.snapolitano.exercises.functional;

import java.util.Map;

public class PayMore2 {
    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta){
        fees.entrySet().forEach(t -> {if(t.getKey().startsWith(numberFamily)) t.setValue(t.getValue() + costDelta);});
    }
}
