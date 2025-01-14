package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int month = 13;
		switch (month) {
		case 1, 2, 12:
			System.out.println(month + "月は冬です。");
			break;
		case 3, 4, 5:
			System.out.println(month + "月は春です。");
			break;
		case 6, 7, 8:
			System.out.println(month + "月は夏です。");
			break;
		case 9, 10, 11:
			System.out.println(month + "月は冬です。");
			break;
		default:
			System.out.println(month + "月は存在しないです。");
		}
	}

}
