package com.samplelist.customlist;

import java.util.Arrays;
import java.util.List;

public class CustomList<T> {
	private Object customArray[] =  new Object[1];
	
	public CustomList() {
		// TODO Auto-generated constructor stub
	}

	public CustomList(T t) {
		add(t);
	}

	
	
	public CustomList<T> add(T t) {
			customArray[customArray.length-1] = t;
			capacityIncrease();
			return this;
		
	}
	
	public CustomList<T> remove() {
		
		int newCapacity = customArray.length-1;
		customArray = Arrays.copyOf(customArray, newCapacity);
		return this;
		
	}
	
	public CustomList<T> removeIndexOf(int index){
		
		for(int i = index ; i < customArray.length-1;i++) {
			
			customArray[i] = customArray[i+1];
		}
		
		return this.remove();
		
	}
	
	@SuppressWarnings("unchecked")
	public T getIndexOf(int index) {
		
		return (T) customArray[index];
	}
	
	public CustomList<T> concateAnotherList(List<T> list) {
		for(T t:list) {
			add(t);
		}
		return this;
		
	}
	
	public CustomList<T> replaceWithList(List<T> list){
		customArray = Arrays.copyOf(customArray, 1);
		for(T t:list) {
			add(t);
		}
		
		return this;
		
	}
	public int customListSize() {
		
		return customArray.length-1;
	}
	
	
	private void capacityIncrease() {
			int newCapacity = customArray.length+1;
			customArray = Arrays.copyOf(customArray, newCapacity);
	}
	
	
	
	

}
