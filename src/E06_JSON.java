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
	// JavaScript���� ����ϴ� MapŸ��
	// ���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����
	// {Key : Value, Key : Value}�� ���¸� ����
	
	// JSON Value�� ���Ǵ� �ڹٽ�ũ��Ʈ Ÿ�Ե�
	// '', "" :  String
	// ����, �Ҽ� : Number
	// [] : Array
	// {} : JSON
	
	// JAVA������ JSONŸ���� �������� �ʱ� ������ �����͵���
	// JSON ������ ���ڿ��� ����� ����� (Parsing, Binding)
	
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
			
			// Object�� ��� ���� �� �� �ִ�Ÿ��
			// �ٽù迭�� ����ϱ����� Object[] Ÿ������ �ٿ�ĳ�����Ͽ� ����ؾ���
			
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
		System.out.println("���� ���� �Ϸ�");
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
		// ���� Map�� ����� �����͸� JSON������ ���ڿ��� �����Ͽ� ���
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "ȫ�浿");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("programming", new String[] {"JAVA", "python", "JS"});
		map.put("lotto", new Integer[] {10, 11, 12 ,13 ,14});

		
		// instanceof �����ڸ� ���� �ش� ���� Ÿ���� ������ �� ����
//		System.out.println(map.get("name") instanceof String);
//		System.out.println(map.get("age") instanceof String);
//		System.out.println(map.get("programming") instanceof Object[]);
		
		
		//��� : { name:"ȫ�浿", age:15, tel:"010-1234-1234" }
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
//			// Object�� ��� ���� �� �� �ִ�Ÿ��
//			// �ٽù迭�� ����ϱ����� Object[] Ÿ������ �ٿ�ĳ�����Ͽ� ����ؾ���
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
//		System.out.println("���� ���� �Ϸ�");
		
		
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
