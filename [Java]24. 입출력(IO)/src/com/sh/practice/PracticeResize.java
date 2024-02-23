package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
//import javax.print.DocFlavor.STRING;

public class PracticeResize {

	public static void main(String[] args) {
		// �̹��� �ϳ� �ҷ�����
		// ����ȭ�鿡 ���ο� ���� ����� mkdir
		// ���� ���������� �̹��� ����ȭ�鿡 ���� ���� ���� �ȿ� �����ϱ�
		
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "Windy.jpg";
		
		//�ƿ�ǲ �̹��� ������ ���� ����
		String dirPath = "C:\\Users\\user1\\Desktop\\HeartGold";
		File dir = new File(dirPath);
		boolean success = dir.mkdir();
		
		if(success) {
			System.out.println("���������Ϸ�");
		} else {
			System.out.println("������������");
		}
		
		//�ƿ�ǲ ���� ���θ��� ������ ����
		String outputImg = dirPath + "\\reSizeWindy.jpg";
		
		int width = 100;
		int height = 100;
		
		try {
			BufferedImage originImg = ImageIO.read(new File(inputImg));
			
			Image resizeImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("�Ϸ�Ϸ�");
			
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
		}

	}

}
