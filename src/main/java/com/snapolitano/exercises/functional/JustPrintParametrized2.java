package com.snapolitano.exercises.functional;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class JustPrintParametrized2 {
    public static <T> void justPrintList(List<T> list, Consumer<T> consumer){
        list.forEach(consumer);
    }
    public static <K,V> void justPrintMap(Map<K, V> map, BiConsumer<K, V> biConsumer){
        map.forEach(biConsumer);
    }
}
