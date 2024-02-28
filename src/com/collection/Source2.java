package com.collection;


import java.util.List;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;

class Brand {
	String model;
	int speed;
	public Brand(String model, int spedd) {
		this.model=model;
		this.speed=speed;
	}
	public String getMedel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	@Override
	public String toString() {
		return "Brand{"+"model="+model+",speed="+speed+'}';
	}

}
class BrandImplementation{
	public ArrayList<Brand>Al=new ArrayList<Brand>(2);
	public long getCount(List<Brand>list) {
		List<Brand>LR=list.stream().filter(b->b.getSpeed()>200).collect(Collectors.toList());
		long sum=LR.stream().mapToLong(b->b.getSpeed()).count();
		return sum;
	}
	public List<Brand>sortBySpeed(List<Brand>list){
		List L=list.stream().map(b->b.getSpeed()).sorted().collect(Collectors.toList());
		return L;
	}
}
	public class Source2{
		public static void main(String[] args) {
			BrandImplementation m=new BrandImplementation();
			m.Al.add(new Brand("SUV",500));
			m.Al.add(new Brand("SEDAN",800));
			System.out.println("Sorted Order"+m.sortBySpeed(m.Al));
			System.out.println("Count"+m.getCount(m.Al));
		}

	}



