package com.collection;

import java.util.ArrayList;

public class Implementations {
	public String getIndex(ArrayList<String> seriesList, int index) {
		String s = seriesList.get(index);

		return s;
	}

	public ArrayList<String> addAfterSeries(ArrayList<String> seriesList, String p, String q) {
		int s = seriesList.indexOf(p);
		seriesList.add(s + 1, q);
		return seriesList;
	}

	public static void main(String[] ar) {
		ArrayList<String> list = new ArrayList<>();
		Implementations s = new Implementations();
		list.add("sunil");
		list.add("sai");
		list.add("kumar");
		s.getIndex(list, 1);
		ArrayList<String> list1 = s.addAfterSeries(list, "sai", "satya");
		for (String l : list1) {
			System.out.println(l);
		}
	}
}