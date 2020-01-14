package dataAndAlgo.chap03;

import java.util.Scanner;

public class BinSearch {
	/**
	 * @author danny
	 * 
	 * @param a : obj
	 * @param n : size
	 * @param key 
	 * 
	 * @return index
	 * */
	static int binSearch(int[] a, int n, int key) { 
		int pl = 0;                   // start
		int pr = n-1;                 // end
		
		do {
			int pc = (pl + pr) / 2;   // index
			if(a[pc] == key) {
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;          // 시작 인덱스를 중앙 + 1로 변경
			} else {
				pr = pc - 1;
			}
		} while(pl<=pr);
		
		return -1;                    // 검색 값이 존재하지 않을 경우
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// array 선언
		System.out.print("요솟수 :"); // n
		int num = sc.nextInt();
		int[] x= new int[num]; // obj array
		
		System.out.println("오름 차순으로 입력하세요"); // - [ ] 정렬을 직접 하는 것으로 대체
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		// array 입력
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] :");
				x[i] = sc.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		// 검색 키 입력
		System.out.print("검색할 값 :");
		int ky = sc.nextInt();
		int idx = binSearch(x, num, ky);
		
		sc.close();
		
		// 검색 결과 출력
		if(-1 == idx) {
			System.out.println("검색 대상 값이 존재하지 않습니다.");
		} else {
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
		}
	}
}
