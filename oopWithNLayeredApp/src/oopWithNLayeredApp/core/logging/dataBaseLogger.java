package oopWithNLayeredApp.core.logging;

public class dataBaseLogger implements Logger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("veritabanına loglandı : " + data);
	}

}
