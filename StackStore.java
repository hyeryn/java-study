package hyeryn_project;
import java.util.Scanner;

interface Stack{
	int length(); // ���� ���ÿ� ����� ���� ����
	int capacity(); // ������ ��ü ���� ������ ���� ����
	String pop(); // ������ �鿡 ����� �Ǽ� ���� 
	boolean push(String val); // ������ �鿡 �Ǽ� ���� 
}

class StringStack implements Stack{
	public int length() { 
		return 0;
	}
	public int capacity() { // �Է¹��� ũ�Ⱑ main�� �ִµ� ��� ����? �ҷ��;� �� �� ������ ���� ��?
		return 0;
	}
	public String pop() { // ������ Ư���� �°� �ϳ��� pop�ϱ�
		return null;
	}
	public boolean push(String val) { // �������� �Ǻ��ϰ� �����ϸ� true�� ��������
		return false;
	}
}

public class StackStore {
	static void run(){
		StringStack ss = new StringStack();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String word = sc.next();
			if(word.equals("�׸�"))
				break;
			else {
				
			}
		}
		System.out.println("���ÿ� ����� ��� ���ڿ� �� : ");
		ss.pop();
	}
	
	public static void main(String[] args) {
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		run();
	}

}
