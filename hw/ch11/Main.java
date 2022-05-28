package hw.ch11;

public class Main {
	public static void main(String[] args) {
		System.out.println("2020818 ������");
		try {
			// ������: 3���� ���͸� ����
			System.out.println("Making root entries...");
			Directory MyDocuments  = new Directory("Mydocuments", "20220401", "SooyeonYoo");
			Directory MyData = new Directory("MyData", "20220401", "SooyeonYoo");
			Directory MyPictures = new Directory("MyPictures", "20220401", "SooyeonYoo");

			
			// ������: MyDocuments�� ���� �� ���� ����
			MyDocuments.add(new File("������0.doc", "20220501", 1000, "SooyeonYoo"));
			MyDocuments.add(MyData);
			
			
			// ������: MyData�� ���� �� ���� ����
			MyData.add(new File("������1.doc", "20220501", 2000, "SooyeonYoo"));
			MyData.add(new File("������2.java", "20220501", 3000, "SooyeonYoo"));
			MyData.add(MyPictures);
			

			// ������: MyDocuments�� ���� �� ���� ����
			MyPictures.add(new File("������3.gif", "20220601", 4000, "SooyeonYoo"));
			MyPictures.add(new File("������4.jpg", "20220601", 5000, "SooyeonYoo"));
			MyPictures.add(new File("������5.png", "20220601", 6000, "SooyeonYoo"));
			
		
			MyDocuments.printList(); // MyData���� ���� ���͸� ��� ���
			
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
