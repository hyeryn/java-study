package hyeryn_project;
import java.util.Scanner;

class Person{ // 사람 이름 저장
	private String name;
	public Person(){ // default
		this.name = "---";
	}
	public void setName(String name) { // 이름을 입력했다면 저장
		this.name = name;
	}
	public String getName() { // 저장된 이름을 반환 
		return name;
	}
}
class People{ // 한 줄 저장 (콘서트 줄 각각 10명씩 있음)
	private Person[] per;
	public People(){ // default
		per = new Person[10]; // 한 줄에 열명 저장
		for(int i = 0; i<per.length;i++) {
			per[i] = new Person();
		}
	}
	public void setName(int n, String name) { // n번째 사람 이름 저장(한 라인 저장)
		per[n-1].setName(name);
	}
	public String getName(int n) { // n번째 저장된 사람 이름 반환
		return per[n-1].getName();
	}
}

class Ticket{
	private People[] p;
	public Ticket() {
		p = new People[3]; // 단계가 3단계임 (S, A, B)
		for(int i = 0; i<p.length; i++) {
			p[i] = new People();
		}
	}
	private Scanner sc = new Scanner(System.in);
	
	public void res() {
		System.out.print("좌석구분 S(1), A(2), B(3)>> ");
		int num = sc.nextInt();
		for(int i = 0; i<10; i++){
			System.out.print(p[num-1].getName(i+1)+" ");
		}
		System.out.print("\n");
		System.out.print("이름>> ");
		String name = sc.next();
		System.out.print("번호>> ");
		int n = sc.nextInt();
		if(p[num-1].getName(n).equals("---"))
			p[num-1].setName(n, name);
		else 
			System.out.println("이미 예약이 완료된 좌석입니다. 다시 예약하세요.");
	//	System.out.println((num-1)+":"+n+":"+p[num-1].getName(n)); // 저장되는지 확인 -> 완료 !
	}
	
	public void find() {
		System.out.print("S>> ");
	//	System.out.println(p[0].getName(1)); // S좌석 1번에 사람이름 저장되는지 확인 -> 간단한 문제였음. main에서 저장 초기화문제
		for(int j = 0; j<10; j++) {
			System.out.print(p[0].getName(j+1)+" ");
		}
		System.out.println("");
		System.out.print("A>> ");
		for(int j = 0; j<10; j++) {
			System.out.print(p[1].getName(j+1)+" ");
		}
		System.out.println("");
		System.out.print("B>> ");
		for(int j = 0; j<10; j++) {
			System.out.print(p[2].getName(j+1)+" ");
		}
		System.out.println("");
	}
	
	public void del() {
		System.out.print("좌석  S:1, A:2, B:3 >> ");
		int num = sc.nextInt();
		for(int i = 0;i<10;i++) {
			System.out.print(p[num-1].getName(i+1)+" ");
		}
		System.out.println(" ");
		System.out.print("번호>> ");
		int n = sc.nextInt();
		if(p[num-1].getName(n).equals("---"))
			System.out.println("예약되지 않은 자리입니다. 다른 좌석을 선택해주세요.");
		else
			p[num-1].setName(n, "---");
	}
	
	public void exit() {
		System.out.print("시스템을 종료합니다.");
	}
}

public class ConcertHall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("환영합니다.콘서트 예약 시스템입니다.\n원하는 가수의 이름을 입력해주세요 >> ");
		String idol = sc.next();
		System.out.println(idol+" 콘서트 예약 시스템입니다 *^^*");
		Ticket t = new Ticket(); // while문 안에 넣으면 예약 조회 이전에 계속 초기화 되니까 문제가 발생함
		while(true) {
			System.out.print("예약:1 조회:2 취소:3 끝내기:4 >> ");
			int number = sc.nextInt();
				switch(number) {
					case 1:
						t.res();
						break;
					case 2:
						t.find();
						break;
					case 3:
						t.del();
						break;
					case 4:
						t.exit();
						System.exit(0);
					default:
						System.out.println("번호를 잘못 선택했습니다 ~");
				}
		}
	}
}
