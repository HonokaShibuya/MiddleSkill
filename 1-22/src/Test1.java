import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください
		Date date = new Date();
		System.out.println(date.toString());
		
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d = sd.parse(shinyaBirthday);
			Date a = sd.parse(minamiBirthday);
			Date earlierDate = d.before(a) ? d : a;
			System.out.println(sd.format(earlierDate));
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
		Date t = sdf.parse(furuyamaBirthday);
		Calendar cal = Calendar.getInstance();
		cal.setTime(t);
		cal.add(Calendar.YEAR,5);
		cal.add(Calendar.MONTH,2);
		System.out.println(sd.format(cal.getTime()));
	} catch(ParseException e) {
		e.printStackTrace();
	}
	}
}
