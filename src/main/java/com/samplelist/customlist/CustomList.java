package com.samplelist.customlist;

import java.util.Arrays;
import java.util.List;

public class CustomList<T> {
	private Object customArray[] =  new Object[1];

	public CustomList(T t) {
		add(t);
	}

	public CustomList() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(T t) {
			customArray[customArray.length-1] = t;
			capacityIncrease();
		
	}
	
	public void remove() {
		
		int newCapacity = customArray.length-1;
		customArray = Arrays.copyOf(customArray, newCapacity);
		
	}
	
	public void removeIndexOf(int index){
		
		for(int i = index ; i < customArray.length-1;i++) {
			
			customArray[i] = customArray[i+1];
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public T getIndexOf(int index) {
		
		return (T) customArray[index];
	}
	
	public void concateAnotherList(List<T> list) {
		for(T t:list) {
			add(t);
		}
	}
	public int customListSize() {
		
		return customArray.length;
	}
	
	
	private void capacityIncrease() {
			int newCapacity = customArray.length+1;
			customArray = Arrays.copyOf(customArray, newCapacity);
	}
	
	
	
	

}
