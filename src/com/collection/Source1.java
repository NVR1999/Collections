package com.collection;


import java.util.List;
import java.util.ArrayList;

class Implementation {
	public List<String> changeOccurence(List<String>list,String a, String b){
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equalsIgnoreCase(a)) {
				list.set(i, b);
			}
		}
		return list;
	}
	public String getIndex(List<String>list) {
		if(list.size()>0) {
			return list.get(0);
		}else 
			return null;
		}
		public List<String> addAfter (List<String>list,String a,String b){
			int index=list.indexOf(a);
			if(index !=-1) {
				list.add(index + 1,b);
				return list.subList(index + 1, list.size());
			}
			return list;
		}
	}
	public class Source1{
		public static void main(String[] args) {
			List<String>list=new ArrayList();
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			
			Implementation implementation=new Implementation();
			System.out.println(implementation.changeOccurence(list, "B", "S"));
			System.out.println(implementation.getIndex(list));
			System.out.println(implementation.addAfter(list,"B","S"));
		}
	}