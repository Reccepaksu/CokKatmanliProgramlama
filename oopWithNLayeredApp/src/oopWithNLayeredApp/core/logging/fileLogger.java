package oopWithNLayeredApp.core.logging;

public class fileLogger implements Logger{

	@Override //anatasyon interface den geldiğin süler 
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Dosyaya loglandı  :" + data);
	}
	
}
