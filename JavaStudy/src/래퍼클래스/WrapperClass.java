package ����Ŭ����;

public class WrapperClass {
	public WrapperClass() {
		// TODO Auto-generated constructor stub
		// ���� = Byte , Short , Integer , Long
		// �Ǽ� = Float , Double
		// ���� = Character 
		int num  = 130;
		// �� ������ �޸𸮿� �󸶳� �����ϴ��� �𸣰� ���� 250�̶��͸� �˼��ִ�.
		Integer numObj = new Integer(num);
		// ��ü�� ��������� �ϴµ� ���������ʴ´�
		Integer numObj2 = Integer.valueOf(num);
		// valueOf �޼��� �̿�
		Integer numObj3 = num; 
		// num �׳� �־ �ȴ� = ���� �ڽ� = �⺻ ������ Ÿ���� ��ü������ �ڵ����� ��ȯ�Ǵ� ��
		
		// num = 250 , numObj = 5400 �ּҿ� �� 250 , numobj2 = 6500 �ּҿ� �� 250 , numobj3 = 7200 �ּҿ� �� 250
		// ����Ʈ ũ�� 
		System.out.println("����Ʈ ��->"+numObj3.BYTES);
		// ��Ʈ��
		System.out.println("��Ʈ ��->"+numObj3.SIZE);
		// ���� �ִ밪
		System.out.println("ū��->"+ numObj3.MAX_VALUE);
		// Ÿ��
		System.out.println("��������->"+numObj3.TYPE);
		// byte �ִ밪 
		System.out.println("����Ʈ �ִ� ũ��->"+Byte.MAX_VALUE);
		System.out.println("����Ʈ �ּ� ũ��->"+Byte.MIN_VALUE);
		byte numByte = (byte)num;
		System.out.println("numByte="+numByte); // - 128 , - 127 , - 126 �����÷ο�
		
		// IntegerŬ������ byteŸ������ �����ϴ� �޼��� ã��
		byte numByte2 = numObj3.byteValue();
		System.out.println("numByte2="+numByte2);
		// IntegerŬ���� 16������ ���ϱ�
		System.out.println("100�� 16������="+Integer.toHexString(100));
		// �Ű������� int�� ����ߵǴµ� Integer �� �����ص� �� = ���� ��ڽ� �� 
		System.out.println(num+"�� 16������="+Integer.toHexString(num));
		
		// ��ü���� �⺻������������ ��ȯ�Ͽ� ������ = �����ڽ�
		int num4 = numObj3;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WrapperClass();
	}

}
