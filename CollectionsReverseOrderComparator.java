package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsReverseOrderComparator {

	public static void main(String[] args) {
		Comparator<Integer> comparator=Comparator.comparing(Integer::intValue);
	List<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	Collections.reverseOrder(comparator);

	list.stream().sorted(comparator).forEach(System.out::println);
	      	}
		
	}
