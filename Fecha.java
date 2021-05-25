import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Fecha {
	 
	
	public Fecha() {
		
	}
	public void mostrarFecha(){
		Date fechaActual = new Date();
		System.out.println(DateAString(fechaActual));
		
	}
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	
	public static String DateAString(Date fecha) {
		String fechaCadena = sdf.format(fecha);
		return fechaCadena;
	}
	
	public static int calculaDias(int dia, int mes,int anio) {
		Calendar fin = Calendar.getInstance();
		fin.set(anio, mes-1, dia);
		fin.set(Calendar.HOUR,0);
		fin.set(Calendar.HOUR_OF_DAY,0);
		fin.set(Calendar.MINUTE,0);
		fin.set(Calendar.SECOND,0);
		 
		Calendar actual = Calendar.getInstance();
		actual.set(Calendar.HOUR,0);
		actual.set(Calendar.HOUR_OF_DAY,0);
		actual.set(Calendar.MINUTE,0);
		actual.set(Calendar.SECOND,0);
		
		long finMs = fin.getTimeInMillis();
		long inicioMs = actual.getTimeInMillis();
		
		int dias = (int) (( Math.abs(finMs - inicioMs)) / (1000*60*60*24) );
		
		return dias;
		
	}
	
}

