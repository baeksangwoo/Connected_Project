package ExamArrayList;

import java.util.HashMap;

public class WhatisHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> bbc = new HashMap<String, Integer>(100);
		bbc.put("해리", 122);
		bbc.put("rose", new Integer(100));
		bbc.put("lisa", new Integer(100));
		bbc.put("rdd", new Integer(100));
		
		Integer num = bbc.get("rose");
		System.out.printf("rose의 키값은???? %d",num);
	}

}
