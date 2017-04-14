package com.vishal.myArrayList.test;
import com.vishal.myArrayList.*;

public class Test {

	public static void main(String[] args) {
		int temp = 0;
		
		MyArrayList<String> mal = new MyArrayList<String>();
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishal"+temp++);
		mal.add("vishaasdasl");
		mal.remove(2);
		mal.add("baba");
		mal.remove(9);
		
		System.out.println(mal);
	}

}
