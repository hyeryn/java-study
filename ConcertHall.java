package hyeryn_project;
import java.util.Scanner;

class Person{ // ��� �̸� ����
	private String name;
	public Person(){ // default
		this.name = "---";
	}
	public void setName(String name) { // �̸��� �Է��ߴٸ� ����
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
class People{ // �� �� ���� (�ܼ�Ʈ �� ���� 10�� ����)
	private Person[] per;
	public People(){ // default
		per = new Person[10]; // �� �ٿ� ���� ����
		for(int i = 0; i<per.length;i++) {
			per[i] = new Person();
		}
	}
	public void setName(int n, String name) {
		per[n-1].setName(name);
	}
	public String getName(int n) {
		return per[n-1].getName();
	}
}

class Ticket{
	private People[] p;
	public Ticket() {
		p = new People[3];
		for(int i = 0; i<p.length; i++) {
			p[i] = new People();
		}
	}
	private Scanner sc = new Scanner(System.in);
	
	public void res() {
		System.out.print("�¼����� S(1), A(2), B(3)>> ");
		int num = sc.nextInt();
		for(int i = 0; i<10; i++){
			System.out.print(p[num-1].getName(i+1)+" ");
		}
		System.out.print("\n");
		System.out.print("�̸�>> ");
		String name = sc.next();
		System.out.print("��ȣ>> ");
		int n = sc.nextInt();
		p[num].setName(n, name);
	}
	
	public void find() {
		System.out.print("S>> ");
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
		System.out.print("�¼�  S:1, A:2, B:3 >> ");
		int num = sc.nextInt();
		for(int i = 0;i<10;i++) {
			System.out.print(p[num-1].getName(i+1)+" ");
		}
		System.out.println(" ");
		System.out.print("��ȣ>> ");
		int n = sc.nextInt();
		p[num].setName(n, "---");
	}
	
	public void exit() {
		System.out.print("�ý����� �����մϴ�.");
	}
}

public class ConcertHall {
	public static void main(String[] args) {
		System.out.println("���̽Ľ� �ܼ�Ʈ ���� �ý����Դϴ� *^^*");

		while(true) {
			System.out.print("����:1 ��ȸ:2 ���:3 ������:4 >> ");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			
			Ticket t = new Ticket();
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
						System.out.println("��ȣ�� �߸� �����߽��ϴ� ~");
				}
		}
	}
}
