import myobj.tmp.C07_diffPackage;

public class C07_accessModifier extends C07_diffPackage{

	
	// ���԰���(include)
	// ����� ���� �ش� Ŭ������ �����ϴ°�
	// ���� ���� ���յ��� ����
	
	// ���� ����(dependency)
	// �ϳ��� Ŭ������ �ٸ� Ŭ������ ����ϴ� ��
	
	//���� ������ (Access Modifier)
	// �ٸ� Ŭ������ �ش� Ŭ�������ڿ��� ����Ϸ��� �Ҷ�
	
	// ������ �� �ִ� �Ÿ��� ����
	// ���� Ŭ���� ������ �ٸ� �ڿ�(���� ����� �Ÿ�)
	// ���� ��Ű�� ������ �ٸ� �ڿ�
	// �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	// �ٸ� ��Ű���� �ڿ� (����հŸ�)
	
	// ���� �������� ����
	// private		: ���� Ŭ���� ���ο����� ����� �� �ִ� �ڿ��� ��
	// �ƹ��͵� �� ��	: default �ٸ� ��Ű�������� ����� �� ���� �ڿ��̵�
	// protected	: �ٸ� ��Ű�������� ����� ������ �� �� �ִ� �ڿ��� ��
	// public		: ���� �� �Ÿ������� �����Ӱ� �� �� �ִ� �ڿ��� �ȴ�
	
	// ��ü���⿡���� ĸ��ȭ (Encapsulation)
	// ���� �����ڸ� Ȱ���Ͽ� �ٸ� Ŭ�������Դ� ������ �ʿ���� �ڿ�(����,�޼���)�� �����ϴ� ���� ����
	
	public static void main(String[] args) {
		
		//���� ��Ű�� ������ �ڿ��� private�� �����ϰ� ��� ���δ�(visible)
		
		System.out.println(C07_samePackage.package_s_int);
		System.out.println(C07_samePackage.protected_sInt);
		System.out.println(C07_samePackage.public_sInt);
		
		C07_samePackage same_package_instance = new C07_samePackage();
		
		System.out.println(same_package_instance.package_int);
		System.out.println(same_package_instance.protected_int);
		System.out.println(same_package_instance.public_int);
		
		// �ٸ� ��Ű���� �ڿ��� ����� ������ protected���� ���δ�(visible)
		System.out.println(C07_diffPackage.public_sInt);
		System.out.println(C07_diffPackage.protected_sInt);
		
		C07_diffPackage diff_package_instance = new C07_diffPackage();
		// ��ӹ��� ��ü�� �ν��Ͻ��� protected �ڿ��� ������ �� ����
		C07_accessModifier child = new C07_accessModifier();
		
		System.out.println(child.protected_int);
		System.out.println(child.public_int);
		
		
	}
	
}
