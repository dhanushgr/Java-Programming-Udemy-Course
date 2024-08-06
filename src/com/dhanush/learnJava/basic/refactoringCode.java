//THIS CODE EXPLAINS REFACTORING OF CODE.
//IT GIVES US THE ABILITY TO WRITE THE MAIN CODE ONLY ONCE IN ONE METHOD , AND CALL IT WHEREEVER WE WANT, INSTEAD OF WRITING THE CODE AGAIN AND AGAIN.

package com.dhanush.learnJava.basic;

public class refactoringCode {
	
	void print() {
		print(5);		//print(5, 1, 10)		//This method calls print(int table) which calls print(int table, int from, int to)
		// for(int i=1; i<=10; i++) {
		// 	System.out.printf("%d * %d = %d", 6, i, 6*i).println();
		// }
	}
	
	void print(int table) {		//this method calls print(int table, int from, int to) method.
		print(table, 1, 10);
		// for(int i=1; i<=10; i++) {
		// 	System.out.printf("%d * %d = %d", table, i, table*i).println();
		// }
	}

	void print(int table, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d", table, i, table*i).println();
		}		
	}
}
