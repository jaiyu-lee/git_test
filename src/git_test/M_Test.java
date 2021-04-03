package git_test;

import java.util.Scanner;

public class M_Test {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float op1 = readOperand("ù��°");
		float op2 = readOperand("�ι�°");
		String operator;
		
		System.out.print("������(+,-,*,/) : ");
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
				System.out.println("������ �����Դϴ�.");
					
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

