package ��Ʈ������;

public class StringBufferTest {
	
	public StringBufferTest() {

	}
	public void start() {
		// String ���������� ���ڿ��� ó���ϹǷ� ���ڿ��� ���� ����Ǹ�
		// ���ο� �ּ� �̵��Ѵ�.
		// StringBuffer �� StringBuilder ���ڿ��� �������� �����Ҽ� �ִ� Ŭ������
		// ���ڿ��� ���� �Ǵ��� �ּҸ� �̵����� �ʰ� ������ ó���Ѵ�.
		StringBuffer sb = new StringBuffer();
		System.out.println(" Ȯ���� �޸� ������ -> " + sb.capacity());
		
		String name ="ȫ";
		name = name.concat("�浿"); // ������ ������ ������� �������� ���Ѵ�. 
		System.out.println(name);
		
		// StringBuffer
		sb.append("����"); // append  ���ڸ� ���� �������� �������� �߰��Ѵ�. 
		System.out.println("sb->"+sb.toString());
		char[] txt = {'J','A','V','A','��','��','��','��','��'};
		sb.append(txt);
		System.out.println(sb.toString());
		// ���� index 0 ����
		sb.append(txt,5,4);
		sb.insert(6, "(�ڹ�)"); // insert 6��° �ε����� �߰� 
		System.out.println("sb  = " + sb);
		
		
		// �ִ� 19���� 
		System.out.println("���� �� = " + sb.length()); 
		System.out.println("����ũ�� = " + sb.capacity()); // 34���� Ȯ��
								// ���ڸ� �������� 2���̻��� ������ Ȯ���Ѵ�.
		
		// Ư����ġ�� ���� �����
		sb.delete(2, 5);
		System.out.println("sb->del->"+ sb);
		
		String tel = "010-1234-5678";
		String localTel = tel.substring(4, 8);
		String userTel = tel.substring(4);
		System.out.println(localTel + ", " + userTel);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("�ڹ�");
		StringBuffer sb3 = new StringBuffer("�ڹ�");
		
		System.out.println("===");
		if(sb2.equals(sb3)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// ���� - ��ü�� �ƴϳ��� ���� ���� �����ϴ°� �� 
		
		if(sb2 == sb3) {
		// �������� 
			System.out.println("����");
		} else {
			System.out.println("�����ʴ�");
		}
		// ���� 
		StringBuffer sb4 = sb3;
		if(sb3 == sb4) {
			System.out.println("����");
		} else {
			System.out.println("�����ʴ�");
		}
		
		// sb4�� ���� �����ϸ� ���� �ּҸ� ������ �ִ� sb3 �� ���� ���� 
		sb4.append("��¥�ٲ??");
		System.out.println("sb3->"+sb3);
		
		// ��ü �ּ��� �����͸� ������ ������ Ȯ���ϴ� �޼���
		
		// ��ü�ּ��� �����͸� ������ ������ Ȯ���ϴ� �޼��带 �̿��ؾ� �Ѵ�.
		// equals() : Object Ŭ������ �޼��带 ��ӹ޾� ����ϰ� ������
		//			��ü���� ���� �ƴ� ��ü ��ü�� ������ �ٸ��� �Ǵ��Ѵ�.
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		if(s1 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		if(s1.equals(s2)) {
			System.err.println("����");
		} else {
			System.out.println("�����ʴ�");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		// �켱���� ���� 
		// ���ڿ��� ũ�� ��
		// ����� ������ ���� ��ü�� ũ��
		// ������ ������ ���� ��ü�� �۴�
		// 0 �̸� �� ��ü �� ���� ���� 
		String s3 = new String("Jbxcb");
		String s4 = new String("JAVA");
		
		System.out.println(s3.compareTo(s4));
		
		// Ư�� ��ġ�� ����1���� ���´�.
		String str = "Java Programing Test.. ";
		// Ư����ġ�� ���� 1���� ���´�.
		
		char c = str.charAt(5);
		System.out.println(c);
		
		// ���ڿ��� byte �� �迭�� ���Ѵ�. 
		byte[] strByte = str.getBytes();
		for(byte s : strByte) {
			System.out.println(s);
		}
		System.out.println(str.indexOf("g") + ", " + str.lastIndexOf("g"));
					// 8 + 14
		str = str.replaceAll("Test", "�׽�Ʈ");
		System.out.println("str->" + str);
		
		String str4 = "sldlas s dokd  wqo";
		System.out.println(str4.replaceAll(" ", ""));
		
		String[] splitResult = str.split("g"); // g �� ¥�� 
		for(String s : splitResult) {
			System.out.println(s);
		}
		System.out.println("�빮�ڷ� -> " + str.toUpperCase());
		System.out.println("�ҹ��ڷ� -> " + str.toLowerCase());
	
		// ���ڿ��� ���Ե� ���ʿ� �ִ� ���鹮�ڸ� �����ϴ� �� : trim();
		String userid = "        g";
		System.out.println(" �������� : " + userid.trim().replaceAll(" ", ""));
		
		System.out.println("="+userid+"=");
	}
	
	public static void main(String[] args) {
		new StringBufferTest().start();
	}
}
