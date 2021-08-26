package project;

import java.util.Scanner;

import alan.TestAlanFile;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("1.강동원 2.박수민 3.김나현 4.김선우 5.김도윤 6.이호준");
			num = sc.nextInt();
			TestAlanFile alan = new TestAlanFile();
			switch(num) {
			case 1:  alan.display(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			
			}
			
		}
		
		
	}

}
