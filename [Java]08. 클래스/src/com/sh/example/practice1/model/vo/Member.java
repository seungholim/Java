package com.kh.example.practice1.model.vo;

public class Member {
	
	//1.�������
	String memeberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone; //int, String ������
	String email;
	
	//2.������ + Member()
	public Member(String memeberId, String memberPwd, String memberName, int age, char gender, String phone, String email) {
		
		this.memeberId = memeberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		
	}
	
	/*3. ��� �޼ҵ�
		+ changeName(name:String):void
		+ printName():void
	*/	
	public void changeName(String memberName) {
		
		this.memberName = memberName;
		
	}
	
	//print void
	public void Name(String memberName) {
		
		System.out.println(memberName);
		
	}

}
