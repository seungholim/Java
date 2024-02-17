package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 	StringTokenizer : Ŭ���� ���ڿ��� �и��ϴ� �� ���
 	�־��� ������(�⺻:����)�� �������� ���ڿ��� ��ū���� �и�
 */
	public static void main(String[] args) {
		
		/*
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		//tokenizer
		//hasMorTokens
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token); //���⸦ �������� ���
		}
		*/
		
		StringTokenizerMain stm = new StringTokenizerMain(); //�ν��Ͻ� ����
		//stm.STExam4();
		stm.stringtoMath();
	}
	
	public void STExam() {
		String text = "apple, banana, grape, orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ","); //,�� �������� �����ς����
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	
	public void STExam2() {
		// '-' �����ڸ� ����ؼ� text����� '-' �����ڷ� ��� ����ϱ�
		String text = "��ī��-������-���̸�-���α�-�ߵ���";
		StringTokenizer tokenizer = new StringTokenizer(text,"-"); //-�� �����ς���
		
		while(tokenizer.hasMoreTokens()) {
			String pokemon = tokenizer.nextToken();
			System.out.println(pokemon); // -�� �������� ���
		}
	}
	
	public void STExam3() {
		//Ư�� �ܾ� �����ϰ� �����ڷ� �и�
		String text = "This is a test. But not a real one." ;
		StringTokenizer tokenizer = new StringTokenizer(text, " .");
		
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			if(!word.equals("test")) { //test�� �ƴϸ� ����ع����ڴ�
				System.out.println(word);
			}
		}	
	}
	
	public void STExam4() {
		//��¥ �����ڷ� �и�
		String date = "2023-09-13";
		StringTokenizer tokenizer = new StringTokenizer(date,"-");
		int year = Integer.parseInt(tokenizer.nextToken()); //parseInt
		int month = Integer.parseInt(tokenizer.nextToken());
		int day = Integer.parseInt(tokenizer.nextToken());
		
		System.out.println("Year : " + year + "��");
		System.out.println("Month : " + month + "��");
		System.out.println("Day : " + day + "��");
	}
	
	public void stringtoMath() { //���ڿ����� ��.. ���ڸ� �ϳ� �����ͺ���
		String text = "The price is $15.99";
		StringTokenizer tokenizer = new StringTokenizer(text, " $.");
		
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			if(token.matches("\\d+(\\.\\d+)?")){//���๮�� �ܿ켼��..
				System.out.println("Number : " + token);
			}
		}
	}

}
