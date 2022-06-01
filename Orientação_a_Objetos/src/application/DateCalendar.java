package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateCalendar {

	public static void main(String[] args)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // instaciei o SimpleDate pra poder transformar datas em string usando o format
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // declarei um valor pra data no objeto d utilizando o padrao iso8601
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();                // instanciei um objeto do tipo calendar
		cal.setTime(d);                                       // setei o usando o metodo setTime o valor da data D pro objeto cal do tipo calendar
		cal.add(Calendar.HOUR_OF_DAY, 4);                     // adicionei 4 horas na data d setada anteriormente. Essas 4 horas foram pro objeto cal
		d = cal.getTime();                                    // peguei a data d de novo e atribui a ela o valor somado utilizado no calendar
		System.out.println(sdf.format(d));
		
	
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // mes começa com o valor 0
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
	}

}
