package com.snapolitano.exercises.generics;

public class PairUtil2 {
	public static <K, V> Pair2<V, K> swap(Pair2<K, V> src) {
		return new Pair2<>(src.getSecond(), src.getFirst());
	}
}
