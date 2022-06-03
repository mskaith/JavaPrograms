package JavaInQu;

import java.util.stream.IntStream;

public class PrintNoWithoutLoop {

	// Recursive function
	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}

	}
	public static void printNum(int stNum, int endNum) {
		if (stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNum(stNum,endNum);
		}

	}

	public static void main(String[] args) {
		//printNum(1);
		//printNum(5,50);
		
		//Using Java Streams
		
		IntStream.range(1, 101).forEach(e -> System.out.println(e));
	}

}
