package quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class E03_JoinMember {
	
	// 사용자가 자신의 여러가지 개인정보를 입력하면
	// 그 정보를 사용자의 이름으로 된 파일에 저장
	
	// java_io/member/디렉토리에 저장
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {

			
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			String age = sc.nextLine();
			System.out.print("지역 : ");
			String local = sc.nextLine();
			System.out.print("전화번호 : ");
			String number = sc.nextLine();
			
			String member = "D:\\java_io\\member\\"+name+".txt";
			
			FileWriter fw = new FileWriter(member,Charset.forName("UTF-8"));
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw,true);
			
			

			
			pw.println(name+ "/" + age + "/" + local + "/" + number);
			
			
			
			
			
			pw.close();
			bw.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 사용자의 이름을 전달받으면 해당 사용자가 가입된 회원이라면 파일에서 정보를 읽어 출력
		// 아직 가입되지 않은 사람이라면 가입되지 않았다고 출력하는 메서드를 작성
		
		// java_io/member/디렉토리에 저장
		
		System.out.println();
		System.out.println();
		
		System.out.print("찾을 이름 입력 : ");
		String sname = sc.nextLine();
		
		try {
			String member = "D:\\java_io\\member\\"+sname+".txt";
			FileInputStream fi = new FileInputStream(member);
			InputStreamReader is = new InputStreamReader(fi,Charset.forName("UTF-8"));
			
			StringBuilder sb = new StringBuilder();
			
			int i;
				while((i = is.read()) != -1) {
					sb.append(((char)i));
//					System.out.println((char)i);
					if (i==(int)'\n') {
						if (sb.toString().startsWith(sname)) {
							System.out.println(sb.toString());
						}
						sb = new StringBuilder();
					}
					
			}
			
			is.close();
			fi.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("가입되어있지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		// 저장된 사용자의 정보를 수정할 수 있는 메서드를 구현
		
		
		
		
		try {
			System.out.print("수정할 이름 입력 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			String age = sc.nextLine();
			System.out.print("지역 : ");
			String local = sc.nextLine();
			System.out.print("전화번호 : ");
			String number = sc.nextLine();
			
			String member = "D:\\java_io\\member\\"+sname+".txt";
			
			FileWriter fw = new FileWriter(member,Charset.forName("UTF-8"));
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw,true);
			
			

			
			pw.println(name+ "/" + age + "/" + local + "/" + number);
			
			
			
			
			
			pw.close();
			bw.close();
			fw.close();
			
			
		} catch (FileNotFoundException e) {
			System.err.println("가입되어있지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
