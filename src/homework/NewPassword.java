package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<>();
		
		System.out.println("< 비밀번호 변경 서비스 >");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		//비밀번호 변경할 아이디 시스템상에 존재하는지 확인
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이디는 존재하지 않습니다.");
			System.out.println("다시 입력해주세요");
			
			return;
		}
		
		System.out.print("기존 비밀번호 입력 : ");
		String password = sc.nextLine();
		
		//입력받은 아이디의 비밀번호와 맞지 않다면..
		if(!map.get(id).equals(password)) {
			System.out.println("비밀번호가 맞지 않습니다.");
			System.out.println("비밀번호를 다시 입력해주세요.");
		
			return;
		}
	
		//변경할 비밀번호 입력
		System.out.print("새로 변경할 비밀번호를 입력해주세요 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("비밀번호 변경이 완료되었습니다.");
		
	}
}
