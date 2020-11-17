import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E06_JSON {
	
	// JSON
	// JavaScript에서 사용하는 Map타입
	// 문자열만으로 Map을 간결하게 표현할 수 있어서 인기가 많음
	// {Key : Value, Key : Value}의 형태를 가짐
	
	// JSON Value에 사용되는 자바스크립트 타입들
	// '', "" :  String
	// 숫자, 소수 : Number
	// [] : Array
	// {} : JSON
	
	// JAVA에서는 JSON타입을 지원하지 않기 때문에 데이터들을
	// JSON 형태의 문자열로 만들어 줘야함 (Parsing, Binding)
	
	public static void mapToJsonFile(Map<String, Object> map) throws IOException {
		int start = 0;
		int end = map.size()-1;

		
		StringBuffer str2 = new StringBuffer("");
		int j = 0;
		
		
		for (Entry<String, Object> tmp : map.entrySet()) {
			if (j==start) {
				str2.append("{\n");
			}
			
			str2.append("\t\"" + tmp.getKey()+"\" : ");
			
			// Object는 모든 것이 들어갈 수 있는타입
			// 다시배열로 사용하기위해 Object[] 타입으로 다운캐스팅하여 사용해야함
			
			Object value = tmp.getValue();

			if (value instanceof Object[]) {
				str2.append("[");
				int startC = 0;
				for (Object ob : (Object[])value) {
					if (startC!=0) {
						str2.append(", ");
					}
					if (ob instanceof String) {
						str2.append("'" + ob + "'");
					}else {
						str2.append(ob);
					}
					startC++;
				}
			str2.append("]");
			}else if (tmp.getValue() instanceof String) {
				str2.append("\"" + tmp.getValue()+"\"");
			}else {
				str2.append(tmp.getValue());
			}
			if(j!=end) {
				str2.append(", \n");
			}else {
				str2.append("\n}");
			}

			j++;
			
		}
		//System.out.println(str2.toString());
		
		FileWriter fw = new FileWriter("D:\\java_io\\data.json");
		fw.write(new String(str2));
		fw.close();
		System.out.println("파일 쓰기 완료");
	}
	
	public static HashMap<String, Object> jsonFileToMap(String url) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(url));
		
		StringBuilder str = new StringBuilder();
		String next_br = br.readLine();
		
		HashMap<String, Object> map = new HashMap<>();
		
		
		while(next_br!=null) {
			//System.out.println(next_br);
			str.append(next_br);
			next_br = br.readLine();
		}
		br.close();
		str.deleteCharAt(0);
		str.deleteCharAt(0);
		str.deleteCharAt(str.length()-1);
		String all_data = str.toString();
		//System.out.println(all_data);
		String[] data = all_data.split("\t");
		for (int i = 0; i < data.length; i++) {
			//System.out.println(i + " - " + data[i]);
		}
		for (int i = 0; i < data.length; i++) {
			String[] tmp = data[i].split(":");
			tmp[0]=tmp[0].replace("\"", "").trim();
			if (tmp[1].contains("[")) {
				String[] tmp2 = tmp[1].replace("[", "").replace("]", "").replace("'", "").replace(" ", "").split(",");
				if (tmp[1].contains("'")) {
					map.put(tmp[0], tmp2);
				}else if(tmp[1].contains(".")) {
					double[] double_arr = Arrays.asList(tmp2).stream().mapToDouble(Double::parseDouble).toArray();
					map.put(tmp[0], double_arr);
				}else {
					int[] int_arr = Arrays.asList(tmp2).stream().mapToInt(Integer::parseInt).toArray();
					map.put(tmp[0], int_arr);
				}
			}else if (tmp[1].contains("\"")) {
				map.put(tmp[0], tmp[1].replace("\"", "").replace(",", "").trim());
			}else {
				if (tmp[1].contains(".")) {
					map.put(tmp[0], Double.parseDouble(tmp[1].replace(",", "").trim()));
				}else {
					map.put(tmp[0], Integer.parseInt(tmp[1].replace(",", "").trim()));
				}
			}
		}
		
		return map;
	}
	 
	public static void main(String[] args) throws IOException {
		// 다음 Map에 저장된 데이터를 JSON형태의 문자열로 생성하여 출력
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "홍길동");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("programming", new String[] {"JAVA", "python", "JS"});
		map.put("lotto", new Integer[] {10, 11, 12 ,13 ,14});

		
		// instanceof 연산자를 통해 해당 값을 타입을 구분할 수 있음
//		System.out.println(map.get("name") instanceof String);
//		System.out.println(map.get("age") instanceof String);
//		System.out.println(map.get("programming") instanceof Object[]);
		
		
		//출력 : { name:"홍길동", age:15, tel:"010-1234-1234" }
//		int start = 0;
//		int end = map.size()-1;
//
//		
//		StringBuffer str2 = new StringBuffer("");
//		int j = 0;
//		
//		
//		for (Entry<String, Object> tmp : map.entrySet()) {
//			if (j==start) {
//				str2.append("{ \n");
//			}
//			
//			str2.append("\t\"" + tmp.getKey()+"\" : ");
//			
//			// Object는 모든 것이 들어갈 수 있는타입
//			// 다시배열로 사용하기위해 Object[] 타입으로 다운캐스팅하여 사용해야함
//			
//			Object value = tmp.getValue();
//
//			if (value instanceof Object[]) {
//				str2.append("[");
//				int startC = 0;
//				for (Object ob : (Object[])value) {
//					if (startC!=0) {
//						str2.append(", ");
//					}
//					if (ob instanceof String) {
//						str2.append("'" + ob + "'");
//					}else {
//						str2.append(ob);
//					}
//					startC++;
//				}
//			str2.append("]");
//			}else if (tmp.getValue() instanceof String) {
//				str2.append("\"" + tmp.getValue()+"\"");
//			}else {
//				str2.append(tmp.getValue());
//			}
//			if(j!=end) {
//				str2.append(", \n");
//			}else {
//				str2.append(" \n}");
//			}
//
//			j++;
//			
//		}
//		System.out.println(str2.toString());
//		The method toString(long[]) in the type Arrays is not applicable for the arguments (Object)
//		FileWriter fw = new FileWriter("D:\\java_io\\data.json");
//		fw.write(new String(str2));
//		fw.close();
//		System.out.println("파일 쓰기 완료");
		
		
		HashMap<String, Object> map2 = jsonFileToMap("D:\\java_io\\data.json");
		
		for(Entry<String, Object> tmp : map2.entrySet()) {
			if (tmp.getValue() instanceof int[]) {
				System.out.println(tmp.getKey() + " : " + Arrays.toString((int[])tmp.getValue()));
			}else if(tmp.getValue() instanceof double[]) {
				System.out.println(tmp.getKey() + " : " + Arrays.toString((double[])tmp.getValue()));
			}else if (tmp.getValue() instanceof Object[]) {
				System.out.println(tmp.getKey() + " : " + Arrays.toString((Object[])tmp.getValue()));
			}else {
				System.out.println(tmp.getKey() + " : " + tmp.getValue());
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
