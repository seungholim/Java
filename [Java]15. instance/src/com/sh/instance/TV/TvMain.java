package com.kh.instance.TV;

public class TvMain {

	public static void main(String[] args) {
		
		TV tv; //TV�ν��Ͻ��� �����ϱ� ���� ���� tv����
		tv = new TV(); //TV�ν��Ͻ� ���� (�޸𸮿� '����'Ȯ��) �� �̸��� tv�ýô�
		//������ ��ġ�� ���� ����� (�׳� �� ����Ʈ�� ġ�� 18�� ���븸 Ȯ���ص� ����..)
		
		//��ü�� �ּҸ� �������� tv�� �����Ѵ�
		
		//TV tv1 = new TV();
		
		tv.channel = 7; //TV �ν��Ͻ��� ������� channel�� ���� 7�� �ʱ�ȭ
		tv.channelDown(); //TV �ν��Ͻ��� �޼��� channelDown ȣ��
		tv.power(); //�޼���ȣ��
		System.out.println("Channel : " + tv.channel);

	}

}
