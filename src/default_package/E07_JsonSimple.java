package default_package;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class E07_JsonSimple {

	//google 'maven repo' -> �ڹ� ���̺귯������ ���ִ� ����Ʈ
	
	// �ܺζ��̺귯�� �߰����
	// Build path -> Configure BuildPath -> Lib Tab -> Add External JAR
	
	public static void main(String[] args) {
		
		// mapó�� �����͸� �߰���
		JSONObject obj = new JSONObject();
		
		// JSON �迭�� ����� ���ؼ��� ArrayList�� ���
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Programming");
		arr.add("Fishing");
		arr.add("Billiard");
		
		obj.put("car", "BMW");
		obj.put("addr", "��õ��");
		obj.put("age", "27");
		obj.put("hobbies",arr);
		
		System.out.println(obj);
		
		String jsonStr = obj.toJSONString();
		System.out.println(jsonStr);
		
		
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject obj2 =(JSONObject) parser.parse(new FileReader("D:\\java_io\\data.json"));
			
			System.out.println(obj2.get("name"));
			System.out.println(obj2.get("tel"));
			System.out.println(obj2.get("age"));
			System.out.println(obj2.get("programming"));
			System.out.println(obj2.get("lotto"));
			System.out.println(obj2.get("�μ�"));
			
			// JSONObject ������ �迭 ��� ������
			JSONArray programs = (JSONArray) (obj2.get("programming"));
			
			for (Object program : programs) {
				System.out.println(program);
			}
			
			JSONObject minsu = (JSONObject) obj2.get("�μ�");
			
			System.out.println(minsu.get("����"));
			System.out.println(minsu.get("����"));
			
			// JSON - ���ڿ� ������ ������ Map�� ������ �� �ִ� ���ڿ� (�����ϱ� ���� ����)
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
