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
			System.out.print(name+"이 졌습니다 >.<바보");
			System.exit(0);
		}
	}
}

public class WordGameApp{
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		run();
	}
	static void run() {
		System.out.print("게임에 참가하는 인원은 몇 명입니까? ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Player player[] = new Player[num];
		for(int i = 0; i<num ; i++)
			player[i] = new Player();
		
		for(int i = 0; i<num;i++) {
			System.out.print("참가자의 이름을 입력하세요>> ");
			String name = sc.next();
			player[i].name = name;
		}
		
		System.out.println("시작단어를 입력해주세요 >> ");
		System.out.println(player[0].name+"부터 시작합니다. ");
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