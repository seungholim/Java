package com.kh.treeMain;
/*
 ��带 �����ϰ� ���ư���(��ȸ) ����ϴ� ����Ʈ��
 	���� ��ȸ : root(�Ѹ�)�� ���� ���� �湮
 	���� ��ȸ : ���� ���� Ʈ���� �湮 �� root(�Ѹ�) �湮
 	���� ��ȸ : ���� Ʈ�� ��� �湮 �� root(�Ѹ�) �湮
 	���� ��ȸ : �� �� node�� ���� �Ʒ� �������� ���ʴ�� �湮
 */
public class BinaryTree {
	
	TreeNode roott; //�̰� �����Ҹ��ϱ�.. ��ư �Ķ� root�� ���� ������ �����ε�
	
	/*
	public BinaryTree() { //������ > �ʿ���µ�...?��?
		this.root = null;
	}
	*/
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(); //�ν��Ͻ� ����
		
		tree.insert(50);
		tree.insert(70);
		tree.insert(30);
		tree.insert(40);
		tree.insert(20);
		tree.insert(80);
		tree.insert(60);
		tree.insert(45);
		tree.insert(85);
		tree.insert(100);
		tree.insert(120);
		tree.insert(10);
		tree.insert(65);
		
		System.out.println("���� Ʈ���� ���� ��ȸ ��� : ");
		tree.inOrderT(); 
	}
	
	/*
	 insert, insertRec �޼���� ���� Ʈ���� ���ο� ��带 �����ϴµ� ���
	 
	 insert : �ܺο� ����Ǵ� �޼���
	 insertRec : ���� ���� �۾� �޼���	
	 */
	
	// insert �޼���
	public void insert(int data) {
		roott = insertRec(roott, data);
	}
	
	// intsertRec �޼���
	private TreeNode insertRec(TreeNode root, int data) {
		// ��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ����
		// ����� : �ڱ� �ڽ��� �����ϰ�, �ٽ� �ڱ� �ڽ��� ����ؼ� ���ǳ���
		
		if(root == null) { //root�� null���� ��� ù data�� root�� ����
			root = new TreeNode(data);
			return root;
		}
		if(data<root.data) { //���� ���� �����Ͱ� root���� ������ ��������
			root.left = insertRec(root.left, data);
		} else if(data>root.data) { // ũ�� ����������
			root.right = insertRec(root.right, data);
		}
		
		return root;
	}
	
	/*
	 inOrderT : ������ȸ
	 inOrderTR : ������ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
	 ���� ����Ʈ�� > ������ > ������ ����Ʈ�� ������ ��� ���
	 */
	
	public void inOrderT() { // inOrderTraversal : ������ȸ
		// �ܺο� ����Ǵ� �޼���
		inOrderTR(roott);
	}
	
	//root.data�� ����
	private void inOrderTR(TreeNode root) { //������ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���..
		if(root != null) { // root ���� null�� �ƴ϶��..
			inOrderTR(root.right); //���ʼ���Ʈ�� ���� ��� �������� �� �� �մ¸�ŭ ��
			System.out.print(root.data + " "); //��Ʈ��Ʈ�湮 ����~~~!
			inOrderTR(root.left); //�����ʼ���Ʈ�� ���� ��� ���������� �� �� �մ¸�ŭ ��
			//System.out.print(root.data + " ");
		}
	}
	


}