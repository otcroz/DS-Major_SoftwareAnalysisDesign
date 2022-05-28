package hw.ch11;

public class Main {
	public static void main(String[] args) {
		System.out.println("2020818 유수연");
		try {
			// 유수연: 3개의 디렉터리 생성
			System.out.println("Making root entries...");
			Directory MyDocuments  = new Directory("Mydocuments", "20220401", "SooyeonYoo");
			Directory MyData = new Directory("MyData", "20220401", "SooyeonYoo");
			Directory MyPictures = new Directory("MyPictures", "20220401", "SooyeonYoo");

			
			// 유수연: MyDocuments에 파일 및 폴더 삽입
			MyDocuments.add(new File("유수연0.doc", "20220501", 1000, "SooyeonYoo"));
			MyDocuments.add(MyData);
			
			
			// 유수연: MyData에 파일 및 폴더 삽입
			MyData.add(new File("유수연1.doc", "20220501", 2000, "SooyeonYoo"));
			MyData.add(new File("유수연2.java", "20220501", 3000, "SooyeonYoo"));
			MyData.add(MyPictures);
			

			// 유수연: MyDocuments에 파일 및 폴더 삽입
			MyPictures.add(new File("유수연3.gif", "20220601", 4000, "SooyeonYoo"));
			MyPictures.add(new File("유수연4.jpg", "20220601", 5000, "SooyeonYoo"));
			MyPictures.add(new File("유수연5.png", "20220601", 6000, "SooyeonYoo"));
			
		
			MyDocuments.printList(); // MyData부터 하위 디렉터리 경로 출력
			
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
