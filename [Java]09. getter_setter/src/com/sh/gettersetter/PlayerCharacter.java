package com.kh.gettersetter;

public class PlayerCharacter {
	
	//�ʵ尪(����)
	private String name; 
	private int hp; 
	private int attackPower;
	
	/**
	Getter
		(������ '���纻'�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ���� ���������ʹ� ������
		Run������ set���� ������ ������ �޾Ƽ� ��������..
		
	Setter
		�ܺο��� �޼��带 ���� �����Ϳ� ������ �ϰ� �ȴٸ�
		�޼���� �Ű���(�Ű�����)�� �����ؼ� ��ȿ�� ���� �����ͷ� ������ �� ����
		
		set: ������ ����...�̶�� ���� �ɵ�.. ���� ���� ������ �ϵ� ���ϵ� ��ư~ (ppt�� ġ�� �� �������� ���ͼ� ����)
		
		set: ������ (��ȯ���� ��� ���� x)
	**/
	
	public String getName() { //1. get���� �̸��� ����
		return name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	
	//valid -> ������ �� ���� �̸�
	public void isValidHp() {}
	
	
	public void setName(String name) {//2. set�� �̸��� �־���
		this.name = name;
	}
	
	public void setHp(int hp) {
		//���࿡ ü���� 0�̶�� ���̰� ü���� 1 �̻��̸� �츮��
		if(hp>0) {
			this.hp = hp;
		} else { //ü���� 0 ���϶�� ü���� ǥ���� ��ġ�� ����..
			System.out.println(name + "��(��) �����ߴ�!");
		}
	}
	
	// ���� �־ 0 ������ ���� ��µ��� ����
	public void setAttackPower(int attackPower) {
		//���࿡ ���ݷ��� 0���� Ŭ ���
		if(attackPower>0) {
			this.attackPower = attackPower;
		} else {
			this.attackPower = 0;
			System.out.println("���ݷ��� ������ �մϴ�.");
		}
		
	}
	
	//ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("< ĳ���� ���� >\n�г��� : " + name);
		System.out.println("HP : " + hp);
		System.out.println("���ݷ� : " + attackPower + "\n");
	}
	
	//ĳ���� �����ϴ� ��� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println(name + "�� �巡����̺�!\n" + target.getName() + "��(��) " + attackPower + "�� ������ �޾Ҵ�.");
	}
	
	//�ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�.");
	}
	
}
