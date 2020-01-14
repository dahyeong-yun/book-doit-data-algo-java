package dataAndAlgo.chap03;

import java.util.Scanner;

public class SeqSearch {
	/**
	 * @author danny
	 * 
	 * @param a 대상 배열
	 * @param n 배열의 크기
	 * @param key 찾고자 하는 값(키)
	 * */
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n)
				return -1; // 배열을 다 돌았는 데 키 값을 찾지 못한 경우
			if(a[i] == key)
				return i;
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// array 선언
		System.out.print("요솟수 :"); // n
		int num = sc.nextInt();
		int[] x= new int[num]; // obj array
		
		// array 입력
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] :");
			x[i] = sc.nextInt();
		}
		
		// 검색 키 입력
		System.out.print("검색할 값 :");
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky);
		
		sc.close();
		
		// 검색 결과 출력
		if(-1 == idx) {
			System.out.println("검색 대상 값이 존재하지 않습니다.");
		} else {
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
		}
	}
}
