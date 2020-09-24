package hyeryn_project;
import java.util.Scanner;

class Person{
	String name;
	String type;
	int num;
	Person(String n, String t, int num) {
		this.name = n;
		this.type = t;
		this.num = num;
	}
}
class Line{
	String alpha;
	Line(String al){
		this.alpha = al;
	}
	Person[] per = new Person[10];
	for(int i = 0; i<per.length; i++) {
		
	}
}
class Concert{
	Line[] line = new Line[10];
	String alpha="";
	for(int i = 0; i< line.length; i++) {
		line[i] = new Line(alpha);
	}
}

class Reservation{
	
}
class Find{
	
}
class Delete{
	
}

public class ConcertHall {
	public static void main(String[] args) {
		System.out.println("데이식스 콘서트 예약 시스템입니다 *^^*");
		System.out.println("예약:1 조회:2 취소:3 끝내기:4 >>");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		while(true) {
			if(number==1) {
				Reservation res = new Reservation();
				//res();
			}
			else if(number==2) {
				Find find = new Find();
				//find();
			}
			else if(number==3) {
				Delete del = new Delete();
				//del();
			}
			else if(number==4) {
				System.exit(0);
			}
			else {
				System.out.println("올바른 번호를 선택해주세요 ~");
			}
		}
	}
}
