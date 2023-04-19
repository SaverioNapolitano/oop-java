package com.snapolitano.exercises.generics;

import java.util.List;

public class AppendBounded {
    public static <T, R extends T> void append(List<T> dst, List<R> src) {
        dst.addAll(src);
    }
}
