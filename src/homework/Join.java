package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Join {
	private String name;

	private String password;
	private String socialNumber;
	

	public void name() {
		
	}

	public void id() {
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		
		String id = sc.nextLine();
		if(map.containsKey(id)) {
			System.out.println("이미 존재하는 아이디입니다. 다시 입력해주세요.");
			
			return;
		}
			
	}
	
	public void password() {
		
	}

	public void socialNumber() {
		
	}
	
}
		
