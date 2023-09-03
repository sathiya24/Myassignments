package week3.day1.assignment3;

public class Automation extends MultipleLangauge implements Language, TestTool  {

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Toolname - Selenium");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("language name - Java");
		
	}
	
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();
		
	}

}
