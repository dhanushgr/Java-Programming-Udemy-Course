package com.dhanush.learnJava;

public class MultiplicationTable {
	
		void hello(int table) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d", table, i, table*i).println();
		}
	}
}