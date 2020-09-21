package hyeryn_project;

import java.util.Scanner;

class Player{
	String name;
	String word;
	void getWordFromUser(String word) {
		this.word = word;
	}
	void checkSuccess(char last, char first) {
		if(last != first) {
			System.out.print(name+"�� �����ϴ� >.<�ٺ�");
			System.exit(0);
		}
	}
}

public class WordGameApp{
	public static void main(String[] args) {
		System.out.println("�����ձ� ������ �����մϴ�...");
		run();
	}
	static void run() {
		System.out.print("���ӿ� �����ϴ� �ο��� �� ���Դϱ�? ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Player player[] = new Player[num];
		for(int i = 0; i<num ; i++)
			player[i] = new Player();
		
		for(int i = 0; i<num;i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>> ");
			String name = sc.next();
			player[i].name = name;
		}
		
		System.out.println("���۴ܾ �Է����ּ��� >> ");
		System.out.println(player[0].name+"���� �����մϴ�. ");
		String word = sc.next();
		int lastIndex = word.length()-1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = word.charAt(0);
		while(true) {			
			for(int i = 0;i<num;i++) {
				System.out.print(player[i].name+">> ");
				word = sc.next();
				player[i].getWordFromUser(word);
				firstChar = word.charAt(0);
				player[i].checkSuccess(lastChar, firstChar);
				if(i<=num-1) 
					i = i%3;
				lastIndex = word.length()-1;
				lastChar = word.charAt(lastIndex);
			}
		}
	}
}