package git_test;

import java.util.Scanner;

public class M_Test {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float op1 = readOperand("첫번째");
		float op2 = readOperand("두번째");
		String operator;
		
		System.out.print("연산자(+,-,*,/) : ");
		operator = sc.nextLine();
		
		switch (operator) {
		case"+":
				System.out.println(op1 + "+" + op2 + "=" + (op1 + op2) );
				break;
		case"-":
				System.out.println(op1 + "-" + op2 + "=" + (op1 - op2) );
				break;
		case"*":
				System.out.println(op1 + "*" + op2 + "=" + (op1 * op2) );
				break;
		case"/":
				System.out.println(op1 + "/" + op2 + "=" + (op1 / op2) );
				break;
		default:
				System.out.println("연산자 오류입니다.");
					
		}
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

	private static float readOperand(String str) {
		// TODO Auto-generated method stub
		float operand = 0;
		while (true) {
			System.out.print(str + ":");
			try {
					operand = Float.valueOf(sc.nextLine());
					return operand;
			}catch (NumberFormatException e) {
				continue;
			}
		}
		
	}

}

