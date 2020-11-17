

public class C12_tryCatchFinally {
	
	//���� ó��
	// �츮�� ������� �˰��ִ� ���� �۾����� ����(Exception)��� �θ�
	// �� ���������� Ʋ������ ���ܰ� �ƴ϶� ����(ó���Ұ�)
	// ���α׷��Ӱ� ���ܿ� ���� ��������ġ�� �����شٸ� ���α׷��� �������������ʰ� ����ؼ� �����ϰ� ��
	
	// try
	// ���ܰ� �߻��� �� �ִ� �ڵ带 try�� ���ο� ���Խ�Ŵ
	// ���ܰ� �߻����� ������ ��� ���� �����
	// ���ܰ� �߻��Ѵٸ� �ش翹�ܸ� �޴� catch������ �Ѿ�� ��
	
	// catch
	// catch���� �������� ����� �� ����
	// ù��° �Ű������� �ش� ���ܿ� ���� ������ ����ִ� ��ü�� ����
	// ExceptionŸ���� catch���� ��� ���ܸ� catch�� �� ����
	//	Exception : ��� ������ �θ�Ÿ��
	
	// finally
	// try�� ������ ���� �߻� ���ο� ������� ������ ����Ǵ� ����
	
	public static void main(String[] args) {
		
		int[] abc = new int[10];
		
		try {
			System.out.println("try���� ����");
			System.out.println(abc[0]); // ���ܹ߻� �ڵ�
			System.out.println(Integer.parseInt("123")); // ���ܹ߻��ڵ�2	
			System.out.println("try���� ��");
			
		} catch (Exception e) {
			System.out.println("catch�� ����");		
		} finally {
			System.out.println(" /)/)");
			System.out.println("(.. )");
			System.out.println(" <  )");
		
		}
			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("catch�� ����");
//		} catch (NumberFormatException e) {
//			System.out.println("int Ÿ���� �� �� ����");
//		} 
		
		System.out.println("����");
	}
	
	

}
