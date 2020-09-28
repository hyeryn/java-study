package hyeryn_project;
import java.util.Scanner;

interface Stack{
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱에 저장된 실수 리턴 
	boolean push(String val); // 스택의 톱에 실수 저장 
}

class StringStack implements Stack{
	private int num; // 저장 가능한 개수
	private int set; // 저장 인덱스
	private String[] stack;
	public StringStack(int n) { // 입력한 개수만큼 main에서 받아와야 함
		this.num = n;
		this.set = 0;
		stack = new String[num]; // 받은 개수의 크기 만한 배열을 선언
	}
	public int length() { 
		return set;
	}
	public int capacity() { 
		return stack.length;
	}
	public String pop() { // 스택의 특성에 맞게 하나씩 pop하기
		if(set<=0)
			return null; // 스택이 비어있을때
		set--;
		String s = stack[set];
		return s;
	}
	public boolean push(String val) { // 가능한지 판별하고 성공하면 true를 리턴하자
		if(set<num) {
			stack[set] = val;
			set++;
			return true;
		}
		else
			return false;
	}
}

public class StackStore {
	static void run(){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		StringStack ss = new StringStack(size);
		while(true) {
			int num = 0;
			System.out.print("문자열 입력 >> ");
			String word = sc.next();
			if(word.equals("그만"))
				break; // 저장 그만하고 그대로 while문을 빠져나옴
			if(!ss.push(word)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = ss.length();
		for(int i = 0; i<len;i++) {
			String s = ss.pop();
			System.out.print(s+" ");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		run();
	}

}
