package book1;

public class List_1_4 {
	public static void main(String[] args) {
		//書き換えてはいけない変数の値を上書きしてしまった例
		double tax = 1.08;	//消費税を入れた変数
		int fax = 5;	//faxは５万円
		System.out.println("5万円から4万円に値下げします");
		tax = 4;	//誤り！代入すべきはfax変数
		System.out.println("FAXの新価格（税込）");
		System.out.println(fax * tax + "万円");
	}
}
