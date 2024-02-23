package com.kh.file_IO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImgResizeMain {

	public static void main(String[] args) {
		// ���� �̹��� ���� ��� �����ϰ� �̹��� ���������� ���� ��� ����
		String path  = "C:\\Users\\user1\\Desktop\\"; //����ȭ�� ���: cmdâ �Ѱ�, cd + Desktop �Է��ؼ� ������ ��ũ
		String inputImg = path + "Windy.jpg";
		String outputImg = path + "reSizeWindy.jpg"; //�̸��� �����ϸ� ������ ������ ����ȴ�
		
		//���������� �̹��� ũ�� ����
		int width = 2000; //���α���
		int height = 100; //���α��� ��ν��Ѿ���
		
		//���� �̹����� �о����
		try {
			BufferedImage originImg = ImageIO.read(new File(inputImg)); //Buffer:������ �о���� �� ex)������ ���۸��� ���ϴ�
			
			//���ο� ũ��� �̹����� ��������
			Image resizeImg = originImg.getScaledInstance(width, height, Image.SCALE_SMOOTH); //�������ϰ�...�غ������?
			//originImg.getGraphics().drawImage(originImg, height, height, height, height, height, height, width, height, null);
			
			//BufferedImage�� ��ȯ
			BufferedImage bufResizeImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB); //���۵��̹����� �ν��Ͻ� �����
			
			//�������� ��û�� ������� ���� �׷��� drawImage
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			
			//�������� �� �̹����� ���Ϸ� ����
			ImageIO.write(bufResizeImg, "jpg"/*.jpg�ε� ���尡��?*/, new File(outputImg));
			
			System.out.println("�̹��� �������� �Ϸ� ~.~");
		} catch (Exception e) { //Exception: ��� ����ó���� �����
			// TODO Auto-generated catch block
			System.out.printf("�̹��� �������� �� ���� �߻� : " + e.getMessage());
		}
	}

}
