package com.kh.genericsMain;

//���׸� Ŭ���� �����ϱ�
public class Book<T> {
	T content; //��� Ÿ���� ������ �����ϰڴ�
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
	

}
