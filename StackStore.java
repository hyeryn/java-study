package hyeryn_project;
import java.util.Scanner;

interface Stack{
	int length(); // ���� ���ÿ� ����� ���� ����
	int capacity(); // ������ ��ü ���� ������ ���� ����
	String pop(); // ������ �鿡 ����� �Ǽ� ���� 
	boolean push(String val); // ������ �鿡 �Ǽ� ���� 
}

class StringStack implements Stack{
	private int num; // ���� ������ ����
	private int set; // ���� �ε���
	private String[] stack;
	public StringStack(int n) { // �Է��� ������ŭ main���� �޾ƿ;� ��
		this.num = n;
		this.set = 0;
		stack = new String[num]; // ���� ������ ũ�� ���� �迭�� ����
	}
	public int length() { 
		return set;
	}
	public int capacity() { 
		return stack.length;
	}
	public String pop() { // ������ Ư���� �°� �ϳ��� pop�ϱ�
		if(set<=0)
			return null; // ������ ���������
		set--;
		String s = stack[set];
		return s;
	}
	public boolean push(String val) { // �������� �Ǻ��ϰ� �����ϸ� true�� ��������
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
			System.out.print("���ڿ� �Է� >> ");
			String word = sc.next();
			if(word.equals("�׸�"))
				break; // ���� �׸��ϰ� �״�� while���� ��������
			if(!ss.push(word)) {
				System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		int len = ss.length();
		for(int i = 0; i<len;i++) {
			String s = ss.pop();
			System.out.print(s+" ");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		run();
	}

}
