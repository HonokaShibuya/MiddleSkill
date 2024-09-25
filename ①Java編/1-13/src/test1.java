import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class test1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
		//		例）
		//		for() {
		//			for() {
		//				for() {
		//					
		//				}
		//			}
		//		}
		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList(Arrays.asList("f", "u", "k", "u", "d", "a", "k" , "a" , "n" , "e" , "k" , "o" ));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();

		for(int i = 2; i < strArray1.size(); i++) {
			strArray2.add(strArray1.get(i));
			for(int x = i-2; x < strArray2.size(); x++) {
				if(strArray2.get(x).equals("k") || strArray2.get(x).equals("a") || strArray2.get(x).equals("o")) {
					strArray3.add(strArray2.get(x));
				}
				if(strArray3.size() > 5) {
				for(int n = 3; n < strArray3.size(); n++) {
					if(strArray3.get(n).equals("k")) {
						strArray3.remove(n);
					}
					strArray4 = strArray3;
				}
				}
			}

		}
		System.out.println(strArray4);
	}
}