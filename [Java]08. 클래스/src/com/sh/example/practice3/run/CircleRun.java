package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class CircleRun {

	public static void main(String[] args) {
		// �� ��ü ����
		
		Circle circle1 = new Circle(3.14,2);
		
		circle1.incrementRadius();
		circle1.getAreaOfCircle(); //������� �ʹ� �׷��� �̰� �Ҽ��� �� �ڸ����� �����°ž�...
		circle1.getSizeOfCircle();
		

	}

}
