package com.regis.map;

import java.util.Comparator;
import java.util.Map;

public class ComparadorInts implements Comparator<Integer> {

	Map<Integer, String> base;

	public ComparadorInts(Map<Integer, String> base) {
		this.base = base;
	}

	@Override
	public int compare(Integer obj1, Integer obj2) {
		return base.get(obj1).compareTo(base.get(obj2));
	}

}