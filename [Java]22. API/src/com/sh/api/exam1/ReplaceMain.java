package com.kh.api.exam1;

public class ReplaceMain {
	//���� ��ü�� ��ü
	public static void main(String[] args) {
		/*
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-"); //������ ���������� ����
		System.out.println(reInput); //��°�: Hello,-world!
		
		String input2 = reInput.replace("-"," ");
		System.out.println("input2 : " + input2);
		*/
		
		ReplaceMain rm = new ReplaceMain(); //Ŭ���� �ν���Ʈ rm����
		rm.replace(); //�ν���Ʈ�� �޼��� ����
		rm.replace2();
		rm.replace3();
		rm.replace4();
		rm.replaceAll();
	}
	
	public void replace() {
		String input = "Hello World!";
		//World�� Java�� ��ü
		String reInput = input.replace("World" , "Java");
		System.out.println(reInput);
	}
	
	public void replace2() {
		String originName = "Hello World!";
		// 'o'�� �����ִ� ���ڿ��� 'x'�� �����ϱ�
		String reName = originName.replace("o", "x");
		System.out.println(reName);
	}
	
	public void replace3() {
		String originString = "The quick brown fox jumps over the lazy dog";
		//fox�� cat���� �ٲٱ�
		String reString = originString.replace("fox", "cat");
		System.out.println(reString);
		
	}

	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		//��� ���� �����ϱ�
		String reString = originString.replace(" ", "");
		System.out.println(reString);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		//replace ��� replaceAll�� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)world", "Java");
		
		System.out.println(reAllstr);
		
	}
}
