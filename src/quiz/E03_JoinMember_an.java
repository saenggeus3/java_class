package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;


public class E03_JoinMember_an {
	
	static class Member{
		String name;
		int age;
		String blood_type;
		String tel;
		
		public Member(String name, int age, String blood_type, String tel) {
			this.name = name;
			this.age = age;
			this.blood_type = blood_type;
			this.tel = tel;
		}
		@Override
		public String toString() {
			return String.format("%s/%d/%s/%s", name, age, blood_type,tel);
		}
		
		public Member update(Member to_update) {
		 	
			return new Member(
					this.name,
					to_update.age == -1 ? this.age : to_update.age,
					to_update.blood_type == null ? this.blood_type : to_update.blood_type,
					to_update.tel == null ? this.tel : to_update.tel
				);
		}
	}
	
	public static boolean checkNotMember(String name) throws IOException {
		BufferedReader br=null;
		String dir = "D:\\java_io//member//";
		String filename = name + ".txt";
		try {
			br = new BufferedReader(
					new FileReader(
							dir+filename, Charset.forName("UTF-8")
					)
			);
			String[] data = br.readLine().split("/");
			System.out.printf("<< '%s'���� ���� >>\n",data[0]);
			System.out.println("�̸� : " + data[0]);
			System.out.println("���� : " + data[1]);
			System.out.println("������ : " + data[2]);
			System.out.println("Tel : " + data[3]);
			
			return false;
		} catch (FileNotFoundException e) {
			System.out.println("[System] - ȸ�������� �����մϴ�.");
			return true;
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}
	
	public static void save(Member info) throws IOException {
		String dir = "D:\\java_io//member//";
		String filename = info.name + ".txt";
		
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter(
								dir+filename,
								Charset.forName("UTF-8")
								)
						)
				);
		
		pw.print(info);
		
		pw.close();
	}

	
	
	
	public static void modify(Member to_update) {
		
		//to_update�� �������� ���� �������� �����ǰ� �������� �����ǵ��� �����
		String dir = "D:\\java_io//member//";
		String filename = to_update.name + ".txt";
		PrintWriter pw;
		
		// ���� �����͸� �о����
		try {
			BufferedReader br = new BufferedReader(new FileReader(dir+filename,Charset.forName("UTF-8")));
			String[] data =br.readLine().split("/");
			
			Member before = new Member(data[0], Integer.parseInt(data[1]), data[2], data[3]);
			Member after = before.update(to_update);
			String info = String.format("%s/%d/%s/%s", after.name, after.age, after.blood_type, after.tel);
			//after.name + after.age + after.blood_type + after.tel;
			pw = new PrintWriter(new BufferedWriter(new FileWriter(dir+filename,Charset.forName("UTF-8"))));
			
			pw.print(info);
			
			pw.close();
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			modify(new Member("ȫ�浿",70,"O","01000000000"));
			
//			System.out.print("�̸� > ");
//			String name = br.readLine();
//			
//			if (checkNotMember(name)) {
//				System.out.print("���� > ");
//				int age = Integer.parseInt(br.readLine());
//				
//				System.out.print("������ > ");
//				String blood_type = br.readLine();
//				
//				System.out.print("��ȭ��ȣ > ");
//				String tel = br.readLine();
//				
//				save(new Member(name, age, blood_type, tel));
//			}
			
			
			
			
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
