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

	//google 'maven repo' -> 자바 라이브러리들이 모여있는 사이트
	
	// 외부라이브러리 추가방법
	// Build path -> Configure BuildPath -> Lib Tab -> Add External JAR
	
	public static void main(String[] args) {
		
		// map처럼 데이터를 추가함
		JSONObject obj = new JSONObject();
		
		// JSON 배열을 만들기 위해서는 ArrayList를 사용
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("Programming");
		arr.add("Fishing");
		arr.add("Billiard");
		
		obj.put("car", "BMW");
		obj.put("addr", "금천구");
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
			System.out.println(obj2.get("민수"));
			
			// JSONObject 내부의 배열 요소 꺼내기
			JSONArray programs = (JSONArray) (obj2.get("programming"));
			
			for (Object program : programs) {
				System.out.println(program);
			}
			
			JSONObject minsu = (JSONObject) obj2.get("민수");
			
			System.out.println(minsu.get("성별"));
			System.out.println(minsu.get("나이"));
			
			// JSON - 문자열 정보만 가지고 Map을 생성할 수 있는 문자열 (전송하기 아주 좋음)
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
