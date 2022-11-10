package com.te.collections; 

public class ArrayListDemo {

	private Object[] array;
	private int position;
	

	
	public ArrayListDemo(int arraySize) {
		this.array=new Object[arraySize];
	}
	public void add(Object element) {
		if(position<array.length-1)
		{
			growArray();
		}
		this.array[position++]=element;
			
	}
	public Object get(int position) {
		return array[position];
		
	}
	public int size () {
		return position;
		
	}
	private void growArray() {
		Object[] temp= new Object[this.array.length+5];
		System.arraycopy(this.array, 0, temp, 0 ,array.length);
		array=temp; 
	}

}
