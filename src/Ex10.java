import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		String[][] words= {
				{"chair","����"},{"computer","��ǻ��"},{"integer","����"}
		};
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s�� ����?" ,i+1,words[i][0]);
			
			String tmp=s.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n", words[i][1]);
				}else {
					System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n",words[i][1]);}
		}
	}

}
