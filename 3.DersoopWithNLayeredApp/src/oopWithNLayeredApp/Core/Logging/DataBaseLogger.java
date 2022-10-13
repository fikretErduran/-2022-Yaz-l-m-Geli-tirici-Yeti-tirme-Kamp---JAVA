package oopWithNLayeredApp.Core.Logging;

public class DataBaseLogger implements Logger{

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Veri Tabanına Loglandı:"+data);
	}

}
