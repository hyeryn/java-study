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
	public String getName() { // ����� �̸��� ��ȯ 
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
	public void setName(int n, String name) { // n��° ��� �̸� ����(�� ���� ����)
		per[n-1].setName(name);
	}
	public String getName(int n) { // n��° ����� ��� �̸� ��ȯ
		return per[n-1].getName();
	}
}

class Ticket{
	private People[] p;
	public Ticket() {
		p = new People[3]; // �ܰ谡 3�ܰ��� (S, A, B)
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
		if(p[num-1].getName(n).equals("---"))
			p[num-1].setName(n, name);
		else 
			System.out.println("�̹� ������ �Ϸ�� �¼��Դϴ�. �ٽ� �����ϼ���.");
	//	System.out.println((num-1)+":"+n+":"+p[num-1].getName(n)); // ����Ǵ��� Ȯ�� -> �Ϸ� !
	}
	
	public void find() {
		System.out.print("S>> ");
	//	System.out.println(p[0].getName(1)); // S�¼� 1���� ����̸� ����Ǵ��� Ȯ�� -> ������ ��������. main���� ���� �ʱ�ȭ����
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
		if(p[num-1].getName(n).equals("---"))
			System.out.println("������� ���� �ڸ��Դϴ�. �ٸ� �¼��� �������ּ���.");
		else
			p[num-1].setName(n, "---");
	}
	
	public void exit() {
		System.out.print("�ý����� �����մϴ�.");
	}
}

public class ConcertHall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȯ���մϴ�.�ܼ�Ʈ ���� �ý����Դϴ�.\n���ϴ� ������ �̸��� �Է����ּ��� >> ");
		String idol = sc.next();
		System.out.println(idol+" �ܼ�Ʈ ���� �ý����Դϴ� *^^*");
		Ticket t = new Ticket(); // while�� �ȿ� ������ ���� ��ȸ ������ ��� �ʱ�ȭ �Ǵϱ� ������ �߻���
		while(true) {
			System.out.print("����:1 ��ȸ:2 ���:3 ������:4 >> ");
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
						System.out.println("��ȣ�� �߸� �����߽��ϴ� ~");
				}
		}
	}
}
