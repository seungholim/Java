package com.kh.calculatorMVC;

public class CalculatorMain { //Client

	public static void main(String[] args) {
		// model view controller �־��ֱ�
		// model ��ü ����
		CalculatorModel model = new CalculatorModel();
		// view ��ü ����
		CalculatorView view = new CalculatorView();
		// Controller ��ü ����
		CalculatorController controller = new CalculatorController(model, view);
		// �� ������ ������ model�� view�� �Ķ���� �ۼ�

	}

}
