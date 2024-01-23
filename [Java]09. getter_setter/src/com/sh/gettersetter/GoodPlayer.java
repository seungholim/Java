package com.kh.gettersetter;

public class GoodPlayer { //set���� ���޹ް� get���� ����ϴ¿���
	
	private String name; 
	private int hp; //ü��
	private int attackPower; //���ݷ�

	//set: ���� �����ϱ⸸ �ϴ� ��� (���� ����̾����..)
	//�׷��� valid�� �� ���� ������ �Ѵ�~
	//---------------------------------------------------------	
	
	public void setName(String name) { //1) �̸��� ����Ǹ� ����� set
		this.name = name;
	}
	
	//�����ϴ� valid
	public void ValidName() { //2) ĳ���� �̸��� ������ ������ ����
		if(this.name == "") {
			this.name = "No name";
			System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
		}
	}
	
	public String getName() { //3) ĳ���� �̸��� ��ȯ
		return name;
	}
	
	//---------------------------------------------------------	
	
	public void setHp(int hp) { //1) �Ű������� ����� ü�� �����ϴ� �� (ü���� ����Ǹ� ����� set)
		this.hp = hp;
	}
	
	public void ValidHp() { //2) ü���� 0�� �Ǵ��� ����
		if(this.hp <= 0) { //ü���� 0 ���ϰ� �Ǹ� ü�°� 0���� �����ϰ� �׳� ����
			this.hp = 0;
			System.out.println(name + "�� �����ߴ�!\n");
		}
	}
	
	public int getHp() { //3) ĳ���� ü���� ��ȯ
		return hp; //�Լ� �� ��ȯ�� O
	}
	
	
	//---------------------------------------------------------	
	
	public void setAP(int attackPower) { // AP: Attack Power
		this.attackPower = attackPower;
	}
	
	public void ValidAP() {
		if(this.attackPower < 0) { //���ݷ��� 0���� ������ �׳� 0���� ����
			this.attackPower=0;
			System.out.println("��ȿ���� ���� ���ݷ��Դϴ�.");
		}
	}
	
	public int getAttackPower() {
		return attackPower;
	}
	
	//---------------------------------------------------------	
	
	//ĳ���� ���� ���
		public void displayInfo() {
			System.out.println("< ĳ���� ���� >\n�г��� : " + this.name);
			System.out.println("HP : " + this.hp);
			System.out.println("���ݷ� : " + attackPower + "\n");
		}
		
		//ĳ���� �����ϴ� ��� �޼���
		public void attack(GoodPlayer player2) {
			System.out.println(name + "�� �巡����̺�!\n" + player2.getName() + "��(��) " + attackPower + "�� ������ �޾Ҵ�.");
		}
		
		//�ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
		public void takeDamage(int damage) {
			System.out.println("���� �޾ҽ��ϴ�.");
		}
	

}