package hyeryn_project;
import java.util.Scanner;

interface Stack{
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱에 저장된 실수 리턴 
	boolean push(String val); // 스택의 톱에 실수 저장 
}

class StringStack implements Stack{
	public int length() { 
		return 0;
	}
	public int capacity() { // 입력받은 크기가 main에 있는데 어떻게 하지? 불러와야 될 것 같은데 말이 됨?
		return 0;
	}
	public String pop() { // 스택의 특성에 맞게 하나씩 pop하기
		return null;
	}
	public boolean push(String val) { // 가능한지 판별하고 성공하면 true를 리턴하자
		return false;
	}
}

public class StackStore {
	static void run(){
		StringStack ss = new StringStack();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		while(true) {
			System.out.print("문자열 입력 >> ");
			String word = sc.next();
			if(word.equals("그만"))
				break;
			else {
				
			}
		}
		System.out.println("스택에 저장된 모든 문자열 팝 : ");
		ss.pop();
	}
	
	public static void main(String[] args) {
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		run();
	}

}
