package book1;

public class List_1_5 {
	public static void main(String[] args) {
		//定数の例
		final double TAX = 1.08;	//定数として税率を設定
		int fax = 5;
		System.out.println("5万円から4万円に値下げします");
		fax = 4;
		System.out.println("FAXの新価格（税込）");
		System.out.println(fax * TAX + "万円");
	}
}
